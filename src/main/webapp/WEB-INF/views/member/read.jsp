<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang='ko-kr'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css" />

<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한 -->
<script src="//code.jquery.com/jquery.js"></script>

<!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

</head>

<style>
body {
	background: #f8f8f8;
	padding: 60px 0;
}
</style>
<body>
	<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-success">
			<div class="panel-heading">
				<div class="panel-title">POS관리자 정보</div>
			</div>
			<div class="panel-body">
				<form role="form" method="post">
					<div class="form-group" for="posNum">
						posNum <input id="posNum" class="form-control" type="text"
							name='posNum' value="${memberVO.posNum}" readonly="readonly">
					</div>
				</form>
				<div class="control-Label" for="regNum">
					regNum <input id="regNum" class="form-control" type="text"
						name='regNum' value="${memberVO.regNum}" readonly="readonly">
				</div>

				<div class="control-Label" for="vanNum">
					vanNum <input id="vanNum" class="form-control" type="text"
						name='vanNum' value="${memberVO.vanNum}" readonly="readonly">
				</div>

				<div class="control-Label" for="repreName">
					repreName <input id="repreName" class="form-control" type="text"
						name='repreName' value="${memberVO.repreName}" readonly="readonly">
				</div>

				<div class="control-Label" for="compaName">
					compaName <input id="compaName" class="form-control" type="text"
						name='compaName' value="${memberVO.compaName}" readonly="readonly">
				</div>

				<div class="control-Label" for="phoneNum">
					phoneNum <input id="vanNum" class="form-control" type="text"
						name='phoneNum' value="${memberVO.phoneNum}" readonly="readonly">
				</div>

				<div class="control-group" for="addr">
					addr <input id="vanNum" class="form-control" type="text"
						name='addr' value="${memberVO.addr}" readonly="readonly">
				</div>

				<!-- /.box-body -->

				<br>
				<div class="box-footer" align="center">
					<button type="submit" class="btn btn-warning">수정</button>
					<button type="submit" class="btn btn-danger">삭제</button>
					<button type="submit" class="btn btn-primary">사업자 목록 페이지</button>
					<a href="/shopmanage/shop_main?posNum=${memberVO.posNum}"> <input
						type="button" class="btn btn-success" value="매장 관리"></a>
					<button type="submit" class="btn btn-info">재등록하기</button>
				</div>

				<script>
               $(document).ready(function() {
                  var formObj = $("form[role='form']");

                  $(".btn-warning").on("click", function() {
                     formObj.attr("action", "/member/modify");
                     formObj.attr("method", "get");
                     formObj.submit();
                  });

                  $(".btn-danger").on("click", function() {
                     formObj.attr("action", "/member/remove");
                     formObj.submit();
                  });

                  $(".btn-primary").on("click", function() {
                     self.location = "/member/listAll";
                  });
                  
                  $(".btn-info").on("click", function(){
                	  formObj.attr("action","/member/restart");
                	  formObj.submit();
                  });
               });
            </script>
			</div>
		</div>
	</div>
</body>
</html>