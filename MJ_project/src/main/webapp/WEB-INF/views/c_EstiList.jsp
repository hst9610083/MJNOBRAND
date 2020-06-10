<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>견적서 쓰기</title>
</head>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>

	<div id="container">
		<h1>견적서 쓰기</h1>
<!-- 		<input id="lists"> -->
		<form action="./c_EstiList.do" method="get">
			<table class="table table-bordered">
				<tr>
<!-- 					<th><input type="checkbox" onclick="checkAll(this.checked)"></th> -->
					<th>번호</th>
<!-- 					<th>ID</th> -->
					<th>닉네임</th>
					<th>제목</th>
					<th>날짜</th>
				</tr>
				<c:forEach items="${lists}" var="dto">
					<tr>
						<td>${dto.seq}</td>
<%-- 						<td>${dto.id}</td> --%>
						<td>${dto.nicname}</td>
						<td>${dto.title}</td>
						<td>${dto.regdate}</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>





</body>
</html>