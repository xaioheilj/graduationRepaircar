package com.graduationdesign.lj.springboot.pojo;

import java.util.Date;

public class Bill {
	private int id;
	private int requst_id;
	private float final_price;
	private Date billData;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRequst_id() {
		return requst_id;
	}
	public void setRequst_id(int requst_id) {
		this.requst_id = requst_id;
	}
	public float getFinal_price() {
		return final_price;
	}
	public void setFinal_price(float final_price) {
		this.final_price = final_price;
	}
	public Date getBillData() {
		return billData;
	}
	public void setBillData(Date billData) {
		this.billData = billData;
	}
	
	

}
