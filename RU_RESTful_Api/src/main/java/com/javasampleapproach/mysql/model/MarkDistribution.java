package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mark_dis" )
public class MarkDistribution implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	

	@Column(name = "mark_distribution_info")
	private String mark_distribution_info;




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getMark_distribution_info() {
		return mark_distribution_info;
	}




	public void setMark_distribution_info(String mark_distribution_info) {
		this.mark_distribution_info = mark_distribution_info;
	}




	@Override
	public String toString() {
		return "MarkDistribution [id=" + id + ", mark_distribution_info=" + mark_distribution_info + "]";
	}
	
	
}
