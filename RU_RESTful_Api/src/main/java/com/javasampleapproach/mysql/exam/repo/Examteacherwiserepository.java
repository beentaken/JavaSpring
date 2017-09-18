package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Examteacherwise;
import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.model.MarkDistribution;

public interface Examteacherwiserepository extends CrudRepository<Examteacherwise, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}