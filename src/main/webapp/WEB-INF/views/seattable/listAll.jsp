<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>

<title>Insert title here</title>
</head>
<body>
	<table class="table table-bordered">
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
	<script>
		var result = '${msg}';
		if(result =='success'){
			alert("처리가 완료 되었습니다.");
		}
	</script>
</body>
</html>