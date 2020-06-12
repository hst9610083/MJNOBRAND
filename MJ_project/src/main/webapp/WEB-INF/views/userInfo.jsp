<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
</head>
<body>
<%@ include file="/WEB-INF/views/boardTopMenu.jsp" %>
<div id="container" class="table-responsive">
<table class="table">
<tbody>
      <tr>
        <th rowspan="6">
           <img alt="프로필사진" src="./resource/profileImg/${infoDto.profileimg}"
              style="width: 100%;" height="auto;">
        </th>
        <th>아이디</th>
        <td>${infoDto.id}</td>
      </tr>
      <tr>
         <th>성명</th>
        <td>${infoDto.name}</td>
      </tr>
      <tr>
        <td>권한</td>
        <td>${infoDto.auth eq 'U'?'사용자':'관리자'}</td>
      </tr>
      <tr>
        <td>가입일</td>
        <td>${infoDto.regdate}</td>
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