package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Teacherwise;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Unit;

public interface Teacherwiserepository extends CrudRepository<Teacherwise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}