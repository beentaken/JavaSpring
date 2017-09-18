package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Classschedule;
import com.javasampleapproach.mysql.exam.model.Schedule;
import com.javasampleapproach.mysql.exam.repo.Classschedulerepository;
import com.javasampleapproach.mysql.exam.repo.Schedulerepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Result;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.ResultRepository;

@Service
public class Scheduleservice {
	
	@Autowired
	private Schedulerepository schedulerepo;
	
	public void addschedule(Schedule schedule){
		schedulerepo.save(schedule);
		
	}
	
public void deleteschedule(long id) {
		
		schedulerepo.delete(id);
		
	}
	
public void updateschedule(long id, Schedule schedule) {
	
	schedulerepo.save(schedule);
	
	
}
public Schedule getschedule(long id)
{
	
	return (Schedule) schedulerepo.findOne(id);
}

public List<Schedule>getallschedule()
{
	
	List<Schedule>schedule =new ArrayList<>();
	schedulerepo.findAll()
	.forEach(schedule::add);
	
	return schedule;
}

}
