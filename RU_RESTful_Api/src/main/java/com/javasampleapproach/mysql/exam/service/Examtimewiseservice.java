package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examsemesterwise;
import com.javasampleapproach.mysql.exam.model.Examtimewise;
import com.javasampleapproach.mysql.exam.repo.Examsemesterwiserepository;
import com.javasampleapproach.mysql.exam.repo.Examtimewiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.MarkDistribution;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.MarkDistributionRepository;

@Service
public class Examtimewiseservice {
	
	@Autowired
	private Examtimewiserepository examtimewiserepo;
	
	public void addexamtimewise(Examtimewise examtimewise){
		examtimewiserepo.save(examtimewise);
		
	}
	
public void deleteexamtimewise(long id) {
		
		examtimewiserepo.delete(id);
		
	}

public void updateexamtimewise(long id,Examtimewise examtimewise) {
	
	examtimewiserepo.save(examtimewise);
	
	
}

public Examtimewise getexamtimewise(long id)
{
	
	return (Examtimewise) examtimewiserepo.findOne(id);
}

public List<Examtimewise>getallexamtimewise()
{
	
	List<Examtimewise> examtimewise=new ArrayList<>();
	examtimewiserepo.findAll()
	.forEach(examtimewise::add);
	
	return examtimewise;
}




}

