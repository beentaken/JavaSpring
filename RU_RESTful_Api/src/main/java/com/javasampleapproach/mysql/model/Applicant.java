package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicant" )
public class Applicant implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	
	@Column(name = "applicant_info")
	private String applicant_info;



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getApplicant_info() {
		return applicant_info;
	}



	public void setApplicant_info(String applicant_info) {
		this.applicant_info = applicant_info;
	}



	@Override
	public String toString() {
		return "Applicant [id=" + id + ", applicant_info=" + applicant_info + "]";
	}
	
	
}