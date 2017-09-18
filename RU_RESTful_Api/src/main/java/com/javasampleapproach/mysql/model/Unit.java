package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unit" )
public class Unit implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "num_of_applicant")
	private long num_of_applicant;
	
	@Column(name = "routine")
	private String routine;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "result")
	private String result;
	
	@Column(name = "seat_plan")
	private String seat_plan;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNum_of_applicant() {
		return num_of_applicant;
	}

	public void setNum_of_applicant(long num_of_applicant) {
		this.num_of_applicant = num_of_applicant;
	}

	public String getRoutine() {
		return routine;
	}

	public void setRoutine(String routine) {
		this.routine = routine;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getSeat_plan() {
		return seat_plan;
	}

	public void setSeat_plan(String seat_plan) {
		this.seat_plan = seat_plan;
	}

	@Override
	public String toString() {
		return "Unit [id=" + id + ", num_of_applicant=" + num_of_applicant + ", routine=" + routine + ", time=" + time
				+ ", result=" + result + ", seat_plan=" + seat_plan + "]";
	}

	
	
	
}