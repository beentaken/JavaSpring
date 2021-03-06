package com.javasampleapproach.mysql.association.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * 
 * 
 * @author 
 *
 */
@Entity
@Table(name = "president" )
public class President implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "name_of_president")
	private String name_of_president;
	
	@Column(name = "contact_info")
	private String contact_info;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName_of_president() {
		return name_of_president;
	}

	public void setName_of_president(String name_of_president) {
		this.name_of_president = name_of_president;
	}

	public String getContact_info() {
		return contact_info;
	}

	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}

	@Override
	public String toString() {
		return "President [id=" + id + ", name_of_president=" + name_of_president + ", contact_info=" + contact_info
				+ "]";
	}
	
	
	
}