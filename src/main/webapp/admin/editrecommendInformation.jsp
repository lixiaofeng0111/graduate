<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
		$("#submitbutton").click(function() {
			if(validateForm()){
				checkFyFhSubmit();
			}
		});
		
		/*
		 * 取消
		 */
		$("#cancelbutton").click(function() {
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
			当前位置：用户管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">孕月推荐修改</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr><td><input id="id" name="id" type="hidden" value="${editSelectRecommentById.id}"/></td></tr>
				<tr>
					<td class="ui_text_rt" width="80">孕月</td>
					<td class="ui_text_lt">
						<input value="${editSelectRecommentById.time}" autocomplete="off" class="ui_input_txt01" id="time" type="text" name="time" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="80">作用</td>
					<td class="ui_text_lt">
						<input value="${editSelectRecommentById.effect}" autocomplete="off" class="ui_input_txt01" id="effect" type="text" name="effect" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">描述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="description"  name=""description"" placeholder = "请输入话题内容">
						${editSelectRecommentById.description}
						</textarea>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="update_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cancelbutton" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#update_btn").click(function() {
				
				var id1 = document.getElementById("id");
				var time1 = document.getElementById("time");
				var effect1 = document.getElementById("effect");
				var description1 = document.getElementById("description");
				id1_val = $.trim(id1.value);
				time1_val = $.trim(time1.value);
				effect1_val = $.trim(effect1.value);
				description1_val = $.trim(description1.value);
				if (time1_val == null || time1_val == "") {
					alert("孕月不能为空");
					return false;
				} else if (effect1_val == null || effect1_val == "") {
					alert("作用不能为空");
					return false;
				} else if (description1_val == null || description1_val == "") {
					alert("描述不能为空");
					return false;
				}

				var url = "/checkUpdateRecommend";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"id" : id1_val,
					"time" : time1_val,
					"effect" : effect1_val,
					"description" : description1_val,
					"time1" : new Date()
				};
				$.post(url, args, function(data) {
					if(data == "ok"){
						alert("修改成功");
						window.parent.$.fancybox.close();
					}else{
					alert("修改失败");
					}
				});
			});
		})
	</script>

</body>
</html>