<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="../js/lhgcore.js"></script>
<script type="text/javascript" src="../js/lhgcalendar.js"></script>
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
		$("#add_btn").click(function() {
			if(validateForm()){
				checkFyFhSubmit();
			}
		});
		
		/*
		 * 取消
		 */
		$("#cancel_btn").click(function() {
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
			当前位置：主页信息管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">添加今日或往期话题</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">图片路径</td>
					<td class="ui_text_lt">
						<input  autocomplete="off" class="ui_input_txt01" id="picture" type="text" name="picture" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="80">孕周</td>
					<td class="ui_text_lt">
						<input  autocomplete="off" class="ui_input_txt01" id="week" type="text" name="week" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">孕期提示</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="yqts"  name="yqts" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">宝宝发育</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="bbfy"  name="bbfy" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">营养提示</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="yyts"  name="yyts" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">爸妈须知</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="bmxz"  name="bmxz" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">妈妈变化</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" height="50px" autocomplete="off" class="ui_input_txt01" id="mmbh"  name="mmbh" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="week_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cancel_btn" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#week_btn").click(function() {
				var picture1 = document.getElementById("picture");
				var week1 = document.getElementById("week");
				var yqts1 = document.getElementById("yqts");
				var bbfy1 = document.getElementById("bbfy");
				var yyts1 = document.getElementById("yyts");
				var bmxz1 = document.getElementById("bmxz");
				var mmbh1 = document.getElementById("mmbh");
				picture1_val = $.trim(picture1.value);
				week1_val = $.trim(week1.value);
				yqts1_val = $.trim(yqts1.value);
				bbfy1_val = $.trim(bbfy1.value);
				yyts1_val = $.trim(yyts1.value);
				bmxz1_val = $.trim(bmxz1.value);
				mmbh1_val = $.trim(mmbh1.value);
				if (picture1_val == null || picture1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'图片路径不能为空！', ok:true,});
				} else if (week1_val == null || week1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'孕周不能为空！', ok:true,});
				} else if (yqts1_val == null || yqts1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'孕期提示不能为空！', ok:true,});
				} else if (bbfy1_val == null || bbfy1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'宝宝发育不能为空！', ok:true,});
				} else if (yyts1_val == null || yyts1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'营养提示不能为空！', ok:true,});
				} else if (bmxz1_val == null || bmxz1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'爸妈须知不能为空！', ok:true,});
				} else if (mmbh1_val == null || mmbh1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'妈妈变化不能为空！', ok:true,});
				} 

				var url = "/checkPregnantAnalysisweek";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"picture" : picture1_val,
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
						alert("保存成功");
						window.parent.$.fancybox.close();
					}else{
					alert(data);
					alert("保存失败");
					}
				});
			});
		})
	</script>



</body>
</html>