package com.institute.home.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.institute.home.modal.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query("SELECT log from Student log where log.username=?1 and log.password=?2")
	public Student findByUsernamePassword(String username,String password);

}
