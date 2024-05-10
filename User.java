package com.kodnest.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	private String username;
	private String password;
	private String phone;
	private String email;
	private String gender;
	private String role;
	private String address;
	private boolean ispremium;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isIspremium() {
		return ispremium;
	}
	public void setIspremium(boolean ispremium) {
		this.ispremium = ispremium;
	}
	public User(int userid, String username, String password, String phone, String email, String gender, String role,
			String address, boolean ispremium) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.ispremium = ispremium;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", email=" + email + ", gender=" + gender + ", role=" + role + ", address=" + address + ", ispremium="
				+ ispremium + "]";
	}
	
}
	
	