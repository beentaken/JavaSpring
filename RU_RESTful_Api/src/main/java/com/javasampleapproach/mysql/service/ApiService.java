package com.javasampleapproach.mysql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class ApiService {
	
	@Autowired
	private ApiRepository apirepo;
	
	public void addapi(Api api){
		apirepo.save(api);
		
	}
	
public void deleteapi(long id) {
		
		apirepo.delete(id);
		
	}

public void updateapi(long id, Api api) {
	
	apirepo.save(api);
	
	
}

public Api getapi(long id)
{
	
	return (Api) apirepo.findOne(id);
}

public List<Api>getallapi()
{
	
	List<Api> api=new ArrayList<>();
	apirepo.findAll()
	.forEach(api::add);
	
	return api;
}

}
