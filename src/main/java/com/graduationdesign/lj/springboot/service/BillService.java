package com.graduationdesign.lj.springboot.service;

import java.util.List;

import com.graduationdesign.lj.springboot.pojo.Bill;

public interface BillService {
	List<Bill> findLastbill(Bill bill);

}
