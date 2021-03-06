package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.Residence;
import com.javasampleapproach.mysql.hall.repo.ResidenceRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class ResidenceService {
	
	@Autowired
	private ResidenceRepository residencerepo;
	
	public void addresidence(Residence residence){
		residencerepo.save(residence);
		
	}
	
public void deleteresidence(long id) {
		
		residencerepo.delete(id);
		
	}

public void updateresidence(long id, Residence residence) {
	
	residencerepo.save(residence);
	
	
}

public Residence getresidence(long id)
{
	
	return (Residence) residencerepo.findOne(id);
}

public List<Residence>getallresidence()
{
	
	List<Residence> residence=new ArrayList<>();
	residencerepo.findAll()
	.forEach(residence::add);
	
	return residence;
}


}
