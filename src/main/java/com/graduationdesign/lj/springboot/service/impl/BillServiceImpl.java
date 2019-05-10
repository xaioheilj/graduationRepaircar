package com.graduationdesign.lj.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduationdesign.lj.springboot.mapper.BillMapper;
import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.service.BillService;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired 
	private BillMapper billMapper;

	public List<Bill> findLastbill(Bill bill) {
		// TODO Auto-generated method stub
		return billMapper.findBillID(bill);
	}

}
