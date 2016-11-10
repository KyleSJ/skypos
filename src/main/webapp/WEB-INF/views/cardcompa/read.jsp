<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang='ko-kr'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css" />

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="//code.jquery.com/jquery.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

<!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>


</head>

<style>
body {
	background: #f8f8f8;
	padding: 60px 0;
}

#Data-form>div {
	margin: 15px 0;
}
</style>
<body>
	<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-success">
			<div class="panel-heading">
				<div class="panel-title">카드회사 정보</div>
			</div>
			<div class="panel-body">
				<form role="form" method="post">
					<div class="form-group" for="cardCompaNum">
						cardCompaNum <input id="cardCompaNum" class="form-control"
							type="text" name='cardCompaNum'
							value="${cardCompaVO.cardCompaNum}" readonly="readonly">
					</div>
				</form>

				<div class="form-group" for="compaName">
					compaName <input id="compaName" class="form-control" type="text"
						name='compaName' value="${cardCompaVO.compaName}"
						readonly="readonly">
				</div>

				<div class="form-group" for="phoneNum">
					phoneNum <input id="phoneNum" class="form-control" type="text"
						name='phoneNum' value="${cardCompaVO.phoneNum}"
						readonly="readonly">
				</div>
				<!-- /.box-body -->

				<br>
				<div class="box-footer" align="center">
					<button type="submit" class="btn btn-warning">수정</button>
					<button type="submit" class="btn btn-danger">삭제</button>
					<a
						href='/cardcompa/listAll?cardCompaNum=${cardCompaVO.cardCompaNum}'><input
						type="button" class="btn btn-primary" value="카드회사 목록"></a>
				</div>

				<script>
					$(document).ready(function() {
						var formObj = $("form[role='form']");

						console.log(formObj);

						$(".btn-warning").on("click", function() {
							formObj.attr("action", "/cardcompa/modify");
							formObj.attr("method", "get");
							formObj.submit();
						});

						$(".btn-danger").on("click", function() {
							formObj.attr("action", "/cardcompa/remove");
							formObj.submit();
						});

						$(".btn-primary").on("click", function() {
							self.location = "/cardcompa/listAll";
						});
					});
				</script>
			</div>
		</div>
	</div>
</body>
</html>