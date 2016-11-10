<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<form role="form" method="post">
	<div class="box-body"> 
		
		<div class="form-group">
		<label>tableNum</label>
		<input type ="text" name='tableNum' class="form-control" value="${seattableVO.tableNum}" readonly="readonly">
		</div>
		
		<div class="form-group">
		<label>tableLoc</label>
		<input type="text" name='tableLoc' class="form-control" value="${seattableVO.tableLoc}">
		</div>
		
		<div class="form-group">
		<label>tableColor</label>
		<input type="text" name='tableColor' class="form-control" value="${seattableVO.tableColor}">
		</div>
		
		<div class="form-group">
		<label>tableCatNum</label>
		<input type="text" name='tableCatNum' class="form-control" value="${seattableVO.tableCatNum}" readonly="readonly">
		</div>
		
		<div class="form-group">
		<label>tableName</label>
		<input type="text" name='tableName' class="form-control" value="${seattableVO.tableName}">
		</div>
	</div>
</form>
		
		<div class ="box-footer">
		 <button type="submit" class="btn btn-primary">저장</button>
		 <button type="submit" class="btn btn-warning">취소</button>
		</div>

	<script>
		$(document).ready(function(){
			var formObj = $("form[role='form']");

			console.log(formObj);
			
			$(".btn-warning").on("click",function(){
				self.location ="/seattable/listAll";
			});
			
			$(".btn-primary").on("click",function(){
				formObj.submit();
			});
		});
	</script>
</body>
</html>