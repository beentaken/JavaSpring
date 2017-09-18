package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.Provost;
import com.javasampleapproach.mysql.hall.repo.ProvostRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class ProvostService {
	
	@Autowired
	private ProvostRepository provostrepo;
	
	public void addprovost(Provost provost){
		provostrepo.save(provost);
		
	}
	
public void deleteprovost(long id) {
		
		provostrepo.delete(id);
		
	}

public void updateprovost(long id, Provost provost) {
	
	provostrepo.save(provost);
	
	
}

public Provost getprovost(long id)
{
	
	return (Provost) provostrepo.findOne(id);
}

public List<Provost>getallprovost()
{
	
	List<Provost> provost=new ArrayList<>();
	provostrepo.findAll()
	.forEach(provost::add);
	
	return provost;
}


}

