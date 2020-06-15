<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문의글 상세보기 리스트</title>
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
					<li><a href="">소비자 문의 게시판</a></li>
					<li><a href="./pBoardList.do">홍보게시판</a></li>
					<li><a href="./iBoardList.do">문의글 마이페이지</a></li>
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
	 


<body>





		<div id="container">
		<h1> 문의글 상세보기</h1>
		


			<table class="table table-bordered">
				<tr>

					<th>ID</th>
					<th>닉네임</th>
					<th>제목</th>
					<th>내용</th>
					<th>파일</th>
					<th>날짜</th>
				</tr>
			
					<tr>

						<td>${lists.id}</td>
						<td>${lists.nicname}</td>
						<td>${lists.title}</td>
						<td>${lists.content}</td>
						<td>${lists.realfile}</td>
						<td>${lists.regdate}</td>
						
					</tr>
			</table>
			<div>
			</div>			
	</div>

<div>
    <form id="viewForm" name="viewForm" method="post">
        <div>
            <h2>수정하기</h2>
            <div>
                <table>
                    <tr>
                        <th>제목</th>
                        <td><input style="width: 500px" type="text" id="title" name="title" value="${lists.title }"/></td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td><textarea style="width: 500px" rows="10" cols="10" id="content" name="content"><c:out value="${lists.content }"/></textarea></td>
                    </tr>
<!--                     <tr> -->
<!--                         <th>작성자</th> -->
<%--                         <td><input style="width: 500px" type="text" id="writer" name="writer" value="${result.writer }"/></td> --%>
<!--                     </tr> -->
                </table>
                <div>
                    <a href='./iBoardListModify.do' onClick='fn_update()'>수정</a>
                    <a href='./iBoardList.do' onClick='fn_cancel()'>목록</a>
                    <a href='./iBoardList.do' onClick='fn_delete()'>삭제</a>                    
                </div>
            </div>
        </div>
        <input type='hidden' id='code' name='code' value='${result.code }' />
    </form>
<script>
//목록
function fn_cancel(){
    
    var form = document.getElementById("viewForm");
    
    form.action = "<c:url value='/iBoardList.do'/>";
    form.submit();
    
}
 
//수정
function fn_update(){
    
    var form = document.getElementById("viewForm");
    
    form.action = "<c:url value='/iBoardListModify.do'/>";
    form.submit();
}
 
//삭제
function fn_delete(){
    
    var form = document.getElementById("viewForm");
    
    form.action = "<c:url value='/iBoardList.do'/>";
    form.submit();
    
}
</script>
</div>





</body>
</html>