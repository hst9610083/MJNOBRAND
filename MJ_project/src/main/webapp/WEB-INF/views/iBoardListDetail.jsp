<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문의글 상세보기 리스트</title>
</head>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>

		<div id="container">
		<h1>문의글 임시보기 리스트</h1>
<!-- 		<input id="lists"> -->
		<form action="./iBoardListDetail.do" method="get">
			<table class="table table-bordered">
				<tr>
<!-- 					<th><input type="checkbox" onclick="checkAll(this.checked)"></th> -->
					<th>번호</th>
					<th>ID</th>
					<th>닉네임</th>
					<th>제목</th>
					<th>내용</th>
					<th>파일</th>
					<th>날짜</th>
				</tr>
				<c:forEach items="${lists}" var="dto">
					<tr>
						<td>${dto.seq}</td>
						<td>${dto.id}</td>
						<td>${dto.nicname}</td>
						<td>${dto.title}</td>
						<td>${dto.content}</td>
						<td>${dto.file}</td>
						<td>${dto.regdate}</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>

</body>
</html>