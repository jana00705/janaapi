package com.institute.home.repository;

import org.springframework.data.repository.CrudRepository;

import com.institute.home.modal.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
