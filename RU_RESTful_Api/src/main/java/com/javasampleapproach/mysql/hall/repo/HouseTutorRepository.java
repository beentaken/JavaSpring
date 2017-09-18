package com.javasampleapproach.mysql.hall.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.hall.model.HouseTutor;

public interface HouseTutorRepository extends CrudRepository<HouseTutor, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}