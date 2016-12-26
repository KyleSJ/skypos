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




<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>


</head>

<style>
body {
   background: #f8f8f8;
   padding: 60px 0;
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
                  <div class="control-label" for="posNum">
                     posNum <input id="posNum" class="form-control" type="text"
                        name='posNum' placeholder="Enter posNum" autofocus />
                  </div>

                  <div class="control-label" for="regNum">
                     regNum <input id="regNum" class="form-control" type="text"
                        name='regNum' placeholder="Enter regNum" />
                  </div>

                  <div class="control-label" for="vanNum">
                     vanNum <input id="vanNum" class="form-control" type="text"
                        name='vanNum' placeholder="Enter posNum">
                  </div>

                  <div class="control-label" for="repreName">
                     repreName<input id="repreName" class="form-control" type="text"
                        name='repreName' placeholder="Enter repreName">
                  </div>

                  <div class="control-label" for="compaName">
                     compaName
                     <textarea id="compName" class="form-control" name="compaName"
                        rows="1" placeholder="Enter compaName."></textarea>
                  </div>

                  <div class="contorl-label" for="phoneNum">
                     phoneNum
                     <textarea id="phoneNum" class="form-control" name="phoneNum"
                        rows="1" placeholder="Enter phoneNum."></textarea>
                  </div>

                  <div class="control-group" for="addr">
                     addr
                     <textarea id="addr" class="form-control" name="addr" rows="1"
                        placeholder="Enter address."></textarea>
                  </div>


                  <!-- /.box-body -->
                  <br>
                  <div class="box-footer" align="center">
                     <button type="submit" class="btn btn-primary">등록</button>
                     <a href="/member/listAll"><button type="button"
                           class="btn btn-primary" value="사업자 목록 페이지">사업자 목록 페이지</button></a>
                  </div>
            </div>
         </div>
      </div>
   </form>
</body>
</html>