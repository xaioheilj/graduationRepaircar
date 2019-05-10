package com.graduationdesign.lj.springboot.web;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.PortableInterceptor.NON_EXISTENT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.graduationdesign.lj.springboot.config.LoginSessionUtils;
import com.graduationdesign.lj.springboot.mapper.UserloginMapper;
import com.graduationdesign.lj.springboot.pojo.Userlogin;
import com.graduationdesign.lj.springboot.service.UserLoginService;
   
@Controller
public class UserloginController {
	 @Autowired
	 private HttpServletRequest  request;
	
	 @Autowired
	 private UserLoginService userLoginService;
	    @RequestMapping("/register")
	   // @ResponseBody
	    public String addUser(Userlogin user) throws Exception {
	    	userLoginService.register(user);  	
	        return "Login";
	 }
	    
	  /*  @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
	   public String userLogin(HttpServletRequest request, HttpSession session) throws Exception{	    	
	    	userLoginService.login(request,session);
	    	Userlogin exsitUser = userLoginService.login(request, session);
	    	
	    	if(exsitUser.getRole_id() == 0){
	    		return "manageMajorpage";
	    	}else{
	    		return "mercManagepage";
	    	}
	    }
	    */
	    
	    @RequestMapping("/login")
	//  @ResponseBody
		   public String userLogin(Userlogin user) throws Exception{	    	
		    	//userLoginService.login(user);
		    	List<Userlogin> list = userLoginService.login(user);
		    	if (list.size() > 0) {
		    		//成功
		    		Userlogin loginUser = list.get(0);
		    		//request.getSession().setAttribute("loginInfo", loginUser);
		    		LoginSessionUtils.setUserToSession(request, loginUser);
		    		if(loginUser.getRole_id() == 0){
		    			return "redirect:/requstList";
			    		/*return "cusManagepage";*/
			    	}else{
			    		return "redirect:/biiList";
			    		/*return "merManagepage";*/
			    	}
		    	}else{
		    		//失败
		    		
		    		return "Login";
		    	}
			//	return null;
		    	
		    	/*if(exsitUser.getRole_id() == 0){
		    		return "manageMajorpage";
		    	}else{
		    		return "mercManagepage";
		    	}*/
		    }
	    
	    @RequestMapping("/loginOut")
	    public String logout(Userlogin user) {
	        // 移除session
	      LoginSessionUtils.removeUserFormSession(request);
	        return "majorPage";
	    }
		    
	    
	    
	   
	    
	   
	    /*	@RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
		public String login() {
			// TODO Auto-generated method stub
			return "Login";
		}
		
		
		@RequestMapping(value = "/managemajor", method = {RequestMethod.POST, RequestMethod.GET})
	    public String login1() {
	        return "manageMajorpage";

	    }
		
		@RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
	    public String login (HttpServletRequest request, HttpSession session) throws Exception{
	        String phone = request.getParameter("phone");
	        String password = request.getParameter("password");
	        System.out.println("你输入的手机号为：" + phone);
	        System.out.println("你输入的密码为：" + password);
	        String tuser = userLoginService.login(phone, password);
	        session.setAttribute("tuser", tuser);
	        if (phone == null) {
	            return "redirect:/";
	        } else {
	            return "redirect:/managemajor";
	        }
	    }

		
		public String login(String phone, String password) {
			// TODO Auto-generated method stub
			return null;
		}
*/
	    
	    
	    
	   
	   /* @RequestMapping("/deleteCategory")
	    public String deleteCategory(Category c) throws Exception {
	        categoryMapper.delete(c.getId());
	        return "redirect:listCategory";
	    }*/
	   /* @RequestMapping("/updateCategory")
	    public String updateCategory(Category c) throws Exception {
	        categoryMapper.update(c);
	        return "redirect:listCategory";
	    }*/
	   /* @RequestMapping("/editCategory")
	    public String listCategory(int id,Model m) throws Exception {
	        Category c= categoryMapper.get(id);
	        m.addAttribute("c", c);
	        return "editCategory";
	    }
	     */
	    /*	    @RequestMapping("/listUserlogin")
	   	    public String listUserlogin(Model m,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
	        PageHelper.startPage(start,size,"id desc");
	        List<Userlogin> user=UserloginMapper.findAll();
	        PageInfo<Userlogin> page = new PageInfo<>(user);
	        m.addAttribute("page", page);     
	        return "register";
	    } */  
//
//	    public String init(){
//	    	List<T> list = requestService.find();
//	    	//
//	    	return "";
//	    }

}
