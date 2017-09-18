package com.javasampleapproach.mysql.association.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.association.model.Activities;
import com.javasampleapproach.mysql.association.repo.ActivityRepository;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;



@Service
public class ActivitiesService {
	
	@Autowired
	private ActivityRepository activityrepo;
	
	public void addactivity(Activities activities){
		activityrepo.save(activities);
		
	}
	
public void deleteactivity(long id) {
		
		activityrepo.delete(id);
		
	}
	
public void updateactivity(long id, Activities activities) {
	
	activityrepo.save(activities);
	
	
}

public Activities getactivity(long id)
{
	
	return (Activities) activityrepo.findOne(id);
}

public List<Activities>getallactivity()
{
	
	List<Activities> activity=new ArrayList<>();
	activityrepo.findAll()
	.forEach(activity::add);
	
	return activity;
}

}
