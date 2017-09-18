package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Classschedule;
import com.javasampleapproach.mysql.exam.model.Examschedule;
import com.javasampleapproach.mysql.exam.repo.Classschedulerepository;
import com.javasampleapproach.mysql.exam.repo.Examschedulerepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Emergency_contact;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.EmergencycontactRepository;

@Service
public class Examscheduleservice {
	
	@Autowired
	private Examschedulerepository examschedulerepo;
	
	public void addexamschedule(Examschedule examschedule){
		examschedulerepo.save(examschedule);
		
	}
	
public void deleteexamschedule(long id) {
		
		examschedulerepo.delete(id);
		
	}
	
public void updateexamschedule(long id, Examschedule examschedule) {
	
	examschedulerepo.save(examschedule);
	
	
}
public Examschedule getexamschedule(long id)
{
	
	return (Examschedule) examschedulerepo.findOne(id);
}

public List<Examschedule>getallexamschedule()
{
	
	List<Examschedule>examschedule =new ArrayList<>();
	examschedulerepo.findAll()
	.forEach(examschedule::add);
	
	return examschedule;
}
	

}
