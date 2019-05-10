package com.graduationdesign.lj.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import com.graduationdesign.lj.springboot.pojo.Merchant;
import com.graduationdesign.lj.springboot.pojo.Userlogin;

@Mapper
public interface MerchantMapper {
	
//	@Select("select * from t_merc ")
//    List<Merchant> findAll();
     
    @Insert(" insert into t_merc ( name,mail ) values (#{name},#{mail}) ")
    public int save(Merchant merchant); 
    
//    @Select("select * from t_merc where id= #{id} ")
//    public Category get(int id);
//       
/*    @Update("update category_ set name=#{name} where id=#{id} ")
    public int update(Userlogin userlogin);  
*/

}
