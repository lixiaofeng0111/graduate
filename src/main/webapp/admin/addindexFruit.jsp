<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="../js/lhgcore.js"></script>
<script type="text/javascript" src="../js/lhgcalendar.js"></script>
<script type="text/javascript" src="../scripts/jquery/jquery-1.7.1.js"></script>
<link href="../style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="../style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="../scripts/jquery/jquery-1.4.4.min.js"></script>
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
</script>
</head>
<body>
<div>
	<div id="container">
		<div id="nav_links">
			当前位置：主页信息管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">添加今水果相关信息</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<td class="ui_text_rt" width="80">图片</td>
					<td class="ui_text_lt">
						<input  value="${editFruitSelectById.imgpath}" autocomplete="off" class="ui_input_txt01" id="fruitImgpath" type="hidden" name="fruitImgpath" >
						<input  type="file" id="submit_btn">
					
					</td>
				<tr>
					<td class="ui_text_rt">水果描述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="fruitContent"  name="fruitContent" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="addindexfruit_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cancel_btn" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<!-- <form id="formdata" enctype="multipart/form-data">
	<input type="file" name="file">
	<button id="add">添加</button>
</form> -->
<script type="text/javascript">
		$(function() {
			$("#addindexfruit_btn").click(function() {
				var fruitImgpath1 = document.getElementById("fruitImgpath");
				var fruitContent1 = document.getElementById("fruitContent");
				fruitImgpath1_val = $.trim(fruitImgpath1.value);
				fruitContent1_val = $.trim(fruitContent1.value);
				if (fruitImgpath1_val == null || fruitImgpath1_val == "") {
					alert("水果名不能为空！");
					return false;
				} else if (fruitContent1_val == null || fruitContent1_val == "") {
					alert("水果简述不能为空！");
					return false;
				} 

				var url = "/checkIndexFruit";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"fruitImgpath" : fruitImgpath1_val,
					"fruitContent" : fruitContent1_val,
					"time" : new Date()
				};
				$.post(url, args, function(data) {
					if(data == "ok"){
						alert("保存成功");
						window.parent.$.fancybox.close();
					}else{
					alert("保存失败");
					}
				});
			});
		})
		/* $("#add").click(function(){
		var formData = new FormData($('#formdata')[0]);
		$.ajax({
			type: 'post',
			url: "/checkIndexFruit",
			data: formData,
			cache: false,
			processData: false,
			contentType: false,
		}).success(function (data) {
			$.messager.alert('提示信息',data,'info');
			openURL('添加信息', '/EmpGuid/manager/addBanner');
		}).error(function () {
			$.messager.alert('错误信息',data,'error');
		});
		}); */
	</script>



</body>
</html>