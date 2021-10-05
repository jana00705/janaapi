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
import com.institute.home.modal.Student;
import com.institute.home.repository.CollegeRepository;

@RestController
@RequestMapping(value="/college")
public class CollegeController {

	@Autowired
	private CollegeRepository CollegeRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertcollege(@RequestBody final College s){
		CollegeRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College Registered Successfully");
		
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllColleges(){
		ArrayList<College> colleges = (ArrayList<College>) CollegeRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(colleges);
	}
	
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteCollege(@PathVariable final int id){
		CollegeRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College deleted Successfully!");
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<?> getCollege(@PathVariable final int id){
		College college = CollegeRepo.findById(id).get();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(college);
	}	
}