<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>
<%@include file="/WEB-INF/views/boardTopMenu.jsp" %>
<div id="container">
<h1>홍보글 상세보기</h1>
	<table class="table table-bordered">
		 	<tr>
		 		<th>SEQ</th>
		 		<th>ID</th>
		 		<th>TITLE</th>
		 		<th>CONTENT</th>
		 		<th>REGDATE</th>
		 	</tr>
		 	<tr>
		 	<td>${bDto.seq}</td>
		 	<td>${bDto.id}</td>
		 	<td>${bDto.title}</td>
		 	<td>${bDto.content}</td>
		 	<td>${bDto.regdate}</td>
		 	</tr>
	</table>
</div>
</body>
</html>