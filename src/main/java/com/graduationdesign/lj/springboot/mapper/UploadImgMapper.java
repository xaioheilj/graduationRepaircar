package com.graduationdesign.lj.springboot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.graduationdesign.lj.springboot.pojo.UploadImg;

@Mapper
public interface UploadImgMapper {
	int insert(UploadImg record);
	

}
