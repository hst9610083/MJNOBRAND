function modify(val){
//	alert("????");
	location.href="./pModifyForm.do?seq="+val;
}


//글삭제-----------------------------------------------------------------
function del(val){
//	alert("????");
	location.href="./pdel.do?seq="+val;
}


//다중삭제-------------------------------------
function checkAll(bool){
  var chkVals = document.getElementsByName("chkval");
  for (var i = 0; i < chkVals.length; i++) {
     chkVals[i].checked = bool;
  }
}

function chkbox() {
  var n = 0;
  
  var chkVals = document.getElementsByName("chkval");
  for (var i = 0; i < chkVals.length; i++) {
     if (chkVals[i].checked) {
        n++;
     }
  }
  if (n > 0) {
     document.getElementById("frm").action="./pMultiDel.do";
  }else{
     swal("게시글 오류", "삭제 값이 없습니다.");
     return false;
  }
}
//--------------------------------------------------------------
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
				    varHtml += "  <th>작성자</th>";
				    varHtml += "  <th>제목</th>";
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
					    varHtml += "  <td>"+v.id+"</td>";
					    varHtml += "  <td><a href='./pBoardDetail.do?seq="+v.seq+"'>"+v.title+"</a></td>  ";
					    varHtml += "  <td>"+v.readcoun+"</td>  ";
					    if(n==7){
					    	varHtml += "<td>"+v.delflag+"</td>";
					    }
					    varHtml += "  <td>"+v.regdate+"</td>";
					    varHtml += "  </tr> ";
					       
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

function update(){
	var frm = document.getElementById("modi");
	frm.action ="./pModify.do";
	var title= $("#title").val();
	if(title == ''){
		swal("글수정 오류", '제목은 필수입니다');
	}else{
		frm.submit();
	}
}