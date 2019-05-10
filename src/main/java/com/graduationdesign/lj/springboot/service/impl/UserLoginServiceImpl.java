package com.graduationdesign.lj.springboot.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.graduationdesign.lj.springboot.mapper.UserloginMapper;
import com.graduationdesign.lj.springboot.pojo.Userlogin;
import com.graduationdesign.lj.springboot.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService{
	
	@Autowired 
	UserloginMapper userloginmapper; 
	
	public void register(Userlogin user) {
		// TODO Auto-generated method stub
    	userloginmapper.saveUser(user);
    	int userId = userloginmapper.selectUserId();
    	user.setId(userId);
    	if (user.getRole_id()==0) {
    		userloginmapper.saveCust(user);	     		
    		int custId = userloginmapper.selectCustId();   		
    		user.setPerson_id(custId);   
    		userloginmapper.savePersonId(user);
		} else {				
			userloginmapper.saveMerc(user);			
			int mercId = userloginmapper.selectMercId();			
			user.setPerson_id(mercId);  		
    		userloginmapper.savePersonId(user);
		}	 
	}

	public List<Userlogin> login(Userlogin user) {	
		return  userloginmapper.login(user);
	}

	

	/*@Override
	public Userlogin login (HttpServletRequest request, HttpSession session){
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        System.out.println("你输入的手机号为：" + phone);
        System.out.println("你输入的密码为：" + password);
        Userlogin tuser = userloginmapper.login(phone, password);
        session.setAttribute("tuser", tuser);
     	return tuser; 
     //	session.setAttribute("tuser", tuser);
        
        if (phone == null) {
            return "redirect:/";
        } else {
            return "redirect:/managemajor";
        }
    }
*/

	
	/*public String login(Userlogin user) {
		// TODO Auto-generated method stub
	
			
		return userloginmapper.login(phone, password);
		
	}*/
	
	
	
	

}
