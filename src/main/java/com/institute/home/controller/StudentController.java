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

import com.institute.home.modal.Student;
import com.institute.home.repository.StudentRepository;

@RestController
@RequestMapping(value="/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;	
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?>insertstudent(@RequestBody final Student s){
		studentRepo.save(s);		
	
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student Registered Successfully");
		
	}
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllStudents(){
		ArrayList<Student> students = (ArrayList<Student>) studentRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(students);
	}
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable final int id){
		studentRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Student deleted Successfully!");
		
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<?>loginStudent(@RequestBody final Student log){
		Student student = (Student) studentRepo.findByUsernamePassword(log.getUsername(),log.getPassword())	;	
	
		if(student!=null)
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("login successfully");
		else
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
			
	}
}