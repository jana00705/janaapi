package com.institute.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institute.home.modal.Admin;
import com.institute.home.repository.AdminRepository;

@RestController
@RequestMapping(value="/admin")
public class AdminController {

	@Autowired
	private AdminRepository adminRepo;

	@PostMapping(value = "/login")
	public ResponseEntity<?>loginAdmin(@RequestBody final Admin log){
		Admin admin = (Admin) adminRepo.findByUsernamePassword(log.getUsername(),log.getPassword())	;	
	
		if(admin!=null)
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("login successfully");
		else
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
			
	}
}
