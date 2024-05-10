package com.kodnest.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Playlist {
    
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
	private int id;
    private String name;
	@ManyToMany
	private List<Song>song;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Song> getSong() {
		return song;
	}
	public void setSong(List<Song> song) {
		this.song = song;
	}
	public Playlist(int id, String name, List<Song> song) {
		super();
		this.id = id;
		this.name = name;
		this.song = song;
	}
	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Playlist [id=" + id + ", name=" + name + "]";
	}
	
	
	}
