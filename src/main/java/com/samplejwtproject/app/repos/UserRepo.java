package com.samplejwtproject.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samplejwtproject.app.entities.UserEntity;



@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	
	UserEntity findByUsername(String username);
}
