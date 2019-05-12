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
							<h1 style="font-family: 'Viga', sans-serif; color: #956295;">面向妊娠女性的水果及营养推荐系统</h1>
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
						<li><a href="/pageIndex" class="active hvr-sweep-to-bottom">主页</a></li>
						<li><a class="hvr-sweep-to-bottom" href="about.jsp">孕期阶段分析</a></li>
						<li><a class="hvr-sweep-to-bottom" href="services.jsp">水果分析</a></li>
						<li><a class="hvr-sweep-to-bottom" href="typo.jsp">孕期水果及营养推荐</a></li>
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
						<a style="color: #956295; font-size: 25px; padding: 0px 35px;">
							今日话题 </a>
					</div>
					<div>
						<c:forEach items="${topictoday}" var="today">
							<fmt:formatDate var="datetime" value="${today.datetime}"
								pattern="yyyy-MM-dd" />
							<table>
								<tr>
									<td><li><a href="topic1.jsp">${datetime} |
												${today.name }</a></li></td>
								</tr>
							</table>
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
						<a style="color: #956295; font-size: 25px; padding: 0px 45px;"
							data-toggle="tab"> 往期话题 </a>
					</div>
					<fmt:formatDate var="nowDate" value="<%=new Date()%>"
						pattern="yyyy-MM-dd" />
					<c:forEach items="${notoday}" var="yesterday">
						<fmt:formatDate var="datetime" value="${yesterday.datetime}"
							pattern="yyyy-MM-dd" />
						<c:if test="${datetime != nowDate}">
							<table>
								<tr>
									<td><li><a href="topic1.jsp">${datetime} |
												${yesterday.name }</a></li></td>
								</tr>
							</table>
						</c:if>
					</c:forEach>

					<a href="topic.jsp"
						style="font-family: 'Viga', sans-serif; color: #956295">More...<span
						class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true">
					</span></a>
				</div>

				<div class="col-md-4 wedo-grid">
					<span class="glyphicon glyphicon-eye-open" aria-hidden="true">
					</span>
					<div>
						<a style="color: #956295; font-size: 25px; padding: 0px 45px;"
							href="#home" data-toggle="tab"> 专家栏目 </a>
					</div>
					<fmt:formatDate var="nowDate" value="<%=new Date()%>"
						pattern="yyyy-MM-dd" />
					<c:forEach items="${professors}" var="professor">
						<fmt:formatDate var="datetime" value="${professor.datetime}"
							pattern="yyyy-MM-dd" />
						<c:if test="${datetime != nowDate}">
							<table>
								<tr>
									<td><li><a href="topic1.jsp">${nowDate} |
												${professor.name }</a></li></td>
								</tr>
							</table>
						</c:if>
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
					<h3>妊娠女性 & 水果营养</h3>
					<p style="font-size: 15px;">水果营养丰富，口味酸甜，怀孕后的准妈妈要适量吃水果孕期应势应该遵循：
						全面原则，均衡原则，自然原则，植物性食物功效非凡。水果中许多成分均是水溶性的，
						饭前吃有利于身体必需营养素的吸收孕妈妈的营养牵动着妈咪和宝宝的身体发育在这个特殊 的时期水果就是最好的补品</p>
					<a href="typo.jsp" class="hvr-wobble-bottom">更多...</a>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div>


			<div style = "font-size:30px;color: #956295;padding:10px;">孕期周刊 </div>
			<div class="pregnantweek">
				<div style = "font-size:20px;">孕早期</div>
			<ul><table>
				<tr>
			    	<td width = "100px;" height = "50px;"><a href="#">第一周</a></td>
			    	<td width = "100px;"><a href="#">第二周</a></td>
			    	<td width = "100px;"><a href="#">第三周</a></td>
			    	<td width = "100px;"><a href="#">第四周</a></td>
			    	<td width = "100px;"><a href="#">第五周</a></td>
			    	<td width = "100px;"><a href="#">第六周</a></td>
			    	<td width = "100px;"><a href="#">第七周</a></td>
			    	<td width = "100px;"><a href="#">第八周</a></td>
			    	<td width = "100px;"><a href="#">第九周</a></td>
			    	<td width = "100px;"><a href="#">第十周</a></td>
			    	<td width = "100px;"><a href="#">第十一周</a></td>
			    	<td width = "100px;"><a href="#">第十二周</a></td>
				</tr>
				</table>
			</ul>
			<div style = "font-size:20px;">孕中期</div>
			<ul><table>
				<tr>
			    	<td width = "100px;" height = "50px;"><a href="#">第十一周</a></td>
			    	<td width = "100px;"><a href="#">第十二周</a></td>
			    	<td width = "100px;"><a href="#">第十三周</a></td>
			    	<td width = "100px;"><a href="#">第十四周</a></td>
			    	<td width = "100px;"><a href="#">第十五周</a></td>
			    	<td width = "100px;"><a href="#">第十六周</a></td>
			    	<td width = "100px;"><a href="#">第十七周</a></td>
			    	<td width = "100px;"><a href="#">第十八周</a></td>
			    	<td width = "100px;"><a href="#">第十九周</a></td>
			    	<td width = "100px;"><a href="#">第二十周</a></td>
			    	<td width = "100px;"><a href="#">第二十一周</a></td>
			    	<td width = "100px;"><a href="#">第二十二周</a></td>
			    </tr>
			    <tr>
			    	<td width = "100px;" height = "50px;"><a href="#">第二十三周</a></td>
			    	<td width = "100px;"><a href="#">第二十四周</a></td>
			    	<td width = "100px;"><a href="#">第二十五周</a></td>
			    	<td width = "100px;"><a href="#">第二十六周</a></td>
			    	<td width = "100px;"><a href="#">第二十七周</a></td>
			    	<td width = "100px;"><a href="#">第二十八周</a></td>
				</tr>
				</table>
			</ul>
			<div style = "font-size:20px;">孕晚期</div>
			<ul><table>
				<tr>
			    	<td width = "100px;" height = "50px;"><a href="#">第二十九周</a></td>
			    	<td width = "100px;"><a href="#">第三十周</a></td>
			    	<td width = "100px;"><a href="#">第三十一周</a></td>
			    	<td width = "100px;"><a href="#">第三十二周</a></td>
			    	<td width = "100px;"><a href="#">第三十三周</a></td>
			    	<td width = "100px;"><a href="#">第三十四周</a></td>
			    	<td width = "100px;"><a href="#">第三十五周</a></td>
			    	<td width = "100px;"><a href="#">第三十六周</a></td>
			    	<td width = "100px;"><a href="#">第三十七周</a></td>
			    	<td width = "100px;"><a href="#">第三十八周</a></td>
			    	<td width = "100px;"><a href="#">第三十九周</a></td>
			    	<td width = "100px;"><a href="#">第四十周</a></td>
				</tr>
				</table>
			</ul>
			</div>

