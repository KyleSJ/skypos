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
					<div class="panel-title">테이블 등록</div>
				</div>
				<div class="panel-body">
					<div class="control-label" for="tableNum">
						tableNum <input id="tableNum" class="form-control" type="text"
							name='tableNum' placeholder="Enter tableNum" autofocus />
					</div>

					<div class="control-label" for="tableLoc">
						tableLoc <input id="tableLoc" class="form-control" type="text"
							name='tableLoc' placeholder="Enter tableLoc" />
					</div>

					<div class="control-label" for="tableColor">
						tableColor <input id="tableColor" class="form-control" type="text"
							name='tableColor' placeholder="Enter tableColor" />
					</div>

					<div class="control-label" for="tableColor">
						tableCatNum <input id="tableCatNum" class="form-control"
							type="text" name='tableCatNum' placeholder="Enter tableCatNum" />
					</div>

					<div class="control-label" for="tableName">
						tableName <input id="tableName" class="form-control" type="text"
							name='tableName' placeholder="Enter tableName" />
					</div>

					<!-- /.box-body -->
					<br>
					<div class="box-footer" align="center">
						<button type="submit" class="btn btn-primary">등록</button>
						<a href="/seattable/listAll"><input type="button"
							value="테이블 목록"></a>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>