<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 



<div class="container"  style = "background: url(img/loginBackground1.jpg);width: 100%;height:664px;margin-top: 0%">
	<%@ include file="pageHead.jsp"%>
	<div class="login">   <!--  style = "width:400px;margin:120px auto;background :rgba(255,255,255,0.2);" -->
    <div class="login-titte ">
        	瑞派
    </div>
    <form class="form-horizontal" action="/login" method="post" >
        <div class="form-group"  style="padding-top: 3%;padding-left: 10%;margin-top: 14%;">
            <label  class="glyphicon glyphicon-user col-sm-2 control-label" style="font-size: 23px;"></label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputPhone3" name="phone" id="phone" placeholder="phone" />
            </div>
        </div>
        <div class="form-group" style="padding-top: 10%;padding-left:10%;margin-top: 3%;">
            <label  class="col-sm-2 control-label glyphicon glyphicon-lock" style="font-size: 23px;"></label>
            <div class="col-sm-8">
                <input type="password" name= "password" class="form-control" id="inputPassword3" placeholder="Password">
            </div>
        </div>
        <div class="form-group" style="padding-top: 7%; margin-top: 3%;width: 78%; margin-left: 0%;">
                 
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success" style="width: 120%;background: ;">登录</button>
            </div>
        </div>
        <div class="form-group" style=" padding-left: 78%;">
            <a href="register.jsp">注册</a>
        </div>
    </form>

 </div>
  
</div>



	<%@ include file="pageFoot.jsp"%>



