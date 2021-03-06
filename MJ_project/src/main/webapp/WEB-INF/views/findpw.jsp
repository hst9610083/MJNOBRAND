<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기 화면</title>
</head>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<body>
<div class="password_container">
	<form class="form-horizontal" role="form" method="POST">
		<div class="form">
			<div class="row">
			<div class="col-md-12 h2m">
					<h2>비밀번호 찾기</h2>
					<h6>회원가입 시 사용한 비밀번호는 <strong>${fn:substring(pw, 0, 4)}
					<c:forEach begin="1" end="${fn:length(pw)-4}">
							*
					</c:forEach>
					</strong>입니다.</h6>
			</div>
		</div>
		</div>
		<div class="row">
			<div class="col-md-10 inputbb">
					<!-- <a type="submit" class="btn loginbtn" href="starters?cmd=login">로그인 화면으로 돌아가기</a> -->
		                    <button type="button" class="btn btn-outline-secondary loginbtn" onclick = "backToLogin()">로그인 화면으로 돌아가기</button>
			</div>
		</div>
	</form>
</div>
</body>
</html>