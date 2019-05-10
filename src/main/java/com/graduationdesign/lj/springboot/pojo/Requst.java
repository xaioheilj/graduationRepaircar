package com.graduationdesign.lj.springboot.pojo;

import java.util.Date;





public class Requst {
	private int id;	
	private String name;
	private String phone;
	private String adress;
	private String requst_detail;
	private String requstpic_local;
	private int cust_id;
	private float total_price;
	private Date datetime;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getRequst_detail() {
		return requst_detail;
	}
	public void setRequst_detail(String requst_detail) {
		this.requst_detail = requst_detail;
	}
	public String getRequstpic_local() {
		return requstpic_local;
	}
	public void setRequstpic_local(String requstpic_local) {
		this.requstpic_local = requstpic_local;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public float getTotal_price() {
		return total_price;
	}
	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	

}
