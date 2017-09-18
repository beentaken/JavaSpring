package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Datewise;
import com.javasampleapproach.mysql.exam.repo.Datewiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class Datewiseservice {
	
	@Autowired
	private Datewiserepository datewiserepo;
	
	public void adddatewise(Datewise datewise){
		datewiserepo.save(datewise);
		
	}
	
public void deletedatewise(long id) {
		
		datewiserepo.delete(id);
		
	}

public void updatedatewise(long id, Datewise datewise) {
	
	datewiserepo.save(datewise);
	
	
}

public Datewise getdatewise(long id)
{
	
	return (Datewise) datewiserepo.findOne(id);
}

public List<Datewise>getalldatewise()
{
	
	List<Datewise> datewise=new ArrayList<>();
	datewiserepo.findAll()
	.forEach(datewise::add);
	
	return datewise;
}

}
