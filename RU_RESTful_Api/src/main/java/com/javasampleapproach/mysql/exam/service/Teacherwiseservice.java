package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examteacherwise;
import com.javasampleapproach.mysql.exam.model.Teacherwise;
import com.javasampleapproach.mysql.exam.repo.Examteacherwiserepository;
import com.javasampleapproach.mysql.exam.repo.Teacherwiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.DateRepository;

@Service
public class Teacherwiseservice {
	
	@Autowired
	private Teacherwiserepository teacherwiserepo;
	
	public void addteacherwise(Teacherwise teacherwise){
		teacherwiserepo.save(teacherwise);
		
	}
	
public void deleteteacherwise(long id) {
		
		teacherwiserepo.delete(id);
		
	}

public void updateteacherwise(long id,Teacherwise teacherwise) {
	
	teacherwiserepo.save(teacherwise);
	
	
}

public Teacherwise getteacherwise(long id)
{
	
	return (Teacherwise) teacherwiserepo.findOne(id);
}

public List<Teacherwise>getallteacherwise()
{
	
	List<Teacherwise> teacherwise=new ArrayList<>();
	teacherwiserepo.findAll()
	.forEach(teacherwise::add);
	
	return teacherwise;
}



}
