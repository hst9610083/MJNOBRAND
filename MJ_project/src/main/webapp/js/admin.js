function del(val){
	 
//	 var id = document.getElementsById("cc")[0].value;
	var conf = confirm("회원탈퇴 ㄱ?");
	if(conf){
		location.href="./del.do?id="+val;
	}
	
		
	
}