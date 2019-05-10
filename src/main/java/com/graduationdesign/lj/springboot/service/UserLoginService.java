package com.graduationdesign.lj.springboot.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.graduationdesign.lj.springboot.pojo.Userlogin;

public interface UserLoginService {
	
	void register(Userlogin user);
	/*void login(Userlogin user);*/	
	//Userlogin login (HttpServletRequest request, HttpSession session);
	List<Userlogin> login(Userlogin user);
}
