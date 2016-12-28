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
					<div class="panel-title">정산 변경 이력 등록</div>
				</div>
				<div class="panel-body">
					<div class="control-label" for="calcuChngNum">
						calcuChngNum <input id="calcuChngNum" class="form-control"
							type="text" name='calcuChngNum' placeholder="Enter calcuChngNum"
							autofocus />
					</div>

					<div class="control-label" for="calcuChngDay">
						calcuChngDay <input id="calcuChngDay" class="form-control"
							type="text" name='calcuChngDay' placeholder="Enter calcuChngDay" />
					</div>

					<div class="control-label" for="calcuChngTime">
						calcuChngTime <input id="calcuChngTime" class="form-control"
							type="text" name='calcuChngTime'
							placeholder="Enter calcuChngTime" />
					</div>

					<div class="control-label" for="bakDay">
						bakDay <input id="bakDay" class="form-control" type="text"
							name='bakDay' placeholder="Enter bakDay" />
					</div>

					<div class="control-label" for="bakTime">
						bakTime <input id="bakTime" class="form-control" type="text"
							name='bakTime' placeholder="Enter bakTime" />
					</div>

					<div class="control-label" for="moneySales">
						moneySales <input id="moneySales" class="form-control" type="text"
							name='moneySales' placeholder="Enter moneySales" />
					</div>

					<div class="control-label" for="cardSales">
						cardSales <input id="cardSales" class="form-control" type="text"
							name='cardSales' placeholder="Enter cardSales" />
					</div>
					<!-- /.box-body -->
					<br>
					<div class="box-footer" align="center">
						<button type="submit" class="btn btn-primary">등록</button>
						<a href="/calcuchngrec/listAll"><input type="button"
							class="btn btn-primary" value="정산 변경 이력 LIST"></a>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>