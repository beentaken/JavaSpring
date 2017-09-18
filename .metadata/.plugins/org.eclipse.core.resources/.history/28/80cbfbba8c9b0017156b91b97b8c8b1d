package com.javasampleapproach.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.AdmissionRepository;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class AdmissionService {
	
	@Autowired
	private AdmissionRepository admissionrepo;
	
	public void addadmission(Admission admission){
		admissionrepo.save(admission);
		
	}
	
public void deleteadmission(long id) {
		
		admissionrepo.delete(id);
		
	}
	
public void updateadmission(long id, Admission admission) {
	
	admissionrepo.save(admission);
	
	
}
public Admission getadmission(long id)
{
	
	return (Admission) admissionrepo.findOne(id);
}

public List<Admission>getalladmission()
{
	
	List<Admission> admission=new ArrayList<>();
	admissionrepo.findAll()
	.forEach(admission::add);
	
	return admission;
}

}
