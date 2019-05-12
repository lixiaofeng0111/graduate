<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>孕期营养早知道</title>
<script type="text/javascript" src="js/pc.js"></script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }>
</script>
<meta name="keywords" content="Agrom Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndriodCompatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
</script>
<!-- //end-smoth-scrolling -->
<script src="js/menu_jquery.js"></script>

<!---pop-up-box---->
					<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
					<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
					<!---//pop-up-box---->
					 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>		
</head>
<body>
<!--header start here-->
<div class="header">
	<div class="container">
		<div class="header-main">	  
			   <div class="header-right">
				   <div class="logo">
				   	   <h1><font color = "#956295">面向妊娠女性的水果及营养推荐系统</font></h1>
				   </div>
				   <div class="header-login">
					 <div class="top-nav-right">
				   </div>
		      </div>
		    <div class="clearfix"> </div>
	     </div>
	     <div class="clearfix"> </div>
     </div>
   </div>
</div>
<!--header end here-->
<!--top nav start here-->
<div class="top-navg-main">
	<div class="container">
	    <div class="top-navg">
	    	           <span class="menu"> <img src="images/icon.png" alt=""/></span>
				<ul class="res">
				    <li><a href="/pageIndex" class="active hvr-sweep-to-bottom">主页</a></li>
					<li><a class="hvr-sweep-to-bottom" href="about.jsp">孕期阶段分析</a></li>
					<li><a class="hvr-sweep-to-bottom" href="services.jsp">水果分析</a></li>
					<li><a class="hvr-sweep-to-bottom" href="typo.jsp">水果及营养分析</a></li>
					<li><a class="hvr-sweep-to-bottom" href="login.jsp">登录</a></li>
				 </ul>
					<!-- script-for-menu -->
						 <script>
						   $( "span.menu" ).click(function() {
							 $( "ul.res" ).slideToggle( 300, function() {
							 // Animation complete.
							  });
							 });
						</script>
		        <!-- /script-for-menu -->
		   </div>
	 </div>
</div>

<div class="about">
	<div class="container">
		<div class="about-main">
			<div class="col-md-4 about-left">
				<img style = "width:300px;height:310px;" src="imgs/indexbottom1.jpg">
			</div>
			<div class="col-md-4 about-left" style = "padding: 0px 0px 0px 10px;">
				<h2>孕期阶段</h2>
					<table style = " text-align:center;">
						<tr height = "35px;">
							<td width = "60px;">1周</td>
							<td width = "60px;">2周</td>
							<td width = "60px;">3周</td>
							<td width = "60px;">4周</td>
							<td width = "60px;">5周</td>
						</tr>
						<tr height = "35px;">
							<td>6周</td><td>7周</td><td>8周</td><td>9周</td><td>10周</td>
						</tr>
						<tr height = "35px;">
							<td>11周</td><td>12周</td><td>13周</td><td>14周</td><td>15周</td>
						</tr>
						<tr height = "35px;">
							<td>16周</td><td>17周</td><td>18周</td><td>19周</td><td>20周</td>
						</tr>
						<tr height = "35px;">
							<td>21周</td><td>22周</td><td>23周</td><td>24周</td><td>25周</td>
						</tr>
						<tr height = "35px;">
							<td>26周</td><td>27周</td><td>28周</td><td>29周</td><td>30周</td>
						</tr>
						<tr height = "35px;">
							<td>31周</td><td>32周</td><td>33周</td><td>34周</td><td>35周</td>
						</tr>
						<tr height = "35px;">
							<td>36周</td><td>37周</td><td>38周</td><td>39周</td><td>40周</td>
						</tr>
					</table>
			</div>
			<div class="col-md-4 about-left" style = "padding: 0px 0px 0px 10px;">
				<h2 style = "color:#363636">孕期必备知识</h2>
				<p>欢迎进入孕期阶段！这是一段令人难以置信的美妙旅程，一个健康活泼的宝宝，需要你我共同努力。</p>
				<ul>
					<li style = "width:200px;"><a href="#">孕期营养|孕期营养的重要性 </a></li>
					<li><a href="#">孕期营养|孕期各阶段营养饮食攻略</a></li>
					<li><a href="#">孕期健康|孕期家居环境</a></li>
					<li><a href="#">孕期健康|孕期不宜吃的一些食物</a></li>
					<li><a href="#">孕期知识|你需要了解的激素变化</a></li>
					<li><a href="#">孕期知识|孕期宝宝都在做什么</a></li>
					
				</ul>
			</div>
		  <div class="clearfix"> </div>
		</div>
	</div>
</div>
<div class="histort">
	<div class="container">
		<div class="history-main">
			这里写一个标签
			
			
		</div>
	</div>
</div>
<div class="team">
	<div class="container">
		<div class="team-main" > 
			<h3>Our Team</h3>
			 <div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
			 	<img src="images/t4.jpg" alt=""/>
			 </div>
			 <div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
			 	<img src="images/t1.jpg" alt=""/>
			 </div>
			 <div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
			 	<img src="images/t3.jpg" alt=""/>
			 </div>
			 <div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
			 	<img src="images/t2.jpg" alt=""/>
			 </div>
		  <div class="clearfix"> </div>
		</div>
	</div>
</div>
<!--about end here-->

<!--footer start here-->
<div class="footer">
				<div class="container" style = "text-align:center;">
							<div style = "font-size:18px;padding:0px 0px 0px 150px;">友情链接:
								<a href="http://baby.39.net/">39育儿网|</a>
								<a href="http://www.baby-trees.cn/">宝宝树亲子网|</a>
								<a href="http://www.ci123.com/">育儿网|</a>
								<a href="http://yuer.ibabyzone.cn/">宝宝地带|</a>
								<a href="http://www.yaolan.com/">摇篮网|</a>
								<a href="https://www.mmbang.com/">妈妈帮|</a>
								<a href="http://www.lamabang.com/yunqi">辣妈帮</a>
							</div>
							<div style = "color:#FFFFFF;">@CopyRight Lxf 郑州轻工业大学2015届毕业设计</div>
						<div class="clearfix"></div>
				</div>
			</div>
<!--//footer--> 
</body>
</html>