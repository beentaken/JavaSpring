package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "routine" )
public class Routine implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "routine_info")
	private String routine_info;




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getRoutine_info() {
		return routine_info;
	}




	public void setRoutine_info(String routine_info) {
		this.routine_info = routine_info;
	}




	@Override
	public String toString() {
		return "Routine [id=" + id + ", routine_info=" + routine_info + "]";
	}
	
}