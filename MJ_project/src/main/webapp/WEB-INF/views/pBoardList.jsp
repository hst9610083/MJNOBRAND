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
<script type="text/javascript" src="./js/pBoardList.js"></script>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>
	<div id="container">
		<h1>게시판 영역</h1>
		<div id="select">
			<span> 
			<select class="btn btn-primary" id="list" name="list"
				onchange="pageList()">
					<option value="5">5</option>
					<option value="10">10</option>
					<option value="15">15</option>
					<option value="20">20</option>
			</select>
			</span>
		</div>
		<form action="#" method="post" id="frm" name="frm"
			onsubmit="return chkbox()">
			<div class="panel-group" id="accordion">
				<table class="table table-bordered">
					<tr>
						<th><input type="checkbox" onclick="checkAll(this.checked)"></th>
						<th>글번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<c:if test="${mem.auth eq 'A'}">
							<th>삭제여부</th>
						</c:if>
						<th>작성일</th>
					</tr>
					<jsp:useBean id="format" class="com.min.mj.bean.InputList" scope="page" />
					<jsp:setProperty property="lists" name="format" value="${lists}" />
					<jsp:setProperty property="mem" name="format" value="${mem}" />
					<jsp:getProperty property="listForm" name="format" />
				</table>
			</div>
			<input type="text" name="index" id="index" value="${row.index}">
			<input type="text" name="pageNum" id="pageNum" value="${row.pageNum}">
			<input type="text" name="listNum" id="listNum" value="${row.listNum}">
			<script type="text/javascript">
				var listNum = document.getElementById("listNum").value;
				var list = document.getElementById("list");
// 				alert(list.options[listNum/5-1].selected = 'selected');
			</script>

			<div class="center">
				<ul class="pagination">
					<li><a href="#" onclick="pageFirst()">&laquo;</a></li>
					<li><a href="#" onclick="pagePre(${row.pageNum},${row.pageList})">&lsaquo;</a></li>
					<c:forEach var='i' begin="${row.pageNum}" end="${row.count}"
						step="1">
						<li><a href="#" onclick="pageIndex(${i})">${i}</a></li>
					</c:forEach>
					<li><a href="#" onclick="pageNext(${row.pageNum},${row.total},${row.listNum},${row.pageList})">&rsaquo;</a></li>
					<li><a href="#" onclick="pageLast(${row.pageNum},${row.total},${row.listNum},${row.pageList})">&raquo;</a></li>
				</ul>
			</div>

			<div>
				<input class="btn btn-danger" type="submit" value="삭제">
			</div>
		</form>

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
	</div>

</body>
</html>