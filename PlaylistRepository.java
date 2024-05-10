package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.Entity.Playlist;
import com.kodnest.Entity.Song;
import com.kodnest.Entity.User;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
	public Playlist findByName(String string);

	

}
