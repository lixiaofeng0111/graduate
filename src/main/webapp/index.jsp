<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<title>孕期营养早知道</title>

<link rel="stylesheet" href="css/topic.css">
<link rel="stylesheet" href="css/element.min-xuan.css">
<script type="text/javascript" src="js/vue.min-xuan.js"></script>
<script src="js/element.min-xuan.js"></script>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link
	href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>


<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style type="text/css">
a:hover {
	color: red;
}

.ser {
	border-style: none;
	border-bottom-style: solid;
	border-bottom-width: thin;
	border-bottom-color: red;
}

form {
	position: relative;
	width: 300px;
	margin: 0 auto;
}

input, button {
	border: none;
	outline: none;
}

input {
	width: 100%;
	height: 42px;
	padding-left: 13px;
}

button {
	height: 42px;
	width: 42px;
	cursor: pointer;
	position: absolute;
}

.bar8 form {
	height: 42px;
}

.bar8 input {
	width: 0;
	padding: 0 42px 0 15px;
	border-bottom: 2px solid transparent;
	background: transparent;
	transition: .3s linear;
	position: absolute;
	top: 25px;
	right: 0;
	z-index: 2;
}

.bar8 input:focus {
	width: 300px;
	z-index: 1;
	border-bottom: 2px solid #F9F0DA;
}

.bar8 button {
	top: 20px;
	right: 0;
}

.bar8 button:before {
	content: "\f002";
	font-family: FontAwesome;
	font-size: 16px;
}
</style>

<script type="application/x-javascript">

	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }>

</script>
<meta name="keywords"
	content="Agrom Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndriodCompatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>
<!-- //end-smoth-scrolling -->
<script src="js/menu_jquery.js"></script>

<!---pop-up-box---->
<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
<!---//pop-up-box---->
<script>
	$(document).ready(function() {
		$('.popup-with-zoom-anim').magnificPopup({
			type : 'inline',
			fixedContentPos : false,
			fixedBgPos : true,
			overflowY : 'auto',
			closeBtnInside : true,
			preloader : false,
			midClick : true,
			removalDelay : 300,
			mainClass : 'my-mfp-zoom-in'
		});

	});
