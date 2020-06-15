function modify(val){
	ajaxModify(val);
	$("#modify").modal();
}


//글삭제-----------------------------------------------------------------
function del(val){
	location.href="./pdel.do?seq="+val;
}


//다중삭제-------------------------------------
function checkAll(bool){
  var chkVals = document.getElementsByName("chkVal");
  for (var i = 0; i < chkVals.length; i++) {
     chkVals[i].checked = bool;
  }
}

function chkbox() {
  var n = 0;
  
  var chkVals = document.getElementsByName("chkVal");
  for (var i = 0; i < chkVals.length; i++) {
     if (chkVals[i].checked) {
        n++;
     }
  }
  if (n != 0) {
     document.getElementById("frm").action="./pMultiDel.do";
  }else{
     swal("게시글 오류", "삭제 값이 없습니다.");
     return false;
  }
}

function reseted(){
	document.getElementById("con").innerHTML = '내용(원본)';
	$("#title").html('제목(원본)');
}

function chk(){
	var con = document.getElementById('con');
	var titl = document.getElementById('titl');
	
	var title = document.getElementById('title');
	var hiddenContent = document.getElementById('hiddenContent');
	var textArea = document.getElementById('Txtarea');
	
	
	if(textArea.value == hiddenContent.value){
		con.innerHTML = '내용';
		titl.innerHTML = '제목';
		textArea.value = '';
		title.value ='';
	}
}

// 페이징 관려----------------------------------------------------------------

function pageList(){
	var index = document.getElementById("index");
	var pageNum = document.getElementById("pageNum");
	var listNum = document.getElementById("listNum");
	
	index.value=0;
	pageNum.value=1;
	listNum.value= document.getElementById("list").value;
	alert(index.value+";"+pageNum.value+";"+listNum.value);
	
	pageAjax();
}
//첫번째 페이지로 이동
function pageFirst(){
	var index = document.getElementById("index");
	var pageNum = document.getElementById("pageNum");
	index.value= 0;
	pageNum.value = 1;
	pageAjax();
}
// <  버튼 
function pagePre(num,pageList){
	if(0 < num - pageList){
		num -= pageList;
		var index = document.getElementById("index");
		var pageNum = document.getElementById("pageNum");
		pageNum.value = num;
		index.value = num -1;
	}
	pageAjax();
}

function pageNext(num ,total, listNum, pageList){ 
	var index = Math.ceil(total/listNum);
	var max = Math.ceil(index/pageList); 
	
	if(max*pageList > num+pageList){
		
		num += pageList;
		
		var index = document.getElementById("index");
		var pageNum = document.getElementById("pageNum");
		
		
		pageNum.value = num;
		index.value = num -1;
		
	}
	pageAjax();
	
}

function pageLast(num ,total, listNum, pageList){
	var idx = Math.ceil(total/listNum);
	var max = Math.ceil(idx/pageList);
	
	while(max*pageList > num+pageList){
		num += pageList;
	}
	var index = document.getElementById("index");
	var pageNum = document.getElementById("pageNum");
	pageNum.value = num;
	index.value = idx-1;
	pageAjax();
}



function pageIndex(idx){

	var index= document.getElementById("index");
	index.value = idx-1;
	pageAjax();
}

//공통 페이징 아작스----------------------------------------------

