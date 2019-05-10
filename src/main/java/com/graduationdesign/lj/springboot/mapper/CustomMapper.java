package com.graduationdesign.lj.springboot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Many;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;




import com.graduationdesign.lj.springboot.pojo.Custom;
import com.graduationdesign.lj.springboot.pojo.Userlogin;

@Mapper
public interface CustomMapper {
	
//	@Select("select * from t_cust ")
//    List<Custom> findAll();
//     
    @Insert(" insert into t_cust ( name,mail ) values (#{name},#{mail}) ")
    public int save(Custom custom); 
    
    @Select(" select * from t_cust ")
    @Results({ 
                @Result(property = "id", column = "id"),
                @Result(property = "requsts", javaType = List.class, column = "id", many = @Many(select = "com.graduationdesign.lj.springboot.mapper.RequstMapper.listByCustom") )
            })
    public List<Custom> list();
    
//    @Select("select * from t_cust where id= #{id} ")
//    public Category get(int id);
       
/*    @Update("update category_ set name=#{name} where id=#{id} ")
    public int update(Userlogin userlogin);  
*/
}