</script>
</head>
<body>

	<div style="">
		<!--header start here-->
		<div class="header">
			<div class="container">
				<div class="header-main">
					<div class="header-right">
						<div class="logo">
							<h1 style="font-family: 'Viga', sans-serif; color: #956295">面向妊娠女性的水果及营养推荐系统</h1>
						</div>

						<div class="clearfix"></div>
					</div>
					<div>
						<div class="search bar8">
							<form>
								<input style="cursor: pointer;" type="text"
									placeholder="输入搜索内容...">
								<button style="cursor: pointer;" type="submit"></button>
							</form>
						</div>

						<!---->
						<div class="clearfix"></div>
					</div>

					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!--header end here-->
		<!--top nav start here-->
		<div class="top-navg-main">
			<div class="container">
				<div class="top-navg">
					<span class="menu"> <img src="images/icon.png" alt="" /></span>
					<ul class="res"
						style="font-family: 'Viga', sans-serif; color: #956295">
						<li><a href="index.jsp" class="active hvr-sweep-to-bottom">主页</a></li>
						<li><a class="hvr-sweep-to-bottom" href="about.jsp">孕期阶段分析</a></li>
						<li><a class="hvr-sweep-to-bottom" href="services.jsp">水果分析</a></li>
						<li><a class="hvr-sweep-to-bottom" href="typo.jsp">水果及营养分析</a></li>
						<li><a class="hvr-sweep-to-bottom" href="gallery.jsp">美文推荐</a></li>
						<li><a class="hvr-sweep-to-bottom" href="login.jsp">登录</a></li>
					</ul>
					<!-- script-for-menu -->
					<script>
						$("span.menu").click(function() {
							$("ul.res").slideToggle(300, function() {
								// Animation complete.
							});
						});
					</script>
					<!-- /script-for-menu -->
				</div>
			</div>
		</div>

		<!--banner start here-->
		<div class="banner">
			<div class="container">
				<div class="row clearfix">
					<div class="col-md-12 column">
						<div class="carousel slide" id="carousel-719068"
							data-ride="carousel" data-interval="5000">
							<ol class="carousel-indicators">
								<li class="active" data-slide-to="0"
									data-target="#carousel-719068"></li>
								<li data-slide-to="1" data-target="#carousel-719068"></li>
								<li data-slide-to="2" data-target="#carousel-719068"></li>
							</ol>
							<div id="lunbo" class="carousel-inner">
								<c:forEach items="${imgPath}" var="imagepath">
									<div class="item active">
										<img style="height: 350px; width: 1700px;" alt=""
											src="${imagepath.imgpath}" />
									</div>
								</c:forEach>
							</div>
							<a class="left carousel-control" href="#carousel-719068"
								data-slide="prev"><span
								class="glyphicon glyphicon-chevron-left"></span></a> <a
								class="right carousel-control" href="#carousel-719068"
								data-slide="next"><span
								class="glyphicon glyphicon-chevron-right"></span></a>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!--bann info end here-->
	<!--wedo start here-->
	<div class="we-do">
		<div class="container">
			<div class="wedo-main">
				<div class="col-md-4 wedo-grid">
					<span class="glyphicon glyphicon-leaf" aria-hidden="true"> </span>
					
					<div class="active">
						<a style="color: #956295; font-size: 25px; padding:0px 35px;" > 今日话题 </a>
					</div>
					<div>
								<c:forEach items="${topictoday}" var="today">
										<a href="topic1.jsp">${today.name}</a>
										<div>${today.datetime}</div>
								</c:forEach>
					</div>
							
					
					<a href="topic.jsp"
						style="font-family: 'Viga', sans-serif; color: #956295">More...<span
						class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
					</span></a>
				</div>
				
				
				<div class="col-md-4 wedo-grid">
					<span class="glyphicon glyphicon-user" aria-hidden="true"> </span>
					
					<div class="active">
						<a style="color: #956295; font-size: 25px; padding:0px 45px;" 
							data-toggle="tab"> 往期话题 </a>
					</div>
								<%-- <c:forEach items="${topictoday}" var="notoday">
									<fmt:formatDate var="datetime" value="${notoday.datetime}"
										pattern="yyyy-MM-dd" />
										<a href="topic1.jsp">${today.name}</a>
										<div>${today.datetime}</div>
								</c:forEach> --%>
	
					<a href="topic.jsp"
						style="font-family: 'Viga', sans-serif; color: #956295">More...<span
						class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
					</span></a>
				</div>
				
				<div class="col-md-4 wedo-grid">
					<span class="glyphicon glyphicon-eye-open" aria-hidden="true">
					</span>
					<div>
						<a style="color: #956295; font-size: 25px; padding:0px 45px;" href="#home"
							data-toggle="tab"> 专家栏目 </a>
					</div>
					<c:forEach items="${professor}" var="professor1">
					<fmt:formatDate var="datetime" value="${professor1.datetime}"
										pattern="yyyy-MM-dd" />
					<div>
					${professor1.name}
					</div>
					<div>
					${professor1.datetime}
					</div>
					</c:forEach>
				<div>
					<a href="single.jsp"
						style="font-family: 'Viga', sans-serif; color: #956295">More...<span
						class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
					</span></a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--we do end here-->
	<!--agrom strip start here-->
	<div class="agro-strip">
		<div class="container">
			<div class="agro-strip-main">
				<h3>Nam libero tempore, cum soluta nobis est eligendi</h3>
				<p>But I must explain to you how all this mistaken idea of
					denouncing pleasure and praising pain was born and I will give you
					a complete account of the system</p>
				<a href="topic2" class="hvr-wobble-bottom">Read More</a>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--agrom strip end here-->
	<!--latest-news start here-->
	<div class="latest-new">
		<div class="container">
			<div class="latest-news-main">
				<div class="col-md-3 latest-grid">
					<img src="images/l1.jpg" alt="" class="img-responsive">
					<p>Temporibus autem quibusdam et aut offic</p>
				</div>
				<div class="col-md-3 latest-grid">
					<img src="images/l2.jpg" alt="" class="img-responsive">
					<p>Temporibus autem quibusdam et aut offic</p>
				</div>
				<div class="col-md-3 latest-grid">
					<img src="images/l.jpg" alt="" class="img-responsive">
					<p>Temporibus autem quibusdam et aut offic</p>
				</div>
				<div class="col-md-3 latest-grid">
					<img src="images/l4.jpg" alt="" class="img-responsive">
					<p>Temporibus autem quibusdam et aut offic</p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--latest news end here-->
	<!--footer start here-->
	<div class="footer">
		<div class="container">
			<div class="footer-main">
				<div class="col-md-4 ftr-grd">
					<h3>Get in Touch</h3>
					<p>8901 ibero Road</p>
					<p>Nam libero tempore</p>
					<p>Phone: +148 5746 415</p>
				</div>
				<div class="col-md-4 ftr-grd">
					<h3>Follow Us</h3>
					<ul>
						<li><a href="#"><span class="fa"> </span></a></li>
						<li><a href="#"><span class="tw"> </span></a></li>
						<li><a href="#"><span class="g"> </span></a></li>
						<li><a href="#"><span class="in"> </span></a></li>
					</ul>
				</div>
				<div class="col-md-4 ftr-grd">
					<h3>Join Our Newsletter</h3>
					<p>Temporibus autem quibusdam et aut officiis debitis aut rerum
						necessitatibus</p>
					<label class="hvr-wobble-bottom"> <input type="submit"
						value="Send"></label>
				</div>
				<div class="clearfix"></div>
				<div class="copy-right">
					<p>
						Copyright &copy; 2015.Company name All rights reserved.More
						Templates <a href="http://www.cssmoban.com/" target="_blank"
							title="模板之家">模板之家</a> - Collect from <a
							href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<!--//footer-->
	</div>
	<script type="text/javascript">
		$(function() {
			var aDiv = document.getElementById("lunbo").getElementsByTagName(
					"div");
			aDiv[1].classList.remove("active");
			aDiv[2].classList.remove("active");
		})
	</script>
</body>
</html>