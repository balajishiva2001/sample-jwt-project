package com.samplejwtproject.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samplejwtproject.app.dtos.UserDto;
import com.samplejwtproject.app.services.JwtService;
import com.samplejwtproject.app.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	private JwtService jwtService;

	@PostMapping("/register")
	public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
		userService.addUser(userDto);
		return new ResponseEntity<String>("User Created", HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserDto userDto) {

		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(userDto.getUsername(), userDto.getPassword()));

		return new ResponseEntity<String>(
				authentication.isAuthenticated() ? jwtService.generateToken(userDto.getUsername()) : "Login Failed",
				HttpStatus.OK);
	}
}
