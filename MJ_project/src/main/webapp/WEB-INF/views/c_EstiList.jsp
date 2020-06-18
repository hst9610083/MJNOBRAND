<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>견적서 리스트</title>
</head>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>

	<div id="container">
		<h1>견적서 리스트</h1>
<!-- 		<input id="lists"> -->
		<form action="./c_EstiList.do" method="get">
			<table class="table table-bordered">
				<tr>
<!-- 					<th><input type="checkbox" onclick="checkAll(this.checked)"></th> -->
					<th><a href="./WEB-INF/views/c_EstiList_detail.jsp">번호</a></th>
<!-- 					<th>ID</th> -->
					<th>닉네임</th>
					<th>제목</th>
					<th>날짜</th>
				</tr>
				<c:forEach items="${lists}" var="dto">
					<tr>
						<td>${dto.seq}</td>
						<td>${lists.id}</td>
						<td>${lists.regdate}</td>
						<td>${lists.title}</td>
						<td>${lists.content}</td>
						<td>${lists.realfile}</td>
					</tr>
					</c:forEach>
			</table>
		</form>
	</div>





</body>
</html>