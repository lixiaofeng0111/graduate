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
		<!-- 以下是孕期信息内容  -->
		<div style="text-align: center; height:396px;">
			<div style="padding: 0px 0px 0px 260px; height: 150px; width: 1200px;">
				<!-- 以下是轮播图 -->
				<div id="slide" class="slide" style="height:300px; alt="star">
					<!-- 轮播图片数量可自行增减 -->
					<div class="img">
						<img src="images/pregnantweek/2.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/3.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/4.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/5.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/6.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/7.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/8.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/9.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/10.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/11.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/12.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/13.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/14.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/15.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/16.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/17.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/18.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/19.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/20.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/21.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/22.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/23.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/24.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/25.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/26.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/27.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/28.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/29.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/30.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/31.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/32.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/33.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/34.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/35.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/36.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/37.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/38.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/39.png" />
					</div>
					<div class="img">
						<img src="images/pregnantweek/40.png" />
					</div>

					<div class="slide-bt"></div>
				</div>
				<button class="pre" onclick="left()">上一周</button>
				<button class="next" onclick="right()">下一周</button>
			</div>
				<!-- 以上是轮播图 -->
</div>
			<!-- 以上是孕期信息内容 -->
<!-- 以下是孕期每周的具体信息 -->
<div class="container" style="padding: 0px 0px 0px 110px;">
	<div style="width: 1000px; padding: 20px 0px 0px 50px; border: 1px solid #C5C1AA">
		<div>
			<div style = "font-size:20px;"><img width = "75px" height = "70px"  src="imgs/yqts.png">孕期提示 </div>
			<p>${pregnantWeek.yqts}</p>
			<hr>
		</div>
		<div>
			<div style = "font-size:20px;"><img width = "75px" height = "70px"  src="imgs/bbfy.png">宝宝发育 </div>
			<p>${pregnantWeek.bbfy}</p>
			<hr>
		</div>
		<div>
			<div style = "font-size:20px;"><img width = "75px" height = "70px" src="imgs/yyts.png">营养提示 </div>
			<p>${pregnantWeek.yyts}</p>
			<hr>
		</div>
		<div>
			<div style = "font-size:20px;"><img width = "75px" height = "70px" src="imgs/bmxz.png">准爸妈须知 </div>
			<p>${pregnantWeek.bmxz}</p>
			<hr>
		</div>
		<div>
			<div style = "font-size:20px;"><img width = "75px" height = "70px" src="imgs/mmbh.png">准妈妈变化 </div>
			<p>${pregnantWeek.mmbh}</p>
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
		<!-- 以下是轮播图 -->
		<script>
			var autoLb = false; //autoLb=true为开启自动轮播
			var autoLbtime = 1; //autoLbtime为轮播间隔时间（单位秒）
			var touch = true; //touch=true为开启触摸滑动
			var slideBt = true; //slideBt=true为开启滚动按钮
			var slideNub; //轮播图片数量

			//窗口大小改变时改变轮播图宽高
			$(window).resize(function() {
				$(".slide").height($(".slide").width() * 0.46);
			});

			$(function() {
				$(".slide").height($(".slide").width() * 0.46);
				slideNub = $(".slide .img").size(); //获取轮播图片数量
				for (i = 0; i < slideNub; i++) {
					$(".slide .img:eq(" + i + ")").attr("data-slide-imgId", i);
				}

				//根据轮播图片数量设定图片位置对应的class
				if (slideNub == 1) {
					for (i = 0; i < slideNub; i++) {
						$(".slide .img:eq(" + i + ")").addClass("img3");
					}
				}
				if (slideNub == 2) {
					for (i = 0; i < slideNub; i++) {
						$(".slide .img:eq(" + i + ")")
								.addClass("img" + (i + 3));
					}
				}
				if (slideNub == 3) {
					for (i = 0; i < slideNub; i++) {
						$(".slide .img:eq(" + i + ")")
								.addClass("img" + (i + 2));
					}
				}
				if (slideNub > 3 && slideNub < 6) {
					for (i = 0; i < slideNub; i++) {
						$(".slide .img:eq(" + i + ")")
								.addClass("img" + (i + 1));
					}
				}
				if (slideNub >= 6) {
					for (i = 0; i < slideNub; i++) {
						if (i < 5) {
							$(".slide .img:eq(" + i + ")").addClass(
									"img" + (i + 1));
						} else {
							$(".slide .img:eq(" + i + ")").addClass("img5");
						}
					}
				}

				//根据轮播图片数量设定轮播图按钮数量
				if (slideBt) {
					for (i = 1; i <= slideNub; i++) {
						$(".slide-bt").append(
								"<span data-slide-bt='" + i + "' onclick='tz("
										+ i + ")'>"+(i+1)+"</span>");
					}
					$(".slide-bt").width(slideNub * 19);
					$(".slide-bt").css("margin-left",
							"-" + slideNub * 17 + "px");
				}

				//自动轮播
				if (autoLb) {
					setInterval(function() {
						right();
					}, autoLbtime * 1000);
				}

				if (touch) {
					k_touch();
				}
				slideLi();
				imgClickFy();
			})

			//右滑动
			function right() {
				var fy = new Array();
				for (i = 0; i < slideNub; i++) {
					fy[i] = $(".slide .img[data-slide-imgId=" + i + "]").attr(
							"class");
				}
				for (i = 0; i < slideNub; i++) {
					if (i == 0) {
						$(".slide .img[data-slide-imgId=" + i + "]").attr(
								"class", fy[slideNub - 1]);
					} else {
						$(".slide .img[data-slide-imgId=" + i + "]").attr(
								"class", fy[i - 1]);
					}
				}
				imgClickFy();
				slideLi();
			}

			//左滑动
			function left() {
				var fy = new Array();
				for (i = 0; i < slideNub; i++) {
					fy[i] = $(".slide .img[data-slide-imgId=" + i + "]").attr(
							"class");
				}
				for (i = 0; i < slideNub; i++) {
					if (i == (slideNub - 1)) {
						$(".slide .img[data-slide-imgId=" + i + "]").attr(
								"class", fy[0]);
					} else {
						$(".slide .img[data-slide-imgId=" + i + "]").attr(
								"class", fy[i + 1]);
					}
				}
				imgClickFy();
				slideLi();
			}

			//轮播图片左右图片点击翻页
			function imgClickFy() {
				$(".slide .img").removeAttr("onclick");
				$(".slide .img2").attr("onclick", "left()");
				$(".slide .img4").attr("onclick", "right()");
			}

			//修改当前最中间图片对应按钮选中状态
			function slideLi() {
				var slideList = parseInt($(".slide .img3").attr(
						"data-slide-imgId")) + 1;
				$(".slide-bt span").removeClass("on");
				$(".slide-bt span[data-slide-bt=" + slideList + "]").addClass(
						"on");
			}

			//轮播按钮点击翻页
			function tz(id) {
				var tzcs = id
						- (parseInt($(".slide .img3").attr("data-slide-imgId")) + 1);
				if (tzcs > 0) {
					for (i = 0; i < tzcs; i++) {
						setTimeout(function() {
							right();
						}, 1);
					}
				}
				if (tzcs < 0) {
					tzcs = (-tzcs);
					for (i = 0; i < tzcs; i++) {
						setTimeout(function() {
							left();
						}, 1);
					}
				}
				slideLi();
			}

			//触摸滑动模块
			function k_touch() {
				var _start = 0, _end = 0, _content = document
						.getElementById("slide");
				_content.addEventListener("touchstart", touchStart, false);
				_content.addEventListener("touchmove", touchMove, false);
				_content.addEventListener("touchend", touchEnd, false);
				function touchStart(event) {
					var touch = event.targetTouches[0];
					_start = touch.pageX;
				}
				function touchMove(event) {
					var touch = event.targetTouches[0];
					_end = (_start - touch.pageX);
				}

				function touchEnd(event) {
					if (_end < -100) {
						left();
						_end = 0;
					} else if (_end > 100) {
						right();
						_end = 0;
					}
				}
			}
		</script>
		<!-- 以上是轮播图 -->
</body>
</html>