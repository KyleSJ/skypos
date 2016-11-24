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
               <div class="control-label" for="cmplxPayNum">
                  cmplxPayNum <input id="cmplxPayNum" class="form-control" type="text"
                   name="cmplxPayNum"  value="${cmplxPayVO.cmplxPayNum}"readonly="readonly"/>
               </div>
            </form>
            
               <div class="form-group" for="printNum">
                  printNum <input id="printNum" class="form-control"
                     type="text" name='printNum'
                     value="${cmplxPayVO.printNum}" readonly="readonly">
               </div>

               <div class="control-label" for="orderNum">
                  orderNum <input id="orderNum" class="form-control" type="text"
                     name='orderNum' value="${cmplxPayVO.orderNum}"readonly="readonly"/>
               </div>
               
               <div class="control-label" for="payTime">
                  payTime <input id="payTime" class="form-control" type="text"
                     name='payTime' value="${cmplxPayVO.payTime}"readonly="readonly"/>
               </div>
               
               <div class="control-label" for="openDay">
                  openDay <input id="openDay" class="form-control" type="text"
                     name='openDay' value="${cmplxPayVO.openDay}"readonly="readonly"/>
               </div>
               
               <div class="control-label" for="totalPayAmnt">
                  totalPayAmnt <input id="totalPayAmnt" class="form-control" type="text"
                     name='totalPayAmnt' value="${cmplxPayVO.totalPayAmnt}"readonly="readonly"/>
               </div>
            <!-- /.box-body -->

            <br>
            <div class="box-footer" align="center">
               <button type="submit" class="btn btn-warning">수정</button>
               <button type="submit" class="btn btn-danger">삭제</button>
               <button type="submit" class="btn btn-primary">복합결제 목록</button>
            </div>

            <script>
               $(document).ready(function() {
                  var formObj = $("form[role='form']");

                  console.log(formObj);

                  $(".btn-warning").on("click", function() {
                     formObj.attr("action", "/cmplxpay/modify");
                     formObj.attr("method", "get");
                     formObj.submit();
                  });

                  $(".btn-danger").on("click", function() {
                     formObj.attr("action", "/cmplxpay/remove");
                     formObj.submit();
                  });

                  $(".btn-primary").on("click", function() {
                     self.location = "/cmplxpay/listAll";
                  });
               });
            </script>
         </div>
      </div>
   </div>
</body>
</html>