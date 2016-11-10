<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

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