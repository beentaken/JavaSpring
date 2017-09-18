package com.javasampleapproach.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Fee;
import com.javasampleapproach.mysql.model.Routine;

public interface RoutineRepository extends CrudRepository<Routine, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
