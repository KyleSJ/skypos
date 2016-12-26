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




<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

</head>

<style>

body {
   background: #f8f8f8;
   padding: 30px 50px;
}

th{
   text-align : center;
   background : #ffffff;
}

td{
text-align : center;
}

</style>

<body>
   <table class="table table-hover table-bordered">
      <tr>
       <th>calcuChngNum</th>
       <th>calcuChngDay</th>
       <th>calcuChngTime</th>
       <th>bakDay</th>
       <th>bakTime</th>
       <th>moneySales</th>
       <th>cardSales</th>
      </tr>

   <c:forEach items="${list}" var="CalcuChngRecVO">
      <tr>
       <td><a href='/calcuchngrec/read?calcuChngNum=${CalcuChngRecVO.calcuChngNum}'>${CalcuChngRecVO.calcuChngNum}</a></td>
       <td>${CalcuChngRecVO.calcuChngDay}</td>
       <td>${CalcuChngRecVO.calcuChngTime}</td>
       <td>${CalcuChngRecVO.bakDay}</td>
       <td>${CalcuChngRecVO.bakTime}</td>
       <td>${CalcuChngRecVO.moneySales}</td>
       <td>${CalcuChngRecVO.cardSales}</td>
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