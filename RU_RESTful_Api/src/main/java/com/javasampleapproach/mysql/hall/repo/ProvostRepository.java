package com.javasampleapproach.mysql.hall.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.hall.model.Provost;

public interface ProvostRepository extends CrudRepository<Provost, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
