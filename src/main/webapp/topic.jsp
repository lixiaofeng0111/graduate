<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>孕期营养早知道</title>
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
<div class="top-navg-main">
	<div class="container">
	    <div class="top-navg">
	    	           <span class="menu"> <img src="images/icon.png" alt=""/></span>
				<ul class="res">
				    <li><a href="index.jsp" class="active hvr-sweep-to-bottom">主页</a></li>
					<li><a class="hvr-sweep-to-bottom" href="about.jsp">孕期阶段分析</a></li>
					<li><a class="hvr-sweep-to-bottom" href="services.jsp">水果分析</a></li>
					<li><a class="hvr-sweep-to-bottom" href="typo.jsp">水果及营养分析</a></li>
					<li><a class="hvr-sweep-to-bottom" href="gallery.jsp">美文推荐</a></li>
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
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							编号
						</th>
						<th>
							产品
						</th>
						<th>
							交付时间
						</th>
						<th>
							状态
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							1
						</td>
						<td>
							TB - Monthly
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							Default
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
</body>
</html>