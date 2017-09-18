package com.javasampleapproach.mysql.hall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "capacity" )
public class Capacity implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "capacity_info")
	private String capacity_info;




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getCapacity_info() {
		return capacity_info;
	}




	public void setCapacity_info(String capacity_info) {
		this.capacity_info = capacity_info;
	}




	@Override
	public String toString() {
		return "Capacity [id=" + id + ", capacity_info=" + capacity_info + "]";
	}
	
	
	
}
	
	