package com.institute.home.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<?> home(){
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Spring Worked");
	}
	
	

}

