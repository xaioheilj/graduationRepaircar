<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="pageHead.jsp"%>
 <%-- <div><%@ include file="pageHead.jsp"%></div>  --%>
<div class="col-md-10 col-md-offset-2">
   <div class="page-header ">
        <h1>瑞派汽修后台管理系统<font style="color: red">-[客户]-</font>
            <small>顾客第一，服务至上</small>
        </h1>
    </div>
</div>

<div class="panel panel-default">

    <div class="panel-heading">
    
        <!--面板的标题-->
        <h3 class="panel-title text-center">订单列表</h3>
    </div>
    <!--面板的主体-->
    <!--<div class="panel-body">-->
    <!--在面板中嵌入一个表格-->
    <table class="table table-bordered table-hover">
        <thead>
        <tr class="bg-success">
            <td>编号</td>
            <td>我的需求</td>
            <td>价目表</td>
            <td>状态</td>
           <!--  <td>状态</td> -->
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${page1.list}" var="c" varStatus="st">
	        <tr>        
	            <td>${c.id}</td>
	            <td><a href="requstdetailIncus?id=${c.id}">我的需求</a></td>
	            <td><a href="Billcontentdetail?id=${c.id}">价目表（未确认）</a></td>
	            <td>未完成</td>           
	        </tr>
        </c:forEach>
      <!--   <tr>
            <td>002</td>
            <td></td>
            <td>价目表（未确认）</td>
            <td>未完成</td>
            
        </tr>
        <tr>
            <td>003</td>
            <td></td>
            <td>价目表（未确认）</td>
            <td>未完成</td>
            
        </tr>
        <tr>
            <td>004</td>
            <td></td>
            <td>价目表（未确认）</td>
            <td>未完成</td>
            
        </tr>
        <tr>
            <td>005</td>
            <td></td>
            <td>价目表（未确认）</td>
            <td>未完成</td>
            
        </tr> -->
        </tbody>
    </table>
    <!--</div>-->

    <!--<div class="panel-footer">-->
    <!---->
    <!--</div>-->
    
    <div style="padding-left: 40%">
               		<a href="?start=1">[首  页]</a>
            		<a href="?start=${page1.pageNum-1}">[上一页]</a>
            		<a href="?start=${page1.pageNum+1}">[下一页]</a>
            		<a href="?start=${page1.pages}">[末  页]</a>
    			</div>
    
    <!-- <nav aria-label="Page navigation" class="text-center">
    <ul class="pagination">
        <li>
            <a href="#" aria-label="Previous">
                <span aria-hidden="true">«</span>
            </a>
        </li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li>
            <a href="#" aria-label="Next">
                <span aria-hidden="true">»</span>
            </a>
        </li>
    </ul>
</nav> -->
    
</div>


<%-- <%@ include file="pageFoot.jsp"%> --%>
	</body>
	
	
</html>
