package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Examyearwise;
import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.model.Result;

public interface Examyearwiserepository extends CrudRepository<Examyearwise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}