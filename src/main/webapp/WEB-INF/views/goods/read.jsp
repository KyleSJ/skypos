<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
	<div>
		<form role="form" method="post">
			<label>goodsNum</label> <input type="text" name="goodsNum"
				value="${goodsVO.goodsNum}" readonly="readonly">
		</form>

		<div class="form-group">
			<label>goodsCatNum</label> <input type="text" name='goodsCatNum'
				class="form-control" value="${goodsVO.goodsCatNum}" readonly="readonly">
		</div>

		<div class="form-group">
			<label>goodsColor</label> <input type="text" name='goodsColor'
				class="form-control" value="${goodsVO.goodsColor}" readonly="readonly">
		</div>

		<div class="form-group">
			<label>goodsName</label> <input type="text" name='goodsName'
				class="form-control" value="${goodsVO.goodsName}" readonly="readonly">
		</div>
		
		<div class="form-group">
			<label>goodsPrice</label> <input type="text" name='goodsPrice'
				class="form-control" value="${goodsVO.goodsPrice}" readonly="readonly">
		</div>
		
		<div class="form-group">
			<label>goodsSeq</label> <input type="text" name='goodsSeq'
				class="form-control" value="${goodsVO.goodsSeq}" readonly="readonly">
		</div>
	</div>
	<!-- /.box-body -->

	<div class="box-footer">
		<button type="submit" class="btn btn-warning">수정</button>
		<button type="submit" class="btn btn-danger">삭제</button>
		<button type="submit" class="btn btn-primary">상품 목록 페이지</button>
	</div>
	
	

	<script>
		$(document).ready(function(){
			var formObj = $("form[role='form']");

			console.log(formObj);
			
			$(".btn-warning").on("click",function(){
				formObj.attr("action","/goods/modify");
				formObj.attr("method","get");
				formObj.submit();
			});
			
			$(".btn-danger").on("click",function(){
				formObj.attr("action","/goods/remove");
				formObj.submit();
			});
			
			$(".btn-primary").on("click",function(){
				self.location = "/goods/listAll";
			});
		});
	</script>
</body>

</html>