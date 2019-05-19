<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<title>孕期营养早知道</title>

<script src="js/jquery.min.js"></script>
<script src="js/jquery.transit.min.js"></script>
<script src="js/es6-shim.min.js"></script>
<script src="js/easyhelper.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/easyhelper.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<script src="js/jquery-1.11.0.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
<style type="text/css">
pre {
			white-space: pre-wrap;
			word-wrap: break-word;
		}
.content {
	margin: 0px auto;
	width: 1000px;
	height: 320px;
	border: #dfdfdf solid 1px;
	overflow: hidden;
}

.content li {
	display: block;
	height: 40px;
	line-height: 40px;
	text-align: center;
	font-size: 14px;
	border-bottom: #e8e8e8 solid 1px;
}

.page {
	text-align: center;
	margin-bottom: 20px;
}

.slide {
	position:relative;
	left:-50px;
	width: 100%;
	min-height: 180px;
	overflow: hidden;
	position: relative;
}

.slide .img {
	overflow: hidden;
	position: absolute;
	transition: width 0.4s, height 0.4s, top 0.4s, left 0.4s, z-index 0.4s;
}

.slide .img img {
	width: calc(100% - 14px);
	height: calc(100% - 14px);
	margin: 7px;
}

.slide .img1 {
	width: 40%;
	height: 40%;
	top: 30%;
	left: -50%;
	z-index: 1;
}

.slide .img2 {
	width: 80%;
	height: 60%;
	top: 20%;
	left: -20%;
	z-index: 2;
}

.slide .img3 {
	width: 80%;
	height: 80%;
	top: 10%;
	left: 10%;
	z-index: 3;
}

.slide .img4 {
	width: 60%;
	height: 60%;
	top: 20%;
	left: 60%;
	z-index: 2;
}

.slide .img5 {
	width: 40%;
	height: 40%;
	top: 30%;
	left: 110%;
	z-index: 1;
}

.slide-bt {
	position: absolute;
	left: 81%;
	bottom: 13%;
	z-index: 10;
}

.slide-bt span {
	width: 15px;
	height: 16px;
	background: #fff;
	float: left;
	margin: 2px;
	font-size:12px;
	text-align:center;
	cursor: pointer;
}

.slide .slide-bt .on {
	background: #57C4E9;
}

button {
	width: 102px;
	height:42px;
	margin: 20px;
}
.pre{
	position:relative;
	top:-113px;
	left:-396px;
}
.next{
	position:relative;
	top:-113px;
	left:297px;
}
</style>
</head>
<body>
	<div class="avatar-holder">
	<!-- 以下是菜单的内容 -->
		<div class="avatar-container">

			<div class="top-navg-main" style="background-color: #956295">
				<div class="container">
					<div class="top-navg">
						<span class="menu"> <img src="images/icon.png" alt="" /></span>
						<ul class="res">
							<li style="height: 60px;"><a href="/pageIndex"
								style="color: #fff;">主页</a></li>
							<li><a href="about.jsp"
								style="color: #000; background-color: #fff;">孕期阶段分析</a></li>
							<li><a href="/fruit" style="color: #fff;">水果分析</a></li>
							<li><a href="typo.jsp" style="color: #fff;">孕期水果及营养推荐</a></li>
							<li><a href="login.jsp" style="color: #fff;">登录</a></li>
						</ul>

					</div>
				</div>
			</div>
		</div>
		<!-- 以上是菜单的内容 -->
<!-- 以下是孕期每周的具体信息 -->
<div class="container" style="padding: 30px 0px 0px 110px;">
	<div style="width: 1000px; padding: 20px 0px 0px 50px; border: 1px solid #C5C1AA">
		<div style = "text-align:center;">
			<h2>${selectYqbd.name}</h2>
			<hr>
		</div>
		<div>
			<img width = "890px" height = "200px" src="${selectYqbd.picture }">
		</div>
		<div>
			<pre style = "background-color:#fff;width:890px;">${selectYqbd.discription}
			</pre>
			<hr>
		</div>
	</div>
</div>




<!-- 以下是尾部的信息 -->
			<div class="footer">
				<div class="container" style="text-align: center;">
					<div
						style="color: #FFFFFF; font-size: 18px; padding: 0px 0px 0px 150px;">
						友情链接: <a href="http://baby.39.net/">39育儿网|</a> <a
							href="http://www.baby-trees.cn/">宝宝树亲子网|</a> <a
							href="http://www.ci123.com/">育儿网|</a> <a
							href="http://yuer.ibabyzone.cn/">宝宝地带|</a> <a
							href="http://www.yaolan.com/">摇篮网|</a> <a
							href="https://www.mmbang.com/">妈妈帮</a>
					</div>
					<div style="color: #FFFFFF;">@CopyRight Lxf 郑州轻工业大学2015届毕业设计</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
</body>
</html>