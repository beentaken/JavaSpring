package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examteacherwise" )
public class Examteacherwise implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "nameofteacher_info1")
	private String nameofteacher_info1;
	
	@Column(name = "building_info1")
	private String building_info1;
	
	@Column(name = "room_info1")
	private String room_info1;
	
	@Column(name = "coursetitle_info1")
	private String coursetitle_info1;
	
	@Column(name = "coursecode_info1")
	private String coursecode_info1;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameofteacher_info1() {
		return nameofteacher_info1;
	}

	public void setNameofteacher_info1(String nameofteacher_info1) {
		this.nameofteacher_info1 = nameofteacher_info1;
	}

	public String getBuilding_info1() {
		return building_info1;
	}

	public void setBuilding_info1(String building_info1) {
		this.building_info1 = building_info1;
	}

	public String getRoom_info1() {
		return room_info1;
	}

	public void setRoom_info1(String room_info1) {
		this.room_info1 = room_info1;
	}

	public String getCoursetitle_info1() {
		return coursetitle_info1;
	}

	public void setCoursetitle_info1(String coursetitle_info1) {
		this.coursetitle_info1 = coursetitle_info1;
	}

	public String getCoursecode_info1() {
		return coursecode_info1;
	}

	public void setCoursecode_info1(String coursecode_info1) {
		this.coursecode_info1 = coursecode_info1;
	}

	@Override
	public String toString() {
		return "Examteacherwise [id=" + id + ", nameofteacher_info1=" + nameofteacher_info1 + ", building_info1="
				+ building_info1 + ", room_info1=" + room_info1 + ", coursetitle_info1=" + coursetitle_info1
				+ ", coursecode_info1=" + coursecode_info1 + "]";
	}


	
}