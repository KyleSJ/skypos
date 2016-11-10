<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

<title>CSS 영역 나누기 연습</title>

<style>
body{
	background: #f8f8f8;
	padding: 60px 0;
}

#div_root {
	margin: auto;
	width: 100%;
}

#div_top {
	width: 100% height:100px;
	text-align: center;
	border-top : 1px solid white;
}

#div_menu {
	width: 20%;
	height: 300px;
	float: left;;
	text-align: left;
}

#div_con {
	width: 80%;
	height: 300px;
	float: left;
	text-align: center;
}

#div_bottom {
	width: 100%;
	height: 100px;
	clear: both;;
	text-align: center;
}
</style>

</head>
<body>
	<div id="div_root">
		<div id="div_top">메인메뉴</div>
		<div id="div_menu">
			<div class="btn-">
				<button id="table_manage" type="submit" class="btn btn-warning">테이블 관리</button>
			</div>
			<div>
				<button id="good_manage" type="submit" class="btn btn-danger">상품 관리</button>
			</div>
			<div>
				<button id="employee_manage" type="submit" class="btn btn-danger">직원 관리</button>
			</div>
			<div>
				<button id="statistics" type="submit" class="btn btn-danger">통계</button>
			</div>
		</div>
		<div id="div_con"></div>
		<div id="div_bottom">마무리</div>

		<script>
			$(document).ready(function() {
				$(".btn-warning").on("click", function() {
					$('#div_con').load("/member/listAll");
				});

				$(".btn-danger").on("click", function() {
					$('#div_con').load("/van/listAll");
				})
			});
		</script>
	</div>
</body>
</html>