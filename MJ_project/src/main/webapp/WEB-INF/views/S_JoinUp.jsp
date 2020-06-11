<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form action="./S_JoinUp.do" method="post">
사업자 등록증 이미지 : <input type="text" name="selpick"><br>
아이디 : <input type="text" name="id"><br>
비밀번호 :<input type="text" name="pw"><br>
이름 : <input type="text" name="name"><br>
주소 : <input type="text" name="address"><br>
별명 : <input type="text" name="nicname"><br>
사업자 번호 :<input type="text" name="sellernum"><br>
이메일 : <input type="text" name="email"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>