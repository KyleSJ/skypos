<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang='ko-kr'>
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

#Data-form>div {
   margin: 15px 0;
}
</style>
<body>
   <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
      <div class="panel panel-success">
         <div class="panel-heading">
            <div class="panel-title">개시 정보</div>
         </div>
         <div class="panel-body">
            <form role="form" method="post">
               <div class="form-group" for="openDay">
                  openDay <input id="openDay" class="form-control" type="text"
                     name='openDay' value="${openVO.openDay}" readonly="readonly">
               </div>
            </form>
            <div class="control-Label" for="empId">
               empId <input id="empId" class="form-control" type="text"
                  name='empId' value=<%=request.getParameter("empId")%> readonly="readonly">
            </div>

            <div class="control-Label" for="posNum">
               posNum <input id="posNum" class="form-control" type="text"
                  name='posNum' value=<%=request.getParameter("posNum")%> readonly="readonly">
            </div>

            <div class="control-Label" for="cashAmnt">
               cashAmnt <input id="cashAmnt" class="form-control" type="text"
                  name='cashAmnt' value="${openVO.cashAmnt}" readonly="readonly">
            </div>
            <!-- /.box-body -->

            <br>
            <div class="box-footer" align="center">
               <button type="submit" class="btn btn-warning">수정</button>
               <button type="submit" class="btn btn-danger">삭제</button>
               <button type="submit" class="btn btn-primary">개시 리스트</button>
            </div>

            <script>
               $(document).ready(function() {
                  var formObj = $("form[role='form']");

                  console.log(formObj);

                  $(".btn-warning").on("click", function() {
                     formObj.attr("action", "/open/modify");
                     formObj.attr("method", "get");
                     formObj.submit();
                  });

                  $(".btn-danger").on("click", function() {
                     formObj.attr("action", "/open/remove");
                     formObj.submit();
                  });

                  $(".btn-primary").on("click", function() {
                     self.location = "/open/listAll";
                     //formObj.attr("action", "/member/listAll");
                     //formObj.attr("method", "get");
                  });
               });
            </script>
         </div>
      </div>
   </div>
</body>
</html>