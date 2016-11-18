<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

<title>매장 관리</title>

<style>
body {
	background: #f8f8f8;
	padding: 60px 60px;
}

div {
	border : 1.5px solid white;
	
}

#div_root {
	width: 100%;
	height : 100%;
}

#div_top {
	width : 100%;
	height : 50px;
	text-align: center;
}

#div_left {
	width: 20%;
	height : 394px;
	float: left;
	text-align: left;
}

#div_right {
	width: 80%;
	float: left;
	text-align: center;
}

#div_bottom {
	width: 100%;
	clear: both;
	text-align: center;
}
button{
width:100%;
height : 95px;
font-size : 100%;
}
</style>

</head>
<body>
	<div id="div_root">
		<div id="div_top">매장관리</div>
		<div id="div_left">
			<div>
				<button id="table_manage" type="submit" class="btn btn-danger">테이블
					관리</button>
			</div>
			<div>
				<button id="good_manage" type="submit" class="btn btn-danger">상품
					관리</button>
			</div>
			<div>
				<button id="employee_manage" type="submit" class="btn btn-danger">직원
					관리</button>
			</div>
			<div>
				<button id="statistics" type="submit" class="btn btn-danger">통계</button>
			</div>
		</div>
		<div id="div_right"></div>

		<script>
			$(document).ready(function() {
				$("#table_manage").on("click", function() {
					$('#div_right').load("/seattable/listAll");
				});

				$("#good_manage").on("click", function() {
					$('#div_right').load("/goods/listAll");
				});

				$("#eployee_manage").on("click", function() {
					$('#div_right').load("/employee/listAll?posNum=${memberVO.posNum}");
				});

				$("#statistics").on("click", function() {
					$('#div_right').load("/shopmanage/statistics");
				});
			});
		</script>
	</div>
</body>
</html>