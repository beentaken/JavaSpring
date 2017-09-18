package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Classschedule;
import com.javasampleapproach.mysql.exam.repo.Classschedulerepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.AdmissionRepository;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class Classscheduleservice {
	
	@Autowired
	private Classschedulerepository classschedulerepo;
	
	public void addclassschedule(Classschedule classschedule){
		classschedulerepo.save(classschedule);
		
	}
	
public void deleteclassschedule(long id) {
		
		classschedulerepo.delete(id);
		
	}
	
public void updateclassschedule(long id, Classschedule classschedule) {
	
	classschedulerepo.save(classschedule);
	
	
}
public Classschedule getclassschedule(long id)
{
	
	return (Classschedule) classschedulerepo.findOne(id);
}

public List<Classschedule>getallclassschedule()
{
	
	List<Classschedule>classschedule =new ArrayList<>();
	classschedulerepo.findAll()
	.forEach(classschedule::add);
	
	return classschedule;
}

}
