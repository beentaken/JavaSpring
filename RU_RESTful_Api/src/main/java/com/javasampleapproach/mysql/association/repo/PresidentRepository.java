package com.javasampleapproach.mysql.association.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.association.model.Association;
import com.javasampleapproach.mysql.association.model.President;

public interface PresidentRepository extends CrudRepository<President, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}

