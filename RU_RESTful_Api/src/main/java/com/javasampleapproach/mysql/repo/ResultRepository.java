package com.javasampleapproach.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.model.Result;

public interface ResultRepository extends CrudRepository<Result, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}