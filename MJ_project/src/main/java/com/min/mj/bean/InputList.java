package com.min.mj.bean;

import java.util.List;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.MJ_MemberDTO;

public class InputList {

	private List<MJ_BoardDTO> lists;
	private MJ_MemberDTO mem;

	public InputList() {

	}

	public void setLists(List<MJ_BoardDTO> lists) {
		this.lists = lists;
	}

	public void setMem(MJ_MemberDTO mem) {
		this.mem = mem;
	}

	// 날짜
	private String dateFormat(String date) {
		return date.substring(0, date.indexOf(" "));
	}

	// 출력 리스트 폼
	private String listForm(MJ_BoardDTO dto) {
		StringBuffer sb = new StringBuffer();
		//colspan의 기본 user의 값
		int n = 6;
		
		sb.append("	<tr>                                                                                                       ");
		sb.append("	<td><input type='checkbox' name='chkval' value='"+dto.getSeq()+"'></td>                                                   ");
		sb.append("	<td>"+dto.getSeq()+"</td>                                                                                                ");
		sb.append("	<td>                                                                                                       ");
		sb.append("		<div class='panel-heading'>                                                                            ");
		sb.append("		<a data-toggle='collapse' data-parent='#accordion' href='#collapse"+dto.getSeq()+"' onclick='collapse(\""+dto.getSeq()+"\")'>"+dto.getTitle()+"</a>"	);
		sb.append("		</div>                                                                                                 ");
		sb.append("	</td>                                                                                                      ");
		sb.append("	<td>"+dto.getId()+"</td>                                                                                            "	);
		sb.append("	<td>"+dto.getReadcount()+"</td>                                                                                            "	);
		if(mem.getAuth().equalsIgnoreCase("A")) {
			n = 7;
			sb.append("<td>"+dto.getDelflag()+"</td>>");
		}
		sb.append("	<td>"+dateFormat(dto.getRegdate())+"</td>                                                                                          ");
		sb.append("	</tr>                                                                                                       ");
		sb.append("                                                                                                            ");
		sb.append("	<tr>                                                                                                        ");
		sb.append("	<td colspan='"+n+"'>                                                                                           ");
		sb.append("		<div id='collapse"+dto.getSeq()+"' class='panel-collapse collapse'>                                                ");
		sb.append("			<div class='form-group'>                                                                           ");
		sb.append("				<label>내용</label> <br>                                                                           	");
		sb.append("				<textarea rows='7' class='form-control' readonly='readonly'>"+dto.getContent()+"</textarea>            		 ");
		sb.append("			</div>                                                                                             ");
		sb.append("<div>");
		sb.append("<div class=''form-group'>");
		if(mem.getId().equalsIgnoreCase(dto.getId())||mem.getAuth().equals("ROLE_S")) {
			sb.append("<input type='button' class='btn btn-primary btn-sm btn-center' value='글 수정' onclick='modify(\""+dto.getSeq()+"\")'>");
			
		}
		if(mem.getId().equalsIgnoreCase(dto.getId())||mem.getAuth().equalsIgnoreCase("ROLE_S")) {
			sb.append("<input type='button' class='btn btn-primary btn-sm btn-center' value='글 삭제' onclick='del(\""+dto.getSeq()+"\")'>");
			
		}
		sb.append("</div>");
		sb.append("</div>");
		sb.append("		</div>                                                                                                 ");
		sb.append("	</td>                                                                                                      ");
		sb.append("	</tr>                                                                                                       ");
		
		return sb.toString();
	}

	public String getListForm() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < lists.size(); i++) {
			sb.append(listForm(lists.get(i)));
		}
		return sb.toString();
	}
}
