<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성</title>
</head>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<body>
	<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>
	<div id="container">
		<form class="form-horizontal" action="./pBoardWrite.do" method="post" enctype="multipart/form-data">
			<div>
				<label class="control-label col-sm-2" for="id">작성자:</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" value='${mem.id}' name="id"
						readonly="readonly">
				</div>
			</div>
			<!-- 	<div class="form-group"> -->
			<!--       <label class="control-label col-sm-2" for="nicname">닉네임</label> -->
			<!--       <div class="col-sm-5">           -->
			<%--         <input type="text" class="form-control" id="nicname" name="nicname" value='${mem.nicname}'> --%>
			<!--       </div> -->
			<!--     </div> -->
			<div>
				<label class="control-label col-sm-2" for="title">제목</label>
				<div class="col-sm-5">
					<input type="text" class="form-control" id="title" placeholder="Enter title" name="title">
				</div>
			</div>

			<div>
				<label class="control-label col-sm-2" for="content">내용</label>
				<div class="col-sm-10">
					        <textarea rows="5" id="content" name="content" placeholder="Enter Content"></textarea>
<!-- 					<textarea id="content" name="content"></textarea> -->
<!-- 					<script type="text/javascript"> -->
<!-- // 						CKEDITOR.replace('content', { -->
<!-- // 							height : 500 -->
<!-- // 						}); -->

<!-- // 						//                          CKEDITOR.instances.content.setData($("#con").val()); -->
<!-- 					</script> -->
				</div>
			</div>
			<div>
				<div>
					<input class="btn btn-success" id="uploadFile" type="file" name="uploadFile" multiple="multiple" value="파일등록">
					<input class="btn btn-success" type="submit" value="글등록"> 
					<input class="btn btn-default" type="button" value="목록 이동" onclick="">
				</div>
			</div>
		</form>
	</div>
</body>
</html>