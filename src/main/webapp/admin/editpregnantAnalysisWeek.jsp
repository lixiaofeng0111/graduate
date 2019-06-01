<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="../scripts/jquery/jquery-1.7.1.js"></script>
<link href="../style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="../style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="../scripts/jquery/jquery-1.4.4.min.js"></script>
<script src="../scripts/My97DatePicker/WdatePicker.js" type="text/javascript" defer="defer"></script>
<script type="text/javascript" src="../scripts/artDialog/artDialog.js?skin=default"></script>
<script type="text/javascript">
	$(document).ready(function() {
		/*
		 * 提交
		 */
		$("#submitbutton").click(function() {
			if(validateForm()){
				checkFyFhSubmit();
			}
		});
		
		/*
		 * 取消
		 */
		$("#cancelbutton").click(function() {
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		});
		
		var result = 'null';
		if(result =='success'){
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		}
	});
</script>
</head>
<body>
<div>
	<div id="container">
		<div id="nav_links">
			当前位置：用户管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">用户信息修改</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr><td><input id="id" name="id" type="hidden" value="${editweekSelectById.id}"/></td></tr>
				<tr>
					<td class="ui_text_rt" width="80">图片路径</td>
					<td class="ui_text_lt">
						<input value="${editweekSelectById.pictrue}" autocomplete="off" class="ui_input_txt01" id="pictrue" type="text" name="pictrue" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="80">孕周</td>
					<td class="ui_text_lt">
						<input value="${editweekSelectById.week}" autocomplete="off" class="ui_input_txt01" id="week" type="text" name="week" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">孕期提示</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="yqts"  name="yqts" placeholder = "请输入话题内容">${editweekSelectById.yqts}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">宝宝发育</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="bbfy"  name="bbfy" placeholder = "请输入话题内容">${editweekSelectById.bbfy}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">营养提示</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="yyts"  name="yyts" placeholder = "请输入话题内容">${editweekSelectById.yyts}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">爸妈须知</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="bmxz"  name="bmxz" placeholder = "请输入话题内容">${editweekSelectById.bmxz}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">妈妈变化</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="mmbh"  name="mmbh" placeholder = "请输入话题内容">${editweekSelectById.mmbh}</textarea>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="update_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cancelbutton" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#update_btn").click(function() {
				
				var id1 = document.getElementById("id");
				var pictrue1 = document.getElementById("pictrue");
				var week1 = document.getElementById("week");
				var yqts1 = document.getElementById("yqts");
				var bbfy1 = document.getElementById("bbfy");
				var yyts1 = document.getElementById("yyts");
				var bmxz1 = document.getElementById("bmxz");
				var mmbh1 = document.getElementById("mmbh");
				id1_val = $.trim(id1.value);
				pictrue1_val = $.trim(pictrue1.value);
				week1_val = $.trim(week1.value);
				yqts1_val = $.trim(yqts1.value);
				bbfy1_val = $.trim(bbfy1.value);
				yyts1_val = $.trim(yyts1.value);
				bmxz1_val = $.trim(bmxz1.value);
				mmbh1_val = $.trim(mmbh1.value);
				if (picture1_val == null || picture1_val == "") {
					alert("图片不能为空");
					return false;
				} else if (week1_val == null || week1_val == "") {
					alert("孕周不能为空");
					return false;
				} else if (yqts1_val == null || yqts1_val == "") {
					alert("孕期提示不能为空");
					return false;
				} else if (bbfy1_val == null || bbfy1_val == "") {
					alert("宝宝发育不能为空");
					return false;
				} else if (yyts1_val == null || yyts1_val == "") {
					alert("营养提示不能为空");
					return false;
				} else if (bmxz1_val == null || bmxz1_val == "") {
					alert("爸妈须知不能为空");
					return false;
				} else if (mmbh1_val == null || mmbh1_val == "") {
					alert("妈妈变化不能为空");
					return false;
				} 

				var url = "/checkUpdateweek";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"id" : id1_val,
					"pictrue" : pictrue1_val,
					"week" : week1_val,
					"yqts" : yqts1_val,
					"bbfy" : bbfy1_val,
					"yyts" : yyts1_val,
					"bmxz" : bmxz1_val,
					"mmbh" : mmbh1_val,
					"time" : new Date()
				};
				$.post(url, args, function(data) {
					if(data == "ok"){
						alert("修改成功");
						window.parent.$.fancybox.close();
					}else{
					alert("修改失败");
					}
				});
			});
		})
	</script>



</body>
</html>