package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.ResidentialStuff;
import com.javasampleapproach.mysql.hall.repo.ResidentialStuffRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class ResidentialStuffService {
	
	@Autowired
	private ResidentialStuffRepository residentialstuffrepo;
	
	public void addresidentialstuff(ResidentialStuff residentialstuff){
		residentialstuffrepo.save(residentialstuff);
		
	}
	
public void deleteresidentialstuff(long id) {
		
		residentialstuffrepo.delete(id);
		
	}

public void updateresidentialstuff(long id,ResidentialStuff residentialstuff) {
	
	residentialstuffrepo.save(residentialstuff);
	
	
}

public ResidentialStuff getresidentialstuff(long id)
{
	
	return (ResidentialStuff) residentialstuffrepo.findOne(id);
}

public List<ResidentialStuff>getallresidentialstuff()
{
	
	List<ResidentialStuff> residentialstuff=new ArrayList<>();
	residentialstuffrepo.findAll()
	.forEach(residentialstuff::add);
	
	return residentialstuff;
}


}
