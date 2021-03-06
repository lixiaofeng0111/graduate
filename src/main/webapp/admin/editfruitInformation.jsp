<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="../css/fSelect.css" rel="stylesheet" type="text/css">
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
			当前位置：用户管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">水果信息修改</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr><td><input id="id" name="id" type="hidden" value="${editSelectfruitinformationById.id}"/></td></tr>
				<tr>
					<td class="ui_text_rt" width="80">名字</td>
					<td class="ui_text_lt">
						<input value="${editSelectfruitinformationById.name}"  autocomplete="off" class="ui_input_txt01" id="name" type="text" name="name" placeholder="请输入话题名">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">水果图片</td>
					<td class="ui_text_lt">
						<textarea  style = "height:150px" autocomplete="off" class="ui_input_txt01" id="picture"  name="picture" placeholder = "请输入话题内容">
						${editSelectfruitinformationById.picture}
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">水果简述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="brief"  name="brief" >
						${editSelectfruitinformationById.brief}
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">水果详述</td>
					<td class="ui_text_lt">
						<textarea style = "height:150px" autocomplete="off" class="ui_input_txt01" id="description"  name="description" >
						${editSelectfruitinformationById.description}
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">孕妇能否吃</td>
					<td class="ui_text_lt">
						<input type="text" value="${editSelectfruitinformationById.pregnantEat}" autocomplete="off" class="ui_input_txt01" id="pregnanteat"  name="pregnanteat" />
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">产妇能否吃</td>
					<td class="ui_text_lt">
						<input type="text" value="${editSelectfruitinformationById.momEat}" autocomplete="off" class="ui_input_txt01" id="momeat"  name="momeat">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">宝宝能否吃</td>
					<td class="ui_text_lt">
						<input type="text" value="${editSelectfruitinformationById.babyEat}" autocomplete="off" class="ui_input_txt01" id="babyeat"  name="babyeat">
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">营养成分&nbsp;</td>
					<td class="ui_text_lt">&nbsp;
					<!-- 原本水果中所含成分 -->
					<br>
						<c:forEach items="${addNutrition}" var="nutritions">
			       			 ${nutritions.name}&nbsp;
						</c:forEach> 
						<br>
			<!-- 以下是多选下拉框的部分 -->
			<select class="demo" multiple="multiple" id="nutritions" name="nutritions">
			    <c:forEach items="${searchNutrition}" var="snutritions">
			        <option value="${snutritions.id}">${snutritions.name}</option>
				</c:forEach> 
			</select>
				
			<!-- 以上是多选下拉框的部分 -->	
						
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
$(function(){
	var nutritions_id = document.getElementById("nutritions");
	var options = document.getElementsByTagName("option");
	for(i=0;i<options.length;i++){
		if(options[i].value==nutritions_id.value){
			options[i].value = true;
		}
	}
})




		$(function() {
			$("#update_btn").click(function() {
				var id1 = document.getElementById("id");
				var name1 = document.getElementById("name");
				var picture1 = document.getElementById("picture");
				var brief1 = document.getElementById("brief");
				var description1 = document.getElementById("description");
				var pregnanteat1 = document.getElementById("pregnanteat");
				var momeat1 = document.getElementById("momeat");
				var babyeat1 = document.getElementById("babyeat");
				var nutritions1 = document.getElementById("nutritions");
				id1_val = $.trim(id1.value);
				name1_val = $.trim(name1.value);
				picture1_val = $.trim(picture1.value);
				brief1_val = $.trim(brief1.value);
				description1_val = $.trim(description1.value);
				pregnanteat1_val = $.trim(pregnanteat1.value);
				momeat1_val = $.trim(momeat1.value);
				babyeat1_val = $.trim(babyeat1.value);
				nutritions1_val = $.trim(nutritions1.value);
				var str = [];
				for(i=0;i<nutritions1.length;i++){
					if(nutritions1.options[i].selected)
					{
						str.push(nutritions1[i].value);
					}
				}
				if (name1_val == null || name1_val == "") {
					alert("水果名不能为空！");
					return false;
				} else if (picture1_val == null || picture1_val == "") {
					alert("水果图片不能为空！");
					return false;
				} else if (brief1_val == null || brief1_val == "") {
					alert("水果简述不能为空！");
					return false;
				} else if (description1_val == null || description1_val == "") {
					alert("水果详述不能为空！");
					return false;
				} else if (pregnanteat1_val == null || pregnanteat1_val == "") {
					alert("孕妇能否吃不能为空！");
					return false;
				} else if (pregnanteat1_val != 'Y' && pregnanteat1_val != 'N') {
					alert("必须输入Y/N！");
					return false;
				} else if (momeat1_val == null || momeat1_val == "") {
					alert("产妇能否吃不能为空！");
					return false;
				} else if (momeat1_val != 'Y' && momeat1_val != 'N') {
					alert("必须输入Y/N！");
					return false;
				} else if (babyeat1_val == null || babyeat1_val == "") {
					alert("宝宝能否吃不能为空！");
					return false;
				} else if (babyeat1_val != 'Y'  && babyeat1_val != 'N') {
					alert("必须输入Y/N！");
					return false;
				} 

				var url = "/checkUpdateFruitinformation";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"id" : id1_val,
					"name" : name1_val,
					"picture" : picture1_val,
					"brief" : brief1_val,
					"description" : description1_val,
					"pregnanteat" : pregnanteat1_val,
					"momeat" : momeat1_val,
					"babyeat" : babyeat1_val,
					"str" : str,
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
<!-- 以下是下拉复选框的内容 -->
<script src="../js/jquery.min.js"></script>
<script src="../js/fSelect.js"></script>
<script>
$(function() {
        $('.demo').fSelect();
    });
</script>




</body>
</html>