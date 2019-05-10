package com.graduationdesign.lj.springboot.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.graduationdesign.lj.springboot.config.BillSessionUtils;
import com.graduationdesign.lj.springboot.mapper.BillMapper;
import com.graduationdesign.lj.springboot.mapper.RequstMapper;
import com.graduationdesign.lj.springboot.pojo.Bill;
import com.graduationdesign.lj.springboot.pojo.Billcontent;
import com.graduationdesign.lj.springboot.pojo.Requst;
import com.graduationdesign.lj.springboot.service.BillService;
import com.graduationdesign.lj.springboot.service.RequstService;

@Controller
public class RequstController {
	@Autowired
	private RequstService requstservice;
	
	@Autowired
	private RequstMapper requstMapper;
		
	@Autowired
	private BillMapper billMapper;
	
	@Autowired 
	private HttpServletRequest request;
	
	@Autowired
	private BillService billservice;
	
	@RequestMapping("/requst")
	public String addRequst(Requst requst) throws Exception{
		requstservice.cusRequst(requst);
		
		return "forward:/addBilllist";
//		return "cusRequsttable";		
	}
	
	@RequestMapping("/addBilllist")
	public String addBilllist(Bill bill){
		requstservice.addABill(bill);
		
		List<Bill> list=billservice.findLastbill(bill);
		Bill bill3 = list.get(0);
		//System.out.println(bill3.getId());//此处调试正式已经得到并打印出bill的ID
		BillSessionUtils.setBillToSession(request,bill3);
			
		return "forward:/requstList";
		/*return "cusRequsttable";*/
		
	}
	
	@RequestMapping("/requstdetailIncus")
	public ModelAndView listRequstdetail(Requst requst2,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "2") int size) throws Exception{
		ModelAndView modelAndView1 = new ModelAndView();
        PageHelper.startPage(start,size,"id asc");
        List<Requst> rfd=requstMapper.findDetail(requst2.getId());
       /* for(int i=0;i<rs.size();i++){
        	System.out.println(rs.get(i).getId());
        }*/
        PageInfo<Requst> page5 = new PageInfo<>(rfd);
        //m.addAttribute("page", page);  
        //页面page未取到值
        modelAndView1.addObject("page5", page5);	        
        modelAndView1.setViewName("requstDetail");
        return modelAndView1;	
	}
	
	@RequestMapping("/requstdetailInMer")
	public ModelAndView requstdetailInMer(Bill bill3,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "2") int size)throws Exception {
		ModelAndView modelAndView2 = new ModelAndView();
        PageHelper.startPage(start,size,"id asc");
        List<Requst> rfd=requstMapper.findDetailInMer(bill3.getId());
       /* for(int i=0;i<rs.size();i++){
        	System.out.println(rs.get(i).getId());
        }*/
        PageInfo<Requst> page7 = new PageInfo<>(rfd);
        //m.addAttribute("page", page);  
        //页面page未取到值
        modelAndView2.addObject("page7", page7);	        
        modelAndView2.setViewName("requstDetailInMer");
        return modelAndView2;	
	}
	
/*	 @RequestMapping("/addBilllist")
	    public String addBilllist(Model m,@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {		 
	        PageHelper.startPage(start,size,"id desc");
	        List<Bill> bl=billMapper.findAll();
	        PageInfo<Bill> page = new PageInfo<>(bl);
	        m.addAttribute("page",page);        
	        return "listCategory";
	    }
	*/
	
	@RequestMapping("/requstList")
	public ModelAndView listRequst(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "2") int size)throws Exception {
		// TODO Auto-generated method stub
		
			ModelAndView modelAndView = new ModelAndView();
	        PageHelper.startPage(start,size,"id asc");
	        List<Requst> rs=requstMapper.findAll();
	       /* for(int i=0;i<rs.size();i++){
	        	System.out.println(rs.get(i).getId());
	        }*/
	        PageInfo<Requst> page1 = new PageInfo<>(rs);
	        //m.addAttribute("page", page);  
	        //页面page未取到值
	        modelAndView.addObject("page1", page1);	        
	        modelAndView.setViewName("cusManagepage");
	        return modelAndView;	
	}
	
	
	
	
	
	/*
	//页面跳转
	@RequestMapping("/cusRequsttable")
	public String uploadImg() {
        return "cusRequsttable";
    }

	
	@Autowired
	RequstMapper requstmapper;
	 @RequestMapping(value = "/requst", method = RequestMethod.POST)
//	 @ResponseBody
	    public String upload(HttpServletRequest req, @RequestParam("requstpic_local") MultipartFile requstpic_local,Model m) {
	            try {
	                String pic_localName = System.currentTimeMillis()+requstpic_local.getOriginalFilename();
	                String destFileName=req.getServletContext().getRealPath("")+"uploaded"+File.separator+pic_localName;
	                 
	                File destFile = new File(destFileName);
	                destFile.getParentFile().mkdirs();
	                requstpic_local.transferTo(destFile);
	                 
	                m.addAttribute("pic_localName",pic_localName);
	            } catch (FileNotFoundException e) {
	                e.printStackTrace();
	                return "上传失败," + e.getMessage();
	            } catch (IOException e) {
	                e.printStackTrace();
	                return "上传失败," + e.getMessage();
	            }
	             
	            return "cusRequsttable";
	    }    */
}
