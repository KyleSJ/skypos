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
               <div class="panel-title">Order Menu 수정</div>
            </div>
            <div class="panel-body">
               <div class="control-Label" for="orderNum">
                  orderNum <input id="orderNum" class="form-control"
                     type="text" name='orderNum'
                     value="${orderMenuVO.orderNum}" readonly="readonly">
               </div>

                 <div class="control-label" for="openDay">
                  openDay <input id="openDay" class="form-control" type="text"
                     name='openDay' value="${orderMenuVO.openDay}" readonly="readonly"/>
               </div>

               <div class="control-label" for="printNum">
                  printNum <input id="printNum" class="form-control" type="text"
                     name='printNum' value="${orderMenuVO.printNum}" readonly="readonly"/>
               </div>
               
               <div class="control-label" for="tableNum">
                  tableNum <input id="tableNum" class="form-control" type="text"
                     name='tableNum' value="${orderMenuVO.tableNum}"placeholder="Enter tableNum" />
               </div>
               
               <div class="control-label" for="orderTime">
                  orderTime <input id="orderTime" class="form-control" type="text"
                     name='orderTime' value="${orderMenuVO.orderTime}"placeholder="Enter orderTime" />
               </div>
               
               <div class="control-label" for="orderAmnt">
                  orderAmnt <input id="orderAmnt" class="form-control" type="text"
                     name='orderAmnt' value="${orderMenuVO.orderAmnt}"placeholder="Enter orderAmnt" />
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
                        self.location = "/ordermenu/listAll";
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