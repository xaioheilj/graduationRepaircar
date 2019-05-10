<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<%@ include file="pageHead.jsp"%>
 <%-- <div><%@ include file="pageHead.jsp"%></div>  --%>
<div class="col-md-10 col-md-offset-2">
   <div class="page-header ">
        <h1>瑞派汽修后台管理系统
            <small>顾客第一，服务至上</small>
        </h1>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-1 col-md-offset-2">
            <ul class="nav nav-pills nav-stacked">
                <li role="presentation"><a href="merManagepage.jsp" target="main">商户订单管理</a></li>
                 <!--  <li role="presentation"><a href="cusManagepage.jsp" target="main">客户订单管理</a></li> -->
              <!--   <li role="presentation"><a href="page2.html" target="main">订单管理</a></li> -->
            </ul>
        </div>

        <div class="col-md-6" style="height: 600px">
             <iframe src="merManagepage.jsp" name="main" frameborder="0" width="100%" height="100%" scrolling="no" marginheight="0" marginwidth="0"></iframe> 
        </div>
    </div>
</div>

<%@ include file="pageFoot.jsp"%>
