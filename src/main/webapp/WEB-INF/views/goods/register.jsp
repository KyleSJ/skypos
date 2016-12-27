<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">




<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

</head>

<style>
body {
	background: #f8f8f8;
	padding: 60px 0;
}
</style>

<body>
	<form class="container" role="form" method="post">
		<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-success">
				<div class="panel-heading">
					<div class="panel-title">상품 등록</div>
				</div>
				<div class="panel-body">					
					<div class="control-label" for="goodsCatNum">
						goodsCatNum <input id="goodsCatNum" class="form-control"
							type="text" name='goodsCatNum' placeholder="Enter goodsCatNum"
							autofocus />
					</div>

					<div class="control-label" for="goodsColor">
						goodsColor <input id="goodsColor" class="form-control" type="text"
							name='goodsColor' placeholder="Enter goodsColor" autofocus />
					</div>

					<div class="control-label" for="goodsName">
						goodsName <input id="goodsName" class="form-control" type="text"
							name='goodsName' placeholder="Enter goodsName" autofocus />
					</div>

					<div class="control-label" for="goodsPrice">
						goodsPrice <input id="goodsPrice" class="form-control" type="text"
							name='goodsPrice' placeholder="Enter goodsPrice" autofocus />
					</div>

					<div class="control-label" for="goodsPrice">
						goodsSeq <input id="goodsSeq" class="form-control" type="text"
							name='goodsSeq' placeholder="Enter goodsSeq" autofocus />
					</div>

					<!-- /.box-body -->
					<br>
					<div class="box-footer" align="center">
						<button type="submit" class="btn btn-primary">등록</button>
						<a href="/shopmanage/shop_main?posNum=<%=request.getParameter("posNum")%>">
						<input type="button" class="btn btn-primary" value="매장관리"></a>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>