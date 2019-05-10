<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
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
        <h3 class="panel-title text-center">本次需求</h3>
    </div>
    <!--面板的主体-->
    <!--<div class="panel-body">-->
    <!--在面板中嵌入一个表格-->
    <table class="table table-bordered table-hover">
        <!-- <thead>
        <tr class="bg-success">
            <td>编号</td>
            <td>我的需求</td>
            <td>价目表</td>
            <td>状态</td>
            <td>状态</td>
        </tr>
        </thead> -->
        <c:forEach items="${page1.list}" var="c" varStatus="st">
        <tbody>
        
	        <tr>        
	            <td>姓名</td>
	            <td></td>
	                     
	        </tr>
        
        <tr>
            <td>手机号</td>
            <td></td>
           
        </tr>
        <tr>
            <td>地址</td>
            <td></td>
           
        </tr>
        <tr>
            <td>详细需求</td>
            <td></td>
           
        </tr> 
        
        <tr>
            <td>图片</td>
            <td></td>
           
        </tr> 
        </tbody>
       </c:forEach>
    </table>
    <!--</div>-->

    <!--<div class="panel-footer">-->
    <!---->
    <!--</div>-->
    
    <div style="padding-left: 25%">
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
