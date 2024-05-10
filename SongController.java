package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.Entity.Song;
import com.kodnest.service.SongService;

@Controller
public class SongController {
	@Autowired
	SongService songservice;


	@PostMapping("/addsongs")
	public String songData(@ModelAttribute Song song)
	{
		
		String name=song.getName();
		boolean songExists = songservice.songExists(name);
		if(songExists==false) {
        songservice.saveSong(song);
		}
		else
		{
	        System.out.println("duplicate ");

		}
		return "adminhome";
	}
	@GetMapping("/playsongs")
	public String playsongs(Model model)
	{
		boolean ispremium=true;
		if(ispremium) {
			
			List<Song> songsList=songservice.fetchAllSongs();
			model.addAttribute("songs",songsList);
			System.out.println(songsList);
			
			return "viewsongs";
			
		}
		else {
			return "pay";
		}
		
	}
	
	
	
	@GetMapping("/viewsongs")
	public String viewsongs(Model model)
	{
			
			List<Song> songsList=songservice.fetchAllSongs();
			model.addAttribute("songs",songsList);
			System.out.println(songsList);
	
			return "viewsongs";
		}
		
	}
	
	

	

