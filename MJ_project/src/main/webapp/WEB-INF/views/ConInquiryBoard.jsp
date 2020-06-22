<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업체로그인 후 페이지</title>
</head>
<link rel="stylesheet" href="css/uc.min.css">
<link rel="stylesheet" href="css/basic.css">
<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/slick-theme.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/layout.css">
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/uc.lib.min.js"></script>
<script src="js/uc.plugin.min.js"></script>
<script src="js/slick.min.js"></script>
<script src="js/common.js"></script>
<body>
	<ul class="nav navbar-nav navbar-right">

		<li></li>
	</ul>
	<!--header-->
	<header id="header">
		<div class="header_wrap">
			<h1>
				<a href="./index.html"><img src="images/main/logo.png" alt=""></a>
			</h1>
			
			<nav id="gnb">
				<ul>
					<li><a href="./ConInquiryBoard.do">소비자 문의 게시판</a></li>
					<li><a href="./pBoardList.do">홍보게시판</a></li>
					<li><a href="">견적서 마이페이지</a></li>
				</ul>
<!-- ㄴㄴ -->
			</nav>
			<nav >
				<div class="util">
					<ul>
						<li><a href="./userInfo.do">
							<img src="images/main/mypage_icon.png" alt=""> ${mDto.id}님 환영합니다.</a></li>
						<li><a href="./logout.do"> <span class="glyphicon glyphicon-log-out"></span> Logout	</a></li>

					</ul>
				</div>
			</nav>
		</div>
	</header>





	<div id="container">
		<h1>소비자 문의 게시판</h1>
		<form action="#" method="post"> <!-- ./ConInquiryBoard.do -->
			<table class="table table-bordered">
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>닉네임</th>
					<th>제목</th>
					<th>날짜</th>				
				</tr>
				<c:forEach items="${lists}" var="dto">
					<tr>
						<td>${dto.seq}</td>
						<td><a href="./s_EstiInputm.do?id=${dto.id}">${dto.id}</a></td>
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

