<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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