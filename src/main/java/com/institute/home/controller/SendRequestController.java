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
import com.institute.home.modal.SendRequest;
import com.institute.home.repository.SendRequestRepository;

@RestController
@RequestMapping(value="/sendrequest")
public class SendRequestController {

	@Autowired
	private SendRequestRepository sendrequestRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertSendrequest(@RequestBody final SendRequest f){
		sendrequestRepo.save(f);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Feedback Successfully");
		
	}
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllRequests(){
		ArrayList<SendRequest> requests = (ArrayList<SendRequest>) sendrequestRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(requests);
	}
	
}