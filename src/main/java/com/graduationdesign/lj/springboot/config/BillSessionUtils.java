package com.graduationdesign.lj.springboot.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.graduationdesign.lj.springboot.pojo.Bill;


public class BillSessionUtils {
	
	// 用户登录成功后，将用户对象存入session中。
    public static void setBillToSession(HttpServletRequest request, Bill bill) {
        HttpSession session = request.getSession();
        if (bill == null) {
            return;
        }
        session.setAttribute("billInfo", bill);
    }

    // 得到之前存入session中的用户对象
    public static Bill getBillFormSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return null;
        }
        return (Bill) session.getAttribute("billInfo");
    }

    // 用户注销时，删除之前存入session中的用户对象。
    public static void removeBillFormSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute("billInfo");//exsitUser
    }
    
}
