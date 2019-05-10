package com.graduationdesign.lj.springboot.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.graduationdesign.lj.springboot.mapper.BillcontentMapper;
import com.graduationdesign.lj.springboot.pojo.Billcontent;
import com.graduationdesign.lj.springboot.pojo.Requst;
import com.graduationdesign.lj.springboot.service.BillService;
import com.graduationdesign.lj.springboot.service.BillcontentService;
import com.graduationdesign.lj.springboot.service.impl.BillServiceImpl;
import com.graduationdesign.lj.springboot.service.impl.RequstServiceImpl;

@Controller
public class BillcontentController {
	
	@Autowired
	private BillcontentService billcontentService;
	@Autowired
	private BillcontentMapper billcontentMapper;
	
	
	
	
	@RequestMapping("/addbillCont")
	public String addBillContent(Billcontent billcontent) throws Exception{
		int cuBID = RequstServiceImpl.getBID();
		billcontent.setBill_id(cuBID);
		System.out.println(cuBID);
		billcontentService.addBillcontent(billcontent);				
		return "forward:/listBillcontent";
	}
	
/*	@RequestMapping("/suiwogai")
	public String listBillcontent(Model m) throws Exception {
		
		List<Billcontent> bs= billcontentMapper.findAll();
		m.addAttribute("bs", bs);
		return "redirect:makeBill";				
	}*/
	
	@RequestMapping("/deleteBillcontent")
    public String deleteBillcontent(Billcontent b) throws Exception {
        billcontentMapper.deleteBillcontent(b.getId());
        return "redirect:listBillcontent";
    }
	
	@RequestMapping("/listBillcontent")
    public ModelAndView listBillcontent(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "2") int size) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(start,size,"id asc");
        List<Billcontent> bs=billcontentMapper.findAll();
        PageInfo<Billcontent> page3 = new PageInfo<>(bs);
        //m.addAttribute("page", page);  
        //页面page未取到值
        modelAndView.addObject("page3", page3);
        
        modelAndView.setViewName("makeBill");
        return modelAndView;
    }
	
	@RequestMapping("/Billcontentdetail")
    public ModelAndView Billcontentdetail(Requst requst2,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "2") int size) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(start,size,"id asc");
        List<Billcontent> bgb=billcontentMapper.getBillcontent(requst2.getId());
        PageInfo<Billcontent> page6 = new PageInfo<>(bgb);
        //m.addAttribute("page", page);  
        //页面page未取到值
        modelAndView.addObject("page6", page6);
        
        modelAndView.setViewName("billContentdetail");
        return modelAndView;
    }
	

	
	

}
