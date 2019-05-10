package com.graduationdesign.lj.springboot.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.pojo.Billcontent;
import com.graduationdesign.lj.springboot.pojo.Requst;
import com.graduationdesign.lj.springboot.pojo.Userlogin;

@Mapper
public interface RequstMapper {
	/* @Insert(" insert into t_requst (name,cust_id,phone,adress,requst_detail,datetime ) values (#{c_name},#{cust_id},#{c_phone},#{adress},#{requst_detail},#{datetime}) ")
	    public int saveRequst(Requst requst); */
	
	 int saveRequst(Requst requst);
	
	 @Select("select * from t_requst")
	 List<Requst> findAll();
	 
	 @Select("select * from t_requst where id=#{id}")
	 List<Requst> findDetail(int id);
	 
	 /*@Select("select * from t_billcontent where bill_id in (select id from t_bill where requst_id in (select id from t_requst where id=#{id}))")
	  List<Billcontent> getBillcontent(int id);*/
	 
	 @Select("select * from t_requst where id in (select requst_id from t_bill where id=#{id})")
	 List<Requst> findDetailInMer(int id);
	 
	 
	

}
