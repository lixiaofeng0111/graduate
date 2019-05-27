<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<link rel="stylesheet" type="text/css" href="../admin/css/style.css" />
<link rel="stylesheet" type="text/css" href="../admin/css/skin_/login.css" />
<script type="text/javascript" src="../admin/js/jquery.js"></script>
<script type="text/javascript" src="../admin/js/jquery.select.js"></script>
<title>后端管理页面_登录</title>
</head>

<body>
<div id="container">
    <div id="bd">
    	<div id="main">
        	<div class="login-box">
                <div id="logo"></div>
                <h1></h1>
                <div class="input username" id="username">
                    <label for="userName">用户名</label>
                    <span></span>
                    <input autocomplete="off" type="text" id="userName" name="userName"/>
                </div>
                <div class="input psw" id="psw">
                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
                    <span></span>
                    <input type="password" id="password" name = "password" autocomplete="new-password"/>
                </div>
                <div  class="loginButton">
                    <input id = "manager_btn"  type="button" class="button" value="登录"  />
                </div>
            </div>
        </div>
        <div id="ft">CopyRight&nbsp;2019&nbsp;&nbsp;版权所有&nbsp;&nbsp;lixiaofeng </div>
    </div>
   
</div>

<script type="text/javascript">
	var height = $(window).height() > 445 ? $(window).height() : 445;
	$("#container").height(height);
	var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
	$('#bd').css('padding-top', bdheight);
	$(window).resize(function(e) {
        var height = $(window).height() > 445 ? $(window).height() : 445;
		$("#container").height(height);
		var bdheight = ($(window).height() - $('#bd').height()) / 2 - 20;
		$('#bd').css('padding-top', bdheight);
    });
	$('select').select();
	
</script>
<!-- 以下是对数据的验证部分 -->
<script type="text/javascript">
		$(function() {
			$("#manager_btn").click(function() {
				var username1 = document.getElementById("userName");
				var password1 = document.getElementById("password");
				username1_val = $.trim(username1.value);
				password1_val = $.trim(password1.value);
				if (username1_val == null || username1_val == "") {
					alert("用户名不能为空！")
				} else if (password1_val == null || password1_val == "") {
					alert("密码不能为空！")
				}

				//form中的action的值；

				var url = "/checkManager";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"username" : username1_val,
					"password" : password1_val,
					"time" : new Date()
				};
				$.post(url, args, function(data) {
					if(data == "ok"){
						window.location.href="admin/index.jsp";
					}else{
					alert(data);
					}
				});
			});
		})
	</script>
<!-- 以上是对数据的验证部分 -->
</body>

</html>
