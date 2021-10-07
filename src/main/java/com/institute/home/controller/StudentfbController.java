package com.institute.home.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institute.home.modal.Studentfb;

import com.institute.home.repository.StudentfbRepository;

@RestController
@RequestMapping(value="/studentfb")
public class StudentfbController {

	@Autowired
	private StudentfbRepository studentfbRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertstudentfb(@RequestBody final Studentfb s){
		studentfbRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student Registered Successfully");
		
	}
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllStudentsfb(){
		ArrayList<Studentfb> studentsfb = (ArrayList<Studentfb>) studentfbRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(studentsfb);
	}
}