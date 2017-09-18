package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.HouseTutor;
import com.javasampleapproach.mysql.hall.repo.HouseTutorRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class HouseTutorService {
	
	@Autowired
	private HouseTutorRepository housetutorrepo;
	
	public void addhousetutor(HouseTutor housetutor){
		housetutorrepo.save(housetutor);
		
	}
	
public void deletehousetutor(long id) {
		
		housetutorrepo.delete(id);
		
	}
	
public void updatehousetutor(long id,HouseTutor housetutor) {
	
	housetutorrepo.save(housetutor);
	
	
}

public HouseTutor gethousetutor(long id)
{
	
	return (HouseTutor) housetutorrepo.findOne(id);
}

public List<HouseTutor>getallhousetutor()
{
	
	List<HouseTutor> housetutor=new ArrayList<>();
	housetutorrepo.findAll()
	.forEach(housetutor::add);
	
	return housetutor;
}


}
