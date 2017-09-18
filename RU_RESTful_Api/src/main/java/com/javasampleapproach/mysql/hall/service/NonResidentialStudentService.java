package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.NonResidentialStudent;
import com.javasampleapproach.mysql.hall.repo.NonResidentialStudentRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class NonResidentialStudentService {
	
	@Autowired
	private NonResidentialStudentRepository nonresidentialstudentrepo;
	
	public void addnonresidentialstudent(NonResidentialStudent nonresidentialstudent){
		nonresidentialstudentrepo.save(nonresidentialstudent);
		
	}
	
public void deletenonresidentialstudent(long id) {
		
		nonresidentialstudentrepo.delete(id);
		
	}

public void updatenonresidentialstudent(long id, NonResidentialStudent nonresidentialstudent) {
	
	nonresidentialstudentrepo.save(nonresidentialstudent);
	
	
}

public NonResidentialStudent getnonresidentialstudent(long id)
{
	
	return (NonResidentialStudent) nonresidentialstudentrepo.findOne(id);
}

public List<NonResidentialStudent>getallnonresidentialstudent()
{
	
	List<NonResidentialStudent> nonresidentialstudent=new ArrayList<>();
	nonresidentialstudentrepo.findAll()
	.forEach(nonresidentialstudent::add);
	
	return nonresidentialstudent;
}


}
