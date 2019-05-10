package com.graduationdesign.lj.springboot.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.graduationdesign.lj.springboot.pojo.Userlogin;









// session工具类
public class LoginSessionUtils {
    // 检查用户输入的验证码是否与session中的一致
    /*public static boolean isCodeMatch(HttpServletRequest request) {
        // 获取session
        HttpSession session = request.getSession(false);
        if (session == null) {
            return false;
        }

        // 获取session中的验证码
        String existCode = (String) session.getAttribute(Const.KEY_VERIFICATION_CODE);
        if (StringUtils.isBlank(existCode)) { // 验证码为空
            return false;
        }

        // 获取用户输入的验证码
        String inputCode = request.getParameter("verificationCode");
        if (StringUtils.isBlank(inputCode)) {
            return false;
        }
        return existCode.equalsIgnoreCase(inputCode);
    }*/

    // 用户登录成功后，将用户对象存入session中。
    public static void setUserToSession(HttpServletRequest request, Userlogin loginUser) {
        HttpSession session = request.getSession();
        if (loginUser == null) {
            return;
        }
        session.setAttribute("userInfo", loginUser);
    }

    // 得到之前存入session中的用户对象
    public static Userlogin getUserFormSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return null;
        }
        return (Userlogin) session.getAttribute("userInfo");
    }

    // 用户注销时，删除之前存入session中的用户对象。
    public static void removeUserFormSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute("userInfo");//exsitUser
    }
    
    
    
}
