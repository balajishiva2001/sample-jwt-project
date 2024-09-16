package com.samplejwtproject.app.controllers;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	
	/*
	 * 1. By default when we add the web-security to the project, to access the endpoints
	 * it will open a form to login
	 * Username: user
	 * Password: you will have the password in the console
	 * 
	 * Similarly we can use the same using basicAuthentication in PostMan
	 */
	@GetMapping("/hello")
	public String greeting(HttpServletRequest httpServletRequest) {
		return "Hello " + httpServletRequest.getRequestedSessionId();
	}
	
	@GetMapping("/getCsrfToken")
	public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest) {
		return (CsrfToken) httpServletRequest.getAttribute("_csrf");
	}
}
