package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Examsemesterwise;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.HelpCenter;

public interface Examsemesterwiserepository extends CrudRepository<Examsemesterwise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
