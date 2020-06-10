<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form action="./singUpSc.do" method="post">
사업자 등록증 이미지 : <input type="text" name="selpick">
아이디 : <input type="text" name="id">
비밀번호 :<input type="text" name="pw">
이름 : <input type="text" name="name">
주소 : <input type="text" name="address">
별명 : <input type="text" name="nicname">
사업자 번호 :<input type="text" name="sellernum">
이메일 : <input type="text" name="email">
종류? : <input type="text" name="email">
<input type="submit" value="회원가입">
</form>
</body>
</html>