<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
	<table class="table table-hover table-bordered">
		<tr>
			<th>payNum</th>
			<th>cmplxPayNum</th>
			<th>cardCompaNum</th>
			<th>payWay</th>
			<th>cardNum</th>
			<th>payAmnt</th>
		</tr>

		<c:forEach items="${list}" var="PayVO">
			<tr>
				<td><a href='/pay/read?payNum=${PayVO.payNum}'>${PayVO.payNum}</a></td>
				<td>${PayVO.cmplxPayNum}</td>
				<td>${PayVO.cardCompaNum}</td>
				<td>${PayVO.payWay}</td>
				<td>${PayVO.cardNum}</td>
				<td>${PayVO.payAmnt}</td>
			</tr>
		</c:forEach>

	</table>
	<script>
      var result = '${msg}';
      if(result =='success'){
         alert("처리가 완료 되었습니다.");
      }
   </script>
</body>
</html>