package com.javasampleapproach.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Routine;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.RoutineRepository;

@Service
public class RoutineService {
	
	@Autowired
	private RoutineRepository routinerepo;
	
	public void addroutine(Routine routine){
		routinerepo.save(routine);
		
	}
	
public void deleteroutine(long id) {
		
		routinerepo.delete(id);
		
	}
	
public void updateroutine(long id,Routine routine) {
	
	routinerepo.save(routine);
	
	
}

public Routine getroutine(long id)
{
	
	return (Routine) routinerepo.findOne(id);
}

public List<Routine>getallroutine()
{
	
	List<Routine> routine=new ArrayList<>();
	routinerepo.findAll()
	.forEach(routine::add);
	
	return routine;
}

}

