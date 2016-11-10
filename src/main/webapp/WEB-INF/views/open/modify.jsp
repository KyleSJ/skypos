<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet"
   type="text/css"/>

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="//code.jquery.com/jquery.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

<!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

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
               <div class="panel-title">POS관리자 수정</div>
            </div>
            <div class="panel-body">
                  <div class="control-Label" for="posNum">
                     posNum <input id="posNum" class="form-control" type="text"
                        name='posNum' value="${memberVO.posNum}" readonly="readonly">
                  </div>

                  <div class="control-Label" for="regNum">
                     regNum <input id="regNum" class="form-control" type="text"
                        name='regNum' value="${memberVO.regNum}">
                  </div>

                  <div class="control-Label" for="vanNum">
                     vanNum <input id="vanNum" class="form-control" type="text"
                        name='vanNum' value="${memberVO.vanNum}">
                  </div>

                  <div class="control-Label" for="repreName">
                     repreName <input id="repreName" class="form-control" type="text"
                        name='repreName' value="${memberVO.repreName}">
                  </div>

                  <div class="control-Label" for="compaName">
                     compaName <input id="compaName" class="form-control" type="text"
                        name='compaName' value="${memberVO.compaName}">
                  </div>

                  <div class="control-Label" for="phoneNum">
                     phoneNum <input id="vanNum" class="form-control" type="text"
                        name='phoneNum' value="${memberVO.phoneNum}">
                  </div>

                  <div class="control-group" for="addr">
                     addr <input id="vanNum" class="form-control" type="text"
                        name='addr' value="${memberVO.addr}">
                  </div>

                  <!-- /.box-body -->
                  <br>
                  <div class="box-footer" align="center">
                     <button type="submit" class="btn btn-primary">저장</button>
                     <button type="submit" class="btn btn-warning">취소</button>
                  </div>

                  <script>
                     $(document).ready(function() {
                        var formObj = $("form[role='form']");

                        console.log(formObj);

                        $(".btn-warning").on("click", function() {
                           self.location = "/member/listAll";
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