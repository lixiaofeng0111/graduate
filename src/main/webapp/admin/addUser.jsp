<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			当前位置：用户管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">用户信息添加</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">用户名</td>
					<td class="ui_text_lt">
						<input autocomplete="off" class="ui_input_txt01" id="username" type="text" name="username" placeholder="请输入用户名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">密码</td>
					<td class="ui_text_lt">
						<input autocomplete="off" class="ui_input_txt01" id="password" type="text" name="password" placeholder="请输入密码">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">年龄</td>
					<td class="ui_text_lt">
						<input autocomplete="off" class="ui_input_txt01" id="age" type="text" name="age" placeholder = "请输入年龄"/>岁
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">性别</td>
					<td class="ui_text_lt">
						<input autocomplete="off" class="ui_input_txt01" id="sex" type="text" name="sex"  placeholder="请输入男或者女"  "/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">家庭住址</td>
					<td class="ui_text_lt">
						<input autocomplete="off" class="ui_input_txt01" id="address" type="text" name="address" placeholder="请输入家庭住址"/>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="add_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cance_btn" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#add_btn").click(function() {
				var username1 = document.getElementById("username");
				var password1 = document.getElementById("password");
				var age1 = document.getElementById("age");
				var sex1 = document.getElementById("sex");
				var address1 = document.getElementById("address");
				username1_val = $.trim(username1.value);
				password1_val = $.trim(password1.value);
				sex1_val = $.trim(sex1.value);
				age1_val = $.trim(age1.value);
				address1_val = $.trim(address1.value);
				if (username1_val == null || username1_val == "") {
					alert("用户名不能为空！")
					return false;
				} else if (password1_val == null || password1_val == "") {
					alert("密码不能为空！")
					return false;
				} else if (age1_val == null || age1_val == "") {
					alert("年龄不能为空！")
					return false;
				} else if(age1_val >=100 || age1_val <= 18){
					alert("输入的年龄必须大于18小于100");
					return false;
				}else if(isNaN(age1_val)){
				   	alert("请填写数字");
				   	return false;
				}else if (sex1_val == null || sex1_val == "") {
					alert("性别不能为空！")
					return false;
				} else if (address1_val == null || address1_val == "") {
					alert("家庭住址不能为空！")
					return false;
				}


				var url = "/checkAddUser";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"username" : username1_val,
					"password" : password1_val,
					"age" : age1_val,
					"sex" : sex1_val,
					"address" : address1_val,
					"time" : new Date()
				};
				$.post(url, args, function(data) {
					if(data == "ok"){
						alert("保存成功！");
						window.parent.$.fancybox.close();
					}else{
					alert(data);
					alert("保存失败！")
					}
				});
			});
		})
	</script>



</body>
</html>