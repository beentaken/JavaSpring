package com.javasampleapproach.mysql.hall.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.hall.model.Location;

public interface LocationRepository extends CrudRepository<Location, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
