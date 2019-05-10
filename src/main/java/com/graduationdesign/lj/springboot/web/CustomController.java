package com.graduationdesign.lj.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graduationdesign.lj.springboot.mapper.CustomMapper;
import com.graduationdesign.lj.springboot.mapper.UserloginMapper;
import com.graduationdesign.lj.springboot.pojo.Custom;
import com.graduationdesign.lj.springboot.pojo.Userlogin;

@Controller
public class CustomController {
	
	 @Autowired CustomMapper custommapper;
     
	    @RequestMapping("/addCust")
	    public void listCustom(Custom cust) throws Exception {
	    	custommapper.save(cust);
	        
	    }

}
