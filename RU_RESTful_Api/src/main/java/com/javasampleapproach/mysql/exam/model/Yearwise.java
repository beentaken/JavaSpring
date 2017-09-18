package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "yearwise" )
public class Yearwise implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	

	@Column(name = "year_info")
	private String year_info;



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getYear_info() {
		return year_info;
	}



	public void setYear_info(String year_info) {
		this.year_info = year_info;
	}



	@Override
	public String toString() {
		return "Yearwise [id=" + id + ", year_info=" + year_info + "]";
	}
	
	
	
	
}