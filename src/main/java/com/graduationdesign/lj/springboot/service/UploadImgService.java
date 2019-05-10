package com.graduationdesign.lj.springboot.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import com.graduationdesign.lj.springboot.pojo.DefaultResp;

public interface UploadImgService {
	
		 DefaultResp<String> upload(MultipartFile file,HttpServletRequest request);
	
}
