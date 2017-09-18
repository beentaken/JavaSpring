package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Timewise;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Unit;

public interface Timewiserepository extends CrudRepository<Timewise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}