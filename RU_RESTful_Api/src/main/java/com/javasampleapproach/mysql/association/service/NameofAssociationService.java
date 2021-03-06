package com.javasampleapproach.mysql.association.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.association.model.NameofAssociation;
import com.javasampleapproach.mysql.association.repo.NameofAssociationRepository;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class NameofAssociationService {
	
	@Autowired
	private NameofAssociationRepository nameofassociationrepo;
	
	public void addnameofassociation(NameofAssociation nameofassociation){
		nameofassociationrepo.save(nameofassociation);
		
	}
	
public void deletenameofassociation(long id) {
		
		nameofassociationrepo.delete(id);
		
	}
	
public void updatenameofassociation(long id, NameofAssociation nameofassociation) {
	
	nameofassociationrepo.save(nameofassociation);
	
	
}

public NameofAssociation getnameofassociation(long id)
{
	
	return (NameofAssociation) nameofassociationrepo.findOne(id);
}

public List<NameofAssociation>getallnameofassociation()
{
	
	List<NameofAssociation> nameofassociation=new ArrayList<>();
	nameofassociationrepo.findAll()
	.forEach(nameofassociation::add);
	
	return nameofassociation;
}

}

