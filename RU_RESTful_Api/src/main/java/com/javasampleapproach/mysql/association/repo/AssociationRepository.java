package com.javasampleapproach.mysql.association.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.association.model.Association;
import com.javasampleapproach.mysql.hall.model.Residence;
import com.javasampleapproach.mysql.model.Admission;

public interface AssociationRepository extends CrudRepository<Association, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
