package com.institute.home.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.institute.home.modal.College;
import com.institute.home.repository.CollegeRepository;

@RestController
@RequestMapping(value="/college")
public class CollegeController {

	@Autowired
	private CollegeRepository collegeRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertcollege(@RequestBody final College s){
		collegeRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College Registered Successfully");
		
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllColleges(){
		ArrayList<College> colleges = (ArrayList<College>) collegeRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(colleges);
	}
	
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteCollege(@PathVariable final int id){
		collegeRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College deleted Successfully!");
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<?> getCollege(@PathVariable final int id){
		College college = collegeRepo.findById(id).get();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(college);
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<?>loginCollege(@RequestBody final College log){
		College college = (College) collegeRepo.findByUsernamePassword(log.getUsername(),log.getPassword())	;	
     int collegeId;
		
		if(college!=null) {
			collegeId = college.getId();
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(collegeId);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
		}
	}
	
	@PostMapping(value="/update")
	public ResponseEntity<?> updateCollege(@RequestBody final College s){
		collegeRepo.save(s);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College saved successfully!");
		
	}	
	
}