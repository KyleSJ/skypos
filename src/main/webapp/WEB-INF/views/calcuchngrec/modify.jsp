<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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

#login-form>div {
   margin: 15px 0;
}
</style>

<body>
   <form class="container" role="form" method="post">
      <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
         <div class="panel panel-success">
            <div class="panel-heading">
               <div class="panel-title">정산 변경 이력 수정</div>
            </div>
            <div class="panel-body">
               <div class="control-Label" for="calcuChngNum">
                  calcuChngNum <input id="calcuChngNum" class="form-control"
                     type="text" name='calcuChngNum'
                     value="${calcuChngRecVO.calcuChngNum}" readonly="readonly">
               </div>

                 <div class="control-label" for="calcuChngDay">
                  calcuChngDay <input id="calcuChngDay" class="form-control" type="text"
                     name='calcuChngDay' value="${calcuChngRecVO.calcuChngDay}" readonly="readonly"/>
               </div>

               <div class="control-label" for="calcuChngTime">
                  calcuChngTime <input id="calcuChngTime" class="form-control" type="text"
                     name='calcuChngTime' value="${calcuChngRecVO.calcuChngTime}" readonly="readonly"/>
               </div>
               
               <div class="control-label" for="bakDay">
                  bakDay <input id="bakDay" class="form-control" type="text"
                     name='bakDay' value="${calcuChngRecVO.bakDay}"placeholder="Enter bakDay" />
               </div>
               
               <div class="control-label" for="bakTime">
                  bakTime <input id="bakTime" class="form-control" type="text"
                     name='bakTime' value="${calcuChngRecVO.bakTime}"placeholder="Enter bakTime" />
               </div>
               
               <div class="control-label" for="moneySales">
                  moneySales <input id="moneySales" class="form-control" type="text"
                     name='moneySales' value="${calcuChngRecVO.moneySales}"placeholder="Enter moneySales" />
               </div>
               
               <div class="control-label" for="cardSales">
                  cardSales <input id="cardSales" class="form-control" type="text"
                     name='cardSales' value="${calcuChngRecVO.cardSales}"placeholder="Enter cardSales" />
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
                        self.location = "/calcuchngrec/listAll";
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