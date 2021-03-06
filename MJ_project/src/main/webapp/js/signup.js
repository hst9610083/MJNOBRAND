function check() {
   var name = document.getElementById("name").value;
   var selpick = document.getElementById("selpick").value;
   var id = document.getElementById("id").value;
   var pw = document.getElementById("pw").value;
   var passOk = document.getElementById("passOk").value;
   var sellernum = document.getElementById("sellernum").value;
   
   if (name == "") {
	   alert("회원가입 오류", "성명을 확인해주세요");
      return false;
   } else if (pw != passOk) {
	   alert("회원가입 오류", "비밀번호가 일치하지 않습니다");
      return false;
   } else if (chkId == "0") {
	   alert("회원가입 오류", "사용할 수 없는 아이디입니다.");
      return false;
   } else if (i_agree2 == false) {
	   alert("회원가입 오류", "개인정보 수집 동의(필수) 해주세요");
      return false;
   } else if (selpick == "") {
	   alert("회원가입 오류", "사업자 등록증을 첨부해주세요");
	  return false;
   } 
      return true;
}

$(document).ready(function() {
   $("#id").keyup(function() { // 키를 눌렀다 땠을 때 작동시키는 방법
      var inputLength = $(this).val().length;
      var id = $(this).val();

      if (id.indexOf(" ") != -1) {
         $("#result").css("color", "red");
         $("#result").html("공백이 포함된 아이디는 입력하실 수 없습니다.");
         $("#chkval").val("0");
      } else if (inputLength <= 4) { // 아이디를 5자리 이상으로 써야함 12345 5<5!
         $("#result").css("color", "red");
         $("#result").html("5자리 이상의 아이디를 입력해주세요.");
         $("#result1").css("color", "red");
         $("#result1").html("5자리 이상의 아이디를 입력해주세요.");
         $("#chkval").val("0");
      } else if (inputLength > 4) { // 공백이 없고 5자리 이상이라면 ajax를 통해 유효성 검증할 것
         jQuery.ajax({ // $.ajax도 가능함
        	 url : "./idCheck.do",
            type : "post",
            data : "id=" + $(this).val(),
            async : true, // true(비동기) = 요청을 보낸 후 응답결과와는 상관없이 다음방식이 동작하는
            // 방식
            success : function(msg) {
               // alert(msg.isc);
               if (msg.isc == "false") {
                  $("#result").css("color", "blue");
                  $("#result").html("사용가능한 아이디입니다.");
                  $("#chkval").val("1");
               } else {
                  $("#result").css("color", "red");
                  $("#result").html("사용 불가능한 아이디입니다.");
                  $("#chkval").val("");
                  $(this).val("");
               }
            },
            error : function
            () {
               alert("잘못된 요청 값 입니다.");
            }
         });
      }

   });
});

// 비밀번호 체크 js
window.onload = function() {
   $("#passOk").keyup(function() { // 비밀번호랑 체크가 일치하지않으면 일치하지 않는다고 띄우겠다
      var pw = $("#pw").val();
      var passOk = $(this).val();
      if (pw != passOk) {
         $("#result_pw").css("color", "red");
         $("#result_pw").html("비밀번호가 일치하지 않습니다.");
      } else if (pw == passOk) {
         $("#result_pw").css("color", "blue");
         $("#result_pw").html("비밀번호가 일치합니다.");
      }
   });


}
// 이메일 문장 정규화
function emailCheck() {
// alert("FDGfdsgfsdgsfdgfsdg");
	
	var email = document.getElementById("email").value;
	
	var regEX = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	if(regEX.test(email)==false) {

		alert("메일형식이 맞지 않습니다. 다시 입력해주세요.");
		return false;

	}else{
		alert("체크완료.");
	}
	return true;
}