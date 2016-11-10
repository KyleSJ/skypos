<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
<script src="/resources/bootstrap/js/respond.js"></script>

</head>
<body>
	<div>
		<form role="form" method="post">
			<label>tableNum</label> <input type="text" name="tableNum"
				value="${seattableVO.tableNum}" readonly="readonly">
		</form>

		<div class="form-group">
			<label>tableLoc</label> <input type="text" name='tableLoc'
				class="form-control" value="${seattableVO.tableLoc}" readonly="readonly">
		</div>

		<div class="form-group">
			<label>tableColor</label> <input type="text" name='tableColor'
				class="form-control" value="${seattableVO.tableColor}" readonly="readonly">
		</div>

		<div class="form-group">
			<label>tableCatNum</label> <input type="text" name='tableCatNum'
				class="form-control" value="${seattableVO.tableCatNum}"
				readonly="readonly">
		</div>

		<div class="form-group">
			<label>tableName</label> <input type="text" name='tableName'
				class="form-control" value="${seattableVO.tableName}"
				readonly="readonly">
		</div>
	</div>
	<!-- /.box-body -->

	<div class="box-footer">
		<button type="submit" class="btn btn-warning">수정</button>
		<button type="submit" class="btn btn-danger">삭제</button>
		<button type="submit" class="btn btn-primary">테이블 목록 페이지</button>
	</div>
	
	<script>
		$(document).ready(function(){
			var formObj = $("form[role='form']");

			console.log(formObj);
			
			$(".btn-warning").on("click",function(){
				formObj.attr("action","/seattable/modify");
				formObj.attr("method","get");
				formObj.submit();
			});
			
			$(".btn-danger").on("click",function(){
				formObj.attr("action","/seattable/remove");
				formObj.submit();
			});
			
			$(".btn-primary").on("click",function(){
				self.location = "/seattable/listAll";
			});
		});
	</script>
</body>

</html>