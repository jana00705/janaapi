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

import com.institute.home.modal.Feedback;

import com.institute.home.repository.CfeedbackRepository;

@RestController
@RequestMapping(value="/collegefeedback")
public class CollegeFeedbackController {

	@Autowired
	private CfeedbackRepository cfeedbackRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertcfeedback(@RequestBody final Feedback f){
		cfeedbackRepo.save(f);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Feedback Successfully");
		
	}
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllFeedbacks(){
		ArrayList<Feedback> cfeedbacks = (ArrayList<Feedback>) cfeedbackRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(cfeedbacks);
	}
	
}