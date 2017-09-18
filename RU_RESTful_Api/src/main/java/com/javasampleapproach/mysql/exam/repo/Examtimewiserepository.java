package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Examtimewise;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Payment;

public interface Examtimewiserepository extends CrudRepository<Examtimewise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
