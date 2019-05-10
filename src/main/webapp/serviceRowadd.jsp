<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>瑞派汽修（添加账单）</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap4.0.0.min.css" />


  </head>
  
  <body class="container mt-3">
    <form method="post" action="AddServlet">
        <div class="card border-primary">
            <div class="card-header bg-primary">
                <div class="row">
                    <div class="col">添加</div>
                    <div class="col">
                        <a class="btn btn-success float-right" href="CourseServlet1">回到首页</a>
                    </div>
                </div>
            </div>

            <div class="card-body">
                <div class="form-group">
                    <label>序号</label>
                    <input type="text" class="form-control" name="id" />
                </div>
                <div class="form-group">
                    <label>配件/服务</label>
                    <input type="text" class="form-control" name="name"/>
                </div>
                <!-- <div class="form-group">
                    <label>发布老师</label>
                    <input type="text" class="form-control" name="teacher"/>
                </div> -->
                <div class="form-group">
                    <label>费用</label>
                    <input type="text" class="form-control" name="information"/>
                </div>
            </div>
            <div class="card-footer">
                <input type="submit" class="btn btn-primary float-right" value="提交" />
            </div>
        </div>
    </form>
    
    
</body>
</html>
