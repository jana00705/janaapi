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

import com.institute.home.repository.FeedbackRepository;

@RestController
@RequestMapping(value="/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackRepository feedbackRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertfeedback(@RequestBody final Feedback s){
		feedbackRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Feedback Successfully");
		
	}
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllStudentsfb(){
		ArrayList<Feedback> feedbacks = (ArrayList<Feedback>) feedbackRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(feedbacks);
	}
}