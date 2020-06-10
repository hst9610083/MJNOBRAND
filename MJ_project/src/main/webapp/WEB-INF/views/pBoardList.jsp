<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>
	<form action="./pBoardList.do" method="post">
		<div id="container">
			<h1>게시판 영역</h1>
			<input type="hidden" name="command" value="boardMultiDel">
			<table>
				<tr>
					<th><input type="checkbox" onclick="checkAll(this.checked)"></th>
					<th>SEQ</th>
					<th>ID</th>
					<th>NICNAME</th>
					<th>TITLE</th>
					<th>CONTENT</th>
					<th>READCOUNT</th>
					<th>REGDATE</th>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>