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
			<label>goodsNum</label>
			<input type ="text" class="form-control" name='goodsNum' placeholder="Enter goodsNum">
		</div>
		
		<div class="form-group">
			<label>goodsCatNum</label> 
			<input type="text"
				name='goodsCatNum' class="form-control" placeholder="Enter goodsCatNum">
		</div> 

		<div class="form-group">	
			<label>goodsColor</label> 
			<input type="text"
				name='goodsColor' class="form-control" placeholder="Enter goodsColor">
		</div>
		
		<div class="form-group">
			<label>goodsName</label> 
			<input type="text"
				name='goodsName' class="form-control" placeholder="Enter goodsName">
		</div> 				

		<div class="form-group">
			<label>goodsPrice</label> 
			<input type="text"
				name='goodsPrice' class="form-control" placeholder="Enter goodsPrice">
		</div> 				
		
		<div class="form-group">
			<label>goodsSeq</label> 
			<input type="text"
				name='goodsSeq' class="form-control" placeholder="Enter goodsPrice">
		</div> 				
	</div>
	<!-- /.box-body -->

	<div class="box-footer">
		<button type="submit" class="btn btn-primary">등록</button>
		<a href="/goods/listAll"><input type="button" value="상품목록"></a>
	</div>
	
	
</form>
</body>
</html>