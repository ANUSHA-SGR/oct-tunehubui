package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.Entity.Song;
@Repository
public interface Songrepository extends JpaRepository<Song, Integer> {

	Song findByName(String name);

	



	

}
