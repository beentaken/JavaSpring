package com.javasampleapproach.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.mysql.model.Api;

public interface ApiRepository extends CrudRepository<Api, Long >{



 

// List<Api> findbyapi_name(String api_name);



//Object findbyapi_name(String api_name);




	
}
