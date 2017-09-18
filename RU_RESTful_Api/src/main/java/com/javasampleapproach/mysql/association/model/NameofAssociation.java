package com.javasampleapproach.mysql.association.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nameofassociation" )
public class NameofAssociation implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "president_info")
	private String president_info;
	
	@Column(name = "secratary_info")
	private String secratary_info;
	
	@Column(name = "activity_info")
	private String activity_info;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPresident_info() {
		return president_info;
	}

	public void setPresident_info(String president_info) {
		this.president_info = president_info;
	}

	public String getSecratary_info() {
		return secratary_info;
	}

	public void setSecratary_info(String secratary_info) {
		this.secratary_info = secratary_info;
	}

	public String getActivity_info() {
		return activity_info;
	}

	public void setActivity_info(String activity_info) {
		this.activity_info = activity_info;
	}

	@Override
	public String toString() {
		return "NameofAssociation [id=" + id + ", location=" + location + ", president_info=" + president_info
				+ ", secratary_info=" + secratary_info + ", activity_info=" + activity_info + "]";
	}
	
	
	
}