package com.javasampleapproach.mysql.association.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.association.model.Secratary;
import com.javasampleapproach.mysql.association.repo.SecrataryRepository;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class SecrataryService {
	
	@Autowired
	private SecrataryRepository secrataryrepo;
	
	public void addsecratary(Secratary secratary){
		secrataryrepo.save(secratary);
		
	}
	
public void deletesecratary(long id) {
		
		secrataryrepo.delete(id);
		
	}
	
public void updatesecratary(long id, Secratary secratary) {
	
	secrataryrepo.save(secratary);
	
	
}

public Secratary getsecratary(long id)
{
	
	return (Secratary) secrataryrepo.findOne(id);
}

public List<Secratary>getallsecratary()
{
	
	List<Secratary> secratary=new ArrayList<>();
	secrataryrepo.findAll()
	.forEach(secratary::add);
	
	return secratary;
}

}
