<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
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
               <div class="panel-title">직원 수정</div>
            </div>
            <div class="panel-body">
               
                  <!--왜 ... name 을 지우니까 하나만 받을 수 있는거지...??-->
                  <div class="control-Label" for="empId">
                     empId <input id="posNum" class="form-control" type="text"
                         value="${employeeVO.empId}" readonly="readonly">
                  </div>

                  <div class="control-Label" for="posNum">
                     posNum <input id="posNum" class="form-control" type="text"
                        name='posNum' value="${employeeVO.posNum}" readonly="readonly">
                  </div>

                  <div class="control-Label" for="empName">
                     empName <input id="empName" class="form-control" type="text"
                        name='empName' value="${employeeVO.empName}" >
                  </div>

                  <div class="control-Label" for="pwd">
                     pwd <input id="pwd" class="form-control" type="text" name='pwd'
                        value="${employeeVO.pwd}" >
                  </div>

                  <!-- /.box-body -->
                  <br>
                  <div class="box-footer">
                     <button type="submit" class="btn btn-primary">저장</button>
                     <button type="submit" class="btn btn-warning">취소</button>
                  </div>
                  <script>
                     $(document).ready(function() {
                        var formObj = $("form[role='form']");

                        console.log(formObj);

                        $(".btn-warning").on("click", function() {
                           self.location = "/employee/listAll=${EmployeeVO.posNum}";
                        });

                        $(".btn-primary").on("click", function() {
                           formObj.submit();	
                        });
                     });
                  </script>
            </div>
         </div>
      </div>
   </form>
</body>
</html>