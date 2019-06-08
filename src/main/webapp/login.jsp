<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>孕期营养早知道</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'>

<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.1/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet" href="css/bootstrap-login.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/login.css">
<script src="js/modernizr-2.6.2.min.js"></script>

</head>
<body class="style-3">

	<div class="row">
		<div class="col-md-4 col-md-push-8">
			<!-- Start Sign In Form -->
			<div class="fh5co-form animate-box" data-animate-effect="fadeInRight">
					<div style = "text-align:center;"><h2>登录页面</h2></div>
				<div class="form-group">
					<label class="sr-only">用户名</label> <input  name="username"
						type="text" class="form-control" id="username"
						placeholder="请输入您的用戶名" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="password" class="sr-only">密码</label> <input
						name="password" type="password" class="form-control" id="password"
						placeholder="请输入您的密码" autocomplete="new-password">
				</div>
				<div class="form-group">
					<p>
						还没有注册？ <a href="sign-up.jsp"><font color = "#33CCCC">注册</font></a>
					</p>
				</div>
				<div class="form-group" style = "text-align:center;">
						<input id="login_btn" type="submit" value="登录"
							class="btn btn-primary">
				</div>
			</div>
		</div>
	</div>
	<div class="row" style="padding-top: 60px; clear: both;">
		<div class="col-md-12 text-center">
			<p>
				<small>&copy;CopyRight Abby_lxf ~_~ 面向妊娠女性的水果及营养推荐系统的设计与实现</small>
			</p>
		</div>
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
			$("#login_btn").click(function() {
				var username1 = document.getElementById("username");
				var password1 = document.getElementById("password");
				username1_val = $.trim(username1.value);
				password1_val = $.trim(password1.value);
				if (username1_val == null || username1_val == "") {
					alert("用户名不能为空！")
				} else if (password1_val == null || password1_val == "") {
					alert("密码不能为空！")
				}

				//form中的action的值；

				var url = "/checkLogin";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"username" : username1_val,
					"password" : password1_val,
					"time" : new Date()
				};
				$.post(url, args, function(data) {
					if(data == "ok"){
						window.location.href="/doLogin";
					}else{
					alert(data);
					}
				});
			});
		})
	</script>
</body>
</html>

