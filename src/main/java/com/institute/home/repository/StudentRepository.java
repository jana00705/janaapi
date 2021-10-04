package com.institute.home.repository;

import org.springframework.data.repository.CrudRepository;

import com.institute.home.modal.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
