<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../scripts/jquery/jquery-1.7.1.js"></script>
<link href="../style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="../style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="../scripts/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript" src="../scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="../style/authority/jquery.fancybox-1.3.4.css" media="screen"></link>
<script type="text/javascript" src="../scripts/artDialog/artDialog.js?skin=default"></script>
<title>后台管理系统</title>
<script type="text/javascript">
	$(document).ready(function(){
		/** 新增   **/
	    $("#addBtn").fancybox({
	    	'href'  : 'admin/addpregnantAnalysisYqbd.jsp',
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = '/pregnantAnalysisYqbd';
	        }
	    });
		
	    /**编辑   **/
	    $("a.edit").fancybox({
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = '/pregnantAnalysisYqbd';
	        }
	    });
	});
	/** 用户角色   **/
	var userRole = '';

	/** 模糊查询来电用户  **/
	function search(){
		$("#submitForm").attr("action", "house_list.jsp?page=" + 1).submit();
	}

	/** 新增   **/
	function add(){
		$("#submitForm").attr("action", "/xngzf/archives/luruFangyuan.action").submit();	
	}
	
	/** 批量删除 **/
	function batchDel(){
    //判断至少选择了一项
    var checkedNum = $("input[name='yqbdCheck']:checked").length;
    if (checkedNum == 0) {
    	art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'至少选择一条', ok:true,});
        return;
    }
    if (confirm("确定删除选中的用户？")) {
        var yqbdList = new Array();
        $("input[name='yqbdCheck']:checked").each(function(){
            yqbdList.push($(this).val());
        });
    $.ajax({
            type : "post",
            url : "/batchdeleteYqbdById",
            data : {yqbdList : yqbdList.toString()},
            success : function(){
            	alert("批量删除成功！");
                location.reload();
            },
            error : function(){
            	alert("批量删除失败！");
            }
        });
    }
}
	//点击删除
    
	function delete_confirm(e) 
	{
	    if (event.srcElement.outerText == "删除") 
	    {
	        event.returnValue = confirm("删除是不可恢复的，你确认要删除吗？");
	    }
	}
	document.onclick = delete_confirm;
</script>
<style type="text/css">
	.alt td{ background:black !important;}
	.chaxun{height:23px;margin-top:10px;}
	.wrap {
	width: 210px;
	white-space: nowrap;
	text-overflow: ellipsis;
	overflow: hidden;}
</style>
</head>
<body>
	<form id="submitForm" name="submitForm" action="" method="post">
		<input type="hidden" name="allIDCheck" value="" id="allIDCheck"/>
		<input type="hidden" name="fangyuanEntity.fyXqName" value="" id="fyXqName"/>
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						<div id="box_bottom">
							<input type="button" value="新增" class="ui_input_btn01" id="addBtn" /> 
							<input type="button" value="删除" class="ui_input_btn01" onclick="batchDel();" /> 
						</div>
					</div>
				</div>
			</div>
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th width="30"><input type="checkbox" id="all" onclick="selectOrClearAllCheckbox(this);" />
							</th>
							<th>孕期展示</th>
							<th>孕早中晚期文章名</th>
							<th>文章插图</th>
							<th>孕早中晚期描述</th>
							<th>操作</th>
						</tr>
						<tr></tr>
						<c:forEach items="${pregnantAnalysisYqbd}" var="yqbd">
							<tr>
								<td><input type="checkbox" name="yqbdCheck" value="${yqbd.id}" class="acb" /></td>
								<td><img width="100px" height="80px" src="${yqbd.showpicture}"></td>
								<td>${yqbd.name}</td>
								<td>${yqbd.picture}</td>
								<td><div class = "wrap">${yqbd.discription}</div></td>
								<td>
									<a href="/editSelectYqbdById?id=${yqbd.id}" class="edit">编辑</a> 
									<a href="/deleteYqbdById?id=${yqbd.id}&page=${currentPage}"
									 id="deleteid" onClick="delete_confirm">删除</a>
								</td>
							</tr>	
						</c:forEach>
					</table>
				</div>
				<!--  以下是页码的部分 -->
				<div style="text-align: center;">
					<ul class="pagination">
						<c:choose>
							<c:when test="${currentPage<=1}">
								<li class="disabled"><a>上一页</a></li>
							</c:when>

							<c:otherwise>
								<li><a href="/pregnantAnalysisYqbd?page=${currentPage - 1} ">上一页</a></li>
							</c:otherwise>
						</c:choose>
						<c:forEach begin="1" end="${totalPage}" var="index">
							<c:choose>
								<c:when test="${currentPage==index}">
									<li class="disabled"><a>${index}</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="/pregnantAnalysisYqbd?page=${index}">${index}</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:choose>
							<c:when test="${currentPage>=totalPage}">
								<li class="disabled"><a>下一页</a></li>
							</c:when>

							<c:otherwise>
								<li><a href="/pregnantAnalysisYqbd?page=${currentPage + 1} ">下一页</a></li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
				<!-- 以上是页码的部分 -->
			</div>
		</div>
	</form>

</body>
</html>
