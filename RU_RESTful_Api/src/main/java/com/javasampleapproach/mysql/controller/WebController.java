package com.javasampleapproach.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.AdmissionRepository;
import com.javasampleapproach.mysql.repo.ApiRepository;


@RestController
public class WebController {
	@Autowired
	ApiRepository repository;
	
	@Autowired
	AdmissionRepository repoAdm;
	

	@RequestMapping("/api")
	public String findAll(){
		String result = "<html>";
		
		for(Api cust : repository.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping("/api/admission")
	public String findbyAdmission(){
		String result = "<html>";
		
		for(Admission cust : repoAdm.findAll()){
			result += "<div>" + cust.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
//	@RequestMapping("/names")
//	public String fetchDataByapi_name(@RequestParam("api_name") String api_name){
//		String result = "";
//		result = repository.findbyapi_name(api_name).toString();
//		return result;
//		
//	}
	
//	@RequestMapping("/Apiname")
//	public String fetchDataByapi_name(@RequestParam("api_name") String api_name){
//		String result = "<html>";
//	
//		
//		for(Api cust: repository.findbyapi_name(api_name)){
//			result += "<div>" + cust.toString() + "</div>"; 
//			
//		}
//		
//		return result + "</html>";
//	
//	}
}