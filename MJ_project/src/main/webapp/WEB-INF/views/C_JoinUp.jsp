<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소비자 회원가입</title>
</head>
<body>
<form action="./C_JoinUp.do" method="post">
아이디 : <input type="text" name="id"><br>
비밀번호 :<input type="text" name="pw"><br>
이름 : <input type="text" name="name"><br>
주소 : <input type="text" name="address"><br>
별명 : <input type="text" name="nicname"><br>
생년월일 :<input type="text" name="birth"><br>
핸드폰번호 : <input type="text" name="phonnum"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>