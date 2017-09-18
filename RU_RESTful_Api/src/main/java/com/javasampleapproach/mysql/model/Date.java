package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "date" )
public class Date implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "date_info")
	private String date_info;




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getDate_info() {
		return date_info;
	}




	public void setDate_info(String date_info) {
		this.date_info = date_info;
	}




	@Override
	public String toString() {
		return "Date [id=" + id + ", date_info=" + date_info + "]";
	}
	
}