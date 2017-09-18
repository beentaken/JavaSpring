package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Examdatewise;
import com.javasampleapproach.mysql.model.Emergency_contact;
import com.javasampleapproach.mysql.model.HelpCenter;

public interface Examdatewiserepository extends CrudRepository<Examdatewise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}