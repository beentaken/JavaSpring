package com.javasampleapproach.mysql.association.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.association.model.Association;
import com.javasampleapproach.mysql.association.repo.AssociationRepository;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class AssociationService {
	
	@Autowired
	private AssociationRepository associationrepo;
	
	public void addassociation(Association association){
		associationrepo.save(association);
		
	}
	
public void deleteassociation(long id) {
		
		associationrepo.delete(id);
		
	}

public void updateassociation(long id,Association association) {
	
	associationrepo.save(association);
	
	
}

public Association getassociation(long id)
{
	
	return (Association) associationrepo.findOne(id);
}

public List<Association>getallassociation()
{
	
	List<Association> association=new ArrayList<>();
	associationrepo.findAll()
	.forEach(association::add);
	
	return association;
}
	

}
