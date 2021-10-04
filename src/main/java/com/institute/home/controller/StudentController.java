package com.institute.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institute.home.modal.Student;
import com.institute.home.repository.StudentRepository;

@RestController
@RequestMapping(value="/student")
public class StudentController {

	@Autowired
	private StudentRepository StudentRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertstudent(@RequestBody final Student s){
		StudentRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student Registered Successfully");
		
	}
}