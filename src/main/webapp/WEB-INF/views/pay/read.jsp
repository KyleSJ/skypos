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
            <div class="panel-title">PAY 테이블 정보</div>
         </div>
         <div class="panel-body">
            <form role="form" method="post">
               <div class="form-group" for="payNum">
                  payNum <input id="payNum" class="form-control"
                     type="text" name='payNum'
                     value="${payVO.payNum}" readonly="readonly">
               </div>
            </form>

            <div class="control-label" for="cmplxPayNum">
                  cmplxPayNum <input id="cmplxPayNum" class="form-control" type="text"
                     name='cmplxPayNum' value="${payVO.cmplxPayNum}"readonly="readonly"/>
               </div>

               <div class="control-label" for="cardCompaNum">
                  cardCompaNum <input id="cardCompaNum" class="form-control" type="text"
                     name='cardCompaNum' value="${payVO.cardCompaNum}"readonly="readonly"/>
               </div>
               
               <div class="control-label" for="payWay">
                  payWay <input id="payWay" class="form-control" type="text"
                     name='payWay' value="${payVO.payWay}"readonly="readonly"/>
               </div>
               
               <div class="control-label" for="cardNum">
                  cardNum <input id="cardNum" class="form-control" type="text"
                     name='cardNum' value="${payVO.cardNum}"readonly="readonly"/>
               </div>
               
               <div class="control-label" for="payAmnt">
                  payAmnt <input id="payAmnt" class="form-control" type="text"
                     name='payAmnt' value="${payVO.payAmnt}"readonly="readonly"/>
               </div>
            <!-- /.box-body -->

            <br>
            <div class="box-footer" align="center">
               <button type="submit" class="btn btn-warning">수정</button>
               <button type="submit" class="btn btn-danger">삭제</button>
               <button type="submit" class="btn btn-primary">결제 목록</button>
            </div>

            <script>
               $(document).ready(function() {
                  var formObj = $("form[role='form']");

                  console.log(formObj);

                  $(".btn-warning").on("click", function() {
                     formObj.attr("action", "/pay/modify");
                     formObj.attr("method", "get");
                     formObj.submit();
                  });

                  $(".btn-danger").on("click", function() {
                     formObj.attr("action", "/pay/remove");
                     formObj.submit();
                  });

                  $(".btn-primary").on("click", function() {
                     self.location = "/pay/listAll";
                  });
               });
            </script>
         </div>
      </div>
   </div>
</body>
</html>