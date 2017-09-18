package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examsemesterwise;
import com.javasampleapproach.mysql.exam.repo.Examsemesterwiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Fee;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.FeeRepository;

@Service
public class Examsemesterwiseservice {
	
	@Autowired
	private Examsemesterwiserepository examsemesterwiserepo;
	
	public void addexamsemesterwise(Examsemesterwise examsemesterwise){
		examsemesterwiserepo.save(examsemesterwise);
		
	}
	
public void deleteexamsemesterwise(long id) {
		
		examsemesterwiserepo.delete(id);
		
	}

public void updateexamsemesterwise(long id,Examsemesterwise examsemesterwise) {
	
	examsemesterwiserepo.save(examsemesterwise);
	
	
}

public Examsemesterwise getexamsemesterwise(long id)
{
	
	return (Examsemesterwise) examsemesterwiserepo.findOne(id);
}

public List<Examsemesterwise>getallexamsemesterwise()
{
	
	List<Examsemesterwise> examsemesterwise=new ArrayList<>();
	examsemesterwiserepo.findAll()
	.forEach(examsemesterwise::add);
	
	return examsemesterwise;
}



}
