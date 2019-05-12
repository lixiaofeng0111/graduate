<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>孕期营养早知道</title>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.transit.min.js"></script>
<script src="js/es6-shim.min.js"></script>
<script src="js/easyhelper.min.js"></script>
<link rel="stylesheet" href="css/easyhelper.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
</style>
</head>
<body>
	<div class="avatar-holder">
		<div class="avatar-container">

			<div class="top-navg-main">
				<div class="container">
					<div class="top-navg">
						<span class="menu"> <img src="images/icon.png" alt="" /></span>
						<ul class="res">
							<li style="font-size: 20px;"><a href="/pageIndex"
								class="active hvr-sweep-to-bottom">主页</a></li>
							<li><a class="hvr-sweep-to-bottom" href="about.jsp">孕期阶段分析</a></li>
							<li><a class="hvr-sweep-to-bottom" href="services.jsp">水果分析</a></li>
							<li><a class="hvr-sweep-to-bottom" href="typo.jsp">水果及营养分析</a></li>
							<li><a class="hvr-sweep-to-bottom" href="gallery.jsp">美文推荐</a></li>
							<li><a class="hvr-sweep-to-bottom" href="login.jsp">登录</a></li>
						</ul>

					</div>
				</div>
			</div>
			<div class="container">
				<div class="row clearfix">
					<div class="col-md-4 column">
						<img src="imgs/mom.png">
					</div>

					<div class="col-md-4 column" style="padding: 100px 0px 0px 60px;">
						<div style="font-size: 40px; padding: 10px 0px 60px 0px;">水果
							& 妊娠女性</div>
						<input style="width: 230px; height: 35px; border-radius: 40px;"
							type="text" placeholder="输入搜索内容...">
						<button type="button" class="btn btn-default"
							style="background: images/Magi.png">搜索</button>
					</div>

					<div class="col-md-4 column" style="padding: 210px 0px 0px 120px;">
						<img src="imgs/son.png; ">
					</div>

				</div>
			</div>
		</div>

		<div class="content">
			<div class="container">
				<div class="row clearfix">

					<c:forEach items="${fruit}" var="fruits">
					<div>111111111</div>
						<div class="col-md-4 column">${fruits.picture}</div>
						<div>${fruits.name}</div>
						<div>${fruits.brief}</div>
					</c:forEach>




				</div>
			</div>
		</div>
		<div class="page" id="page-1"></div>



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
	<!--//footer-->
	<!-- script-for-menu -->
	<script>
		$("span.menu").click(function() {
			$("ul.res").slideToggle(300, function() {
				// Animation complete.
			});
		});
	</script>
	<script>
		// 本地模拟的内容生成函数
		var $content = $(".content");
		function createContent(i, index) {
			$content.eq(index).empty().html(('<li>' + i + '</li>').repeat(8));
		}

		// 调用分页功能 [ 基础版 ]
		Helper.ui.page("#page-1", {
			total : 65,
			pageSize : 9,
			change : function(i) {
				createContent(i, 0);
			}
		});
	</script>
	<!-- /script-for-menu -->
</body>
</html>