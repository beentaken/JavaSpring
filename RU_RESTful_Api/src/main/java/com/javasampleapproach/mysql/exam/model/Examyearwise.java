package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "examyearwise" )
public class Examyearwise implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "year_examinfo")
	private String year_examinfo;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getYear_examinfo() {
		return year_examinfo;
	}


	public void setYear_examinfo(String year_examinfo) {
		this.year_examinfo = year_examinfo;
	}


	@Override
	public String toString() {
		return "Examyearwise [id=" + id + ", year_examinfo=" + year_examinfo + "]";
	}
	
	
	
}