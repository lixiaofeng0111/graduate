<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<title>孕期营养早知道</title>
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

<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
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
	background-color: #fff;
	border: none;
}
.recomment div{
float:left;
margin-left:12px;
text-align:center;
}
</style>
</head>
<body>

	<div class="top-navg-main" style="background-color: #956295">
		<div class="container">
			<div class="top-navg">
				<span class="menu"> <img src="images/icon.png" alt="" /></span>
				<ul class="res" style="font-size: 16px;">
					<li style="height: 60px;"><a href="/pageIndex"
						style="color: #fff;">主页</a></li>
					<li><a href="/pregnant" style="color: #fff;" style=>孕期阶段分析</a></li>
					<li><a href="/fruit" style="color: #fff;">水果分析</a></li>
					<li><a href="/pregnantRecomment"
						style="background-color: #fff;">孕期水果及营养推荐</a></li>
					<li><a href="login.jsp" style="color: #fff;">登录</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- 以下是正文的内容 -->
	<!-- 以下是搜索框的内容 -->
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-4 column">
				<img src="imgs/mom.png">
			</div>

			<div class="col-md-4 column" style="padding: 100px 0px 0px 60px;">
				<div style="font-size: 40px; padding: 0px 0px 60px 0px;">水果&孕期&营养</div>
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
	<!-- 下面是除了搜索框之外的内容 -->
	<div class="container" style="padding: 0px 0px 0px 110px;">
		<div
			style="float:left; width: 1000px; padding: 20px 0px 0px 50px; border: 1px solid #C5C1AA">
			<!-- 以下是搜索框下面的各部分内容 -->
			<!-- 孕期 -->
			
				<div style="font-size: 20px; color: #EE6AA7;">
					<img width="75px" height="75px" src="imgs/momlogo.png">孕期水果及营养
				</div>
				<div>（本页面主要用于搜索，通过下面内容的介绍孕妈根据自己的具体情况去查询自己所需要的信息）</div>
				<c:forEach items="${PregnantDescriptionVM}" var="recommend">
				<hr>
					<h4 style="color: #EE6AA7;">${recommend.time }</h4>
					<pre style="font-size: 15px;"><li>主打营养素：<c:forEach items="${recommend.nutritionVMs}" var="nutritionVMName">${nutritionVMName.name} &nbsp;</c:forEach></li><br><li>作用：${recommend.effect}</li><br><li>描述：${recommend.description}</li>
			<li>相关水果推荐</li></pre>
					<!-- 以下是显示的表格部分1 -->
					<div style="margin-top: 0px; width:950px;border:1px solid red;float:left;" class = "recomment" >
						<c:forEach  items="${recommend.nutritionVMs}" var="nutritionVMList">
							<c:forEach  items="${nutritionVMList.fruits}" var="fruitsList">
								<div >
								 	<img width="180px" height="150px" src="${fruitsList.picture}">
								 	<p>${fruitsList.name}</p>
								 		<p>营养元素：<c:forEach items = "${fruitsList.nutritions}" var = "nutritions">
								 			${nutritions.name}
								 		</c:forEach></p>
								</div>
							</c:forEach>
						</c:forEach>
					</div>
					<hr>
					<!-- 以上是显示的表格部分 -->
				</c:forEach>
			</div>
			<!-- 以上是搜索框下面的各部分内容 -->
		</div>


	<!-- 以上是正文的内容 -->



	<!--footer start here-->
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
	<!--//footer-->
</body>
</html>