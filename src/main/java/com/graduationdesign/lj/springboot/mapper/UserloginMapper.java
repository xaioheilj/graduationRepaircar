package com.graduationdesign.lj.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.graduationdesign.lj.springboot.pojo.Userlogin;

/*
 * 注册登录
 */

@Mapper
public interface UserloginMapper {
	
	@Select("select * from t_user ")
	List<Userlogin> findAll();
     
    @Insert(" insert into t_user ( phone,password,role_id ) values (#{phone},#{password},#{role_id}) ")
    public int saveUser(Userlogin userlogin); 
    
    
    @Insert(" insert into t_merc ( name,mail ) values (#{name},#{mail}) ")
    public int saveMerc(Userlogin userlogin); 
    
    @Insert(" insert into t_cust ( name,mail ) values (#{name},#{mail}) ")
    public int saveCust(Userlogin userlogin); 
    
    @Select("select t_merc.id from t_merc order by id DESC limit 1;")
    public int selectMercId();
    
    @Select("select t_cust.id from t_cust order by id DESC limit 1;")
    public int selectCustId();
    
    @Select("select t_user.id from t_user order by id DESC limit 1;")
    public int selectUserId();
    
    @Update("update t_user set person_id = #{person_id} where id = #{id}")
    public int savePersonId(Userlogin userlogin); 
    
//    @Select("select * from t_user where phone=#{phone} and password=#{password}")
//    public Userlogin login1(@Param("phone") String phone,@Param("password") String password);
    
    @Select("select * from t_user where phone=#{phone} and password=#{password}")
		List<Userlogin> login(Userlogin user);
    
//    @Select("select * from category_ where id= #{id} ")
//    public Category get(int id);
/*       
    @Update("update category_ set name=#{name} where id=#{id} ")
    public int update(Userlogin userlogin);  
*/
}
