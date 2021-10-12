package com.institute.home.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.institute.home.modal.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

	@Query("SELECT log from Admin log where log.username=?1 and log.password=?2")
	public Admin findByUsernamePassword(String username,String password);

}