var pageAjax = function(){
	$.ajax({
		url:"./page.do",
		type:"post",
		async:true,
		data:$("#frm").serialize(),
		dataType:"json",
		success:function(msg){

			$.each(msg,function(key,value){
				var varHtml = "";
				var n = $(".table tr:eq(0) th").length;
				if(key == "lists"){
				    varHtml += "  <tr>";
				    varHtml += "  <th> ";
				    varHtml += "      <input type='checkbox' onclick='checkAll(this.checked)'>";
				    varHtml += "  </th>";
				    varHtml += "  <th>글번호</th>";
				    varHtml += "  <th>제목</th>";
				    varHtml += "  <th>작성자</th>";
				    varHtml += "  <th>조회수</th>";
				    if(n == 7){
				    varHtml += "  <th>";
				    varHtml += "     삭제여부";
				    varHtml += "  </th>";
				    }
				    varHtml += "  <th>작성일</th>";
				    varHtml += "  </tr>";
				    $.each(value,function(k,v){
				    	varHtml += "  <tr>";
				    	varHtml += "  <td>";
					    varHtml += "  <input type='checkbox' name='chkval' value='"+v.seq+"'>";
					    varHtml += "  </td>";
					    varHtml += "  <td>"+v.seq+"</td>";
					    varHtml += "  <td> ";
					    varHtml += "     <div class='panel-heading'> ";
					    varHtml += "         <a data-toggle='collapse' data-parent='#accordion' href='#collapse"+v.seq+"' onclick='collapse(\""+v.seq+"\")'>"+v.title+"</a>";
					    varHtml += "     </div> ";
					    varHtml += "  </td>";
					    varHtml += "  <td>"+v.id+"</td>  ";
					    varHtml += "  <td>"+v.readcount+"</td>  ";
					    if(n==7){
					    	varHtml += "<td>"+v.delflag+"</td>";
					    }
					    varHtml += "  <td>"+v.regdate+"</td>";
					    varHtml += "  </tr> ";
					    varHtml += "  <tr>  ";
					    
				varHtml+= "	       <td colspan='"+n+"'> ";
			    varHtml+= "        <div id='collapse"+v.seq+"' class='panel-collapse collapse'><div class='form-group'>";
			    varHtml+= "        <label>내용</label> <br>";
			    varHtml+= "          <textarea rows='7' class='form-control' readonly='readonly'>"+v.content+"</textarea> ";
			    varHtml+= "          </div>";
			    varHtml+= "          <div>";
			    varHtml+= "          <div class='form-group'>";
			    varHtml+= "        <input type='button' class='btn btn-primary btn-sm btn-center' value='글 수정' onclick='modify(\""+v.seq+"\")'>";
			    varHtml+= "        <input type='button' class='btn btn-primary btn-sm btn-center' value='글 삭제' onclick='del(\""+v.seq+"\")'>";
			    varHtml+= "      </div>";
			    varHtml+= "      </div>";
			    varHtml+= "      </div> ";
			    varHtml+= "      </td>";
			    varHtml+= "      </tr>";    
				    });
				    
				    $(".table > tbody").html(varHtml);
				    
					}else{ //페이지 값 변경
					varHtml +="<li><a href='#' onclick='pageFirst()'>&laquo;</a></li>";
					varHtml +="<li><a href='#' onclick='pagePre("+value.pageNum+","+value.pageList+")'>&lsaquo;</a></li>";
					for(var i = value.pageNum; i <= value.count; i++){		
					varHtml +="<li><a href='#' onclick= 'pageIndex("+i+")'>"+i+"</a></li>";
					}
					varHtml +="<li><a href='#' onclick='pageNext("+value.pageNum+","+value.total+","+value.listNum+","+value.pageList+")'>&rsaquo;</a></li>";
					varHtml +="<li><a href='#' onclick='pageLast("+value.pageNum+","+value.total+","+value.listNum+","+value.pageList+")'>&raquo;</a></li>";
					}
				
					if(key == "lists"){
						$(".table > tbody").html(varHtml);
					}else{
						$(".pagination").html(varHtml);
					}
			});



			
		}, error:function(){
			alert("데이터 처리를 하지 못했습니다");
		}
	});
}
//var pageAjax = function(){
//	$.ajax({
//		url:"./page.do",
//		type:"post",
//		async:true,
//		data:$("#frm").serialize(),
//		dataType:"json",
//		success:function(msg){
//
//			$.each(msg,function(key,value){
//				var varHtml = "";
//				var n = $(".table tr:eq(0) th").length;
//				if(key == "lists"){
//				    varHtml += "  <tr>";
//				    varHtml += "  <th> ";
//				    varHtml += "      <input type='checkbox' onclick='checkAll(this.checked)'>";
//				    varHtml += "  </th>";
//				    varHtml += "  <th>글번호</th>";
//				    varHtml += "  <th>제목</th>";
//				    varHtml += "  <th>작성자</th>";
//				    varHtml += "  <th>조회수</th>";
//				    if(n == 7){
//				    varHtml += "  <th>";
//				    varHtml += "     삭제여부";
//				    varHtml += "  </th>";
//				    }
//				    varHtml += "  <th>작성일</th>";
//				    varHtml += "  </tr>";
//				    $.each(value,function(k,v){
//				    	varHtml += "  <tr>";
//				    	varHtml += "  <td>";
//					    varHtml += "  <input type='checkbox' name='chkval' value='"+v.seq+"'>";
//					    varHtml += "  </td>";
//					    varHtml += "  <td>"+v.seq+"</td>";
//					    varHtml += "  <td> ";
//					    varHtml += "     <div class='panel-heading'> ";
//					    varHtml += "         <a data-toggle='collapse' data-parent='#accordion' href='#collapse"+v.seq+"' onclick='collapse(\""+v.seq+"\")'>"+v.title+"</a>";
//					    varHtml += "     </div> ";
//					    varHtml += "  </td>";
//					    varHtml += "  <td>"+v.id+"</td>  ";
//					    varHtml += "  <td>"+v.readcount+"</td>  ";
//					    if(n==7){
//					    	varHtml += "<td>"+v.delflag+"</td>";
//					    }
//					    varHtml += "  <td>"+v.regdate+"</td>";
//					    varHtml += "  </tr> ";
//					    varHtml += "  <tr>  ";
//					    
//				varHtml+= "	       <td colspan='"+n+"'> ";
//			    varHtml+= "        <div id='collapse"+v.seq+"' class='panel-collapse collapse'><div class='form-group'>";
//			    varHtml+= "        <label>내용</label> <br>";
//			    varHtml+= "          <textarea rows='7' class='form-control' readonly='readonly'>"+v.content+"</textarea> ";
//			    varHtml+= "          </div>";
//			    varHtml+= "          <div>";
//			    varHtml+= "          <div class='form-group'>";
//			    if(v.id == v.meid){
//			    varHtml+= "        <input type='button' class='btn btn-primary btn-sm btn-center' value='글 수정' onclick='modify(\""+v.seq+"\")'>";
//			    }
//			    if(v.id == v.meid || n==7){
//			    varHtml+= "        <input type='button' class='btn btn-primary btn-sm btn-center' value='글 삭제' onclick='del(\""+v.seq+"\")'>";
//			    }
//			    varHtml+= "      </div>";
//			    varHtml+= "      </div>";
//			    varHtml+= "      </div> ";
//			    varHtml+= "      </td>";
//			    varHtml+= "      </tr>";    
//				    });
//				    
//				    $(".table > tbody").html(varHtml);
//				    
//					}else{ //페이지 값 변경
//					varHtml +="<li><a href='#' onclick='pageFirst()'>&laquo;</a></li>";
//					varHtml +="<li><a href='#' onclick='pagePre("+value.pageNum+","+value.pageList+")'>&lsaquo;</a></li>";
//					for(var i = value.pageNum; i <= value.count; i++){		
//					varHtml +="<li><a href='#' onclick= 'pageIndex("+i+")'>"+i+"</a></li>";
//					}
//					varHtml +="<li><a href='#' onclick='pageNext("+value.pageNum+","+value.total+","+value.listNum+","+value.pageList+")'>&rsaquo;</a></li>";
//					varHtml +="<li><a href='#' onclick='pageLast("+value.pageNum+","+value.total+","+value.listNum+","+value.pageList+")'>&raquo;</a></li>";
//					}
//				
//					if(key == "lists"){
//						$(".table > tbody").html(varHtml);
//					}else{
//						$(".pagination").html(varHtml);
//					}
//			});
//
//
//
//			
//		}, error:function(){
//			alert("데이터 처리를 하지 못했습니다");
//		}
//	});
//}


