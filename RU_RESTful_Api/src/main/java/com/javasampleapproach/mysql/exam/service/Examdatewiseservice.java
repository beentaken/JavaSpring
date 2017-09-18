package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Datewise;
import com.javasampleapproach.mysql.exam.model.Examdatewise;
import com.javasampleapproach.mysql.exam.repo.Datewiserepository;
import com.javasampleapproach.mysql.exam.repo.Examdatewiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Applicant;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.ApplicantRepository;

@Service
public class Examdatewiseservice {
	
	@Autowired
	private Examdatewiserepository examdatewiserepo;
	
	public void addexamdatewise(Examdatewise examdatewise){
		examdatewiserepo.save(examdatewise);
		
	}
	
public void deleteexamdatewise(long id) {
		
		examdatewiserepo.delete(id);
		
	}

public void updateexamdatewise(long id, Examdatewise examdatewise) {
	
	examdatewiserepo.save(examdatewise);
	
	
}

public Examdatewise getexamdatewise(long id)
{
	
	return (Examdatewise) examdatewiserepo.findOne(id);
}

public List<Examdatewise>getallexamdatewise()
{
	
	List<Examdatewise> examdatewise=new ArrayList<>();
	examdatewiserepo.findAll()
	.forEach(examdatewise::add);
	
	return examdatewise;
}


}
