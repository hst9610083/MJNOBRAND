<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정하기</title>
</head>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="./js/pBoardList.js"></script>
<body>
	<div>
		<div id="container">
			<%@include file="/WEB-INF/views/boardTopMenu.jsp"%>
			<form action="./pModify.do" method="post" id="modi">
				<input type="hidden" id="seq" name="seq" value="${lists.seq}">
				<table>
					<tr>
						<th>아이디</th>
						<td><input type="text" id="id" name="id" value="${lists.id}">
						</td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" id="title" name="title"
							value="${lists.title}"></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea id="content" name="content">${lists.content}</textarea>
							<script type="text/javascript">
								CKEDITOR.replace('content', {
									height : 500
								});

								//                          CKEDITOR.instances.content.setData($("#con").val());
							</script></td>
					</tr>

				</table>
				<input class="btn btn-warning" type="button" value="수정완료"
					onclick="update()"> <input class="btn btn-warning"
					type="reset" value="내용 초기화">
			</form>
		</div>
	</div>
</body>
</html>