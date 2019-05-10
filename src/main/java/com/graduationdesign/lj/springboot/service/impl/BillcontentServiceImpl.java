package com.graduationdesign.lj.springboot.service.impl;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.graduationdesign.lj.springboot.config.BillSessionUtils;
import com.graduationdesign.lj.springboot.mapper.BillcontentMapper;
import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.pojo.Billcontent;
import com.graduationdesign.lj.springboot.service.BillService;
import com.graduationdesign.lj.springboot.service.BillcontentService;

@Service
public class BillcontentServiceImpl implements BillcontentService {

	
	@Autowired
	private BillcontentMapper billcontentMapper;
		
	@Autowired
	private BillService billservice;
	
	@Autowired
	private HttpServletRequest request;
	

	public void addBillcontent(Billcontent billcontent) {
		// TODO Auto-generated method stub
		//BillcontentServiceImpl bcs = new BillcontentServiceImpl();		
		//billcontent.setBill_id(bcs.getRequstServiceImpl().getBID());
		
		/*bcs.getRequstServiceImpl().getReID();*/
		
		
//		RequstServiceImpl res = new RequstServiceImpl();
//		System.out.println(res.getBID());
//		billcontent.setBill_id(res.getBID());		
//		System.out.println(requstServiceImpl.getBID());
//		billcontent.setBill_id(requstServiceImpl.getBID());
				
		billcontentMapper.saveBillcontent(billcontent);
		
	}	

}
