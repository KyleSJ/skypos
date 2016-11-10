<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form role="form" method="post">
	<div class="box-body">
	
		<div class="form-group">
			<label>tableNum</label>
			<input type ="text" class="form-control" name='tableNum' placeholder="Enter tableNum">
		</div>
		
		<div class="form-group">
			<label>tableLoc</label> 
			<input type="text"
				name='tableLoc' class="form-control" placeholder="Enter tableLoc">
		</div> 

		<div class="form-group">	
			<label>tableColor</label> 
			<input type="text"
				name='tableColor' class="form-control" placeholder="Enter tableColor">
		</div>
		
		<div class="form-group">
			<label>tableCatNum</label> 
			<input type="text"
				name='tableCatNum' class="form-control" placeholder="Enter tableCatNum">
		</div> 				

		<div class="form-group">
			<label>tableName</label> 
			<input type="text"
				name='tableName' class="form-control" placeholder="Enter tableName">
		</div> 				
		
	</div>
	<!-- /.box-body -->

	<div class="box-footer">
		<button type="submit" class="btn btn-primary">등록</button>
		<a href="/seattable/listAll"><input type="button" value="테이블 목록"></a>
	</div>
	
	
</form>
</body>
</html>