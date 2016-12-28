<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang='ko-kr'>
<head>
<meta http-equiv="Content-Type"
	content="width=device-width, initial-scale=1">
<meta charset="utf-8">
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

#login-form>div {
	margin: 15px 0;
}
</style>

<body>
	<form class="container" role="form" method="post">
		<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-success">
				<div class="panel-heading">
					<div class="panel-title">정산등록</div>
				</div>
				<div class="panel-body">
					<div class="control-label" for="calcuDay">
						calcuDay <input id="calcuDay" class="form-control" type="text"
							name='calcuDay' placeholder="Enter calcuDay" autofocus />
					</div>

					<div class="control-label" for="calcuChngNum">
						calcuChngNum <input id="calcuChngNum" class="form-control"
							type="text" name='calcuChngNum' placeholder="Enter calcuChngNum" />
					</div>

					<div class="control-label" for="printNum">
						printNum <input id="printNum" class="form-control" type="text"
							name='printNum' placeholder="Enter printNum">
					</div>

					<div class="control-label" for="openDay">
						openDay<input id="openDay" class="form-control" type="text"
							name='openDay' placeholder="Enter openDay"
							value=<%=request.getParameter("openDay")%>>
					</div>

					<!-- /.box-body -->
					<br>
					<div class="box-footer" align="center">
						<button type="submit" class="btn btn-primary">등록</button>
						<a href="/calcu/listAll"><button type="button"
								class="btn btn-primary" value="정산 페이지">정산 페이지</button></a>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>