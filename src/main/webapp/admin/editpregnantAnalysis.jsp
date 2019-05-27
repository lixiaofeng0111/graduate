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
/*
 * select  option 默认值
 */
 $(function(){
		var kind_id = document.getElementById("kind");
		var options = document.getElementsByTagName("option");
		for(i=0;i<options.length;i++){
			if(options[i].value==kind_id.value){
				options[i].selected = true;
			}
		}
	})
//////////////////////////
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
			当前位置：用户管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">孕期信息编辑修改</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr><td><input id="id" name="id" type="hidden" value="${editSelectpregnantAnalysisById.id}"/></td></tr>
				<tr><td><input id="kindId" name="kindId" type="hidden" value="${editSelectpregnantAnalysisById.kind.id}"/></td></tr>
				<tr>
					<td class="ui_text_rt" width="80">名字</td>
					<td class="ui_text_lt">
						<input value="${editSelectpregnantAnalysisById.name}"  autocomplete="off" class="ui_input_txt01" id="name" type="text" name="name" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">分析描述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="description"  name="description" >
						${editSelectpregnantAnalysisById.description}
						</textarea>
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
				var name1 = document.getElementById("name");
				var description1 = document.getElementById("description");
				var kind1 = document.getElementById("kind");
				
				id1_val = $.trim(id1.value);
				name1_val = $.trim(name1.value);
				description1_val = $.trim(description1.value);
				kind1_val = $.trim(kind1.value);
				if (name1_val == null || name1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'话题名不能为空！', ok:true,});
				} else if (description1_val == null || description1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'话题内容不能为空！', ok:true,});
				} else if (kind1_val == null || kind1_val == "") {
					art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'话题内容不能为空！', ok:true,});
				} 

				var url = "/checkUpdatepregnantAnalysis";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
						"id" : id1_val,
					"name" : name1_val,
					"description" : description1_val,
					"kindId" : kind1_val,
					"time" : new Date()
				};
				$.post(url, args, function(data) {
					if(data == "ok"){
						alert("修改成功");
						window.parent.$.fancybox.close();
					}else{
					alert(data);
					alert("修改失败");
					}
				});
			});
		})
	</script>




</body>
</html>