package com.javasampleapproach.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Emergency_contact;
import com.javasampleapproach.mysql.model.HelpCenter;

public interface EmergencycontactRepository extends CrudRepository<Emergency_contact, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}