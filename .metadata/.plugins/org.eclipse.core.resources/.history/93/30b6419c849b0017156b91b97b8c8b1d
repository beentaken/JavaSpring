package com.javasampleapproach.mysql.hall.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "stuff" )
public class Stuff implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name = "num_of_stuff")
	private String num_of_stuff;
	
	@Column(name = "name_of_stuff")
	private String name_of_stuff;
	
	@Column(name = "contact_num_of_stuff")
	private String contact_num_of_stuff;
	
	@Column(name = "email_of_stuff")
	private String email_of_stuff;
	
	@Column(name = "designation_of_stuff")
	private String designation_of_stuff;
	
	@Column(name = "room_num_of_stuff")
	private String room_num_of_stuff;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNum_of_stuff() {
		return num_of_stuff;
	}

	public void setNum_of_stuff(String num_of_stuff) {
		this.num_of_stuff = num_of_stuff;
	}

	public String getName_of_stuff() {
		return name_of_stuff;
	}

	public void setName_of_stuff(String name_of_stuff) {
		this.name_of_stuff = name_of_stuff;
	}

	public String getContact_num_of_stuff() {
		return contact_num_of_stuff;
	}

	public void setContact_num_of_stuff(String contact_num_of_stuff) {
		this.contact_num_of_stuff = contact_num_of_stuff;
	}

	public String getEmail_of_stuff() {
		return email_of_stuff;
	}

	public void setEmail_of_stuff(String email_of_stuff) {
		this.email_of_stuff = email_of_stuff;
	}

	public String getDesignation_of_stuff() {
		return designation_of_stuff;
	}

	public void setDesignation_of_stuff(String designation_of_stuff) {
		this.designation_of_stuff = designation_of_stuff;
	}

	public String getRoom_num_of_stuff() {
		return room_num_of_stuff;
	}

	public void setRoom_num_of_stuff(String room_num_of_stuff) {
		this.room_num_of_stuff = room_num_of_stuff;
	}

	@Override
	public String toString() {
		return "Stuff [id=" + id + ", num_of_stuff=" + num_of_stuff + ", name_of_stuff=" + name_of_stuff
				+ ", contact_num_of_stuff=" + contact_num_of_stuff + ", email_of_stuff=" + email_of_stuff
				+ ", designation_of_stuff=" + designation_of_stuff + ", room_num_of_stuff=" + room_num_of_stuff + "]";
	}
	
	
	
}