//글 수정 ----------------------------------------------------------------------------
var ajaxModify = function(val){
//	alert('Ajax'+val);
	$.ajax({
		url:"./modifyForm.do",
		type:"post",
		dataType:"json",
		data:{"seq":val},
		success:function(msg){
			html="<div class='form-group'>";
			html+="<input type='hidden' name='seq' value='"+msg.seq+"'>"
		    html+="<label for='id'>아이디</label>";
		    html+="<p class='form-control'><strong>"+msg.id+"</strong></p>";
		    html+="</div>";
		    html+="";
		    html+="<div class='form-group'>";
		    html+="<label for='regdate'>작성일</label>";
		    html+="<p class='form-control'><strong>"+msg.regdate+"</strong></p>";
		    html+="</div>";
		    html+="";
		    html+="<div class='form-group'>";
		    html+="<label for='title'>제목</label>";
		    html+="<input type='text' class='form-control' id='title' name='title' value='"+msg.title+"' required='required'>";
		    html+="</div>";
		    html+="";
		    html+="<div class='form-group'>";
		    html+="<label for='content'>내용</label>";
		    html+="<textarea id='content' name='content' class='form-control' rows='5'>"+msg.content+"</textarea>";
		    html+="</div>";
		    html+="";
		    html+="<div class='modal-footer'>";
		    html+="<input  class='btn btn-success' type='button' value='글수정 완료' onclick='update()'>";
		    html+="<input class='btn btn-info' type='reset' value='내용초기화'>";
		    html+="<button type='button' class='btn btn-default' data-dismiss='modal'>Close</button>";
		    html+="</div>";
		    
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    $("#frmModify").html(html);
		    
		},
		error:function(){
			alert("잘못된 요청입니다");
		}
	});
}



function update(){
	var frm = document.getElementById("frmModify");
	frm.action ="./pModify.do";
	var title= $("#title").val();
	if(title == ''){
		swal("글수정 오류", '제목은 필수입니다');
	}else{
		frm.submit();
	}
}