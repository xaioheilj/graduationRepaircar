package com.graduationdesign.lj.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graduationdesign.lj.springboot.mapper.MerchantMapper;
import com.graduationdesign.lj.springboot.mapper.UserloginMapper;
import com.graduationdesign.lj.springboot.pojo.Merchant;
import com.graduationdesign.lj.springboot.pojo.Userlogin;

@Controller

public class MerchantController {
	
	 @Autowired MerchantMapper merchantmapper;
     
	    @RequestMapping("/addMerchant")
	    public void listMerchant(Merchant merc) throws Exception {
	    	merchantmapper.save(merc);
	        
	    }
}
