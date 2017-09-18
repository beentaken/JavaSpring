package com.javasampleapproach.mysql.exam.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.exam.model.Schedule;
import com.javasampleapproach.mysql.model.Fee;
import com.javasampleapproach.mysql.model.Routine;

public interface Schedulerepository extends CrudRepository<Schedule, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
