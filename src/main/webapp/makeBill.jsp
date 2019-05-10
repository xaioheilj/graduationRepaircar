<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%-- <%@ page import="model.Course"%> --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
    
    <script type="text/javascript">   
	    function JumpAddcont(){
	    	document.f1.action="/addbillCont";
	        document.f1.submit();
	    }   
	    function JumpBilllist(){
	    	document.f1.action="/biiList";
	        document.f1.submit();
	    }    
    </script> 
    
    
  </head>
  
  <body class="container mt-3">
  <form name=f1 method="post">
  		
  		<div class="card border-primary">
            <div class="card-header bg-primary">
            <p align=right><font color="block" size="4">您好</font>
                <div class="row">
                    <div class="class="form-inline"">
                    	<!-- <label for="exampleInputName2">总价：</label>  -->
                    	<%-- <c:set var="sum" value="0"></c:set>
						<c:forEach items="${page.list}" var="use" >
						  ${sum+=use.price }
						</c:forEach>              	 --%>
                       <%-- <input type="text" class="form-control" value="${sum}" readonly="readonly" name="totalPrice" style="width: 300px" placeholder="订单总价"> --%>
                                              
                       <%--  <input type="hidden" name="bill_id" value="${billInfo.id}"> --%>                         
                    </div>
                    
                </div>
            </div>

  		
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
                </thead>  
                 
 
			   <tbody > 
			   			   
			   <c:forEach items="${page3.list}" var="c" varStatus="st">
		            <tr>
		                <td>${c.id}</td>
		                <td>${c.item}</td>
		                <td id="cuPrice">${c.price}</td>
		                <!-- <td><input type="hidden" id="sumPrice" value=""></td> -->
		                <td><a href="deleteBillcontent?id=${c.id}">删除</a></td>
		            </tr>
       		  </c:forEach>
			           
			  <!--  <tr>	
			      
			      	 <td  scope="col">
			  			<input name="number" type="text" style="width: 80px" id="number"  >
			  		</td>
			      		  		
			  		<td  scope="col">
			  			<input name="item" type="text" style="width: 80px" id="item"  >
			  		</td>
			  		
			  		<td  scope="col">
			  			<input name="price" type="text" style="width: 80px" id="price" "><label>元</label>
					</td> -->
			
					<!--<td scope="col">
			  			 <input type="button"   class="btn btn-success"  value="增加" id="addTable" onclick="add_tr(this)"/> 
			  			<input type="button"  class="btn btn-success"   value="删除" id="deleteTable" onclick="del_tr(this)"/>
			 		</td>  -->            
				</tr>
						<!-- <tr>
					      <input type="button"  class="btn btn-success"   value="确定" id="ensureTable"/>
				    	</tr> -->
							
			                     
			    </tbody>
    
    
			    <!-- <tfoot>
				    <tr>
				    
				    	<td>
				      		配件/服务:<input type="text" class="form-control"/>
				      	</td>
				      	
				      	<td>
				      		费用:<input type="text" class="form-control" />
				      	</td>    	
			    	</tr>
			    				    	   	
			  	</tfoot> -->			  		  		  		  	
          </table>
          
          		<div style="padding-left: 40%">
               		<a href="?start=1">[首  页]</a>
            		<a href="?start=${page3.pageNum-1}">[上一页]</a>
            		<a href="?start=${page3.pageNum+1}">[下一页]</a>
            		<a href="?start=${page3.pages}">[末  页]</a>
    			</div>
          
          		<div class="form-inline" style="padding-left: 60px">
          			<label for="exampleInputName2">配件/服务:</label>
          			<input type="text" name="item" style="width: 100px" class="form-control"/>
          			<label for="exampleInputName2">费用:</label>
          			<input type="text" name="price" style="width: 100px" class="form-control" />
         		</div>
         		
         	
         		
 
          		<div style="padding-top: 10px">
			  		
					 <!--  <input type="submit" class="btn btn-success float-left"   value="确定" name="/biiList" id="jumpMerc" onclick="location.href='merManagepage.jsp'"/>	  -->     		
					  <input type="button" class="btn btn-success float-left"   value="确定" id="jumpMerc" onclick="JumpBilllist()"/>	 
					    
					    
					<!--   <input type="submit" class="btn btn-success float-right"   value="提交" name="/addbillCont" id="sendData"/> -->
					<input type="button" class="btn btn-success float-right"   value="提交" id="sendData" onclick="JumpAddcont()"/>
					   
					 	 
			  	</div>
          
         
         </div> 
                
       </div> 
       </form>      
  </body>
</html>
