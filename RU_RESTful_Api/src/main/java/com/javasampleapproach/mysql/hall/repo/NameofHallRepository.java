package com.javasampleapproach.mysql.hall.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.hall.model.NameofHall;
import com.javasampleapproach.mysql.hall.model.Residence;

public interface NameofHallRepository extends CrudRepository<NameofHall, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
