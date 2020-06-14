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
					<th>순서</th>
					<th>아이디</th>
					<th>날짜</th>
					<th>제목</th>
					<th>내용</th>
					<th>파일이름</th>
					<th>권한</th>
				</tr>
					<tr>
						<td>${lists.seq}</td>
						<td>${lists.id}</td>
						<td>${lists.regdate}</td>
						<td>${lists.title}</td>
						<td>${lists.content}</td>
						<td>${lists.realfile}</td>
						<td>${lists.auth}</td>
					</tr>
			</table>
		</form>
	</div>





</body>
</html>