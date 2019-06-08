<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
<form  id="formdata" enctype="multipart/form-data">
<input type="file" name="file">
<button id="add">添加</button>
</form>
<script type="text/javascript">
$("#add").click(function(){
	var formData = new FormData($('#formdata')[0]);
	$.ajax({
		type: 'post',
		url: "/checkIndexFruit",
		data: formData,
		cache: false,
		processData: false,
		contentType: false,
	}).success(function (data) {
		$.messager.alert('提示信息',data,'info');
		openURL('添加信息', '/EmpGuid/manager/addBanner');
	}).error(function () {
		$.messager.alert('错误信息',data,'error');
	});
	});
</script>

</body>
</html>