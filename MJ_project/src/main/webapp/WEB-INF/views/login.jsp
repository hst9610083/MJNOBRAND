
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <title>뭔말인지 알조</title>

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
    <script src="./js/signup.js"></script>   
  
<body>


    <!--로그인 팝업-->
    <div id="loginModal" data-uc-modal class="is-fade">
        <div class="is-modal-dialog">
            <div data-uc-panel>
                <div class="is-panel-body">
                    <div data-uc-colgroup="">
                        <div class="is-col-lg4 is-align-mid is-txt-center sns-wrap">
                            <p class="login_title">업체 로그인</p>
                        </div>
                        <div class="is-col-lg4 is-align-mid">
                            <form data-uc-form action="./logingo.do" method="POST">
                                <div class="is-input-field is-mg-b_15">
                                    <input type="text" name="id" placeholder="아이디"
                                           style="border-color: #777676;" />
                                </div>
                                <div class="is-input-field is-mg-b_30">
                                    <input type="text" name="password" placeholder="비밀번호"
                                           style="border-color: #777676;" />
                                </div>
                                <div class=" is-mg-b_15">
                                    <button type="submit" class="is-btn-yg1 is-mg-b_15">로그인</button>
                                    <a href="#joinModal" data-uc-click="modal" class="is-btn-yg2">업체 회원가입</a>
                                </div>
                                <div class="is-txt-center">
                                    <a href="" class="is-txt-link">ID찾기</a>
                                    <a href="" class="is-txt-link">비밀번호 찾기</a>
                                </div>
                            </form>
                        </div>
                        <div class="is-col-lg4 is-align-mid is-txt-center sns-wrap">
                            <p class="login_title">소비자 로그인</p>
                        </div>
                        <div class="is-col-lg4 is-align-mid">
                            <form data-uc-form action="./logingo.do" method="POST">
                                <div class="is-input-field is-mg-b_15">
                                    <input type="text" name="id" placeholder="아이디"
                                           style="border-color: #777676;" />
                                </div>
                                <div class="is-input-field is-mg-b_30">
                                    <input type="text" name="password" placeholder="비밀번호"
                                           style="border-color: #777676;" />
                                </div>
                                <div class=" is-mg-b_15">
                                    <button type="submit" class="is-btn-yg1 is-mg-b_15">로그인</button>
                                    <a href="#joinModal_1" data-uc-click="modal" class="is-btn-yg2">소비자 회원가입</a>
                                </div>
                                <div class="is-txt-center">
                                    <a href="" class="is-txt-link">ID찾기</a>
                                    <a href="" class="is-txt-link">비밀번호 찾기</a>
                                </div>
                            </form>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div id="joinModal" data-uc-modal class="is-fade">
        <div class="is-modal-dialog">
            <div data-uc-panel>
                <div class="is-panel-body">
                    <div class="is-col-xs6 is-offset-xs3">
                        <h3 style="font-size: 34px; color: #404040; text-align: center; margin-bottom: 30px;">업체 회원가입</h3>
                       
                          <input type="hidden" id="chkval" value="0">
                           <form action="./S_JoinUp.do" method="post">
                        
                     <div class="is-input-field is-mg-b_15">
                                <input type="text" name="selpick"  placeholder="* 사업자등록증이미지" id="selpick" />
                            </div>
                           
                            <div class="is-input-field is-mg-b_15" >
                                <input class="form-control" type="text" name="id" id="id" placeholder="* 아이디" maxlength="20"><br>
                                <span id="result"></span> 
                              </div>
                            
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="pw"  placeholder="* 비밀번호" id="pw">
                            </div>
                            
                            <div class="is-input-field is-mg-b_15">
                               <input class="form-control" type="password" id="passOk"   placeholder="* 비밀번호 확인"><br> 
                               <span id="result_pw"></span>
                          </div>
                          
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="name"  placeholder="* 이름" id="name" >
                            </div>
                            
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="address"  placeholder="* 주소">
                            </div>
                            
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="nicname"  placeholder="* 별명" >
                            </div>
                            
                             <div class="is-input-field is-mg-b_15">
                                <input type="text" id="sellernum" name="sellernum"  placeholder="* 사업자번호" maxlength="20">
                               <span id="result"></span> 
                            </div>
                            
                             <div class="is-input-field is-mg-b_15">
                                <input type="text" name="email" id="email"  placeholder="* 이메일">
                                <button type="button" value="email"  onclick="emailCheck()">이메일체크</button>
                             </div>
                            
                            <div class="is-input-field is-mg-b_40">
                                <label class="is-chk-lab">
                                    <input type="checkbox" id="privacy_1" name="privacy_1" value="0"><span></span> (선택)
                                                      개인정보 제3자
                                                      제공에 동의합니다.
                                </label>
                                  <label class="is-chk-lab">
                                    <input type="checkbox" id="privacy_2" name="privacy_2" value="1"><span></span> (필수)
                                                      개인정보 제공 및
                                                      수집에 동의합니다.
                                </label>
                            </div>
                            <div class=" is-mg-b_15">
                                <button type="submit" class="is-btn-yg1 is-mg-b_15" onclick="check()">회원가입</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div id="joinModal_1" data-uc-modal class="is-fade">
        <div class="is-modal-dialog">
            <div data-uc-panel>
                <div class="is-panel-body">
                    <div class="is-col-xs6 is-offset-xs3">
                        <h3 style="font-size: 34px; color: #404040; text-align: center; margin-bottom: 30px;">소비자 회원가입</h3>
                       
                         <input type="hidden" id="chkval" value="0">
                        <form data-uc-form action="./C_JoinUp.do" method="post"onsubmit="return check_1()">
                            <div class="is-input-field is-mg-b_15">
                                <input class="form-control" type="text" name="id" id="id" placeholder="* 아이디입력란" maxlength="20">
                              <span id="result1"></span> 
                            </div>
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="pw"  placeholder="* 비밀번호" />
                            </div>
                            <div class="is-input-field is-mg-b_15">
                            <input class="form-control" type="password" id="passOk"   placeholder="* 비밀번호 확인"><br> 
                     <span id="result_pw"></span>
                     </div>
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="name"  placeholder="* 이름" />
                            </div>
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="address"  placeholder="* 주소" />
                            </div>
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="nicname"  placeholder="* 별명" />
                            </div>
                             <div class="is-input-field is-mg-b_15">
                                <input type="text" name="birth"  placeholder="* 생년월일" />
                            </div>
                             <div class="is-input-field is-mg-b_15">
                                <input type="text" name="phonnum"  placeholder="* 핸드폰" />
                            </div>
                            <div class="is-input-field is-mg-b_40">
                                <label class="is-chk-lab">
                                    <input type="checkbox" id="privacy_1" name="privacy_1" value="0"><span></span> (선택)
                                    개인정보 제3자
                                    제공에 동의합니다.</label>
                                <label class="is-chk-lab">
                                    <input type="checkbox" id="privacy_2" name="privacy_2" value="1"><span></span> (필수)
                                    개인정보 제공 및
                                    수집에 동의합니다.</label>
                            </div>
                            <div class=" is-mg-b_15">
                                <button type="submit" class="is-btn-yg1 is-mg-b_15">회원가입</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--header-->
    <header id="header">
        <div class="header_wrap">
            <h1><a href="./index.html"><img src="images/main/logo.png" alt=""></a></h1>
            <nav id="gnb">
                <ul>
                    <li><a href="">소비자 문의 게시판</a></li>
                    <li><a href="">홍보게시판</a></li>
                    <li><a href="">공유방</a></li>
                    <li><a href="">고객센터</a></li>
                </ul>
            </nav>
            <div class="util">
                <ul>
                    <li><a href="#loginModal" data-uc-click="modal"><img src="images/main/login_icon.png" alt=""></a></li>
                    <li><a href="#joinModal1" data-uc-click="modal"><img src="images/main/join_icon.png" alt=""></a></li>
                    <li><a href="file:///C:/Users/uriim/OneDrive/바탕%20화면/html_4/mypage1-2.html"><img src="images/main/mypage_icon.png" alt=""></a></li>
                </ul>
            </div>
        </div>
    </header>

    <!--main_visial-->
 

    <div class="con con1">
        <div class="wrap">
           <br>
            <img src="images/main/GIFT.png"alt="">
        </div>
    </div>

    <div class="con con2">
        <div class="wrap">
            <b class="title"><img src="images/main/con2_title.png" alt=""></b>

            <ul>
                <li>
                    <div class="img_area">
                        <img src="images/main/con2_img1.png" alt="">
                    </div>
                    <span>
                        조건 검색하기<br>
                        디자인, 카테고리 등 <b>조건 선택</b>
                    </span>
                </li>
                <li>
                    <div class="img_area">
                        <img src="images/main/con2_img2.png" alt="">
                    </div>
                    <span>
                        <b>원하는 업체</b> 두고<br>
                        비교해보기
                    </span>
                </li>
                <li>
                    <div class="img_area">
                        <img src="images/main/con2_img3.png" alt="">
                    </div>
                    <span>
                        원하는 날짜  체크 후<br>
                        <b>1:1 문의 하기</b>
                    </span>
                </li>
                <li>
                    <div class="img_area">
                        <img src="images/main/con2_img4.png" alt="">
                    </div>
                    <span>
                        <b>견적부터</b>거래까지<br>
                         <b>쉽게쉽게</b>
                    </span>
                      
                </li>
                <li>
                    <div class="img_area">
                        <img src="images/main/con2_img5.png" alt="">
                    </div>
                    <span>
                        계약하기
                    </span>
                </li>
            </ul>
        </div>
    </div>




