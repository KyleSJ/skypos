<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css" />

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="//code.jquery.com/jquery.js"></script>

<!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

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
					<div class="panel-title">상품 수정</div>
				</div>
				<div class="panel-body">
					<div class="control-Label" for="goodsNum">
						goodsNum <input id="goodsNum" class="form-control" type="text"
							name='goodsNum' value="${goodsVO.goodsNum}" readonly="readonly">
					</div>

					<div class="control-Label" for="goodsCatNum">
						goodsCatNum <input id="goodsCatNum" class="form-control"
							type="text" name='goodsCatNum' value="${goodsVO.goodsCatNum}"
							readonly="readonly">
					</div>

					<div class="control-Label" for="goodsColor">
						goodsColor <input id="goodsColor" class="form-control" type="text"
							name='goodsColor' value="${goodsVO.goodsColor}">
					</div>

					<div class="control-Label" for="goodsName">
						goodsName <input id="goodsName" class="form-control" type="text"
							name='goodsName' value="${goodsVO.goodsName}">
					</div>

					<div class="control-Label" for="goodsPrice">
						goodsPrice <input id="goodsPrice" class="form-control" type="text"
							name='goodsPrice' value="${goodsVO.goodsPrice}">
					</div>

					<div class="control-Label" for="goodsSeq">
						goodsSeq <input id="goodsSeq" class="form-control" type="text"
							name='goodsSeq' value="${goodsVO.goodsSeq}">
					</div>
					<!-- /.box-body -->
					<br>
					<div class="box-footer">
						<button type="submit" class="btn btn-primary">저장</button>
						<button type="submit" class="btn btn-warning">취소</button>
					</div>

					<script>
						$(document).ready(function() {
							var formObj = $("form[role='form']");

							console.log(formObj);

							$(".btn-warning").on("click", function() {
								self.location = "/goods/listAll";
							});

							$(".btn-primary").on("click", function() {
								formObj.submit();
							});
						});
					</script>
				</div>
			</div>
		</div>
	</form>
</body>
</html>