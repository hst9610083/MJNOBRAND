<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소비자 문의 게시판 상세보기</title>
</head>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>

	<div id="container">
		<h1>소비자 문의 게시판 상세보기</h1>



		<form action="./ConInquiryBoardDetail.do" method="get">
			<table class="table table-bordered">
				<tr>
					<th>번호</th>
					<th>닉네임</th>
					<th>제목</th>
					<th>날짜</th>				
				</tr>
					<tr>
						<td>${lists.seq}</td>
						<td>${lists.nicname}</td>
						<td>${lists.title}</td>
						<td>${lists.regdate}</td>					
					</tr>
			</table>
		</form>
	</div>
</body>
</html>