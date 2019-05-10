package com.graduationdesign.lj.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.graduationdesign.lj.springboot.mapper.BillMapper;
import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.pojo.Requst;

@Controller
public class BillController {
	@Autowired
	private BillMapper billMapper;
	
	
	@RequestMapping("/biiList")
	public ModelAndView billList(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "2") int size)throws Exception {
		// TODO Auto-generated method stub		
			ModelAndView modelAndView = new ModelAndView();
	        PageHelper.startPage(start,size,"id asc");
	        List<Bill> bl=billMapper.findAll();
	        PageInfo<Bill> page2 = new PageInfo<>(bl);
	        //m.addAttribute("page", page);  
	        //页面page未取到值
	        modelAndView.addObject("page2", page2);	        
	        modelAndView.setViewName("merManagepage");
	        return modelAndView;	
	}
	
	
}
