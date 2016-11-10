<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CSS 영역 나누기 연습</title>

<style>

#div_root{
	margin:auto;
	width:100%;
}
#div_top{
	width:100%
	height:100px
	background-color:#82FA58;
	text-align:center;
}
#div_menu{
	width:20%;
	height:300px;
	float:left;
	background-color:#819FF7;
	text-align:left;
}
#div_con{
	width:80%;
	height:300px;
	float:left;
	text-align:center;
}
#div_bottom{
	width:100%;
	height:100px;
	clear:both;
	background-color:#C8FE2E;
	text-align:center;
}
</style>

</head>
<body>
<div id="div_root"></div>
<div id="div_top">메인메뉴</div>
<div id="div_menu">사이드 메뉴</div>
<div id="div_con">내용</div>
<div id="div_bottom">마무리</div>
</body>
</html>