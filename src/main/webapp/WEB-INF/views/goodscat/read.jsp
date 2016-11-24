<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang='ko-kr'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

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
            <div class="panel-title">상품 테이블 정보</div>
         </div>
         <div class="panel-body">
            <form role="form" method="post">
               <div class="form-group" for="goodsCatNum">
                  goodsCatNum <input id="goodsCatNum" class="form-control"
                     type="text" name='goodsCatNum'
                     value="${goodsCatVO.goodsCatNum}" readonly="readonly">
               </div>
            </form>

            <div class="form-group" for="goodsCatName">
               goodsCatName <input id="goodsCatName" class="form-control" type="text"
                  name='goodsCatName' value="${goodsCatVO.goodsCatName}"
                  readonly="readonly">
            </div>

            <div class="form-group" for="goodsCatLoc">
               goodsCatLoc <input id="goodsCatLoc" class="form-control" type="text"
                  name='goodsCatLoc' value="${goodsCatVO.goodsCatLoc}"
                  readonly="readonly">
            </div>
            <!-- /.box-body -->

            <br>
            <div class="box-footer" align="center">
               <button type="submit" class="btn btn-warning">수정</button>
               <button type="submit" class="btn btn-danger">삭제</button>
               <a
                  href='/goodsCat/listAll?goodsCatNum=${goodsCatVO.goodsCatNum}'><input
                  type="button" class="btn btn-primary" value="카드회사 목록"></a>
            </div>

            <script>
               $(document).ready(function() {
                  var formObj = $("form[role='form']");

                  console.log(formObj);

                  $(".btn-warning").on("click", function() {
                     formObj.attr("action", "/goodscat/modify");
                     formObj.attr("method", "get");
                     formObj.submit();
                  });

                  $(".btn-danger").on("click", function() {
                     formObj.attr("action", "/goodscat/remove");
                     formObj.submit();
                  });

                  $(".btn-primary").on("click", function() {
                     self.location = "/goodscat/listAll";
                  });
               });
            </script>
         </div>
      </div>
   </div>
</body>
</html>