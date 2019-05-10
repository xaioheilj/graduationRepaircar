package com.graduationdesign.lj.springboot.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.pojo.Billcontent;
import com.graduationdesign.lj.springboot.pojo.Requst;

public interface RequstService {
	void cusRequst(Requst requ);

	void addABill(Bill bill);
	 

}
