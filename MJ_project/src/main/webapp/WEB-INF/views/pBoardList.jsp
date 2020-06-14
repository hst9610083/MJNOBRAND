<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.min.mj.dtos.MJ_BoardDTO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홍보게시판</title>
</head>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>
	<div id="container">
		<h1>게시판 영역</h1>
		${lists}
		<form action="./pBoardList.do" method="get" id="lists" name="lists">
			<table class="table table-bordered">
				<tr>
					<th>SEQ</th>
					<th>ID</th>
					<th>NICNAME</th>
					<th>TITLE</th>
					<th>CONTENT</th>
					<th>READCOUNT</th>
					<th>REGDATE</th>
				</tr>
				<c:forEach items="${lists}" var="dto">
					<tr>
						<td>${dto.seq}</td>
						<td>${dto.id}</td>
						<td>${dto.nicname}</td>
						<td>${dto.title}</td>
						<td>${dto.content}</td>
						<td>${dto.readcount}</td>
						<td>${dto.regdate}</td>
					</tr>
				</c:forEach>
			</table>
			<div>
				<input class="btn btn-danger" type="submit" value="삭제">
			</div>
		</form>
	</div>
	<div id="modify" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">게시글 수정</h4>
				</div>
				<div class="modal-body">
					<!-- ajax를 통해서 수정하고 넘길 데이터를 표출해줌 -->
					<form action="#" method="post" id="frmModify"></form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>