<!-- 신규 업데이트. 인기방 -->
    <div class="con con3">
        <div class="wrap">
            <b class="title"><span>신규 업데이트. 인기방</span></b>
            <div class="main_slider">
                <div class="slide slide1">
                    <a href="#">
                        <img src="images/main/slide1.png" alt="">
                        <div class="dim">
                            <div>
                                <img src="images/main/map_icon.png" alt="" class="map_icon">
                                <p>
                                    충청남도 서북구<br>
                                    남서울대학교 <b>도보 7분</b>
                                </p>
                                <div class="price">
                                    <ul>
                                        <li>보증금</li>
                                        <li>월세</li>
                                        <li class="number">500 / 30</li>
                                    </ul>
                                </div>
                                <div class="option">
                                    <ul>
                                        <li>
                                            <img src="images/main/slide_option1.png" alt="">
                                            <span>세탁기</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option2.png" alt="">
                                            <span>인덕션</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option3.png" alt="">
                                            <span>전자레인지</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option4.png" alt="">
                                            <span>에어컨</span>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>

                    </a>
                </div>
                <div class="slide slide2">
                    <a href="#">
                        <img src="images/main/slide2.png" alt="">
                        <div class="dim">
                            <div>
                                <img src="images/main/map_icon.png" alt="" class="map_icon">
                                <p>
                                    충청남도 서북구<br>
                                    남서울대학교 <b>도보 7분</b>
                                </p>
                                <div class="price">
                                    <ul>
                                        <li>보증금</li>
                                        <li>월세</li>
                                        <li class="number">500 / 30</li>
                                    </ul>
                                </div>
                                <div class="option">
                                    <ul>
                                        <li>
                                            <img src="images/main/slide_option1.png" alt="">
                                            <span>세탁기</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option2.png" alt="">
                                            <span>인덕션</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option3.png" alt="">
                                            <span>전자레인지</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option4.png" alt="">
                                            <span>에어컨</span>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>

                    </a>
                </div>
                <div class="slide slide3">
                    <a href="#">
                        <img src="images/main/slide3.png" alt="">
                        <div class="dim">
                            <div>
                                <img src="images/main/map_icon.png" alt="" class="map_icon">
                                <p>
                                    충청남도 서북구<br>
                                    남서울대학교 <b>도보 7분</b>
                                </p>
                                <div class="price">
                                    <ul>
                                        <li>보증금</li>
                                        <li>월세</li>
                                        <li class="number">500 / 30</li>
                                    </ul>
                                </div>
                                <div class="option">
                                    <ul>
                                        <li>
                                            <img src="images/main/slide_option1.png" alt="">
                                            <span>세탁기</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option2.png" alt="">
                                            <span>인덕션</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option3.png" alt="">
                                            <span>전자레인지</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option4.png" alt="">
                                            <span>에어컨</span>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>

                    </a>
                </div>
                <div class="slide slide4">
                    <a href="#">
                        <img src="images/main/slide4.png" alt="">
                        <div class="dim">
                            <div>
                                <img src="images/main/map_icon.png" alt="" class="map_icon">
                                <p>
                                    충청남도 서북구<br>
                                    남서울대학교 <b>도보 7분</b>
                                </p>
                                <div class="price">
                                    <ul>
                                        <li>보증금</li>
                                        <li>월세</li>
                                        <li class="number">500 / 30</li>
                                    </ul>
                                </div>
                                <div class="option">
                                    <ul>
                                        <li>
                                            <img src="images/main/slide_option1.png" alt="">
                                            <span>세탁기</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option2.png" alt="">
                                            <span>인덕션</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option3.png" alt="">
                                            <span>전자레인지</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option4.png" alt="">
                                            <span>에어컨</span>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>

                    </a>
                </div>
                <div class="slide slide5">
                    <a href="#">
                        <img src="images/main/slide5.png" alt="">
                        <div class="dim">
                            <div>
                                <img src="images/main/map_icon.png" alt="" class="map_icon">
                                <p>
                                    충청남도 서북구<br>
                                    남서울대학교 <b>도보 7분</b>
                                </p>
                                <div class="price">
                                    <ul>
                                        <li>보증금</li>
                                        <li>월세</li>
                                        <li class="number">500 / 30</li>
                                    </ul>
                                </div>
                                <div class="option">
                                    <ul>
                                        <li>
                                            <img src="images/main/slide_option1.png" alt="">
                                            <span>세탁기</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option2.png" alt="">
                                            <span>인덕션</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option3.png" alt="">
                                            <span>전자레인지</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option4.png" alt="">
                                            <span>에어컨</span>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>

                    </a>
                </div>
                <div class="slide slide6">
                    <a href="#">
                        <img src="images/main/slide4.png" alt="">
                        <div class="dim">
                            <div>
                                <img src="images/main/map_icon.png" alt="" class="map_icon">
                                <p>
                                    충청남도 서북구<br>
                                    남서울대학교 <b>도보 7분</b>
                                </p>
                                <div class="price">
                                    <ul>
                                        <li>보증금</li>
                                        <li>월세</li>
                                        <li class="number">500 / 30</li>
                                    </ul>
                                </div>
                                <div class="option">
                                    <ul>
                                        <li>
                                            <img src="images/main/slide_option1.png" alt="">
                                            <span>세탁기</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option2.png" alt="">
                                            <span>인덕션</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option3.png" alt="">
                                            <span>전자레인지</span>
                                        </li>
                                        <li>
                                            <img src="images/main/slide_option4.png" alt="">
                                            <span>에어컨</span>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>

                    </a>
                </div>
            </div>
            <button class="arrow prev">
                <img src="images/main/slide_prev.png" alt="">
            </button>
            <button class="arrow next">
                <img src="images/main/slide_next.png" alt="">
            </button>
        </div>
    </div>


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




