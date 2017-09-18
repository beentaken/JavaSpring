package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examschedule" )
public class Examschedule implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	

	@Column(name = "datewise_examschedule")
	private String datewise_examschedule;
	
	@Column(name = "timewise_examschedule")
	private String timewise_examschedule;
	
	@Column(name = "teacherwise_examschedule")
	private String teacherwise_examschedule;
	
	@Column(name = "semesterwise_examschedule")
	private String semesterwise_examschedule;
	
	@Column(name = "yearwise_examschedule")
	private String yearwise_examschedule;
	
	@Column(name = "coursewise_examschedule")
	private String coursewise_examschedule;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDatewise_examschedule() {
		return datewise_examschedule;
	}

	public void setDatewise_examschedule(String datewise_examschedule) {
		this.datewise_examschedule = datewise_examschedule;
	}

	public String getTimewise_examschedule() {
		return timewise_examschedule;
	}

	public void setTimewise_examschedule(String timewise_examschedule) {
		this.timewise_examschedule = timewise_examschedule;
	}

	public String getTeacherwise_examschedule() {
		return teacherwise_examschedule;
	}

	public void setTeacherwise_examschedule(String teacherwise_examschedule) {
		this.teacherwise_examschedule = teacherwise_examschedule;
	}

	public String getSemesterwise_examschedule() {
		return semesterwise_examschedule;
	}

	public void setSemesterwise_examschedule(String semesterwise_examschedule) {
		this.semesterwise_examschedule = semesterwise_examschedule;
	}

	public String getYearwise_examschedule() {
		return yearwise_examschedule;
	}

	public void setYearwise_examschedule(String yearwise_examschedule) {
		this.yearwise_examschedule = yearwise_examschedule;
	}

	public String getCoursewise_examschedule() {
		return coursewise_examschedule;
	}

	public void setCoursewise_examschedule(String coursewise_examschedule) {
		this.coursewise_examschedule = coursewise_examschedule;
	}

	@Override
	public String toString() {
		return "Examschedule [id=" + id + ", datewise_examschedule=" + datewise_examschedule
				+ ", timewise_examschedule=" + timewise_examschedule + ", teacherwise_examschedule="
				+ teacherwise_examschedule + ", semesterwise_examschedule=" + semesterwise_examschedule
				+ ", yearwise_examschedule=" + yearwise_examschedule + ", coursewise_examschedule="
				+ coursewise_examschedule + "]";
	}

	
	
}
	
	