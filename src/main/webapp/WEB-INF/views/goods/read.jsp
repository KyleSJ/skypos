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

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>

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
	<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-success">
			<div class="panel-heading">
				<div class="panel-title">상품 정보</div>
			</div>
			<div class="panel-body">
				<form role="form" method="post">
					<div class="form-group" for="goodsNum">
						goodsNum <input id="goodsNum" class="form-control" type="text"
							name='goodsNum' value="${goodsVO.goodsNum}" readonly="readonly">
					</div>
				</form>
				<div class="control-Label" for="goodsCatNum">
					goodsCatNum <input id="goodsCatNum" class="form-control"
						type="text" name='goodsCatNum' value="${goodsVO.goodsCatNum}"
						readonly="readonly">
				</div>

				<div class="control-Label" for="goodsColor">
					goodsColor <input id="goodsColor" class="form-control" type="text"
						name='goodsColor' value="${goodsVO.goodsColor}"
						readonly="readonly">
				</div>

				<div class="control-Label" for="goodsName">
					goodsName <input id="goodsName" class="form-control" type="text"
						name='goodsName' value="${goodsVO.goodsName}" readonly="readonly">
				</div>

				<div class="control-Label" for="goodsPrice">
					goodsPrice <input id="goodsPrice" class="form-control" type="text"
						name='goodsPrice' value="${goodsVO.goodsPrice}"
						readonly="readonly">
				</div>

				<div class="control-Label" for="goodsSeq">
					goodsSeq <input id="goodsSeq" class="form-control" type="text"
						name='goodsSeq' value="${goodsVO.goodsSeq}" readonly="readonly">
				</div>

				<!-- /.box-body -->
				<br>
				<div class="box-footer" align="center">
					<button type="submit" class="btn btn-warning">수정</button>
					<button type="submit" class="btn btn-danger">삭제</button>
					<button type="submit" class="btn btn-primary">상품 목록 페이지</button>
				</div>
				<script>
					$(document).ready(function() {
						var formObj = $("form[role='form']");

						console.log(formObj);

						$(".btn-warning").on("click", function() {
							formObj.attr("action", "/goods/modify");
							formObj.attr("method", "get");
							formObj.submit();
						});

						$(".btn-danger").on("click", function() {
							formObj.attr("action", "/goods/remove");
							formObj.submit();
						});

						$(".btn-primary").on("click", function() {
							self.location = "/goods/listAll";
						});
					});
				</script>
			</div>
		</div>
	</div>
</body>
</html>