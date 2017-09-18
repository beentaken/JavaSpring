package com.javasampleapproach.mysql.hall.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.hall.model.Residence;
import com.javasampleapproach.mysql.hall.model.StudentResidence;

public interface StudentResidenceRepository extends CrudRepository<StudentResidence, Long > {
	
	//List<Admission>  findbyAdmission();
	// List<Admission>  findbyAdmission(String Admission);

	// Object findbyAdm();

	
	
}
