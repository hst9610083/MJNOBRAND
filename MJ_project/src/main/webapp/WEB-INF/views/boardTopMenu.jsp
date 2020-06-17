<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!-- <link type="text/css" rel="stylesheet" href="./css/bootstrap.css"> -->
<!-- <link type="text/css" rel="stylesheet" href="./css/bootstrap-theme.css"> -->
<!-- <link type="text/css" rel="stylesheet" href="./css/sweetalert.css"> -->

<!-- <script type="text/javascript" src="./js/jquery-3.5.1.js"></script> -->
<!-- <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->
<!-- <script type="text/javascript" src="./js/bootstrap.js"></script> -->
<!-- <script type="text/javascript" src="./js/sweetalert.min.js"></script> -->

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="./css/bootstrap-theme.css">
<link type="text/css" rel="stylesheet" href="./css/sweetalert.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-sweetalert/1.0.1/sweetalert.min.js"></script>
<<script type="text/javascript" src="./js/pBoardList.js"></script>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="./pBoardList.do">
<!--       <img style="width:30px; height:30px;" src="./img/naver.png"> -->
      </a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      <li><a href="./pBoardList.do">게시판</a></li>
<%--       <c:if test="${fn:trim(mem.auth) eq 'U'}"> --%>
      	<li><a href="./writeForm.do">글작성</a></li>
<%--       </c:if> --%>
<%--       <c:if test="${fn:trim(mem.auth) eq 'A'}"> --%>
      	<li><a href="./memberListMAV.do">무엇을넣을까?</a></li>	
<%--       </c:if> --%>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="./userInfo.do"><span class="glyphicon glyphicon-user"></span> 
<%--         	${mem.name}님 환영합니다.(${mem.auth eq 'U'?'일반':'관리자'}) --%>
        	</a></li>
        <li><a href="./logout.do"><span class="glyphicon glyphicon-log-in"></span> 로그아웃</a></li>
      </ul>
    </div>
  </div>
</nav>