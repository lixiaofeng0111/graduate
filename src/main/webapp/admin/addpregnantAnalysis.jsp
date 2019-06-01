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
			当前位置：主页信息管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">添加孕期分析内容</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">名字</td>
					<td class="ui_text_lt">
						<input  autocomplete="off" class="ui_input_txt01" id="name" type="text" name="name" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">分析描述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="description"  name="description" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">分析类别</td>
					<td><select style = "height:30px;" id="kind" name="kind" class="ui_input_txt01">
							  <option value="1">孕期营养</option>
							  <option value="2">孕期饮食</option>
							  <option value="3">孕期保健</option>
							  <option value="4">孕期心理</option>
							  <option value="5">孕期疾病</option>
							  <option value="6">孕期知识</option>
						</select>
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
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#addAnalysis_btn").click(function() {
				var name1 = document.getElementById("name");
				var description1 = document.getElementById("description");
				var kind1 = document.getElementById("kind");
				name1_val = $.trim(name1.value);
				description1_val = $.trim(description1.value);
				kind1_val = $.trim(kind1.value);
				if (name1_val == null || name1_val == "") {
					alert("名字不能为空");
					return false;
				} else if (description1_val == null || description1_val == "") {
					alert("分析描述不能为空");
					return false;
				} else if (kind1_val == null || kind1_val == "") {
					alert("分析类别不能为空");
					return false;
				} 

				var url = "/checkPregnantAnalysis";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"name" : name1_val,
					"description" : description1_val,
					"kind" : kind1_val,
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