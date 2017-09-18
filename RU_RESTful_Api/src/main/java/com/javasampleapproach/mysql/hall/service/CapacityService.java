package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.Capacity;
import com.javasampleapproach.mysql.hall.repo.CapacityRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class CapacityService {
	
	@Autowired
	private CapacityRepository capacityrepo;
	
	public void addcapacity(Capacity capacity){
		capacityrepo.save(capacity);
		
	}
	
public void deletecapacity(long id) {
		
		capacityrepo.delete(id);	
	}

public void updatecapacity(long id, Capacity capacity) {
	
	capacityrepo.save(capacity);
	
	
}

public Capacity getcapacity(long id)
{
	
	return (Capacity) capacityrepo.findOne(id);
}

public List<Capacity>getallcapacity()
{
	
	List<Capacity> capacity=new ArrayList<>();
	capacityrepo.findAll()
	.forEach(capacity::add);
	
	return capacity;
}

	

}
