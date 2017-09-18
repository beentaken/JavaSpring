package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.Stuff;
import com.javasampleapproach.mysql.hall.repo.StuffRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class StuffService {
	
	@Autowired
	private StuffRepository stuffrepo;
	
	public void addstuff(Stuff stuff){
		stuffrepo.save(stuff);
		
	}
	
public void deletestuff(long id) {
		
		stuffrepo.delete(id);
		
	}

public void updatestuff(long id,Stuff stuff) {
	
	stuffrepo.save(stuff);
	
	
}

public Stuff getstuff(long id)
{
	
	return (Stuff) stuffrepo.findOne(id);
}

public List<Stuff>getallstuff()
{
	
	List<Stuff> stuff=new ArrayList<>();
	stuffrepo.findAll()
	.forEach(stuff::add);
	
	return stuff;
}


}
