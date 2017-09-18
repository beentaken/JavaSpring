package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule" )
public class Schedule implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "classschedule_info")
	private String classschedule_info;

	@Column(name = "examschedule_info")
	private String examschedule_info;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassschedule_info() {
		return classschedule_info;
	}

	public void setClassschedule_info(String classschedule_info) {
		this.classschedule_info = classschedule_info;
	}

	public String getExamschedule_info() {
		return examschedule_info;
	}

	public void setExamschedule_info(String examschedule_info) {
		this.examschedule_info = examschedule_info;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", classschedule_info=" + classschedule_info + ", examschedule_info="
				+ examschedule_info + "]";
	}



	
	
	
	
}
	
	