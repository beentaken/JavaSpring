package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Datewise;
import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.model.Routine;

public interface Datewiserepository extends CrudRepository<Datewise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
