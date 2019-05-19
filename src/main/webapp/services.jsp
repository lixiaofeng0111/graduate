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

			<div class="top-navg-main" style = "background-color:#956295">
				<div class="container">
					<div class="top-navg">
						<span class="menu"> <img src="images/icon.png" alt="" /></span>
						<ul class="res">
							<li style = "height:60px;">
							<a href="/pageIndex" style = "color:#fff;">主页</a></li>
							<li><a  href="/pregnant" style = "color:#fff;">孕期阶段分析</a></li>
							<li><a  href="/fruit" style = "background-color:#fff;border-radius:100px;" >水果分析</a></li>
							<li><a  href="typo.jsp" style = "color:#fff;">孕期水果及营养推荐</a></li>
							<li><a  href="login.jsp" style = "color:#fff;">登录</a></li>
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

		<div class="container">
			<div class="row clearfix">
				<c:forEach items="${fruit}" var="fruits">
					<div class="col-md-4 column">
						<a href="/selectById?id=${fruits.id}"> <img height="200px" width="260px"
							src=${fruits.picture }></a>
						<h3>${fruits.name}</h3>
						<p>${fruits.brief}
							<a href="/selectById">详情>></a>
						</p>
					</div>
				</c:forEach>
			</div>
		</div>




		<div style="text-align:center;">
			<ul class="pagination">
  		<c:choose>
				<c:when test = "${currentPage<=1}">
					<li class="disabled"><a>上一页</a></li> 
				</c:when>
				
				<c:otherwise>
					<li><a href="/fruit?page = ${currentPage - 1} ">上一页</a></li> 
				</c:otherwise>
		</c:choose>
				<c:forEach begin = "1" end = "${totalPage}" var = "index">
					<c:choose>
						<c:when test = "${currentPage==index}">
							<li class="disabled"><a>${index}</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="/fruit?page=${index}">${index}</a></li>
						</c:otherwise> 
					</c:choose>
				</c:forEach >
		<c:choose>
				<c:when  test = "${currentPage>=totalPage}">
					<li class="disabled"><a>下一页</a></li> 
				</c:when>
				
				<c:otherwise>
					<li><a href="/fruit?page = ${currentPage + 1} ">下一页</a></li> 
				</c:otherwise>
		</c:choose>
			</ul>
		</div>


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