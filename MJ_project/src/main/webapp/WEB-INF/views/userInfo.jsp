<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
</head>
<body>
<div id="container" class="table-responsive">
<table class="table">
<tbody>
      <tr>
        <th>아이디</th>
        <td>${mDto.id}</td>
      </tr>
      <tr>
         <th>성명</th>
        <td>${mDto.name}</td>
      </tr>
      <tr>
        <td>권한</td>
        <td>${mDto.auth eq 'ROLE_C    '?'업체':'소비자'}</td>
      </tr>
      <tr>
        <td>가입일</td>
        <td>${mDto.regdate}</td>
      </tr>
      <tr>
        <td colspan="2">
           <button class="btn btn-warning">탈퇴</button>
           <button class="btn btn-info">수정</button>
        </td>
      </tr>
  </tbody>
  </table>
</div>
</body>
</html>