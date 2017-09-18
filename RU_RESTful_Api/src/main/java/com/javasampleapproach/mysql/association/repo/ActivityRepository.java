package com.javasampleapproach.mysql.association.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.association.model.Activities;
import com.javasampleapproach.mysql.association.model.President;

public interface ActivityRepository extends CrudRepository<Activities, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
