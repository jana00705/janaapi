package com.institute.home.repository;

import org.springframework.data.repository.CrudRepository;
import com.institute.home.modal.College;
public interface CollegeRepository extends CrudRepository<College, Integer>   {

}