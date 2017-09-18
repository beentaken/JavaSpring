package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Examschedule;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Fee;

public interface Examschedulerepository extends CrudRepository<Examschedule, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
