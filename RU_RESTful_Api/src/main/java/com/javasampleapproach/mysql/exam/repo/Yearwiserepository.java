package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Yearwise;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Unit;

public interface Yearwiserepository extends CrudRepository<Yearwise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}