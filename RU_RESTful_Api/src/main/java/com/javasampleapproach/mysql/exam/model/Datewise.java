package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datewise" )
public class Datewise implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	
	@Column(name = "date_info")
	private String date_info;
	
	@Column(name = "building_info")
	private String building_info;
	
	@Column(name = "room_info")
	private String room_info;
	
	@Column(name = "coursetitle_info")
	private String coursetitle_info;
	
	@Column(name = "coursecode_info")
	private String coursecode_info;

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

	public String getBuilding_info() {
		return building_info;
	}

	public void setBuilding_info(String building_info) {
		this.building_info = building_info;
	}

	public String getRoom_info() {
		return room_info;
	}

	public void setRoom_info(String room_info) {
		this.room_info = room_info;
	}

	public String getCoursetitle_info() {
		return coursetitle_info;
	}

	public void setCoursetitle_info(String coursetitle_info) {
		this.coursetitle_info = coursetitle_info;
	}

	public String getCoursecode_info() {
		return coursecode_info;
	}

	public void setCoursecode_info(String coursecode_info) {
		this.coursecode_info = coursecode_info;
	}

	@Override
	public String toString() {
		return "Datewise [id=" + id + ", date_info=" + date_info + ", building_info=" + building_info + ", room_info="
				+ room_info + ", coursetitle_info=" + coursetitle_info + ", coursecode_info=" + coursecode_info + "]";
	}



	
	
	
}
	
	