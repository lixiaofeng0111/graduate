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
<style type="text/css">
#submit_btn{   
         width:200px;   
         height:200px;   
         background:url(../imgs/add.png) no-repeat center;   
         cursor:pointer;   
          display:block;   
          font-size:0;   
          line-height:0;   
          text-indent:-9999px;   
}  
</style>
</head>
<body>
<div>
	<div id="container">
		<div id="nav_links">
			当前位置：用户管理&nbsp;>&nbsp;<span style="color: #1A5CC6;">水果能吃慎吃原因修改</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="../images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr><td><input id="id" name="id" type="hidden" value="${editFruitReasonById.id}"/></td></tr>
				<tr><td><input id="fruitId" name="fruitId" type="hidden" value="${editFruitReasonById.fruits.id}"/></td></tr>
				<tr>
					<td class="ui_text_rt">孕妇能否吃</td>
					<td class="ui_text_lt">
						<textarea style = "height:100px" autocomplete="off" class="ui_input_txt01" id="pregnanteat"  name="pregnanteat" >${editFruitReasonById.pregnanteat}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">产妇能否吃</td>
					<td class="ui_text_lt">
						<textarea style = "height:100px" autocomplete="off" class="ui_input_txt01" id="momeat"  name="momeat" >${editFruitReasonById.momeat}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">宝宝能否吃</td>
					<td class="ui_text_lt">
						<textarea style = "height:100px" autocomplete="off" class="ui_input_txt01" id="babyeat"  name="babyeat" >${editFruitReasonById.babyeat}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">对应水果</td>
					<td><select style = "height:30px;" id="fruit" name="fruit" class="ui_input_txt01">
							<c:forEach items="${searchFruit}" var="fruits">
								  <option value="${fruits.id}">${fruits.name}</option>
							</c:forEach>
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
//select  option遍历部分
$(function(){
	var fruit_id = document.getElementById("fruitId");
	var options = document.getElementsByTagName("option");
	for(i=0;i<options.length;i++){
		if(options[i].value==fruit_id.value){
			options[i].selected = true;
		}
	}
})
///////////////////////////select  option遍历部分

		$(function() {
			$("#update_btn").click(function() {
				var id1 = document.getElementById("id");
				var fruitId1 = document.getElementById("fruitId");
				var pregnanteat1 = document.getElementById("pregnanteat");
				var momeat1 = document.getElementById("momeat");
				var babyeat1 = document.getElementById("babyeat");
				var fruit1 = document.getElementById("fruit");
				
				id1_val = $.trim(id1.value);
				fruitId1_val = $.trim(fruitId1.value);
				pregnanteat1_val = $.trim(pregnanteat1.value);
				momeat1_val = $.trim(momeat1.value);
				babyeat1_val = $.trim(babyeat1.value);
				fruit1_val = $.trim(fruit1.value);
				if (pregnanteat1_val == null || pregnanteat1_val == "") {
					alert("孕妇能不能吃原因不能为空！");
					return false;
				} else if (momeat1_val == null || momeat1_val == "") {
					alert("产妇能不能吃原因不能为空！");
					return false;
				} else if (babyeat1_val == null || babyeat1_val == "") {
					alert("宝宝能不能吃原因不能为空！");
					return false;
				} else if (fruit1_val == null || fruit1_val == "") {
					alert("水果名不能为空！");
					return false;
				} 

				var url = "/checkUpdateFruitReason";
				//向后端传递参数，time：当前时间，防止重复提交，防止浏览器缓存
				var args = {
					"id" : id1_val,
					"fruitId" : fruit1_val,
					"pregnanteat" : pregnanteat1_val,
					"momeat" : momeat1_val,
					"babyeat" : babyeat1_val,
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