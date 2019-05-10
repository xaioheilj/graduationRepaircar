package com.graduationdesign.lj.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.pojo.Billcontent;
import com.graduationdesign.lj.springboot.pojo.Userlogin;


@Mapper
public interface BillcontentMapper {
	
	@Insert(" insert into t_billcontent ( item,price,bill_id ) values (#{item},#{price},#{bill_id}) ")
    public int saveBillcontent(Billcontent billcontent);
	
	@Select("select * from t_billcontent")
	List<Billcontent> findAll();
	
	@Delete(" delete from t_billcontent where id= #{id} ")
    public void deleteBillcontent(int id); 
	
	/*@Select("select * from t_billcontent where t_billcontent.bill_id=t_bill.id")
	List<Billcontent> getBillcontent(int id);*/
	@Select("select * from t_billcontent where bill_id in (select id from t_bill where requst_id in (select id from t_requst where id=#{id}))")
	  List<Billcontent> getBillcontent(int id);
	
}
