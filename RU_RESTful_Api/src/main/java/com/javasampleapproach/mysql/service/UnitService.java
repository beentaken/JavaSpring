package com.javasampleapproach.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Unit;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.UnitRepository;

@Service
public class UnitService {
	
	@Autowired
	private UnitRepository unitrepo;
	
	public void addunit(Unit unit){
		unitrepo.save(unit);
		
	}
	
public void deleteunit(long id) {
		
		unitrepo.delete(id);
		
	}
	
public void updateunit(long id, Unit unit) {
	
	unitrepo.save(unit);
	
	
}

public Unit getunit(long id)
{
	
	return (Unit) unitrepo.findOne(id);
}

public List<Unit>getallunit()
{
	
	List<Unit> unit=new ArrayList<>();
	unitrepo.findAll()
	.forEach(unit::add);
	
	return unit;
}

}
