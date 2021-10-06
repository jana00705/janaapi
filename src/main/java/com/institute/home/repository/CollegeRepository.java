package com.institute.home.repository;


import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.institute.home.modal.College;
public interface CollegeRepository extends CrudRepository<College, Integer>   {

	@Query("SELECT clg from College clg where clg.username=?1 and clg.password=?2")
	public College findByUsernamePassword(String username,String password);
	
//	@Query("SELECT u from User u where u.username=?1")	
//	User findOneByUsername(String username);
//	@Query("from College where username=?1 and password=?2")
//	public College findByUsernamePassword(String username,String password);

}