<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
 <div id="joinModal" data-uc-modal class="is-fade">
        <div class="is-modal-dialog">
            <div data-uc-panel>
                <div class="is-panel-body">
                    <div class="is-col-xs6 is-offset-xs3">
                        <h3 style="font-size: 34px; color: #404040; text-align: center; margin-bottom: 30px;">회원가입</h3>
                        <form data-uc-form>
							<div class="is-input-field is-mg-b_15">
                                <input type="text" name="selpick"  placeholder="* 사업자등록증이미지" />
                            </div>
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="id"  placeholder="* 아이디" />
                            </div>
                            <div class="is-input-field is-mg-b_15">
                                <input type="text" name="pw"  placeholder="* 비밀번호" />
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
                                <input type="text" name="sellernum"  placeholder="* 사업자번호" />
                            </div>
                             <div class="is-input-field is-mg-b_15">
                                <input type="text" name="email"  placeholder="* 이메일" />
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

</form>
</body>
</html>