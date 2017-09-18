package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examtimewise;
import com.javasampleapproach.mysql.exam.model.Examyearwise;
import com.javasampleapproach.mysql.exam.repo.Examtimewiserepository;
import com.javasampleapproach.mysql.exam.repo.Examyearwiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Payment;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.PaymentRepository;

@Service
public class Examyearwiseservice {
	
	@Autowired
	private Examyearwiserepository examyearwiserepo;
	
	public void addexamyearwise(Examyearwise examyearwise){
		examyearwiserepo.save(examyearwise);
		
	}
	
public void deleteexamyearwise(long id) {
		
		examyearwiserepo.delete(id);
		
	}

public void updateexamyearwise(long id,Examyearwise examyearwise) {
	
	examyearwiserepo.save(examyearwise);
	
	
}

public Examyearwise getexamyearwise(long id)
{
	
	return (Examyearwise) examyearwiserepo.findOne(id);
}

public List<Examyearwise>getallexamyearwise()
{
	
	List<Examyearwise> examyearwise=new ArrayList<>();
	examyearwiserepo.findAll()
	.forEach(examyearwise::add);
	
	return examyearwise;
}



}
