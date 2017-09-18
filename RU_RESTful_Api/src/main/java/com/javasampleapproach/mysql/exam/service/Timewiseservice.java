package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examtimewise;
import com.javasampleapproach.mysql.exam.model.Timewise;
import com.javasampleapproach.mysql.exam.repo.Examtimewiserepository;
import com.javasampleapproach.mysql.exam.repo.Timewiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Time;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.TimeRepository;

@Service
public class Timewiseservice {
	
	@Autowired
	private Timewiserepository timewiserepo;
	
	public void addtimewise(Timewise timewise){
		timewiserepo.save(timewise);
		
	}
	
public void deletetimewise(long id) {
		
		timewiserepo.delete(id);
		
	}

public void updatetimewise(long id,Timewise timewise) {
	
	timewiserepo.save(timewise);
	
	
}

public Timewise gettimewise(long id)
{
	
	return (Timewise) timewiserepo.findOne(id);
}

public List<Timewise>getalltimewise()
{
	
	List<Timewise> timewise=new ArrayList<>();
	timewiserepo.findAll()
	.forEach(timewise::add);
	
	return timewise;
}


}
