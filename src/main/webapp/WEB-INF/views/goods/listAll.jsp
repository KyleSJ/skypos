<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

</head>
<body>
<table class="table table-bordered">
		<tr>
		 <th>goodsNum</th>
		 <th>goodsCatNum</th>
		 <th>goodsColor</th>
		 <th>goodsName</th>
		 <th>goodsPrice</th>
		 <th>goodsSeq</th>
		</tr>

	<c:forEach items="${list}" var="GoodsVO">
		<tr>
		 <td><a href='/goods/read?goodsNum=${GoodsVO.goodsNum}'>${GoodsVO.goodsNum}</a></td>
		 <td>${GoodsVO.goodsCatNum}</td>
		 <td>${GoodsVO.goodsColor}</td>
		 <td>${GoodsVO.goodsName}</td>
		 <td>${GoodsVO.goodsPrice}</td>
		 <td>${GoodsVO.goodsSeq}</td>
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