<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="pageHead.jsp"%>

<script type="text/javascript">   
	    function JumpRequst(){
	    	document.fr1.action="/requst";
	        document.fr1.submit();
	    }   
	      
    </script> 

<div class="register-head">
    客户需求订单
</div>
<hr/>
<form class="form-horizontal" name="fr1" method="post">

	 <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label">姓名</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" name="name" id="Name" placeholder="Name">
            <input type="hidden" name="cust_id" value="${userInfo.id}">
        </div>
    </div> 
    
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3"  class="col-sm-2 control-label">手机号</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" name="phone" id="Phone" placeholder="Phone">
        </div>
    </div>
    
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputEmail3" class="col-sm-2 control-label">详细地址</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" name="adress" id="adressdetail" placeholder="AdressDetail">
        </div>
     </div> 
    
    <!-- <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-5">
            <input type="password" class="form-control" name="password" id="inputPassword3" placeholder="Password">
        </div>
    </div>
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label">重输密码</label>
        <div class="col-sm-5">
            <input type="password" class="form-control" id="re-Enter Password" placeholder="Re-Enter Password">
        </div>
    </div>
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label">姓名</label>
        <div class="col-sm-5">
            <input type="text" class="form-control" id="Name" placeholder="Name">
        </div>
    </div> 
    <div class="form-group" style="margin-left: 23%;">
        <label for="inputPassword3" class="col-sm-2 control-label">Email</label>
        <div class="col-sm-5">
            <input type="email" class="form-control" id="Email" placeholder="Email">
        </div>
    </div>
    
    <div class="form-group" style="margin-left: 30%;">
        <div class="col-sm-offset-3 col-sm-10" >
            <input  type="radio" name="roleIntwo" class="btn btn-default btn-lg">客户
            <input  type="radio" name="roleIntwo" class="btn btn-default btn-lg">商家
        </div>
    </div>
  -->   
  
   	<div class="form-group" style="margin-left: 23%;">
        <label for="DetailNeeding" class="col-sm-2 control-label">详细需求</label>
        <div class="col-sm-5">
            <textarea class="form-control" name="requst_detail" rows="10" placeholder="请填写您的详细需求"></textarea>
        </div>
    </div>
    
    </form>
    
    <!-- 尚未完成多图片上传功能 -->
   
    <div class="form-group" style="margin-left: 23%;"> 
		<label for="DtailImg" class="col-sm-2 control-label">上传图片</label> 
		 <div class="col-sm-5"> 
		 	    <form enctype="multipart/form-data" id="form2">	 	
		         <input type="file" name="file" id="f1" class="file-loading"/>
		         <button type="button" id="upload" class="btn btn-default">上传</button> 
    			</form> 
			<!-- <input id="testlogo" type="file" name="requstpic_local" accept="image/*" class="file-loading" />  -->
			<!-- <input type="text" name="htestlogo" id="htestlogo" onchange="addFile(this)" >  -->
		 </div> 
	</div>
	
	
	<script>
    $('#upload').click(function () {
        var formData = new FormData($("#form2")[0]);
            $.ajax({
                type: 'POST',
                url:'upload',
                data: formData,
                cache: false,
                processData: false,
                contentType: false,
                 success: function (request) {
                    if(request.code == '0000'){
                        layer.msg(request.data, {icon: 1});
                    }else{
                        $("#subButton").removeAttr('disabled');
                        layer.msg(request.data, {icon: 2});
                    }
                },
                error:function(e){
                    layer.msg("error",{icon:2});
                }
            }); 
    });   
</script> 
	
	
	
      
    <div class="form-group" style="margin-left: 30%;">
        <div class="col-sm-offset-3 col-sm-10" >
            <button type="button" class="btn btn-default btn-lg" onclick="JumpRequst()">提交</button>
        </div>
    </div>
    
    
<!-- </form> -->


	<%--  <%@ include file="pageFoot.jsp"%> --%>
</body>
</html>
