<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소비자 문의 게시판</title>
</head>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>

	<div id="container">
		<h1>소비자 문의 게시판</h1>



		<form action="./ConInquiryBoard.do" method="get">
			<table class="table table-bordered">
				<tr>
					<th>번호</th>
					<th>닉네임</th>
					<th>제목</th>
					<th>날짜</th>				
				</tr>
				<c:forEach items="${lists}" var="dto">
					<tr>
						<td><a href="ConInquiryBoard.do"> ${dto.seq}</a></td>
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