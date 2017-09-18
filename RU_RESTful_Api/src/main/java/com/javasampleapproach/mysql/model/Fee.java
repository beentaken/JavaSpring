package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fee" )
public class Fee implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	

	@Column(name = "fee_info")
	private String fee_info;



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getFee_info() {
		return fee_info;
	}



	public void setFee_info(String fee_info) {
		this.fee_info = fee_info;
	}



	@Override
	public String toString() {
		return "Fee [id=" + id + ", fee_info=" + fee_info + "]";
	}
	
	
}