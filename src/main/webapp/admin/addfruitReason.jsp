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
					<td class="ui_text_rt">孕妇能否吃</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="pregnanteat"  name="pregnanteat" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">产妇能否吃</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="momeat"  name="momeat" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">宝宝能否吃</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="babyeat"  name="babyeat" placeholder = "请输入话题内容"></textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">分析类别</td>
					<td><select style = "height:30px;" id="kind" name="kind" class="ui_input_txt01">
							  <option value="1">孕期营养</option>
							  <option value="2">孕期饮食</option>
							  <option value="3">孕期保健</option>
							  <option value="4">孕期心理</option>
							  <option value="5">孕期疾病</option>
							  <option value="6">孕期知识</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input style = "margin-top:30px;" id="addAnalysiskind_btn" type="submit" value="提交" class="ui_input_btn01"/>
						&nbsp;<input style = "margin-top:30px;" id="cancel_btn" type="reset" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
		$(function() {
			$("#addAnalysiskind_btn").click(function() {
				var pregnanteat1 = document.getElementById("pregnanteat");
				var momeat1 = document.getElementById("momeat");
				var babyeat1 = document.getElementById("babyeat");
				var kind1 = document.getElementById("kind");
				pregnanteat1_val = $.trim(pregnanteat1.value);
				momeat1_val = $.trim(momeat1.value);
				babyeat1_val = $.trim(babyeat1.value);
				kind1_val = $.trim(kind1.value);
				if (pregnanteat1_val == null || pregnanteat1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'话题名不能为空！', ok:true,});
				} else if (momeat1_val == null || momeat1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'话题内容不能为空！', ok:true,});
				} else if (babyeat1_val == null || babyeat1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'话题内容不能为空！', ok:true,});
				} else if (kind1_val == null || kind1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'话题内容不能为空！', ok:true,});
				} 

				var url = "/checkFruitReason";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"pregnanteat" : pregnanteat1_val,
					"momeat" : momeat1_val,
					"babyeat" : babyeat1_val,
					"fruitId" : babyeat1_val,
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