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


import com.institute.home.modal.Faculty;
import com.institute.home.repository.FacultyRepository;

@RestController
@RequestMapping(value="/faculty")
public class FacultyController {

	@Autowired
	private FacultyRepository facultyRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertfaculty(@RequestBody final Faculty s){
		facultyRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Faculty added Successfully");
		
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllFaculty(){
		ArrayList<Faculty> faculties = (ArrayList<Faculty>) facultyRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(faculties);
	}
	
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteFaculty(@PathVariable final int id){
		facultyRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Faculty deleted Successfully!");
		
	}
	
//	@GetMapping(value = "/get/{id}")
//	public ResponseEntity<?> getFaculty(@PathVariable final int id){
//		Faculty faculty = facultyRepo.findById(id).get();
//		return ResponseEntity
//				.status(HttpStatus.OK)
//				.body(faculty);
//	}	
//	

	
}