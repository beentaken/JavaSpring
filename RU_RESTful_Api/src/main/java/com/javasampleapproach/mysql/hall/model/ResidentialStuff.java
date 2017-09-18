package com.javasampleapproach.mysql.hall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "residentstuff" )
public class ResidentialStuff implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	

	@Column(name = "total_num_of_resident")
	private String total_num_of_resident;
	
	@Column(name = "location_of_resident")
	private String location_of_resident;
	
	@Column(name = "building_num_of_resident")
	private String building_num_of_resident;
	
	@Column(name = "flat_num_of_resident")
	private String flat_num_of_resident;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTotal_num_of_resident() {
		return total_num_of_resident;
	}

	public void setTotal_num_of_resident(String total_num_of_resident) {
		this.total_num_of_resident = total_num_of_resident;
	}

	public String getLocation_of_resident() {
		return location_of_resident;
	}

	public void setLocation_of_resident(String location_of_resident) {
		this.location_of_resident = location_of_resident;
	}

	public String getBuilding_num_of_resident() {
		return building_num_of_resident;
	}

	public void setBuilding_num_of_resident(String building_num_of_resident) {
		this.building_num_of_resident = building_num_of_resident;
	}

	public String getFlat_num_of_resident() {
		return flat_num_of_resident;
	}

	public void setFlat_num_of_resident(String flat_num_of_resident) {
		this.flat_num_of_resident = flat_num_of_resident;
	}

	@Override
	public String toString() {
		return "ResidentialStuff [id=" + id + ", total_num_of_resident=" + total_num_of_resident
				+ ", location_of_resident=" + location_of_resident + ", building_num_of_resident="
				+ building_num_of_resident + ", flat_num_of_resident=" + flat_num_of_resident + "]";
	}
	
	
	
}
	
	