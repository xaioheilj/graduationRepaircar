package com.graduationdesign.lj.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.graduationdesign.lj.springboot.pojo.Bill;

@Mapper
public interface BillMapper {
	int saveBill(Bill bill);
	
	@Select("select * from t_bill order by id DESC limit 1")
	 List<Bill> findBillID(Bill bill);
	
	@Select("select * from t_bill")
	List<Bill> findAll();

}
