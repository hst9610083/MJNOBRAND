<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
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
<script type="text/javascript"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

      <form action="./del.do"  >
			<table class="table table-bordered">

				<tr>
					<th>연번</th>
					<th>아이디</th>
					<th>이름</th>
					<th>권한</th>
				</tr>
				<c:forEach items="${memlists}" var="dto">
					<tr>
						<td>${mDto.seq}</td>
						<td>${mDto.id}</td>
						<td>${mDto.name}</td>
						<td>${mDto.auth}</td>
						<td><input type="submit" placeholder="회원탈퇴" value="회원탈퇴"
                              style="border-color: #777676;" onclick="del(${dto.seq})" > </td>
					</tr>
				</c:forEach>
				
			</table>
		
		</form>

  </tbody>
  </table>
</div>
</body>
</html>