package com.javasampleapproach.mysql.association.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "secratary" )
public class Secratary implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "name_of_secratary")
	private String name_of_secratary;
	
	@Column(name = "contact_info")
	private String contact_info;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName_of_secratary() {
		return name_of_secratary;
	}

	public void setName_of_secratary(String name_of_secratary) {
		this.name_of_secratary = name_of_secratary;
	}

	public String getContact_info() {
		return contact_info;
	}

	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}

	@Override
	public String toString() {
		return "Secratary [id=" + id + ", name_of_secratary=" + name_of_secratary + ", contact_info=" + contact_info
				+ "]";
	}
	
	
}