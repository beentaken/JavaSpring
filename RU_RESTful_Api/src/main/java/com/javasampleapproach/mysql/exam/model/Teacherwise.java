package com.javasampleapproach.mysql.exam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "teacherwise" )
public class Teacherwise implements Serializable {
	
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

	
	
	
	
}