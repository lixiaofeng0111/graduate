<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<title>孕期营养早知道</title>
<link rel="stylesheet" href="css/roll.css">

<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/scrollbar.js" type="text/javascript"></script>

<script type="text/javascript" src="js/pc.js"></script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
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
	top: 15px;
	right: 0;
	z-index: 2;
}

.bar8 input:focus {
	width: 200px;
	z-index: 1;
	border-bottom: 2px solid #F9F0DA;
}

.bar8 button {
	top: 18px;
	right: 0;
}

.bar8 button:before {
	content: "\f002";
	font-family: FontAwesome;
	font-size: 16px;
}
</style>

</head>
<body>
	<!--header start here-->
	<div class="header">
		<div class="container">
			<div class="header-main">
				<div class="header-right">

					<div class="header-login">
						<div class="top-nav-right"></div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<div class="top-navg-main" style="background-color: #956295">
		<div class="container">
			<div class="top-navg">
				<span class="menu"> <img src="images/icon.png" alt="" /></span>
				<ul class="res" style="font-size: 16px;">
					<li style="height: 60px;"><a href="/pageIndex"
						style="color: #fff;">主页</a></li>
					<li><a href="/pregnant"
						style="background-color: #fff;">孕期阶段分析</a></li>
					<li><a href="/fruit" style="color: #fff;">水果分析</a></li>
					<li><a href="/pregnantRecomment" style="color: #fff;">孕期水果及营养推荐</a></li>
					<c:choose>
						<c:when test="${empty username}">
							<li><a href="login.jsp" style="color: #fff;">登录</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="/loginOut" style="color: #fff;">退出登录</a></li>
						</c:otherwise>
					
					</c:choose>	
				</ul>

			</div>
		</div>
	</div>

	<div class="about">
		<div class="container">
			<div class="about-main">
				<div class="col-md-4 about-left">
					<img style="width: 300px; height: 310px;"
						src="imgs/indexbottom1.jpg">
				</div>
					<div><img width="30px;" height = "30px;" src="imgs/week.png">孕期阶段      
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;              
					<img width="30px;" height = "30px;" src="imgs/knowledge.png">孕期必备知识
					</div>
				<div class="col-md-4 about-left" style="padding: 0px 0px 0px 10px;">
					<table style="text-align: center;">
						<tr height="35px;">
							<td width="60px;"><a href = "/selectByWeek?week=1" target="_blank">1周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=2" target="_blank">2周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=3" target="_blank">3周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=4" target="_blank">4周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=5" target="_blank">5周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=6" target="_blank">6周</a></td>
							<td><a href = "/selectByWeek?week=7" target="_blank">7周</a></td>
							<td><a href = "/selectByWeek?week=8" target="_blank">8周</a></td>
							<td><a href = "/selectByWeek?week=9" target="_blank">9周</a></td>
							<td><a href = "/selectByWeek?week=10" target="_blank">10周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=11" target="_blank">11周</a></td>
							<td><a href = "/selectByWeek?week=12" target="_blank">12周</a></td>
							<td><a href = "/selectByWeek?week=13" target="_blank">13周</a></td>
							<td><a href = "/selectByWeek?week=14" target="_blank">14周</a></td>
							<td><a href = "/selectByWeek?week=15" target="_blank">15周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=16" target="_blank">16周</a></td>
							<td><a href = "/selectByWeek?week=17" target="_blank">17周</a></td>
							<td><a href = "/selectByWeek?week=18" target="_blank">18周</a></td>
							<td><a href = "/selectByWeek?week=19" target="_blank">19周</a></td>
							<td><a href = "/selectByWeek?week=20" target="_blank">20周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=21" target="_blank">21周</a></td>
							<td><a href = "/selectByWeek?week=22" target="_blank">22周</a></td>
							<td><a href = "/selectByWeek?week=23" target="_blank">23周</a></td>
							<td><a href = "/selectByWeek?week=24" target="_blank">24周</a></td>
							<td><a href = "/selectByWeek?week=25" target="_blank">25周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=26" target="_blank">26周</a></td>
							<td><a href = "/selectByWeek?week=27" target="_blank">27周</a></td>
							<td><a href = "/selectByWeek?week=28" target="_blank">28周</a></td>
							<td><a href = "/selectByWeek?week=28" target="_blank">29周</a></td>
							<td><a href = "/selectByWeek?week=30" target="_blank">30周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=31" target="_blank">31周</a></td>
							<td><a href = "/selectByWeek?week=32" target="_blank">32周</a></td>
							<td><a href = "/selectByWeek?week=33" target="_blank">33周</a></td>
							<td><a href = "/selectByWeek?week=34" target="_blank">34周</a></td>
							<td><a href = "/selectByWeek?week=35" target="_blank">35周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=36" target="_blank">36周</a></td>
							<td><a href = "/selectByWeek?week=37" target="_blank">37周</a></td>
							<td><a href = "/selectByWeek?week=38" target="_blank">38周</a></td>
							<td><a href = "/selectByWeek?week=39" target="_blank">39周</a></td>
							<td><a href = "/selectByWeek?week=40" target="_blank">40周</a></td>
						</tr>
					</table>
					
					
					
				</div>
					
				<div class="col-md-4 about-left" style="padding: -10px 0px 0px 10px;">
					<p>欢迎进入孕期阶段！这是一段令人难以置信的美妙旅程，一个健康活泼的宝宝，需要你我共同努力。</p>
					<ul>
					<c:forEach items="${pregnantKonwledge}" var="pregnantkonwledge">
						<li style="width: 400px;"><a href="/selectTopicById?id=${pregnantkonwledge.id}">${pregnantkonwledge.name} </a></li>
					</c:forEach>

					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">
				<div style = "padding:30px 0px 10px 30px;"><img src="imgs/action.png">孕期必读</div>
				<c:forEach items="${selectEarly}" var="selectPregnant">
					<div class="col-md-4 column">
							<a href = "/selectYqbdById?id=${selectPregnant.id}"><img width="300px;" height = "200px;" src = "upload/${selectPregnant.showpicture }"></a>
					</div>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>


	<div class="histort">
		<div class="container">
			<div class="history-main">
				<script src="/demos/googlegg.js"></script>
				<link href="css/css/style.css" rel="stylesheet" type="text/css">
				<div class="o-m">
					<div class="ul-o">
						<ul>
						<c:forEach items="${selectKind}" var="selectAllKind">
							<li class="li-o"><p style = "color:#000;">${selectAllKind.kind}</p>
								<div class="clear"></div></li>
						</c:forEach>
						</ul>
					</div>
					<div class="ul-t">
						<li style="display: block">
							<!-- 这里是滚动条区域 -->
							<div class="scroll_main">
								<div class="scroll_wrap">
									<div class="scroll_cont" style = "text-align:left;">
									
									<c:forEach items="${selectPregnantAnalysis}" var="selectAllPregnantAnalysis">
										<c:if test="${selectAllPregnantAnalysis.kindId==1}">
										<br>

										<h4>&nbsp;&nbsp;${selectAllPregnantAnalysis.name}</h4>
										<br>
										<pre style = "background-color:#fff;">&nbsp;&nbsp;${selectAllPregnantAnalysis.description}</pre>
										<hr>
										</c:if>
										</c:forEach>


									</div>

									<div class="scroll_bar">
										<div class="scroll_slider"></div>
									</div>
								</div>
							</div> 
						<!-- 这里是滚动条区域 -->

						</li>
						<li>
							<div class="li-top">
								<!-- 这里是滚动条区域 -->
							<div class="scroll_main">
								<div class="scroll_wrap">
									<div class="scroll_cont" style = "text-align:left;">
									
									<c:forEach items="${selectPregnantAnalysis}" var="selectAllPregnantAnalysis">
										<c:if test="${selectAllPregnantAnalysis.kindId==2}">
										<br>
										<h4>&nbsp;&nbsp;${selectAllPregnantAnalysis.name}</h4>
										<br>
										<pre style = "background-color:#fff;">&nbsp;&nbsp;${selectAllPregnantAnalysis.description}</pre>
										<hr>
										</c:if>
										</c:forEach>


									</div>

									<div class="scroll_bar">
										<div class="scroll_slider"></div>
									</div>
								</div>
							</div> 
						<!-- 这里是滚动条区域 -->
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<!-- 这里是滚动条区域 -->
							<div class="scroll_main">
								<div class="scroll_wrap">
									<div class="scroll_cont" style = "text-align:left;">	
									<c:forEach items="${selectPregnantAnalysis}" var="selectAllPregnantAnalysis">
										<c:if test="${selectAllPregnantAnalysis.kindId==3}">
										<br>
										<h4>&nbsp;&nbsp;${selectAllPregnantAnalysis.name}</h4>
										<br>
										<pre style = "background-color:#fff;">&nbsp;&nbsp;${selectAllPregnantAnalysis.description}</pre>
										<hr>
										</c:if>
										</c:forEach>


									</div>

									<div class="scroll_bar">
										<div class="scroll_slider"></div>
									</div>
								</div>
							</div> 
						<!-- 这里是滚动条区域 -->
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<!-- 这里是滚动条区域 -->
							<div class="scroll_main">
								<div class="scroll_wrap">
									<div class="scroll_cont" style = "text-align:left;">
									
									<c:forEach items="${selectPregnantAnalysis}" var="selectAllPregnantAnalysis">
										<c:if test="${selectAllPregnantAnalysis.kindId==4}">
										<br>
										<h4>${selectAllPregnantAnalysis.name}</h4>
										<br>
										<pre style = "background-color:#fff;">${selectAllPregnantAnalysis.description}</pre>
										<hr>
										</c:if>
										</c:forEach>


									</div>

									<div class="scroll_bar">
										<div class="scroll_slider"></div>
									</div>
								</div>
							</div> 
						<!-- 这里是滚动条区域 -->
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<!-- 这里是滚动条区域 -->
							<div class="scroll_main">
								<div class="scroll_wrap">
									<div class="scroll_cont" style = "text-align:left;">
									
									<c:forEach items="${selectPregnantAnalysis}" var="selectAllPregnantAnalysis">
										<c:if test="${selectAllPregnantAnalysis.kindId==5}">
										<br>
										<h4>${selectAllPregnantAnalysis.name}</h4>
										<br>
										<pre style = "background-color:#fff;">${selectAllPregnantAnalysis.description}</pre>
										<hr>
										</c:if>
										</c:forEach>


									</div>

									<div class="scroll_bar">
										<div class="scroll_slider"></div>
									</div>
								</div>
							</div> 
						<!-- 这里是滚动条区域 -->
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<!-- 这里是滚动条区域 -->
							<div class="scroll_main">
								<div class="scroll_wrap">
									<div class="scroll_cont" style = "text-align:left;">
									
									<c:forEach items="${selectPregnantAnalysis}" var="selectAllPregnantAnalysis">
										<c:if test="${selectAllPregnantAnalysis.kindId==6}">
										<br>
										<h4>&nbsp;&nbsp;${selectAllPregnantAnalysis.name}</h4>
										<br>
										<pre style = "background-color:#fff;">&nbsp;&nbsp;${selectAllPregnantAnalysis.description}</pre>
										<hr>
										</c:if>
										</c:forEach>


									</div>

									<div class="scroll_bar">
										<div class="scroll_slider"></div>
									</div>
								</div>
							</div> 
						<!-- 这里是滚动条区域 -->
								
							</div>
						</li>
					</div>
					<div class="clear"></div>
				</div>











			</div>
		</div>
	</div>
	<div class="team">
		<div class="container">
			<div class="team-main">
				<div style = "padding:0px 0px 10px 30px;"><img src="imgs/show.png">美图展示</div>
				<c:forEach items="${selectMeituShows}" var="meitushow">
				<div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
					<img width = "150px" height = "200px" src="upload/${meitushow.imgpath}" />
				</div>
				</c:forEach>
				
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--about end here-->

	<!--footer start here-->
	<div class="footer">
				<div class="container" style="text-align: center;">
					<div
						style="color: #FFFFFF; font-size: 18px; padding: 0px 0px 0px 30px;">
						友情链接: <a style = "color:RGB(51,122,183);" href="http://baby.39.net/">39育儿网|</a> 
							<a style = "color:RGB(51,122,183);"
							href="http://www.baby-trees.cn/">宝宝树亲子网|</a> 
							<a style = "color:RGB(51,122,183);"
							href="http://www.ci123.com/">育儿网|</a> 
							<a style = "color:RGB(51,122,183);"
							href="http://yuer.ibabyzone.cn/">宝宝地带|</a> 
							<a style = "color:RGB(51,122,183);"
							href="http://www.yaolan.com/">摇篮网|</a> 
							<a style = "color:RGB(51,122,183);"
							href="https://www.mmbang.com/">妈妈帮</a>
					</div>
					<div style="color: #FFFFFF;">@CopyRight Lxf 郑州轻工业大学2015届毕业设计</div>
					<div class="clearfix"></div>
				</div>
			</div>
	<!--//footer-->
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$('.o-m .ul-o li').hover(function() {
			var linum = $(this).index()
			$('.o-m .ul-t li').eq(linum).stop().show().siblings().hide()
		})
		$(function() {
			var slip = $('.li-mask');
			var a = $('.o-m .ul-o li:first');
			//初始化滑块
			slip.css({
				'top' : parseInt(a.position().top) + 'px'
			});
			$('.o-m .ul-o li').mouseenter(function() {
				//显示滑块
				if (slip.css('display') == 'none') {
					slip.show();
				}
				;
				//移动滑块
				slip.stop().animate({
					top : parseInt($(this).position().top) + 'px'
				}, 300);
			});
		});
	</script>
	<script type="text/javascript">
		new CusScrollBar({
			contentSelector : '.scroll_cont', //滚动内容区
			barSelector : '.scroll_bar', //滚动条
			sliderSelector : '.scroll_slider' //滚动滑块
		});
	</script>
</body>
</html>