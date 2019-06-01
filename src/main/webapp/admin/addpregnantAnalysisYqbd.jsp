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
			当前位置：主页信息管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">添加孕期必读内容</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">页面图片</td>
					<td class="ui_text_lt">
						<input  autocomplete="off" class="ui_input_txt01" id="showpicture" type="text" name="showpicture" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="80">名字</td>
					<td class="ui_text_lt">
						<input  autocomplete="off" class="ui_input_txt01" id="name" type="text" name="name" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="80">文章图片</td>
					<td class="ui_text_lt">
						<input  autocomplete="off" class="ui_input_txt01" id="picture" type="text" name="picture" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">文章描述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="description"  name="description" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="addyqbd_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cancel_btn" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#addyqbd_btn").click(function() {
				var showpicture1 = document.getElementById("showpicture");
				var name1 = document.getElementById("name");
				var picture1 = document.getElementById("picture");
				var description1 = document.getElementById("description");
				showpicture1_val = $.trim(showpicture1.value);
				name1_val = $.trim(name1.value);
				picture1_val = $.trim(picture1.value);
				description1_val = $.trim(description1.value);
				if (showpicture1_val == null || showpicture1_val == "") {
					alert("页面图片不能为空");
					return false;
				} else if (name1_val == null || name1_val == "") {
					alert("名字不能为空");
					return false;
				} else if (picture1_val == null || picture1_val == "") {
					alert("文章图片不能为空");
					return false;
				} else if (description1_val == null || description1_val == "") {
					alert("文章描述不能为空");
					return false;
				} 

				var url = "/checkPregnantAnalysisYqbd";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"showpicture" : showpicture1_val,
					"name" : name1_val,
					"picture" : picture1_val,
					"description" : description1_val,
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
	</script>



</body>
</html>