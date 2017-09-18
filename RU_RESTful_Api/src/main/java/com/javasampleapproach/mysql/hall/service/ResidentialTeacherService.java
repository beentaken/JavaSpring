package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.ResidentialTeacher;
import com.javasampleapproach.mysql.hall.repo.ResidentialTeacherRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class ResidentialTeacherService {
	
	@Autowired
	private ResidentialTeacherRepository residentialteacherrepo;
	
	public void addresidentialteacher(ResidentialTeacher residentialteacher){
		residentialteacherrepo.save(residentialteacher);
		
	}
	
public void deleteresidentialteacher(long id) {
		
		residentialteacherrepo.delete(id);
		
	}

public void updateresidentialteacher(long id, ResidentialTeacher residentialteacher) {
	
	residentialteacherrepo.save(residentialteacher);
	
	
}

public ResidentialTeacher getresidentialteacher(long id)
{
	
	return (ResidentialTeacher) residentialteacherrepo.findOne(id);
}

public List<ResidentialTeacher>getallresidentailteacher()
{
	
	List<ResidentialTeacher> residentialteacher=new ArrayList<>();
	residentialteacherrepo.findAll()
	.forEach(residentialteacher::add);
	
	return residentialteacher;
}


}
