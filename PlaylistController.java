package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.kodnest.Entity.Playlist;
import com.kodnest.Entity.Song;
import com.kodnest.service.PlaylistService;
import com.kodnest.service.SongService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PlaylistController {
	
	@Autowired
	PlaylistService playlistservice;
	@Autowired
	SongService songService;
	
	@GetMapping("/createplaylists")
	public String createplaylist(Model model)
	{
	List<Song> songList=songService.fetchAllSongs();
	model.addAttribute("songs" ,songList);
		return "createplaylists";
		
	}
	@PostMapping("/addplaylist")
	 public String addPlaylist(@ModelAttribute Playlist playlist) {
	  
	  String name = playlist.getName();
	  
	  boolean playlistExists =playlistservice.playlistExists(name);
	  
	  
	  if(playlistExists==false) {
	   playlistservice.saveplaylist(playlist);
	   
	   
	  }
	  else {
	   System.out.println("Duplicate");
	   
	  }
	  
	  return "adminhome";
	 }

@GetMapping("/viewplaylist")
public String viewplaylist(Model model)
{
		
		List<Playlist> playList=playlistservice.fetchAllSongs();
		model.addAttribute("playlists",playList);
		System.out.println(playList);
		
		return "viewplaylist";
		
	
	}
	
}

 

