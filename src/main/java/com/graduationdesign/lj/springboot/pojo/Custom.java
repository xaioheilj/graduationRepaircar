package com.graduationdesign.lj.springboot.pojo;

import java.util.List;

public class Custom {
	
	private int id;
	private String name;
	private String mail;
	List<Requst> requst;
	public List<Requst> getRequst() {
		return requst;
	}
	public void setRequst(List<Requst> requst) {
		this.requst = requst;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}
	
	

}
