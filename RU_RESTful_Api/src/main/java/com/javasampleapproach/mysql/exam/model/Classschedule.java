package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classschedule" )
public class Classschedule implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "datewise_classschedule")
	private String datewise_classschedule;
	
	@Column(name = "timewise_classschedule")
	private String timewise_classschedule;
	
	@Column(name = "teacherwise_classschedule")
	private String teacherwise_classschedule;
	
	@Column(name = "semesterwise_classschedule")
	private String semesterwise_classschedule;
	
	@Column(name = "yearwise_classschedule")
	private String yearwise_classschedule;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDatewise_classschedule() {
		return datewise_classschedule;
	}

	public void setDatewise_classschedule(String datewise_classschedule) {
		this.datewise_classschedule = datewise_classschedule;
	}

	public String getTimewise_classschedule() {
		return timewise_classschedule;
	}

	public void setTimewise_classschedule(String timewise_classschedule) {
		this.timewise_classschedule = timewise_classschedule;
	}

	public String getTeacherwise_classschedule() {
		return teacherwise_classschedule;
	}

	public void setTeacherwise_classschedule(String teacherwise_classschedule) {
		this.teacherwise_classschedule = teacherwise_classschedule;
	}

	public String getSemesterwise_classschedule() {
		return semesterwise_classschedule;
	}

	public void setSemesterwise_classschedule(String semesterwise_classschedule) {
		this.semesterwise_classschedule = semesterwise_classschedule;
	}

	public String getYearwise_classschedule() {
		return yearwise_classschedule;
	}

	public void setYearwise_classschedule(String yearwise_classschedule) {
		this.yearwise_classschedule = yearwise_classschedule;
	}

	@Override
	public String toString() {
		return "Classschedule [id=" + id + ", datewise_classschedule=" + datewise_classschedule
				+ ", timewise_classschedule=" + timewise_classschedule + ", teacherwise_classschedule="
				+ teacherwise_classschedule + ", semesterwise_classschedule=" + semesterwise_classschedule
				+ ", yearwise_classschedule=" + yearwise_classschedule + "]";
	}
	
	

	
	
}
