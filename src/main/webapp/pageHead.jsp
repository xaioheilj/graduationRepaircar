<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  
    <base href="<%=basePath%>">
    
     <title>瑞派汽修</title>
    
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%@ include file="JCcommon.jsp"%>
	
	<!--百度地图  -->
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=3xooDtUNkzlg0u5G1RUM5e6G7Al9dSIi"></script>
	<script type="text/javascript" src="bootstrap-3.3.7-dist/js/getLocation.js"></script>

  </head>
  
  <body>
    <div class="row">
   		<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">瑞派</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="majorPage.jsp">首页 <span class="sr-only">(current)</span></a></li>
        <li><a href="cusRequsttable.jsp">服务</a></li>
        <li><a href="#">选项3</a></li>
        <!-- <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li> -->
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="搜索店铺">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
        
        <div   class="form-group" style="margin-left: 40px">
          <input id="locationNow" type="text" class="form-control" placeholder="当前位置信息">
          <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>
        </div>
               
      </form>
      <ul class="nav navbar-nav navbar-right">
      	<li>
      	  <c:choose>
	        <c:when test="${userInfo.id eq null}">
	        	<a href="Login.jsp">登录|注册</a> 
	        </c:when>
	        <c:otherwise>
	        	<%-- <a href="/loginOut">${userInfo.phone}|注销</a>  --%>
	        	
	        	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${userInfo.phone}<span class="caret"></span></a>
          		  <ul class="dropdown-menu">
		            <li><a href="/requstList">我的订单</a></li>
		            <li><a href="#">给商家留言</a></li>
		            <li><a href="/loginOut">注销</a></li>
	        	  </ul>	
	        </c:otherwise>
	      </c:choose>  
	    </li>   
        <!-- <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Download<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">我的订单</a></li> -->
            <!-- <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li> -->
          </ul>
<!--         </li>
      </ul> -->
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
   	</div>

  