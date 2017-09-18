package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examsemesterwise;
import com.javasampleapproach.mysql.exam.model.Semesterwise;
import com.javasampleapproach.mysql.exam.repo.Examsemesterwiserepository;
import com.javasampleapproach.mysql.exam.repo.Semesterwiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Routine;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.RoutineRepository;

@Service
public class Semesterwiseservice {
	
	@Autowired
	private Semesterwiserepository semesterwiserepo;
	
	public void addsemesterwise(Semesterwise semesterwise){
		semesterwiserepo.save(semesterwise);
		
	}
	
public void deletesemesterwise(long id) {
		
		semesterwiserepo.delete(id);
		
	}

public void updatesemesterwise(long id,Semesterwise semesterwise) {
	
	semesterwiserepo.save(semesterwise);
	
	
}

public Semesterwise getsemesterwise(long id)
{
	
	return (Semesterwise) semesterwiserepo.findOne(id);
}

public List<Semesterwise>getallsemesterwise()
{
	
	List<Semesterwise> semesterwise=new ArrayList<>();
	semesterwiserepo.findAll()
	.forEach(semesterwise::add);
	
	return semesterwise;
}



}

