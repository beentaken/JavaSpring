package com.javasampleapproach.mysql.association.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.association.model.President;
import com.javasampleapproach.mysql.association.model.Secratary;

public interface SecrataryRepository extends CrudRepository<Secratary, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
