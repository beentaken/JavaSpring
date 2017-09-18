package com.javasampleapproach.mysql.hall.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.mysql.hall.model.Location;
import com.javasampleapproach.mysql.hall.repo.LocationRepository;
import com.javasampleapproach.mysql.model.Admission;
import com.javasampleapproach.mysql.model.Api;
import com.javasampleapproach.mysql.repo.ApiRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationrepo;
	
	public void addlocation(Location location){
		locationrepo.save(location);
		
	}
	
public void deletelocation(long id) {
		
		locationrepo.delete(id);
		
	}
public void updatelocation(long id, Location location) {
	
	locationrepo.save(location);
	
	
}

public Location getlocation(long id)
{
	
	return (Location) locationrepo.findOne(id);
}

public List<Location>getalllocation()
{
	
	List<Location> location=new ArrayList<>();
	locationrepo.findAll()
	.forEach(location::add);
	
	return location;
}


}
