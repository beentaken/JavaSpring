package com.javasampleapproach.mysql.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.exam.model.Examsemesterwise;
import com.javasampleapproach.mysql.exam.model.Examteacherwise;
import com.javasampleapproach.mysql.exam.repo.Examsemesterwiserepository;
import com.javasampleapproach.mysql.exam.repo.Examteacherwiserepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.HelpCenter;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.HelpCenterRepository;

@Service
public class Examteacherwiseservice {
	
	@Autowired
	private Examteacherwiserepository examteacherwiserepo;
	
	public void addexamteacherwise(Examteacherwise examteacherwise){
		examteacherwiserepo.save(examteacherwise);
		
	}
	
public void deleteexamteacherwise(long id) {
		
		examteacherwiserepo.delete(id);
		
	}

public void updateexamteacherwise(long id,Examteacherwise examteacherwise) {
	
	examteacherwiserepo.save(examteacherwise);
	
	
}

public Examteacherwise getexamteacherwise(long id)
{
	
	return (Examteacherwise) examteacherwiserepo.findOne(id);
}

public List<Examteacherwise>getallexamteacherwise()
{
	
	List<Examteacherwise> examteacherwise=new ArrayList<>();
	examteacherwiserepo.findAll()
	.forEach(examteacherwise::add);
	
	return examteacherwise;
}



}
