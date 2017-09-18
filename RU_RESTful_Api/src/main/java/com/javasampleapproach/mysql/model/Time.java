package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time" )
public class Time implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "time_info")
	private String time_info;




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getTime_info() {
		return time_info;
	}




	public void setTime_info(String time_info) {
		this.time_info = time_info;
	}




	@Override
	public String toString() {
		return "Time [id=" + id + ", time_info=" + time_info + "]";
	}
	
	
	
}
