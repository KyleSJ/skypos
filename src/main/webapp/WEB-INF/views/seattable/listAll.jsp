<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Bootstrap -->
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css" />

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="//code.jquery.com/jquery.js"></script>

<!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<style>
body {
	background: #f8f8f8;
	padding: 30px 50px;
}

th {
	text-align: center;
	background: #ffffff;
}

td {
	text-align: center;
}
</style>
<body>
	<table class="table table-bordered table-hover">
		<tr>
			<th>tableNum</th>
			<th>tableLoc</th>
			<th>tableColor</th>
			<th>tableCatNum</th>
			<th>tableName</th>
		</tr>

		<c:forEach items="${list}" var="SeattableVO">
			<tr>
				<td><a href='/seattable/read?tableNum=${SeattableVO.tableNum}'>${SeattableVO.tableNum}</a></td>
				<td>${SeattableVO.tableLoc}</td>
				<td>${SeattableVO.tableColor}</td>
				<td>${SeattableVO.tableCatNum}</td>
				<td>${SeattableVO.tableName}</td>
			</tr>
		</c:forEach>

	</table>
	<div align="right">
		<a href="/seattable/register"><input type="button" class="btn btn-primary" value="테이블 등록"></a>
	</div>
	<script>
		var result = '${msg}';
		if (result == 'success') {
			alert("처리가 완료 되었습니다.");
		}
	</script>
</body>
</html>