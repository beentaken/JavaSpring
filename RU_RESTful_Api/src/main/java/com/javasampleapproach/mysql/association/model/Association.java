package com.javasampleapproach.mysql.association.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "association" )
public class Association implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "ref_id")
	private long ref_id;

	@Column(name = "number_of_association")
	private String number_of_association;
	
	@Column(name = "name_of_association")
	private String name_of_association;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRef_id() {
		return ref_id;
	}

	public void setRef_id(long ref_id) {
		this.ref_id = ref_id;
	}

	public String getNumber_of_association() {
		return number_of_association;
	}

	public void setNumber_of_association(String number_of_association) {
		this.number_of_association = number_of_association;
	}

	public String getName_of_association() {
		return name_of_association;
	}

	public void setName_of_association(String name_of_association) {
		this.name_of_association = name_of_association;
	}

	@Override
	public String toString() {
		return "Association [id=" + id + ", ref_id=" + ref_id + ", number_of_association=" + number_of_association
				+ ", name_of_association=" + name_of_association + "]";
	}
	
	
	
	
	
	
	
	
}
