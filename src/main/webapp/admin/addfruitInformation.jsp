<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="../css/fSelect.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/lhgcore.js"></script>
<script type="text/javascript" src="../js/lhgcalendar.js"></script>
<script type="text/javascript" src="../scripts/jquery/jquery-1.7.1.js"></script>
<link href="../style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="../style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../scripts/authority/commonAll.js"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="../scripts/My97DatePicker/WdatePicker.js" type="text/javascript" defer="defer"></script>
<script type="text/javascript" src="../scripts/artDialog/artDialog.js?skin=default"></script>
<script type="text/javascript">
	$(document).ready(function() {
		/*
		 * 提交
		 */
		$("#add_btn").click(function() {
			if(validateForm()){
				checkFyFhSubmit();
			}
		});
		
		/*
		 * 取消
		 */
		$("#cancel_btn").click(function() {
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		});
		
		var result = 'null';
		if(result =='success'){
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		}
	});
	
	/** 批量增加 **/
	function batchAdd(){
    //判断至少选择了一项
    var checkedNum = $("option[name='addNutrition']:checked").length;
    if (checkedNum == 0) {
    	alert("至少选择一项")
        return;
    }
    if (confirm("确定增加选中信息？")) {
        var nutritionList = new Array();
        $("option[name='addNutrition']:checked").each(function(){
            nutritionList.push($(this).val());
        });
    $.ajax({
            type : "post",
            url : "/batchdeleteFruitinformationById",
            data : {nutritionList : nutritionList.toString()},
            success : function(){
            	alert("提交成功！");
                location.reload();
            },
            error : function(){
            	alert("提交失败！");
            }
        });
    }
}
</script>
</head>
<body>
<div>
	<div id="container">
		<div id="nav_links">
			当前位置：主页信息管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">添加水果信息</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
		<form id="formdata" enctype="multipart/form-data">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">名字</td>
					<td class="ui_text_lt">
						<input  autocomplete="off" class="ui_input_txt01" id="name" type="text" name="name" >
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">水果图片</td>
					<td class="ui_text_lt">
					<input  type="file" name="file" id="submit_btn">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">水果简述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="brief"  name="brief"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">水果详述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="description"  name="description" ></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">孕妇能否吃</td>
					<td class="ui_text_lt">
						<input type="text" autocomplete="off" class="ui_input_txt01" id="pregnanteat"  name="pregnanteat" placeholder = "请填写Y/N">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">产妇能否吃</td>
					<td class="ui_text_lt">
						<input type="text" autocomplete="off" class="ui_input_txt01" id="momeat"  name="momeat" placeholder = "请填写Y/N">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">宝宝能否吃</td>
					<td class="ui_text_lt">
						<input type="text" autocomplete="off" class="ui_input_txt01" id="babyeat"  name="babyeat" placeholder = "请填写Y/N"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">营养成分</td>
					<td class="ui_text_lt">
						
			<!-- 以下是多选下拉框的部分 -->
			<select class="demo" multiple="multiple" id="nutritions" name="nutritions">
			    <c:forEach items="${addNutrition}" var="nutritions">
			        <option value="${nutritions.id}">${nutritions.name}</option>
				</c:forEach> 
			</select>
				
			<!-- 以上是多选下拉框的部分 -->	
						
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="addAnalysis_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cancel_btn" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
			</form>
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#addAnalysis_btn").click(function() {
				var name1 = document.getElementById("name");
				var brief1 = document.getElementById("brief");
				var description1 = document.getElementById("description");
				var pregnanteat1 = document.getElementById("pregnanteat");
				var momeat1 = document.getElementById("momeat");
				var babyeat1 = document.getElementById("babyeat");
				var nutritions1 = document.getElementById("nutritions");
				name1_val = $.trim(name1.value);
				brief1_val = $.trim(brief1.value);
				description1_val = $.trim(description1.value);
				pregnanteat1_val = $.trim(pregnanteat1.value);
				momeat1_val = $.trim(momeat1.value);
				babyeat1_val = $.trim(babyeat1.value);
				nutritions1_val = $.trim(nutritions1.value);
				var str = [];
				for(i=0;i<nutritions1.length;i++){
					if(nutritions1.options[i].selected)
					{
						str.push(nutritions1[i].value);
					}
				}
					alert(str);
				if (name1_val == null || name1_val == "") {
					alert("水果名不能为空！");
					return false;
				} else if (brief1_val == null || brief1_val == "") {
					alert("水果简述不能为空！");
					return false;
				} else if (description1_val == null || description1_val == "") {
					alert("水果详述不能为空！");
					return false;
				} else if (pregnanteat1_val == null || pregnanteat1_val == "") {
					alert("孕妇能否吃不能为空！");
					return false;
				} else if (pregnanteat1_val != 'Y' && pregnanteat1_val != 'N') {
					alert("必须输入Y/N！");
					return false;
				} else if (momeat1_val == null || momeat1_val == "") {
					alert("产妇能否吃不能为空！");
					return false;
				} else if (momeat1_val != 'Y' && momeat1_val != 'N') {
					alert("必须输入Y/N！");
					return false;
				} else if (babyeat1_val == null || babyeat1_val == "") {
					alert("宝宝能否吃不能为空！");
					return false;
				} else if (babyeat1_val != 'Y'  && babyeat1_val != 'N') {
					alert("必须输入Y/N！");
					return false;
				} else if (str == null) {
					alert("请至少选中一个营养元素！");
					return false;
				} 
				
				var formData = new FormData($('#formdata')[0]);
				$.ajax({
					type: 'post',
					url: "/checkFruitInfrmation",
					data: formData,
					cache: false,         //不开缓存
					processData: false,
					contentType: false,
				}).success(function (data) {
					alert(data);
				}).error(function () {
					alert("保存失败")
				});
			});
		})
	</script>
<!-- 以下是下拉复选框的内容 -->
<script src="../js/jquery.min.js"></script>
<script src="../js/fSelect.js"></script>
<script>
$(function() {
        $('.demo').fSelect();
    });
</script>

</body>
</html>