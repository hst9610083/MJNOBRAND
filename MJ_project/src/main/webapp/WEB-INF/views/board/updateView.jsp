<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
   <head>
      <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
       <title>문의글 임시게시판</title>
   </head>
   <link rel="stylesheet" href="/css/uc.min.css">
<link rel="stylesheet" href="/css/basic.css">
<link rel="stylesheet" href="/css/slick.css">
<link rel="stylesheet" href="/css/slick-theme.css">
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/css/layout.css">
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
               <li><a href="../c_EstiList.do">견적서 리스트</a></li>
               <li><a href="">소비자 문의 게시판</a></li>
               <li><a href="../pBoardList.do">홍보게시판</a></li>
               <li><a href="../iBoardList.do">문의글 마이페이지</a></li>
            </ul>
<!-- ㄴㄴ -->
         </nav>
         <nav >
            <div class="util">
               <ul>
                  <li><a href="./userInfo.do">
                     <img src="images/main/mypage_icon.png" alt=""> ${mDto.id}님 환영합니다.</a></li>
                  <li><a href="../logout.do"> <span class="glyphicon glyphicon-log-out"></span> Logout   </a></li>

               </ul>
            </div>
         </nav>
      </div>
   </header>
   <script type="text/javascript">
      $(document).ready(function(){
         
         $(".cancel_btn").on("click", function(){
            event.preventDefault();
            location.href = "/board/list.do";
         })
      })
      
      $(document).ready(function(){
         var formObj = $("form[name='updateForm']");
         
         $(".cancel_btn").on("click", function(){
            event.preventDefault();
            location.href = "/board/list.do";
         })
         
         $(".update_btn").on("click", function(){
            if(fn_valiChk()){
               return false;
            }
            formObj.attr("action", "/board/update.do");
            formObj.attr("method", "post");
            formObj.submit();
         })
      })
         
      function fn_valiChk(){
         var updateForm = $("form[name='updateForm'] .chk").length;
         for(var i = 0; i<updateForm; i++){
            if($(".chk").eq(i).val() == "" || $(".chk").eq(i).val() == null){
               alert($(".chk").eq(i).attr("title"));
               return true;
            }
         }
      }
   
   </script>
   <body>
   
      <div id="root">
         <header>
            <h1>문의글 임시 게시판</h1>
         </header>
         <hr />
          
         <div>
            <%@include file="nav.jsp" %>
         </div>
         <hr />
         
         <section id="container">
            <form name="updateForm" role="form" method="post" action="/board/update.do">
               <input type="hidden" name="seq" value="${update.seq}" readonly="readonly"/>
               <table>
                  <tbody>
                     <tr>
                        <td>
                           <label for="title">제목</label><input type="text" id="title" name="title" value="${update.title}"/>
                        </td>
                     </tr>   
                     <tr>
                        <td>
                           <label for="content">내용</label><textarea id="content" name="content"><c:out value="${update.content}" /></textarea>
                        </td>
                     </tr>
                     <tr>
                        <td>
                           <label for="writer">작성자</label><input type="text" id="writer" name="writer" value="${update.nicname}" readonly="readonly"/>
                        </td>
                     </tr>
                     <tr>
                        <td>
                           <label for="regdate">작성날짜</label>
                           <fmt:formatDate value="${update.regdate}" pattern="yyyy-MM-dd"/>               
                        </td>
                     </tr>      
                  </tbody>         
               </table>
               <div>
                  <button type="submit" class="update_btn">저장</button>
                  <button type="submit" class="cancel_btn">취소</button>
               </div>
            </form>
         </section>
         <hr />
      </div>
   </body>
</html>