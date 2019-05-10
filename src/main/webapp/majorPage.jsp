<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%-- <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file="pageHead.jsp"%>

<%-- 
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
	<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css">
	<script type="text/javascript" src="bootstrap-3.3.7-dist/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
	
	
	<!--百度地图  -->
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=3xooDtUNkzlg0u5G1RUM5e6G7Al9dSIi"></script>
	<script type="text/javascript" src="bootstrap-3.3.7-dist/js/getLocation.js"></script>
	
	<style type="text/css">
		.footer {
		  position: relative;
		  bottom: 0;
		  width: 100%;
		  /* Set the fixed height of the footer here */
		  height: 50px;
		  background-color: black;
		  text-align: center;
		}
	</style>
	
  </head>
  
  <body>
   <div class="container">
   
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
      </ul>
      <form class="navbar-form navbar-left" action="#" method="post">
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
		        	<a href="majorPage.jsp">${userInfo.phone}|注销</a> 
		        </c:otherwise>
		     </c:choose>  
	      </li>  --%>
        <!-- <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Download<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">我的订单</a></li> -->
            <!-- <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li> -->
          </ul>
 <!--        </li>
      </ul> -->
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
   	</div>
   	
   	<div class="row">
   	
   	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" data-interval="3000">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="img/majorpagepic11.jpg" alt="..." style="text-align: center;">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    <div class="item">
      <img src="img/majorpagepic21.jpg" alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    
    <div class="item">
      <img src="img/majorpagepic31.jpg" alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    
    <div class="item">
      <img src="img/majorpagepic41.jpg" alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    ...
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
   	
   	</div>
   	
   	<!-- <div class="row" style="margin-top: 10px">
   		
		   <div class="btn-group btn-group-justified" role="group" aria-label="...">
		  <div class="btn-group" role="group">
		    <button type="button" class="btn btn-default">人气</button>
		  </div>		  
		  <div class="btn-group" role="group">
		    <button type="button" class="btn btn-default">距离</button>
		  </div>
		</div>
   		
   	</div> -->
   	
   	
   <div class="row" >
			<div class="col-md-4 col-sm-6 col-xs-4" >
				<h3>网站简介</h3>
				<p>瑞派汽车维修网是一个为顾客提供专业的汽修汽车维修的网站,采用线上线下联动的方式,顾客与商家更好交流，任何车型在这里都能得到服务.
				
				</p>
				<a href="#" class="btn btn-danger pull-right">了解更多</a>
			</div>
			<div class="col-md-4 col-sm-6 col-xs-4">
				<h3>公司愿景</h3>
				<p> 1、将来原厂配件会逐步代替副厂配件；<br>
					2、汽车使用油（各种润滑油）将由品质领航市场；<br>
					3、维修点逐步与互联网搭建在一起，客户线上选择服务.
				</p>
				<a href="#" class="btn btn-info pull-right">了解更多</a>
			</div>
			<div class="col-md-4 col-xs-4">
				<h3>联系我们</h3>
				<p>
					地址：安徽省芜湖市鸠江区北京中路<br>
					邮编：241000<br>
					电话：0552-6666666
					
				</p>
				<a href="#" class="btn btn-primary pull-right">了解更多</a>
			</div>
		</div>
   
   
   
   
   	
   	<div class="row" >
	   	<style type="text/css">
			.footer {
			  position: relative;
			  bottom: 0;
			  width: 100%;
			  /* Set the fixed height of the footer here */
			  height: 50px;
			  background-color: black;
			  text-align: center;
			}
		</style>
   	
		<footer class="footer" style="height:80px">
		  <div class="container">
		    <dd>公司名称：瑞派汽修技术有限公司</dd>
                    <dd>咨询电话：0552-6666666</dd>
                    <dd>公司地址：安徽省芜湖市鸠江区北京中路</dd>
                    <dd>版权所属：© 2019Copyright 瑞派汽修技术有限公司 皖ICP备17035072号</dd>
		  </div>
		</footer>    	
   	</div>
 		
   </div>

  </body>
	
 
</html>
