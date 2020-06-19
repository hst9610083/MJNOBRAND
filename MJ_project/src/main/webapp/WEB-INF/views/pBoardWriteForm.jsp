<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>
	<div id="container">
		<form class="form-horizontal" action="./pBoardWrite.do" method="post">
			<div>
				<label class="control-label col-sm-2" for="id">작성자:</label>
					<input type="text" class="form-control" value='${mem.id}'  id="id" name="id" readonly="readonly">
			</div>
			<div>
				<label class="control-label col-sm-2" for="title">제목</label>
					<input type="text" class="form-control" id="title" name="title" placeholder="Enter title" name="title">
			</div>
			<div>
				<label class="control-label col-sm-2" for="content">내용</label>
					<textarea id="content" name="content"></textarea>
					<script type="text/javascript">
						CKEDITOR.replace('content', { 
							height : 500 -->
						}); 
						//                          CKEDITOR.instances.content.setData($("#con").val());
					</script> 
			</div>
			<div>
				<div>
					<input class="btn btn-success" type="submit" value="글등록"> 
					<input class="btn btn-default" type="button" value="목록 이동" onclick="">
				</div>
			</div>
		</form>
	</div>
</body>
</html>