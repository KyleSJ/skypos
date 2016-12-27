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
       <th>empId</th>
       <th>posNum</th>
       <th>empName</th>
       <th>pwd</th>
       <th>retire</th>
      </tr>

   <c:forEach items="${list}" var="EmployeeVO">
      <tr>
       <td><a href='/employee/read?empId=${EmployeeVO.empId}&&posNum=${EmployeeVO.posNum}'>${EmployeeVO.empId}</a></td>
       <td>${EmployeeVO.posNum}</td>
       <td>${EmployeeVO.empName}</td>
       <td>${EmployeeVO.pwd}</td>
       <td>${EmployeeVO.retire}</td>
      </tr>
   </c:forEach>
   
   </table>
   <div align="right">
   <input type="button" class="btn btn-primary" value="직원 등록">
	
   <!-- <button type="submit" class="btn btn-primary">직원등록</button>
   <button type="submit" class="btn btn-warning">사업자목록</button> -->
   </div>
   <script>
   $(document).ready(function(){
	   $(".btn-primary").on("click",function(){
		   self.location="/employee/register?posNum="+<%=request.getParameter("posNum")%>;
	   });
	   $(".btn-warning").on("click",function(){
		   self.location="/member/listAll";
	   });
   });
      var result = '${msg}';
      if(result =='success'){
         alert("처리가 완료 되었습니다.");
      }
   </script>
</body>
</html>