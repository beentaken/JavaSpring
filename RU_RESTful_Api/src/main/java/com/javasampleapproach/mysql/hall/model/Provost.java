package com.javasampleapproach.mysql.hall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provost" )
public class Provost implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "name_of_provost")
	private String name_of_provost;
	
	@Column(name = "contact_num_of_provost")
	private String contact_num_of_provost;
	
	@Column(name = "email_of_provost")
	private String email_of_provost;
	
	@Column(name = "designation_of_provost")
	private String designation_of_provost;
	
	@Column(name = "room_num_of_provost")
	private String room_num_of_provost;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName_of_provost() {
		return name_of_provost;
	}

	public void setName_of_provost(String name_of_provost) {
		this.name_of_provost = name_of_provost;
	}

	public String getContact_num_of_provost() {
		return contact_num_of_provost;
	}

	public void setContact_num_of_provost(String contact_num_of_provost) {
		this.contact_num_of_provost = contact_num_of_provost;
	}

	public String getEmail_of_provost() {
		return email_of_provost;
	}

	public void setEmail_of_provost(String email_of_provost) {
		this.email_of_provost = email_of_provost;
	}

	public String getDesignation_of_provost() {
		return designation_of_provost;
	}

	public void setDesignation_of_provost(String designation_of_provost) {
		this.designation_of_provost = designation_of_provost;
	}

	public String getRoom_num_of_provost() {
		return room_num_of_provost;
	}

	public void setRoom_num_of_provost(String room_num_of_provost) {
		this.room_num_of_provost = room_num_of_provost;
	}

	@Override
	public String toString() {
		return "Provost [id=" + id + ", name_of_provost=" + name_of_provost + ", contact_num_of_provost="
				+ contact_num_of_provost + ", email_of_provost=" + email_of_provost + ", designation_of_provost="
				+ designation_of_provost + ", room_num_of_provost=" + room_num_of_provost + "]";
	}
	
	
	
}