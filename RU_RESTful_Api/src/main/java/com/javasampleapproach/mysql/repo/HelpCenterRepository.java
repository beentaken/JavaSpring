package com.javasampleapproach.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.HelpCenter;

public interface HelpCenterRepository extends CrudRepository<HelpCenter, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