</body>





<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>뭔말인지 알조</title>

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
<script src="./js/signup.js"></script>

<body>


   <!--로그인 팝업-->
   <div id="loginModal" data-uc-modal class="is-fade">
      <div class="is-modal-dialog">
         <div data-uc-panel>
            <div class="is-panel-body">
               <div data-uc-colgroup="">
                  <div class="is-col-lg4 is-align-mid is-txt-center sns-wrap">
                     <p class="login_title">업체 로그인</p>
                  </div>
                  <div class="is-col-lg4 is-align-mid">
                     <form data-uc-form action="./logingo.do" method="POST">
                        <div class="is-input-field is-mg-b_15">
                           <input type="text" name="id" placeholder="아이디"
                              style="border-color: #777676;" />
                        </div>
                        <div class="is-input-field is-mg-b_30">
                           <input type="text" name="password" placeholder="비밀번호"
                              style="border-color: #777676;" />
                        </div>
                        <div class=" is-mg-b_15">
                           <button type="submit" class="is-btn-yg1 is-mg-b_15">로그인</button>
                           <a href="#joinModal" data-uc-click="modal" class="is-btn-yg2">업체
                              회원가입</a>
                        </div>
                        <div class="is-txt-center">
                           <a href="" class="is-txt-link">ID찾기</a> <a href=""
                              class="is-txt-link">비밀번호 찾기</a>
                        </div>
                     </form>
                  </div>
                  <div class="is-col-lg4 is-align-mid is-txt-center sns-wrap">
                     <p class="login_title">소비자 로그인</p>
                  </div>
                  <div class="is-col-lg4 is-align-mid">
                     <form data-uc-form action="./logingo.do" method="POST">
                        <div class="is-input-field is-mg-b_15">
                           <input type="text" name="id" placeholder="아이디"
                              style="border-color: #777676;" />
                        </div>
                        <div class="is-input-field is-mg-b_30">
                           <input type="text" name="password" placeholder="비밀번호"
                              style="border-color: #777676;" />
                        </div>
                        <div class=" is-mg-b_15">
                           <button type="submit" class="is-btn-yg1 is-mg-b_15">로그인</button>
                           <a href="#joinModal_1" data-uc-click="modal" class="is-btn-yg2">소비자
                              회원가입</a>
                        </div>
                        <div class="is-txt-center">
                           <a href="" class="is-txt-link">ID찾기</a> <a href=""
                              class="is-txt-link">비밀번호 찾기</a>
                        </div>
                     </form>

                  </div>
               </div>
            </div>
         </div>
      </div>
   </div>


   <div id="joinModal" data-uc-modal class="is-fade">
      <div class="is-modal-dialog">
         <div data-uc-panel>
            <div class="is-panel-body">
               <div class="is-col-xs6 is-offset-xs3">
                  <h3
                     style="font-size: 34px; color: #404040; text-align: center; margin-bottom: 30px;">업체
                     회원가입</h3>

                  <input type="hidden" id="chkval" value="0">
                  <form action="./S_JoinUp.do" method="post"   onsubmit="return check();">

                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="selpick" placeholder="* 사업자등록증이미지"
                           id="selpick" />
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input class="form-control" type="text" name="id" id="id"
                           placeholder="* 아이디" maxlength="20"><br> <span
                           id="result"></span>
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="pw" placeholder="* 비밀번호" id="pw">
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input class="form-control" type="password" id="passOk"
                           placeholder="* 비밀번호 확인"><br> <span id="result_pw"></span>
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="name" placeholder="* 이름" id="name">
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="address" placeholder="* 주소">
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="nicname" placeholder="* 별명">
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input type="text" id="sellernum" name="sellernum"
                           placeholder="* 사업자번호" maxlength="20"> <span id="result"></span>
                     </div>

                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="email" id="email" placeholder="* 이메일">
                        <button type="button" value="email" onclick="emailCheck()">이메일체크</button>
                     </div>

                     <div class="is-input-field is-mg-b_40">
                        <label class="is-chk-lab"> <input type="checkbox"
                           id="privacy_1" name="privacy_1" value="0"><span></span>
                           (선택) 개인정보 제3자 제공에 동의합니다.
                        </label> <label class="is-chk-lab"> <input type="checkbox"
                           id="privacy_2" name="privacy_2" value="1"><span></span>
                           (필수) 개인정보 제공 및 수집에 동의합니다.
                        </label>
                     </div>
                     <div class=" is-mg-b_15">
                        <input type="submit" class="is-btn-yg1 is-mg-b_15" value="회원가입">
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </div>


   <div id="joinModal_1" data-uc-modal class="is-fade">
      <div class="is-modal-dialog">
         <div data-uc-panel>
            <div class="is-panel-body">
               <div class="is-col-xs6 is-offset-xs3">
                  <h3
                     style="font-size: 34px; color: #404040; text-align: center; margin-bottom: 30px;">소비자
                     회원가입</h3>

                  <input type="hidden" id="chkval" value="0">
                  <form data-uc-form action="./C_JoinUp.do" method="post"
                     onsubmit="return check_1()">
                     <div class="is-input-field is-mg-b_15">
                        <input class="form-control" type="text" name="id" id="id"
                           placeholder="* 아이디입력란" maxlength="20"> <span
                           id="result1"></span>
                     </div>
                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="pw" placeholder="* 비밀번호" />
                     </div>
                     <div class="is-input-field is-mg-b_15">
                        <input class="form-control" type="password" id="passOk"
                           placeholder="* 비밀번호 확인"><br> <span id="result_pw"></span>
                     </div>
                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="name" placeholder="* 이름" />
                     </div>
                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="address" placeholder="* 주소" />
                     </div>
                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="nicname" placeholder="* 별명" />
                     </div>
                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="birth" placeholder="* 생년월일" />
                     </div>
                     <div class="is-input-field is-mg-b_15">
                        <input type="text" name="phonnum" placeholder="* 핸드폰" />
                     </div>
                     <div class="is-input-field is-mg-b_40">
                        <label class="is-chk-lab"> <input type="checkbox"
                           id="privacy_1" name="privacy_1" value="0"><span></span>
                           (선택) 개인정보 제3자 제공에 동의합니다.
                        </label> <label class="is-chk-lab"> <input type="checkbox"
                           id="privacy_2" name="privacy_2" value="1"><span></span>
                           (필수) 개인정보 제공 및 수집에 동의합니다.
                        </label>
                     </div>
                     <div class=" is-mg-b_15">
                        <button type="submit" class="is-btn-yg1 is-mg-b_15">회원가입</button>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </div>
   <!--header-->
   <header id="header">
      <div class="header_wrap">
         <h1>
