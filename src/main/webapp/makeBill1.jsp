<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%-- <%@ page import="model.Course"%> --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>瑞派汽修（账单）</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap4.0.0.min.css" />
	<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <!-- <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css"/> -->
  </head>
  
  <body class="container mt-3">
  		
  		 <div class="card border-primary"> 
        <!-- <form  method="post" action="doFindCourse.jsp" >  -->
            <div class="card-header bg-primary">
            <p align=right><font color="black" size="4">您好</font>
                <div class="row">
                    <div class="col">
                        	总价：<input type="text" class="form-control" name="name" placeholder="订单总价">                         
                    </div>
<!--                     <div class="col">
                        <input type="submit" class="btn btn-warning" value="查找">
                    </div> -->
                    <div class="col">
                       <!--  <a class="btn btn-success float-right" href="courseAdd.jsp">添加课题</a> -->
                    </div>
                </div>
             </div>
            </div>
      <!--   </form> -->
  		
    	<div class="card-body">
            <table class="table table-striped table-hover table-bordered text-center">
                <thead>
                    <tr>
                        <th scope="col">序号</th>
                        <th scope="col">配件/服务</th>
                        <th scope="col">费用</th>
                         <!-- <th scope="col"></th> -->
                        <th scope="col">操作</th>  
                    </tr>
                    <!-- <tr id="trrow">
                        <th  scope="col"><input name="title" type="text" id="title" style="width:150px;vertical-align:middle;"      maxlength="40"  ></th>
                        <th  scope="col"><input name="title" type="text" id="title" style="width:150px;vertical-align:middle;"      maxlength="40"  ></th>
                        <th  scope="col"><input name="title" type="text" id="title" style="width:150px;vertical-align:middle;"      maxlength="40"  ></th>
                         <th scope="col"></th>
                        <th  scope="col"><a class='btn text-danger' href='#'><i class='fa fa-minus-circle'></i></a></th>  
                    </tr> -->
                </thead>
                 <tbody>
                     <%
                       // List<Course> ps = (List<Course>) request.getAttribute("ps");

                      //  for (Course p : ps) {
                            out.write("<tr>");
                            out.write("<td>"  /* + p.getId() */ +  "</td>");
                            out.write("<td>"/*  + p.getNa/* me()  */+ "</td>");
                          //  out.write("<td>"/*  + p.getTeacher() */ +  "</td>");
                            out.write("<td>"/*  + p.getInformation()*/ +  "</td>");
                            out.write("<td>");
                            out.write("<a class='btn text-primary' href='serviceRowadd.jsp'><i class='fa fa-edit'></i></a>");
                            out.write("<a class='btn text-primary' href='#'><i class='fa fa-plus'></i></a>");
                            out.write("<a class='btn text-danger' href='#'><i class='fa fa-minus-circle'></i></a>");
                            out.write("</td>");
                            out.write("</tr>");
                        //}
                    %> 
                </tbody> 
             </table>
                          
             
            
            <table class="table table-striped table-hover table-bordered text-center">     
             
   		 		<form action="updateBill" method="post">
   		 		<div>
   		 			<tr>
      					<th scope="col">	配件/服务: <input name="partAndservice"></th>
      					<th scope="col">	费用: <input name="servicePrice">  </th> 
      						<input name="Bid" type="hidden" value="#">    					
    				</tr>
    			</div> 
    			
    				<div class="card-footer">
                		<input type="submit" class="btn btn-primary float-left" value="提交" />
                		<input type="button" class="btn btn-success float-right" value="确认" id="addTable" onclick="add_tr(trrow)" />
            		</div>
            </table>
   		 		</form> 
   		 	<!-- <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
			<script>
			  function add_tr(obj) {
			    var tr = $(obj).parent().parent();
			    tr.after(tr.clone());
			  }
			</script> -->
          
         </div>
         

         
  </body>
</html>
