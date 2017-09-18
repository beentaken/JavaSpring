package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Semesterwise;
import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.model.Time;

public interface Semesterwiserepository extends CrudRepository<Semesterwise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}