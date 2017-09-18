package com.javasampleapproach.mysql.hall.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.hall.model.Capacity;
import com.javasampleapproach.mysql.hall.model.NameofHall;

public interface CapacityRepository extends CrudRepository<Capacity, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}