package com.javasampleapproach.mysql.association.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.association.model.President;
import com.javasampleapproach.mysql.association.repo.PresidentRepository;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class PresidentService {
	
	@Autowired
	private PresidentRepository presidentrepo;
	
	public void addpresident(President president){
		presidentrepo.save(president);
		
	}
	
public void deletepresident(long id) {
		
		presidentrepo.delete(id);
		
	}
	
public void updatepresident(long id, President president) {
	
	presidentrepo.save(president);
	
	
}

public President getpresident(long id)
{
	
	return (President) presidentrepo.findOne(id);
}

public List<President>getallpresident()
{
	
	List<President> president=new ArrayList<>();
	presidentrepo.findAll()
	.forEach(president::add);
	
	return president;
}

}
