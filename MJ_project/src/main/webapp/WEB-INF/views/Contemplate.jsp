<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>소비자 문의 게시판</title>
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
					<li><a href="./Contemplate.do">소비자 문의 게시판</a></li>
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


	<div class="content_wrap">

		<div style="background-image: url(images/sub_2_2/2.jpg); background-position: center center; height: 170px;">
			<div class="is-frame-md is-relative" style="height: 100%;">
				<b class="title"><h3>방 올리기</b>

				<ul class="is-tab-nav columns-xs3" style="position: absolute; bottom: 0; left: 0; width: 100%;">
					<li class="is-col is-align-mid is-txt-left is-active">
						</li>
				</ul>
			</div>
		</div>
		<div class="is-frame-md">

			<form name="" method="" action="" data-uc-form="">
				

				
				<script>
					$(document).on('click', '.form-added-btn', function () {
						var markup = '';


						markup = '<tr>';
						markup += '<td>';
						markup += '<div class="is-input-field use-addon">';
						markup += '<input type="text" name="" value="">';
						markup += '<span class="is-addon--back-default">인실</span></div>';
						markup += '</td>';
						markup += '<td>';
						markup += '<div class="is-input-field use-addon">';
						markup += '<input type="text" name="" value="">';
						markup += '<span class="is-addon--back-default">m²</span></div>';
						markup += '</td>';
						markup += '<td>';
						markup += '<div class="is-input-field use-addon">';
						markup += '<input type="text" name="" value="">';
						markup += '<span class="is-addon--center-default">/</span>';
						markup += '<input type="text" name="" value=""></div>';
						markup += '</td>';
						markup += '<td>';
						markup += '<div class="is-input-field use-addon">';
						markup += '<input type="text" name="" value="">';
						markup += '<span class="is-addon--center-default">/</span>';
						markup += '<input type="text" name="" value=""></div>';
						markup += '</td>';
						markup += '<td>';
						markup += '<div class="is-input-field">';
						markup += '<input type="text" name="" value="" class="datepicker">';
						markup += '</div>';
						markup += '</td>';
						markup += '<td class="no-padding">';
						markup +=
							'<a href="javascript: void(0);" class="form-added-btn"><img src="images/sub_2_2/plus.png" alt="" /></a>';
						markup += '</td>';
						markup += '</tr>';

						$('#form-added').append(markup);

						$(".datepicker").datepicker({
							dateFormat: 'yy-dd-mm'
						});
					});

					$(".datepicker").datepicker({
						dateFormat: 'yy-mm-dd'
					});
				</script>
				

				<div data-uc-table="sub2_2">
					<h3>상세 설명</h3>
					<table class="is-table-ver">
						<colgroup>
							<col width="20%">
							<col width="80%">
						</colgroup>
						<tbody><tr>
							<th>제목</th>
							<td class="is-input-field">
								<input type="text" name="" value="" maxlength="50">
							</td>
						</tr>
						<tr>
							<th>내용</th>
							<td class="is-input-field">
								<textarea id="" name="" maxlength="3600"></textarea>
							</td>
						</tr>
					</tbody></table>
				</div>

				<div data-uc-table="sub2_2">
					<h3>사진 등록</h3>
					<table class="is-table-ver">
						<colgroup>
							<col width="100%">
						</colgroup>
						<tbody><tr>
							<td>
								<div class="file-up-txt">
									<div class="inner">
										<p>
											<span>-</span>사진은 가로로 찍은 사진을 권장합니다.(가로 사이즈 최소 800px)
										</p>
										<p>
											<span>-</span>사진 용량은 사진 한장당 10MB까지 등록이 가능합니다.
										</p>
										<p>
											<span>-</span>사진은 최소 전개도 사진 1장, 방 사진 3장 이상 등록하여야 하며 최대 15장까지 권장합니다.
											그 이상 등록할 경우 업로드 시간이 다소 지연될 수 있습니다.
										</p>
									</div>
								</div>
								<div class="is-txt-center gallery is-clearfix">
									<img src="images/sub_2_2/fileupload.png" alt="" style="width: 100%;">
								</div>
								<div class="is-txt-center">
									<input type="file" id="gallery-photo-add" multiple="" style="display: none;">
									<label for="gallery-photo-add"><img src="images/sub_2_2/btn4.png" alt=""></label>
								</div>
							</td>
						</tr>
					</tbody>
					</table>
				</div>
				<script>
					$(function () {
						// Multiple images preview in browser
						var imagesPreview = function (input, placeToInsertImagePreview) {
							$('.gallery').html('');
							if (input.files) {
								var filesAmount = input.files.length;

								for (i = 0; i < filesAmount; i++) {
									var reader = new FileReader();

									reader.onload = function (event) {
										$($.parseHTML('<img>')).attr('src', event.target.result).appendTo(
											placeToInsertImagePreview);
									}

									reader.readAsDataURL(input.files[i]);
								}
							}

						};

						$('#gallery-photo-add').on('change', function () {
							imagesPreview(this, 'div.gallery');
						});
					});
				</script>
				<div class="clearfix"></div>
				<div data-uc-table="sub2_2" style="margin-top:-40px;border:none;">
					<table class="is-table-ver" style="border:none !important;">
						<colgroup>
							<col width="100%">
						</colgroup>
						<tbody><tr style="border:none;">
							<td style="float:right;border:none">
								<a href="#fakePropertyModal" data-uc-click="modal">허위매물 제재 정책 확인하기</a>
							</td>
						</tr>
						<tr>
							<td class="is-txt-center" style="border:none;">
								<div class="is-input-field is-mg-t_10">
									<label for="accept_terms" class="is-chk-lab"><input type="checkbox" id="accept_terms" name="accept_terms" value="">
										<span style="vertical-align: middle"></span>매물관리규정을 확인하였으며, 입력한 정보는 실제 매물과 다름이 없습니다.
									</label>
								</div>
							</td>
						</tr>
						<tr style="border:none;border:none">
							<td style="text-align:center;">
								<div style="display:inline-flex">
									<a href="javascript:void(0);"><img src="images/sub_2_2/btn2.png" alt=""></a>
									<a href="javascript:void(0);"><img src="images/sub_2_2/btn3.png" alt=""></a>
								</div>
							</td>
						</tr>
					</tbody></table>
				</div>
			</form>
		</div>

		<div class="is-empty-xs120"></div>

		<!-- 하단 시작 -->
		<footer class="footer">
			<div class="is-frame-md is-relative">
				<div class="is-area-top">
					<ul>
						<li class=""><a href="#">회사소개</a></li>
						<li class=""><a href="#">이용약관</a></li>
						<li class=""><a href="#">개인정보 처리방침</a></li>
						<li class=""><a href="#">위치기반</a></li>
						<li class=""><a href="#">중개사 사이트 바로가기</a></li>
					</ul>
				</div>
				<div class="is-area-mid">
					<p><span>상호: </span><span>대표: </span><span>사업자등록번호: </span></p>
					<p><span>주소: </span></p>
					<p><span>팩스: </span><span>통신판매업 신고번호: </span></p>
					<p><span>서비스 이용문의: </span><span>이메일: </span><span>서비스제휴문의: </span></p>
				</div>
				<div class="is-area-bot">
					<!-- 아이콘 필요 -->
					<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
					<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
					<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
					<a href="#" class="is-btn-transparent"><img src="" alt=""></a>
					<p class="is-copyright">Copyright .All Rights Reserved.</p>
				</div>
			</div>
		</footer>
		<!-- 하단 끝 -->

	</div><div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>



</body></html>
</body>
</html>