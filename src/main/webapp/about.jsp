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
					<li><a href="typo.jsp" style="color: #fff;">孕期水果及营养推荐</a></li>
					<li><a href="login.jsp" style="color: #fff;">登录</a></li>
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
							<td width="60px;"><a href = "/selectByWeek?week=1">1周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=2">2周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=3">3周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=4">4周</a></td>
							<td width="60px;"><a href = "/selectByWeek?week=5">5周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=6">6周</a></td>
							<td><a href = "/selectByWeek?week=7">7周</a></td>
							<td><a href = "/selectByWeek?week=8">8周</a></td>
							<td><a href = "/selectByWeek?week=9">9周</a></td>
							<td><a href = "/selectByWeek?week=10">10周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=11">11周</a></td>
							<td><a href = "/selectByWeek?week=12">12周</a></td>
							<td><a href = "/selectByWeek?week=13">13周</a></td>
							<td><a href = "/selectByWeek?week=14">14周</a></td>
							<td><a href = "/selectByWeek?week=15">15周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=16">16周</a></td>
							<td><a href = "/selectByWeek?week=17">17周</a></td>
							<td><a href = "/selectByWeek?week=18">18周</a></td>
							<td><a href = "/selectByWeek?week=19">19周</a></td>
							<td><a href = "/selectByWeek?week=20">20周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=21">21周</a></td>
							<td><a href = "/selectByWeek?week=22">22周</a></td>
							<td><a href = "/selectByWeek?week=23">23周</a></td>
							<td><a href = "/selectByWeek?week=24">24周</a></td>
							<td><a href = "/selectByWeek?week=25">25周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=26">26周</a></td>
							<td><a href = "/selectByWeek?week=27">27周</a></td>
							<td><a href = "/selectByWeek?week=28">28周</a></td>
							<td><a href = "/selectByWeek?week=28">29周</a></td>
							<td><a href = "/selectByWeek?week=30">30周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=31">31周</a></td>
							<td><a href = "/selectByWeek?week=32">32周</a></td>
							<td><a href = "/selectByWeek?week=33">33周</a></td>
							<td><a href = "/selectByWeek?week=34">34周</a></td>
							<td><a href = "/selectByWeek?week=35">35周</a></td>
						</tr>
						<tr height="35px;">
							<td><a href = "/selectByWeek?week=36">36周</a></td>
							<td><a href = "/selectByWeek?week=37">37周</a></td>
							<td><a href = "/selectByWeek?week=38">38周</a></td>
							<td><a href = "/selectByWeek?week=39">39周</a></td>
							<td><a href = "/selectByWeek?week=40">40周</a></td>
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
							<a href = "/selectYqbdById?id=${selectPregnant.id}"><img width="300px;" height = "200px;" src = "${selectPregnant.showpicture }"></a>
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
							<li class="li-o"><p style = "color:#000;">孕期营养</p>
								<div class="clear"></div></li>
							<li class="li-t"><p style = "color:#000;">孕期饮食</p>
								<div class="clear"></div></li>
							<li class="li-s"><p style = "color:#000;">孕期保健</p>
								<div class="clear"></div></li>
							<li class="li-f"><p style = "color:#000;">孕期心理</p>
								<div class="clear"></div></li>
							<li class="li-w"><p style = "color:#000;">孕期疾病</p>
								<div class="clear"></div></li>
							<li class="li-l"><p style = "color:#000;">孕期知识</p>
								<div class="clear"></div></li>
						</ul>
					</div>
					<div class="ul-t">
						<li style="display: block">
							<!-- 这里是滚动条区域 -->
							<div class="scroll_main">
								<div class="scroll_wrap">
									<div class="scroll_cont">

										<p>jQuery 是由美国人 John Resig 于 2006 年创建的一个开源项目，随着被人们的熟知，越
											来越多的程序高手加入其中，完善和壮大其项目内容 ；如今已发展成为集 JavaScript、CSS、 DOM、Ajax
											于一体的强大框架体系，它的主旨是 ：以更少的代码，实现更多的功能（Write less，do more）。</p>
										<p>
											1. 访问和操作 DOM 元素<br /> 使用 jQuery
											库，可以很方便地获取和修改页面中的某元素，无论是删除、移动、复制某 元素，jQuery
											都提供了一整套方便、快捷的方法，既减少了代码的编写，又大大提高了用户
											对页面的体验度。具体示例我们将在后面的章节中陆续展示。
										</p>
										<p>
											2. 控制页面样式<br /> 通过引入 jQuery， 程序开发人员可以很便捷地控制页面的 CSS
											文件。浏览器对页面文件 的兼容性一直以来都是页面开发者最为头痛的事，而使用 jQuery 操作页面的样式，却可以很
											好地兼容各种浏览器。
										</p>
										<p>jQuery 是由美国人 John Resig 于 2006 年创建的一个开源项目，随着被人们的熟知，越
											来越多的程序高手加入其中，完善和壮大其项目内容 ；如今已发展成为集 JavaScript、CSS、 DOM、Ajax
											于一体的强大框架体系，它的主旨是 ：以更少的代码，实现更多的功能（Write less，do more）。</p>
										<p>
											1. 访问和操作 DOM 元素<br /> 使用 jQuery
											库，可以很方便地获取和修改页面中的某元素，无论是删除、移动、复制某 元素，jQuery
											都提供了一整套方便、快捷的方法，既减少了代码的编写，又大大提高了用户
											对页面的体验度。具体示例我们将在后面的章节中陆续展示。
										</p>
										<p>
											2. 控制页面样式<br /> 通过引入 jQuery， 程序开发人员可以很便捷地控制页面的 CSS
											文件。浏览器对页面文件 的兼容性一直以来都是页面开发者最为头痛的事，而使用 jQuery 操作页面的样式，却可以很
											好地兼容各种浏览器。
										</p>


									</div>

									<div class="scroll_bar">
										<div class="scroll_slider"></div>
									</div>
								</div>
							</div> <!-- 这里是滚动条区域 -->

						</li>
						<li>
							<div class="li-top">
								<h5>更多客户快速找到您</h5>
								<p>
									PC端+手机端全网搜索引擎SEO优化，提升网站排名引流量，更多客户找到您，<br />强大推广方式+超强营销工具，扩大客流量、订单量
								</p>
								<div class="li-a">
									<a>PC+手机端</a><a>SEO优化</a><a>一键分享传播</a><a>抢红包</a><a>朋友助力</a><a>众筹</a><a>好友赞助</a><a>一元夺宝</a>
								</div>
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<h5>销售网络快速扩张</h5>
								<p>全新"分销加盟+三级返佣"模式体系，无限发展下游，让您的分销商满天下；</p>
								<div class="li-a">
									<a>精美分销店铺</a><a>自选分销产品</a><a>一键分销</a><a>无限下级</a><a>分销商管理</a><a>佣金管理</a><a>推广文案管理</a>
								</div>
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<h5>实时互动沟通转化率高</h5>
								<p>方便的客服沟通工具，实时互动咨询，快速提升询盘率和成交转化率，变流量为销量；</p>
								<div class="li-a">
									<a>多种热门客服工具</a><a>微客服</a><a>在线留言板</a>
								</div>
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<h5>超强电商管理引爆成交量</h5>
								<p>强大的商品管理，团购、秒杀等电商功能促进高销量，方便快捷的购物车及支付方式促成交，流量、业绩统计分析尽在掌握中；</p>
								<div class="li-a">
									<a>产品管理</a><a>订单管理</a><a>物流配送管理</a><a>数据统计分析</a><a>团购</a><a>秒杀</a><a>砍价</a><br />
									<a>购物车</a><a>多种在线支付</a><a>扫码支付</a>
								</div>
								
							</div>
						</li>
						<li>
							<div class="li-top">
								<h5>强化维系客户，利润持续增长</h5>
								<p>客户管理、维系、关怀全方位，结合高效互动营销工具，深度挖掘新老客户潜力价值，刺激客户持续消费</p>
								<div class="li-a">
									<span>客户管理：</span><a>会员管理</a><a>会员卡</a><a>会员预约</a><a>积分管理</a><a>优惠券</a><br />
									<span>客户关怀：</span><a>签到</a><a>生日积分</a><a>充值</a><a>开卡</a><a>消费赠送</a><a>贺卡</a><br />
									<span>抽奖互动：</span><a>大转盘</a><a>刮刮卡</a><a>砸金蛋</a><a>摇一摇</a><a>微现场</a><br />
									<span>提升服务：</span><a>调研</a><a>投票</a>
								</div>
								
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
				<div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
					<img src="images/t4.jpg" />
				</div>
				<div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
					<img src="images/t1.jpg"  />
				</div>
				<div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
					<img src="images/t3.jpg"  />
				</div>
				<div class="col-md-3 team-grids wow bounceIn" data-wow-delay="0.4s">
					<img src="images/t2.jpg" />
				</div>
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
				友情链接: <a style="color:" href="http://baby.39.net/">39育儿网|</a> <a
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