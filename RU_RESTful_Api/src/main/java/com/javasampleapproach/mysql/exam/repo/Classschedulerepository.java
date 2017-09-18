package com.javasampleapproach.mysql.exam.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Classschedule;
import com.javasampleapproach.mysql.model.Admission;



public interface Classschedulerepository extends CrudRepository<Classschedule, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
