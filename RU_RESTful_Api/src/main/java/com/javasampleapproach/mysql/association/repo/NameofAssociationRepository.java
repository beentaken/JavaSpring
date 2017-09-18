package com.javasampleapproach.mysql.association.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.association.model.Association;
import com.javasampleapproach.mysql.association.model.NameofAssociation;

public interface NameofAssociationRepository extends CrudRepository<NameofAssociation, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
