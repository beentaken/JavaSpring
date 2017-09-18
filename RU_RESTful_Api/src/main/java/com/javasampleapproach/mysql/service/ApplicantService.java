package com.javasampleapproach.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Applicant;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.ApplicantRepository;

@Service
public class ApplicantService {
	
	@Autowired
	private ApplicantRepository applicantrepo;
	
	public void addapplicant(Applicant applicant){
		applicantrepo.save(applicant);
		
	}
	
public void deleteapplicant(long id) {
		
		applicantrepo.delete(id);
		
	}
	
public void updateapplicant(long id, Applicant applicant) {
	
	applicantrepo.save(applicant);
	
	
}

public Applicant getapplicant(long id)
{
	
	return (Applicant) applicantrepo.findOne(id);
}

public List<Applicant>getallapplicant()
{
	
	List<Applicant> applicant=new ArrayList<>();
	applicantrepo.findAll()
	.forEach(applicant::add);
	
	return applicant;
}



}
