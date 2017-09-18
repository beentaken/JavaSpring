package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.NameofHall;
import com.javasampleapproach.mysql.hall.repo.NameofHallRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class NameofHallService {
	
	@Autowired
	private NameofHallRepository nameofhallrepo;
	
	public void addnameofhall(NameofHall nameofhall){
		nameofhallrepo.save(nameofhall);
		
	}
	
public void deletenameofhall(long id) {
		
		nameofhallrepo.delete(id);
		
	}

public void updatenameofhall(long id, NameofHall nameofhall) {
	
	nameofhallrepo.save(nameofhall);
	
	
}

public NameofHall getnameofhall(long id)
{
	
	return (NameofHall) nameofhallrepo.findOne(id);
}

public List<NameofHall>getallnameofhall()
{
	
	List<NameofHall> nameofhall=new ArrayList<>();
	nameofhallrepo.findAll()
	.forEach(nameofhall::add);
	
	return nameofhall;
}

	

}
