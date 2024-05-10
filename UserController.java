package com.kodnest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.Entity.User;
import com.kodnest.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserService userservice;
	
	@PostMapping("/register") 
	public String addUser(@ModelAttribute User user) {

		//to check a user with a a mail is present or not
		boolean userExists = userservice.emailExists(user);

		if(userExists==false) {
			userservice.saveUser(user);		
			System.out.println("User added successfully");
		}
		else {
			System.out.println("Duplicate user");
		}

		return "login";

	}

	@PostMapping("/validate") 
	public String validate(@RequestParam("email") String email, 
			@RequestParam("password") String password,HttpSession session) {

		if(userservice.validUser(email, password)!=true) {

			session.setAttribute("email", email);
			String role = userservice.getRole(email);

			if(role.equals("admin"))
			{
				return"adminhome";
			}else{
				return "cutomerhome";
			}

			
		}
		
		else {
			return "customerhome";
		}

	}//sessio object is used user credentials
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "login";
		
	}
	
	
}