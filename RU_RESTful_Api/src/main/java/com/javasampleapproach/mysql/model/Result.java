package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "result" )
public class Result implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "result_info")
	private String result_info;




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getResult_info() {
		return result_info;
	}




	public void setResult_info(String result_info) {
		this.result_info = result_info;
	}




	@Override
	public String toString() {
		return "Result [id=" + id + ", result_info=" + result_info + "]";
	}
	
	
	
}
