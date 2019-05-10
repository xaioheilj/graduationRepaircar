package com.graduationdesign.lj.springboot.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.graduationdesign.lj.springboot.pojo.DefaultResp;
import com.graduationdesign.lj.springboot.service.UploadImgService;

@Controller
public class UploadImgController {
	
		@Autowired
		private UploadImgService uploadImgService;
	
	 	@RequestMapping(value = "upload",method = RequestMethod.POST)
	 	@ResponseBody
	    public DefaultResp<String> upload(@RequestParam("file") MultipartFile file,HttpServletRequest request){
	            return uploadImgService.upload(file,request);
	    }

}
