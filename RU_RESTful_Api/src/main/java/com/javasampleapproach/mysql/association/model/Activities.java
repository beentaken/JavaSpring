package com.javasampleapproach.mysql.association.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity" )
public class Activities implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "activity_info")
	private String activity_info;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActivity_info() {
		return activity_info;
	}

	public void setActivity_info(String activity_info) {
		this.activity_info = activity_info;
	}

	@Override
	public String toString() {
		return "Activities [id=" + id + ", activity_info=" + activity_info + "]";
	}
	
	
}