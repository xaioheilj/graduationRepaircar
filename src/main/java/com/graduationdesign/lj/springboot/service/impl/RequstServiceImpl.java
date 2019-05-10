package com.graduationdesign.lj.springboot.service.impl;


import java.text.Bidi;
import java.util.Date;










import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.graduationdesign.lj.springboot.config.BillSessionUtils;
import com.graduationdesign.lj.springboot.mapper.BillMapper;
import com.graduationdesign.lj.springboot.mapper.BillcontentMapper;
import com.graduationdesign.lj.springboot.mapper.RequstMapper;
import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.pojo.Billcontent;
import com.graduationdesign.lj.springboot.pojo.Requst;
import com.graduationdesign.lj.springboot.service.RequstService;


@Service
public class RequstServiceImpl implements RequstService{
	
	@Autowired 
	private RequstMapper requstmapper;
	
	@Autowired
	private BillMapper billMapper;
	
	@Autowired
	private BillcontentMapper billcontentMapper;
	
/*	@Autowired
	private HttpServletRequest request;*/
	
	public int reID;
	
	static int BID;
	

	public static int getBID() {
		return BID;
	}

	public static void setBID(int bID) {
		BID = bID;
	}

	public void cusRequst(Requst requ) {
		// TODO Auto-generated method stub
		
		 		
		Date requstDate = new Date();
		requ.setDatetime(requstDate);
		int requst = requstmapper.saveRequst(requ);
		reID = requ.getId();//id不是直接返回，需要这样返回
		/*requstmapper.saveRequst(requ)*/;
	}
	
	/*public int getReID() {
		return reID;
	}

	public void setReID(int reID) {
		this.reID = reID;
	}*/
	
	
	public void addABill(Bill bill){
		Date BillDate = new Date();
		bill.setBillData(BillDate);
		bill.setRequst_id(reID);		
		billMapper.saveBill(bill);
				
		BID = bill.getId();
//		System.out.println("re:"+BID);
		
		/*RequstServiceImpl rese  =new RequstServiceImpl();
		rese.setBID(BID1);*/
	//	System.out.println(BID);
		
	}
	
}
