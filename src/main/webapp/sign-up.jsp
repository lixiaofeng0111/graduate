<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>孕期营养早知道</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	
	<link rel="stylesheet" href="css/bootstrap-register.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/register.css">

	<script src="js/modernizr-2.6.2.min.js"></script>

	</head>
	<body class="style-3">
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-md-push-13">
					<div  class="fh5co-form animate-box" data-animate-effect="fadeInRight">
						<center>
						<h2>注册页面</h2>
						</center>
						<div class="form-group">
							<label for="name" class="sr-only">用户名</label>
							<input name = "username" type="text" class="form-control" id="username" placeholder="请输入你的用户名" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">密码</label>
							<input name = "password" type="password" class="form-control" id="password" placeholder="请输入您的密码" autocomplete="off">
						</div>
						
						<div class="form-group">
							<label for="age" class="sr-only">年龄</label>
							<input name = "age" type="age" class="form-control" id="age" placeholder="请输入你的年龄" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="sex" class="sr-only">性别</label>
							<input name = "sex" type="sex" class="form-control" id="sex" placeholder="请输入你的性别" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="address" class="sr-only">家庭住址</label>
							<input name = "address" type="address" class="form-control" id="address" placeholder="请输入你的家庭住址" autocomplete="off">
						</div>
						
						<div class="form-group">
							<p>已经注册了？ <a href="login.jsp"><font color = "#33CCCC">登录</font></a></p>
						</div>
						<center>
						<div class="form-group">
							<input id = "register_btn" type="submit" value="注册" class="btn btn-primary">
						</div>
						</center>
					</div>
				</div>
			</div>
			<div class="row" style="padding-top: 60px; clear: both;">
				<div class="col-md-12 text-center"><p><small>&copy; @CopyRight Abby_lxf  ~_~ 面向妊娠女性的水果及营养推荐系统的设计与实现</small></p></div>
			</div>
		</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	
	<!-- Placeholder -->
	<script src="js/jquery.placeholder.min.js"></script>
	
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	
	<!-- Main JS -->
	<script src="js/main.js"></script>
	
	<script type="text/javascript">
		$(function() {
			$("#register_btn").click(function() {
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
				} else if (password1_val == null || password1_val == "") {
					alert("密码不能为空！")
				} else if (age1_val == null || age1_val == "") {
					alert("年龄不能为空！")
				} else if (sex1_val == null || sex1_val == "") {
					alert("性别不能为空！")
				} else if (address1_val == null || address1_val == "") {
					alert("家庭住址不能为空！")
				}


				var url = "/register";
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
						alert("注册成功！");
						window.location.href="/login.jsp";
					}else{
					alert(data);
					}
				});
			});
		})
	</script>
	</body>
</html>

