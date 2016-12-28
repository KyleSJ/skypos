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

#Data-form>div {
	margin: 15px 0;
}
</style>
<body>
	<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-success">
			<div class="panel-heading">
				<div class="panel-title">정산 변경 이력 정보</div>
			</div>
			<div class="panel-body">
				<form role="form" method="post">
					<div class="form-group" for="calcuChngNum">
						calcuChngNum <input id="calcuChngNum" class="form-control"
							type="text" name='calcuChngNum'
							value="${calcuChngRecVO.calcuChngNum}" readonly="readonly">
					</div>
				</form>

				<div class="control-label" for="calcuChngDay">
					calcuChngDay <input id="calcuChngDay" class="form-control"
						type="text" name='calcuChngDay'
						value="${calcuChngRecVO.calcuChngDay}" readonly="readonly" />
				</div>

				<div class="control-label" for="calcuChngTime">
					calcuChngTime <input id="calcuChngTime" class="form-control"
						type="text" name='calcuChngTime'
						value="${calcuChngRecVO.calcuChngTime}" readonly="readonly" />
				</div>

				<div class="control-label" for="bakDay">
					bakDay <input id="bakDay" class="form-control" type="text"
						name='bakDay' value="${calcuChngRecVO.bakDay}" readonly="readonly" />
				</div>

				<div class="control-label" for="bakTime">
					bakTime <input id="bakTime" class="form-control" type="text"
						name='bakTime' value="${calcuChngRecVO.bakTime}"
						readonly="readonly" />
				</div>

				<div class="control-label" for="moneySales">
					moneySales <input id="moneySales" class="form-control" type="text"
						name='moneySales' value="${calcuChngRecVO.moneySales}"
						readonly="readonly" />
				</div>

				<div class="control-label" for="cardSales">
					cardSales <input id="cardSales" class="form-control" type="text"
						name='cardSales' value="${calcuChngRecVO.cardSales}"
						readonly="readonly" />
				</div>
				<!-- /.box-body -->

				<br>
				<div class="box-footer" align="center">
					<button type="submit" class="btn btn-warning">수정</button>
					<button type="submit" class="btn btn-danger">삭제</button>
					<button type="submit" class="btn btn-primary">통계변화기록</button>
				</div>

				<script>
               $(document).ready(function() {
                  var formObj = $("form[role='form']");

                  console.log(formObj);

                  $(".btn-warning").on("click", function() {
                     formObj.attr("action", "/calcuchngrec/modify");
                     formObj.attr("method", "get");
                     formObj.submit();
                  });

                  $(".btn-danger").on("click", function() {
                     formObj.attr("action", "/calcuchngrec/remove");
                     formObj.submit();
                  });

                  $(".btn-primary").on("click", function() {
                     self.location = "/calcuchngrec/listAll";
                  });
               });
            </script>
			</div>
		</div>
	</div>
</body>
</html>