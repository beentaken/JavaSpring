package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "helpcenter" )
public class HelpCenter implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "helpinfo")
	private String helpinfo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHelpinfo() {
		return helpinfo;
	}

	public void setHelpinfo(String helpinfo) {
		this.helpinfo = helpinfo;
	}

	@Override
	public String toString() {
		return "HelpCenter [id=" + id + ", helpinfo=" + helpinfo + "]";
	}
	

	
	

}
