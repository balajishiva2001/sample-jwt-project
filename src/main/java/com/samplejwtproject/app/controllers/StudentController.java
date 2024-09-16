package com.samplejwtproject.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samplejwtproject.app.dtos.StudentDto;


@RestController
public class StudentController {
	
	/*
	 * During the POST request, along with the basicAuthentication
	 * we need to add a key-value pair in Headers
	 * X-CSRF-TOKEN - the value from the httpServletRequest.getAttribute("_csrf");
	 * orElse we get the status as 401 Unauthorized
	 * 
	 * Default at every request we always get the same sessionId, which intern mean it is statefull 
	 */
	List<StudentDto> studentDtos = new ArrayList<StudentDto>(
			List.of(new StudentDto(1, "A", "Java"), new StudentDto(2, "B", "Python")));
	
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentDto>> getStudents(){
		return new ResponseEntity<List<StudentDto>>(studentDtos, HttpStatus.OK);
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<String> addStudent(@RequestBody StudentDto studentDto) {
		studentDtos.add(studentDto);
		return new ResponseEntity<String>("student created", HttpStatus.CREATED);
	}
}
