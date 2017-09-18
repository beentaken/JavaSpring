package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examyearwise;
import com.javasampleapproach.mysql.exam.model.Yearwise;
import com.javasampleapproach.mysql.exam.repo.Examyearwiserepository;
import com.javasampleapproach.mysql.exam.repo.Yearwiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Unit;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.UnitRepository;

@Service
public class Yearwiseservice {
	
	@Autowired
	private Yearwiserepository yearwiserepo;
	
	public void addyearwise(Yearwise yearwise){
		yearwiserepo.save(yearwise);
		
	}
	
public void deleteyearwise(long id) {
		
		yearwiserepo.delete(id);
		
	}

public void updateyearwise(long id,Yearwise yearwise) {
	
	yearwiserepo.save(yearwise);
	
	
}

public Yearwise getyearwise(long id)
{
	
	return (Yearwise) yearwiserepo.findOne(id);
}

public List<Yearwise>getallyearwise()
{
	
	List<Yearwise> yearwise=new ArrayList<>();
	yearwiserepo.findAll()
	.forEach(yearwise::add);
	
	return yearwise;
}



}
