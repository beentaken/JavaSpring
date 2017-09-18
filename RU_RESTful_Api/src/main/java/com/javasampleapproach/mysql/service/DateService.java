package com.javasampleapproach.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.model.Date;
import com.javasampleapproach.mysql.repo.ApiRepository;
import com.javasampleapproach.mysql.repo.DateRepository;

@Service
public class DateService {
	
	@Autowired
	private DateRepository daterepo;
	
	public void adddate(Date date){
		daterepo.save(date);
		
	}
	
public void deletedate(long id) {
		
		daterepo.delete(id);
		
	}

public void updatedate(long id, Date date) {
	
	daterepo.save(date);
	
	
}

public Date getdate(long id)
{
	
	return (Date) daterepo.findOne(id);
}

public List<Date>getalldate()
{
	
	List<Date> date=new ArrayList<>();
	daterepo.findAll()
	.forEach(date::add);
	
	return date;
}


	

}
