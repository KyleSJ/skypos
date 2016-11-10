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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>

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
               <div class="panel-title">POS관리자 등록</div>
            </div>
            <div class="panel-body">
                  <div class="control-label" for="openDay">
                     openDay <input id="openDay" class="form-control" type="text"
                        name='openDay' placeholder="Enter openDay" />
                  </div>

                  <div class="control-label" for="empId">
                     empId <input id="empId" class="form-control" type="text"
                        name='empId' placeholder="Enter posNum" value=<%=request.getParameter("empId")%> />
                  </div>
                  
                  <div class="control-label" for="posNum">
                     posNum <input id="posNum" class="form-control" type="text"
                        name='posNum' placeholder="Enter posNum" autofocus
                        value=<%=request.getParameter("posNum")%>/>
                  </div>
                  
                  <div class="control-label" for="openAmnt">
                     openAmnt<input id="openAmnt" class="form-control" type="text"
                        name='openAmnt' placeholder="Enter openAmnt">
                  </div>

                  <!-- /.box-body -->
                  <br>
                  <div class="box-footer" align="center">
                     <button type="submit" class="btn btn-primary">등록</button>
                     <a href="/open/listAll"><button type="button"
                           class="btn btn-primary" value="사업자 목록 페이지">개시 일정</button></a>
                  </div>
            </div>
         </div>
      </div>
   </form>
</body>
</html>