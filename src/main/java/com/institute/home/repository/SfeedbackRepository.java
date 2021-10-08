package com.institute.home.repository;

import org.springframework.data.repository.CrudRepository;

import com.institute.home.modal.StudentFeedback;

public interface SfeedbackRepository extends CrudRepository<StudentFeedback, Integer> {

}
