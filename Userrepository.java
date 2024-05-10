package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.Entity.User;
@Repository
public interface Userrepository  extends JpaRepository<User, Integer>{

	User findByEmail(String email);//custom method


}
