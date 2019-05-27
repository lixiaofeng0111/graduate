<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<title>孕期营养早知道</title>
<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="js/anchorHoverEffect.js"></script>
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

input,button {
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
	top: 5px;
	right: 0;
	z-index: 2;
}

.bar8 input:focus {
	width: 200px;
	z-index: 1;
	border-bottom: 2px solid #F9F0DA;
}

.bar8 button {
	top: 5px;
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
							<h1 style="font-family: 'Viga', sans-serif; color: #956295;">面向妊娠女性的水果及营养推荐系统</h1>
						</div>

						<div class="clearfix"></div>
					</div>
					<div>
						<div class="search bar8">
							<form id="searchTopic" method="post" action="/pageSearchTopicAndProfessor" target="_blank">
								<input name="topicString" type="text" style="width:176px;margin-right:40px;"
									placeholder="请输入您的疑问...">
								<button  style="cursor: pointer" type="submit" ></button>
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
						<li><a href="/pageIndex" class="active "
							style="background-color: #956295; color: #fff;">主页</a></li>
						<li><a href="/pregnant">孕期阶段分析</a></li>
						<li><a href="/fruit">水果分析</a></li>
						<li><a href="/pregnantRecomment">孕期水果及营养推荐</a></li>
						<li><a href="login.jsp">登录</a></li>
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
		<div class="container" style="margin-left: 132px;">
			<div class="wedo-main">
				<!-- 今日话题 -->
				<div class="col-md-4 wedo-grid" style="width: 370px; height: 300px;">

					<div class="active">
						<a style="color: #956295; font-size: 25px; padding: 0px 35px;">
							<img width="50px" height="50px" src="imgs/topic1.png">今日话题
						</a>
					</div>
					<hr>
					<div>
						<c:forEach items="${topictoday}" var="today">
							<fmt:formatDate var="datetime" value="${today.datetime}"
								pattern="yyyy-MM-dd" />
							<table>
								<tr>
									<td><a href="/selectIndexTopicById?id=${today.id}">${datetime}
											| ${today.name }</a></td>
								</tr>
							</table>
						</c:forEach>

					</div>


					<a href="/pageMoreIndexTopic"
						style="font-family: 'Viga', sans-serif; color: #956295">More...<span
						class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
					</span></a>
				</div>

				<!-- 往期话题 -->
				<div class="col-md-4 wedo-grid" style="width: 370px; height: 300px;">

					<div class="active">
						<a style="color: #956295; font-size: 25px; padding: 0px 45px;"
							data-toggle="tab"><img width="50px" height="50px"
							src="imgs/topic2.png"> 往期话题 </a>
					</div>
					<hr>
					<fmt:formatDate var="nowDate" value="<%=new Date()%>"
						pattern="yyyy-MM-dd" />
					<c:forEach items="${notoday}" var="yesterday">
						<fmt:formatDate var="datetime" value="${yesterday.datetime}"
							pattern="yyyy-MM-dd" />
						<c:if test="${datetime != nowDate}">
							<table>
								<tr>
									<td><a href="/selectIndexTopicById?id=${yesterday.id}">${datetime}
											| ${yesterday.name }</a></td>
								</tr>
							</table>
						</c:if>
					</c:forEach>

					<a href="/pageMoreIndexTopic"
						style="font-family: 'Viga', sans-serif; color: #956295">More...<span
						class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
					</span></a>
				</div>
				<!-- 专家栏目 -->
				<div class="col-md-4 wedo-grid" style="width: 370px; height: 300px;">
					<div>
						<a style="color: #956295; font-size: 25px; padding: 0px 45px;"
							href="#home" data-toggle="tab"> <img width="50px"
							height="50px" src="imgs/topic3.png">专家栏目
						</a>
					</div>
					<hr>
					<fmt:formatDate var="nowDate" value="<%=new Date()%>"
						pattern="yyyy-MM-dd" />
					<c:forEach items="${professors}" var="professor">
						<fmt:formatDate var="datetime" value="${professor.datetime}"
							pattern="yyyy-MM-dd" />
						<c:if test="${professor.topickindId == 1}">
							<table>
								<tr width="150px">
									<td><a href="/pageProfessor?id=${professor.id}">${datetime}
											| ${professor.name }</a></td>
								</tr>
							</table>
						</c:if>
					</c:forEach>
					<div>
						<a href="/pageProfessorTopic"
							style="font-family: 'Viga', sans-serif; color: #956295">More...<span
							class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
						</span></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<hr>
				<!-- 以上专家栏目 -->
				<!-- 重点关注 -->
				<div class="col-md-4 wedo-grid" style="width: 370px; height: 300px;">
					<div>
						<a style="color: #956295; font-size: 25px; padding: 0px 45px;"
							href="#home" data-toggle="tab"> <img width="50px"
							height="50px" src="imgs/topic4.png">重点关注
						</a>
					</div>
					<hr>
					<fmt:formatDate var="nowDate" value="<%=new Date()%>"
						pattern="yyyy-MM-dd" />
					<c:forEach items="${professors}" var="professor">
						<fmt:formatDate var="datetime" value="${professor.datetime}"
							pattern="yyyy-MM-dd" />
						<c:if test="${professor.topickindId == 2}">
							<table>
								<tr width="150px">
									<td><a href="/pageProfessor?id=${professor.id}">${datetime}
											| ${professor.name }</a></td>
								</tr>
							</table>
						</c:if>
					</c:forEach>
					<div>
						<a href="/pageMoreIndexTopic"
							style="font-family: 'Viga', sans-serif; color: #956295">More...<span
							class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
						</span></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<hr>
				<!-- 水果营养 -->
				<div class="col-md-4 wedo-grid" style="width: 370px; height: 300px;">
					<div>
						<a style="color: #956295; font-size: 25px; padding: 0px 45px;"
							href="#home" data-toggle="tab"> <img width="50px"
							height="50px" src="imgs/topic5.png">水果营养
						</a>
					</div>
					<hr>
					<fmt:formatDate var="nowDate" value="<%=new Date()%>"
						pattern="yyyy-MM-dd" />
					<c:forEach items="${professors}" var="professor">
						<fmt:formatDate var="datetime" value="${professor.datetime}"
							pattern="yyyy-MM-dd" />
						<c:if test="${professor.topickindId == 3}">
							<table>
								<tr width="150px">
									<td><a href="/pageProfessor?id = ${professor.id}">${datetime}
											| ${professor.name }</a></td>
								</tr>
							</table>
						</c:if>
					</c:forEach>
					<div>
						<a href="/pageMoreIndexTopic"
							style="font-family: 'Viga', sans-serif; color: #956295">More...<span
							class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
						</span></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<hr>
				<!--胎儿发育  -->
				<div class="col-md-4 wedo-grid" style="width: 370px; height: 300px;">
					<div>
						<a style="color: #956295; font-size: 25px; padding: 0px 45px;"
							href="#home" data-toggle="tab"> <img width="50px"
							height="50px" src="imgs/topic6.png">胎儿发育
						</a>
					</div>
					<hr>
					<fmt:formatDate var="nowDate" value="<%=new Date()%>"
						pattern="yyyy-MM-dd" />
					<c:forEach items="${professors}" var="professor">
						<fmt:formatDate var="datetime" value="${professor.datetime}"
							pattern="yyyy-MM-dd" />
						<c:if test="${professor.topickindId == 4}">
							<table>
								<tr width="150px">
									<td><a href="/pageProfessor?id = ${professor.id}">${datetime}
											| ${professor.name }</a></td>
								</tr>
							</table>
						</c:if>
					</c:forEach>
					<div>
						<a href="/pageMoreIndexTopic"
							style="font-family: 'Viga', sans-serif; color: #956295">More...<span
							class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
						</span></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<hr>





			</div>

		</div>
		<!-- 以上是话题和轮播图的内容 -->
		<div class="agro-strip" style="width: 1080px; margin-left: 140px;">
			<div class="container">
				<div class="agro-strip-main">
					<h3>妊娠女性 & 水果营养</h3>
					<p style="font-size: 15px;">水果营养丰富，口味酸甜，怀孕后的准妈妈要适量吃水果孕期应势应该遵循：
						全面原则，均衡原则，自然原则，植物性食物功效非凡。水果中许多成分均是水溶性的，
						饭前吃有利于身体必需营养素的吸收孕妈妈的营养牵动着妈咪和宝宝的身体发育在这个特殊 的时期水果就是最好的补品</p>
					<a href="/pregnantRecomment" class="hvr-wobble-bottom">更多...</a>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div>
			<br>
			<br>
			<div style="font-size: 30px; color: green; margin-left: 140px;">
				<img width="85px" height="75px" src="imgs/fruitlogo.png">水果相关信息
			</div>
			<div class="latest-new">
				<div class="container">
					<div class="latest-news-main">

						<c:forEach items="${imgPathButtom}" var="imagepathbuttom">
							<div class="col-md-3 latest-grid"
								style="width: 280px; height: 240px;">
								<img src="${imagepathbuttom.imgpath}" alt=""
									class="img-responsive">
								<p>${imagepathbuttom.content}<a href="/fruit">|更多</a>
								</p>
							</div>
						</c:forEach>

						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!--latest news end here-->
			<!--footer start here-->
			<div class="footer">
				<div class="container" style="text-align: center;">
					<div
						style="color: #FFFFFF; font-size: 18px; padding: 0px 0px 0px 30px;">
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
			<!--//footer-->
		</div>
		<script>
			$(".demo-1 a").anchorHoverEffect();
			$(".demo-2 a").anchorHoverEffect({
				type : 'brackets'
			});
			$(".demo-3 a").anchorHoverEffect({
				type : 'flip'
			});
			$(".demo-4 a").anchorHoverEffect({
				type : 'borderBottom'
			});
		</script>
		<script type="text/javascript">
			$(function() {
				var aDiv = document.getElementById("lunbo")
						.getElementsByTagName("div");
				aDiv[1].classList.remove("active");
				aDiv[2].classList.remove("active");
			})
		</script>
</body>
</html>