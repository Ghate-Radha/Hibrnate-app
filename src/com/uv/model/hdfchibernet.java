package com.uv.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name="hdfchibernet")
public class hdfchibernet implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private Integer hid;
	
	
	@Column(name="name")
	private String hname;


	public Integer getHid() {
		return hid;
	}


	public void setHid(Integer hid) {
		this.hid = hid;
	}


	public String getHname() {
		return hname;
	}


	public void setHname(String hname) {
		this.hname = hname;
	}


	@Override
	public String toString() {
		return "hdfchibernet [hid=" + hid + ", hname=" + hname + "]";
	}


	
	
  

}
