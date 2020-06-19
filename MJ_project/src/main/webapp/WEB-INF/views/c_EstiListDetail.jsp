<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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


<script type="text/javascript">

$(document).ready(function(){
	
	var formObj = $("form[name='readForm']");
//삭제
$(".delete_btn").on("click", function(){	
	var deleteYN = confirm("삭제하시겠습니까?");
	if(deleteYN == true){			
	formObj.attr("action", "./c_EstiListDelete.do");
	formObj.attr("method", "post");
	formObj.submit();
	
	}
})
// 취소
$(".list_btn").on("click", function(){
	location.href = "./c_EstiList.do";
	})
})


</script>

<body>
	
	
	
	<header id="header">
		<div class="header_wrap">
			<h1>
				<a href="./index.html"><img src="images/main/logo.png" alt=""></a>
			</h1>
			
			<nav id="gnb">
				<ul>
					<li><a href="./c_EstiList.do">견적서 리스트</a></li>
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
	
	
<div id="container">


	
		<h1>견적서 리스트 상세보기</h1>
		
			<table class="table table-bordered">
				<tr>
					<th>ID</th>
					<th>제목</th>
					<th>내용</th>
					<th>파일</th>
					<th>날짜</th>
				</tr>
			
					<tr>
						<td>${lists.id}</td>
						<td>${lists.title}</td>
						<td>${lists.content}</td>
						<td>${lists.realfile}</td>
						<td>${lists.regdate}</td>				
					</tr>
			</table>
			
			<section id="container">
				<form name="readForm" role="form" method="post">
					<input type="hidden" id="seq" name="seq" value="${lists.seq}" />
					<input type="hidden" id="id" name="id" value="${lists.id}" />
					<input type="hidden" id="title" name="title" value="${lists.title}" />
<%-- 					<input type="hidden" id="content" name="content" value="${lists.regdate}" /> --%>
<%-- 					<input type="hidden" id="content" name="content" value="${lists.imsi}" /> --%>
<%-- 					<input type="hidden" id="content" name="content" value="${lists.realfile}" /> --%>
				</form>
			</section>
			<div>
			<div>
			
<!-- 				<button type="submit" class="update_btn">수정</button> -->
					<button type="submit" class="delete_btn">삭제</button>
					<button type="submit" class="list_btn">목록으로 돌아가기</button>	
				</div>
			</div>			
	</div>

</body>
</html>