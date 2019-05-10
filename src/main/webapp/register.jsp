
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container"  style = "background: url(img/registerbackground.jpg);width: 100%;height:664px">
<%@ include file="pageHead.jsp"%>

<div class="register-head">
    	<font style="color: white;">用户注册</font>
</div>
<hr/>
<form class="form-horizontal" action="/register" method="post">

	<%-- <c:forEach items="${page.list}" var="c" varStatus="st"> --%>
    
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label"><font style="color: white;">手机号</font></label>
        <div class="col-sm-5">
            <input type="text" class="form-control" id="Phone" name="phone"  placeholder="Phone">
        </div>
    </div>
    
    <!-- <div class="form-group" style="margin-top: 4%; margin-left: 23%;">
        <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" name="username" id="inputEmail3" placeholder="username">
        </div>
    </div> -->
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label"><font style="color: white;">密码</font></label>
        <div class="col-sm-5">
            <input type="password" class="form-control" name="password"  placeholder="Password">
        </div>
    </div>
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label"><font style="color: white;">重输密码</font></label>
        <div class="col-sm-5">
            <input type="password" class="form-control" id="re-Enter Password"  placeholder="Re-Enter Password">
        </div>
    </div>
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label"><font style="color: white;">姓名</font></label>
        <div class="col-sm-5">
            <input type="text" class="form-control" id="Name" name="name" placeholder="Name">
        </div>
    </div> 
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label"><font style="color: white;">Email</font></label>
        <div class="col-sm-5">
            <input type="email" class="form-control" id="Email" name="mail" value="1458573208@qq.com" placeholder="Email">
        </div>
    </div>
    
    <div class="form-group" style="margin-left: 30%;">
        <div class="col-sm-offset-3 col-sm-10" >
            <input  type="radio" name="role_id" value="0" class="btn btn-default btn-lg"><font style="color: white;">客户</font>
            <input  type="radio" name="role_id" value="1" class="btn btn-default btn-lg"><font style="color: white;">商家</font>
        </div>
    </div>
    
    <div class="form-group" style="margin-left: 30%;">
        <div class="col-sm-offset-3 col-sm-10" >
            <button type="submit" class="btn btn-default btn-lg">注册</button>
        </div>
    </div>
    
   <%--  </c:forEach> --%>
</form>

	

</div>

	<%@ include file="pageFoot.jsp"%>

