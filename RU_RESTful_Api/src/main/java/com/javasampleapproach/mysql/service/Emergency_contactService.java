package com.javasampleapproach.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Emergency_contact;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.EmergencycontactRepository;

@Service
public class Emergency_contactService {
	
	@Autowired
	private EmergencycontactRepository emergencyrepo;
	
	public void addemergencycontact(Emergency_contact emergencycontact){
		emergencyrepo.save(emergencycontact);
		
	}
	
public void deleteemergencycontact(long id) {
		
		emergencyrepo.delete(id);
		
	}
public void updateemergencycontact(long id,Emergency_contact emergency_contact){
	
	emergencyrepo.save(emergency_contact);
	
	
}

public Emergency_contact getemergencycontact(long id)
{
	
	return (Emergency_contact) emergencyrepo.findOne(id);
}

public List<Emergency_contact>getallemergencycontact()
{
	
	List<Emergency_contact> emergencycontact=new ArrayList<>();
	emergencyrepo.findAll()
	.forEach(emergencycontact::add);
	
	return emergencycontact;
}


	

}