<div style = "font-size:30px;color: #956295;padding:10px;">水果相关信息</div>
			<div class="latest-new">
				<div class="container">
					<div class="latest-news-main">

						<c:forEach items="${imgPathButtom}" var="imagepathbuttom">
							<div class="col-md-3 latest-grid"
								style="width: 400px; height: 240px;">
								<img src="${imagepathbuttom.imgpath}" alt=""
									class="img-responsive">
								<p>${imagepathbuttom.content}<a href = "services.jsp">|更多</a></p>
							</div>
						</c:forEach>

						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!--latest news end here-->
			<!--footer start here-->
			<div class="footer">
				<div class="container" style = "text-align:center;">
							<div style = "color:#FFFFFF;font-size:18px;padding:0px 0px 0px 30px;">友情链接:
								<a href="http://baby.39.net/">39育儿网|</a>
								<a href="http://www.baby-trees.cn/">宝宝树亲子网|</a>
								<a href="http://www.ci123.com/">育儿网|</a>
								<a href="http://yuer.ibabyzone.cn/">宝宝地带|</a>
								<a href="http://www.yaolan.com/">摇篮网|</a>
								<a href="https://www.mmbang.com/">妈妈帮</a>
							</div>
							<div style = "color:#FFFFFF;">@CopyRight Lxf 郑州轻工业大学2015届毕业设计</div>
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