<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<script type="text/javascript" src="./js/pBoardList.js"></script>
<body>
<%@include file="/WEB-INF/views/boardTopMenu.jsp" %>
<div id="container">
<h1>홍보글 상세보기</h1>
	<div id="container">
	<form action="./pBoardDetail.do" method="get">
		<table>		
			<tr>
				<th>순번</th>
				<td>${lists.seq}</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>${lists.id}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${lists.title}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
				<textarea rows="5" cols="50" readonly="readonly">${lists.content}</textarea>
				</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${lists.regdate}</td> 
			</tr>
		</table>
		</form>
		<!-- javascript를 통한 form 전송 -->
		<c:if test="${mem.id eq lists.id}">
			<input type="button" name="btn" id="modify" value="수정" class="btn btn-warning" onclick="modify('${lists.seq}')">
			<input type="button" name="btn" id="DeleteBoard" value="삭제" class="btn btn-warning" onclick="del('${lists.seq}')">
		</c:if>
	</div>
</div>
</body>
</html>