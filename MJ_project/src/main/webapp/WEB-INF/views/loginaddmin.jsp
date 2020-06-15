<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지</title>
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
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

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
					<li><a href="">회원 관리 게시판</a></li>
					<li><a href="">?</a></li>
					<li><a href="">!</a></li>
				</ul>

			</nav>
			<nav>
				<div class="util">
					<ul>
						<li><a href="./userInfo.do"> <img
								src="images/main/mypage_icon.png" alt=""> ${mDto.id}님
								환영합니다.
						</a></li>
						<li><a href="./logout.do"> <span
								class="glyphicon glyphicon-log-out"></span> Logout
						</a></li>

					</ul>
				</div>
			</nav>
		</div>
	</header>

	<!--main_visial-->
	<div>
	
		<table class="table table-bordered">

			<tr>
				<th>연번</th>
				<th>아이디</th>
				<th>이름</th>
				<th>권한</th>
			</tr>
			<c:forEach items="${memlists}" var="dto">
				<tr>
					<td>${dto.seq}</td>
					<td>${dto.id}</td>
					<td>${dto.name}</td>
					<td>${dto.auth}</td>
					
				</tr>
			</c:forEach>
		</table>

	</div>

	<!-- 하단 시작 -->
	<footer class="footer">
		<div class="is-frame-md is-relative">
			<div class="is-area-top">
				<ul>
					<li class=""><a href="#">회사소개</a></li>
					<li class=""><a href="#">이용약관</a></li>
					<li class=""><a href="#">개인정보 처리방침</a></li>
					<li class=""><a href="#">위치기반</a></li>
					<li class=""><a href="#">중개사 사이트 바로가기</a></li>
				</ul>
			</div>
			<div class="is-area-mid">
				<p>
					<span>상호: </span><span>대표: </span><span>사업자등록번호: </span>
				</p>
				<p>
					<span>주소: </span>
				</p>
				<p>
					<span>팩스: </span><span>통신판매업 신고번호: </span>
				</p>
				<p>
					<span>서비스 이용문의: </span><span>이메일: </span><span>서비스제휴문의: </span>
				</p>
			</div>
			
			<div class="is-area-bot">
				<!-- 아이콘 필요 -->
				<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
				<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
				<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
				<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
				<p class="is-copyright">Copyright .All Rights Reserved.</p>
			</div>
		</div>
	</footer>
	<!-- 하단 끝 -->
</body>
</html>