<<<<<<< HEAD
            <a href="./index.html"><img src="images/main/logo.png" alt=""></a>
=======
            <a href="./index.html"><img src="" alt=""></a>
>>>>>>> branch 'master' of https://github.com/hst9610083/MJNOBRAND.git
         </h1>
         <nav id="gnb">
            <ul>
               <li><a href="">소비자 문의 게시판</a></li>
               <li><a href="">홍보게시판</a></li>
               <li><a href="">공유방</a></li>
               <li><a href="">고객센터</a></li>
            </ul>
         </nav>
         <div class="util">
            <ul>
               <li><a href="#loginModal" data-uc-click="modal"><img
                     src="images/main/login_icon.png" alt=""></a></li>
               <li><a href="#joinModal1" data-uc-click="modal"><img
                     src="images/main/join_icon.png" alt=""></a></li>
               <li><a
                  href="file:///C:/Users/uriim/OneDrive/바탕%20화면/html_4/mypage1-2.html"><img
                     src="images/main/mypage_icon.png" alt=""></a></li>
            </ul>
         </div>
      </div>
   </header>

   <!--main_visial-->


   <div class="con con1">
      <div class="wrap">
         <br> <img src="images/main/GIFT.png" alt="">
      </div>
   </div>

   <div class="con con2">
      <div class="wrap">
         <b class="title"><img src="images/main/con2_title.png" alt=""></b>

         <ul>
            <li>
               <div class="img_area">
                  <img src="images/main/con2_img1.png" alt="">
               </div> <span> 조건 검색하기<br> 디자인, 카테고리 등 <b>조건 선택</b>
            </span>
            </li>
            <li>
               <div class="img_area">
                  <img src="images/main/con2_img2.png" alt="">
               </div> <span> <b>원하는 업체</b> 두고<br> 비교해보기
            </span>
            </li>
            <li>
               <div class="img_area">
                  <img src="images/main/con2_img3.png" alt="">
               </div> <span> 원하는 날짜 체크 후<br> <b>1:1 문의 하기</b>
            </span>
            </li>
            <li>
               <div class="img_area">
                  <img src="images/main/con2_img4.png" alt="">
               </div> <span> <b>견적부터</b>거래까지<br> <b>쉽게쉽게</b>
            </span>

            </li>
            <li>
               <div class="img_area">
                  <img src="images/main/con2_img5.png" alt="">
               </div> <span> 계약하기 </span>
            </li>
         </ul>
      </div>
   </div>




   <!-- 신규 업데이트. 인기방 -->
   <div class="con con3">
      <div class="wrap">
         <b class="title"><span>신규 업데이트. 인기방</span></b>
         <div class="main_slider">
            <div class="slide slide1">
               <a href="#"> <img src="images/main/slide1.png" alt="">
                  <div class="dim">
                     <div>
                        <img src="images/main/map_icon.png" alt="" class="map_icon">
                        <p>
                           충청남도 서북구<br> 남서울대학교 <b>도보 7분</b>
                        </p>
                        <div class="price">
                           <ul>
                              <li>보증금</li>
                              <li>월세</li>
                              <li class="number">500 / 30</li>
                           </ul>
                        </div>
                        <div class="option">
                           <ul>
                              <li><img src="images/main/slide_option1.png" alt="">
                                 <span>세탁기</span></li>
                              <li><img src="images/main/slide_option2.png" alt="">
                                 <span>인덕션</span></li>
                              <li><img src="images/main/slide_option3.png" alt="">
                                 <span>전자레인지</span></li>
                              <li><img src="images/main/slide_option4.png" alt="">
                                 <span>에어컨</span></li>
                           </ul>
                        </div>

                     </div>
                  </div>

               </a>
            </div>
            <div class="slide slide2">
               <a href="#"> <img src="images/main/slide2.png" alt="">
                  <div class="dim">
                     <div>
                        <img src="images/main/map_icon.png" alt="" class="map_icon">
                        <p>
                           충청남도 서북구<br> 남서울대학교 <b>도보 7분</b>
                        </p>
                        <div class="price">
                           <ul>
                              <li>보증금</li>
                              <li>월세</li>
                              <li class="number">500 / 30</li>
                           </ul>
                        </div>
                        <div class="option">
                           <ul>
                              <li><img src="images/main/slide_option1.png" alt="">
                                 <span>세탁기</span></li>
                              <li><img src="images/main/slide_option2.png" alt="">
                                 <span>인덕션</span></li>
                              <li><img src="images/main/slide_option3.png" alt="">
                                 <span>전자레인지</span></li>
                              <li><img src="images/main/slide_option4.png" alt="">
                                 <span>에어컨</span></li>
                           </ul>
                        </div>

                     </div>
                  </div>

               </a>
            </div>
            <div class="slide slide3">
               <a href="#"> <img src="images/main/slide3.png" alt="">
                  <div class="dim">
                     <div>
                        <img src="images/main/map_icon.png" alt="" class="map_icon">
                        <p>
                           충청남도 서북구<br> 남서울대학교 <b>도보 7분</b>
                        </p>
                        <div class="price">
                           <ul>
                              <li>보증금</li>
                              <li>월세</li>
                              <li class="number">500 / 30</li>
                           </ul>
                        </div>
                        <div class="option">
                           <ul>
                              <li><img src="images/main/slide_option1.png" alt="">
                                 <span>세탁기</span></li>
                              <li><img src="images/main/slide_option2.png" alt="">
                                 <span>인덕션</span></li>
                              <li><img src="images/main/slide_option3.png" alt="">
                                 <span>전자레인지</span></li>
                              <li><img src="images/main/slide_option4.png" alt="">
                                 <span>에어컨</span></li>
                           </ul>
                        </div>

                     </div>
                  </div>

               </a>
            </div>
            <div class="slide slide4">
               <a href="#"> <img src="images/main/slide4.png" alt="">
                  <div class="dim">
                     <div>
                        <img src="images/main/map_icon.png" alt="" class="map_icon">
                        <p>
                           충청남도 서북구<br> 남서울대학교 <b>도보 7분</b>
                        </p>
                        <div class="price">
                           <ul>
                              <li>보증금</li>
                              <li>월세</li>
                              <li class="number">500 / 30</li>
                           </ul>
                        </div>
                        <div class="option">
                           <ul>
                              <li><img src="images/main/slide_option1.png" alt="">
                                 <span>세탁기</span></li>
                              <li><img src="images/main/slide_option2.png" alt="">
                                 <span>인덕션</span></li>
                              <li><img src="images/main/slide_option3.png" alt="">
                                 <span>전자레인지</span></li>
                              <li><img src="images/main/slide_option4.png" alt="">
                                 <span>에어컨</span></li>
                           </ul>
                        </div>

                     </div>
                  </div>

               </a>
            </div>
            <div class="slide slide5">
               <a href="#"> <img src="images/main/slide5.png" alt="">
                  <div class="dim">
                     <div>
                        <img src="images/main/map_icon.png" alt="" class="map_icon">
                        <p>
                           충청남도 서북구<br> 남서울대학교 <b>도보 7분</b>
                        </p>
                        <div class="price">
                           <ul>
                              <li>보증금</li>
                              <li>월세</li>
                              <li class="number">500 / 30</li>
                           </ul>
                        </div>
                        <div class="option">
                           <ul>
                              <li><img src="images/main/slide_option1.png" alt="">
                                 <span>세탁기</span></li>
                              <li><img src="images/main/slide_option2.png" alt="">
                                 <span>인덕션</span></li>
                              <li><img src="images/main/slide_option3.png" alt="">
                                 <span>전자레인지</span></li>
                              <li><img src="images/main/slide_option4.png" alt="">
                                 <span>에어컨</span></li>
                           </ul>
                        </div>

                     </div>
                  </div>

               </a>
            </div>
            <div class="slide slide6">
               <a href="#"> <img src="images/main/slide4.png" alt="">
                  <div class="dim">
                     <div>
                        <img src="images/main/map_icon.png" alt="" class="map_icon">
                        <p>
                           충청남도 서북구<br> 남서울대학교 <b>도보 7분</b>
                        </p>
                        <div class="price">
                           <ul>
                              <li>보증금</li>
                              <li>월세</li>
                              <li class="number">500 / 30</li>
                           </ul>
                        </div>
                        <div class="option">
                           <ul>
                              <li><img src="images/main/slide_option1.png" alt="">
                                 <span>세탁기</span></li>
                              <li><img src="images/main/slide_option2.png" alt="">
                                 <span>인덕션</span></li>
                              <li><img src="images/main/slide_option3.png" alt="">
                                 <span>전자레인지</span></li>
                              <li><img src="images/main/slide_option4.png" alt="">
                                 <span>에어컨</span></li>
                           </ul>
                        </div>

                     </div>
                  </div>

               </a>
            </div>
         </div>
         <button class="arrow prev">
            <img src="images/main/slide_prev.png" alt="">
         </button>
         <button class="arrow next">
            <img src="images/main/slide_next.png" alt="">
         </button>
      </div>
   </div>


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
            <p>
               <span>상호: </span><span>대표: </span><span>사업자등록번호: </span>
            </p>
            <p>
               <span>주소: </span>
            </p>
            <p>
               <span>팩스: </span><span>통신판매업 신고번호: </span>
            </p>
            <p>
               <span>서비스 이용문의: </span><span>이메일: </span><span>서비스제휴문의: </span>
            </p>
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




</body>
