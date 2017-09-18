package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.ResidentialStudent;
import com.javasampleapproach.mysql.hall.repo.ResidentialStudentRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class ResidentialStudentService {
	
	@Autowired
	private ResidentialStudentRepository residentialstudentrepo;
	
	public void addresidentialstudent(ResidentialStudent residentialstudent){
		residentialstudentrepo.save(residentialstudent);
		
	}
	
public void deleteresidentialstudent(long id) {
		
		residentialstudentrepo.delete(id);
		
	}

public void updateresidentialstudent(long id,ResidentialStudent residentialstudent) {
	
	residentialstudentrepo.save(residentialstudent);
	
	
}

public ResidentialStudent getresidentialstudent(long id)
{
	
	return (ResidentialStudent) residentialstudentrepo.findOne(id);
}

public List<ResidentialStudent>getallresidentialstudent()
{
	
	List<ResidentialStudent> residentialstudent=new ArrayList<>();
	residentialstudentrepo.findAll()
	.forEach(residentialstudent::add);
	
	return residentialstudent;
}



}
