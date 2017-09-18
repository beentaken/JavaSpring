package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.StudentResidence;
import com.javasampleapproach.mysql.hall.repo.StudentResidenceRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class StudentResidenceService {
	
	@Autowired
	private StudentResidenceRepository studentresidencerepo;
	
	public void addstudentresidence(StudentResidence studentresidence){
		studentresidencerepo.save(studentresidence);
		
	}
	
public void deletestudentresidence(long id) {
		
		studentresidencerepo.delete(id);
		
	}

public void updatestudentresidence(long id,StudentResidence studentresidence ) {
	
	studentresidencerepo.save(studentresidence);
	
	
}

public StudentResidence getstudentresidence(long id)
{
	
	return (StudentResidence)studentresidencerepo.findOne(id);
}

public List<StudentResidence>getallstudentresidence()
{
	
	List<StudentResidence> studentresidence=new ArrayList<>();
	studentresidencerepo.findAll()
	.forEach(studentresidence::add);
	
	return studentresidence;
}


}
