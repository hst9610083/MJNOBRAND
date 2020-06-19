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
		sb.append("	<td>"+dto.getId()+"</td>	"	);
		sb.append("	 <td><a href='./pBoardDetail.do?seq="+dto.getSeq()+"'>"+dto.getTitle()+"</a></td>                                                                                           "	);
		sb.append("	<td>"+dto.getReadcount()+"</td>                                                                                            "	);
		if(mem.getAuth().equalsIgnoreCase("ROLE_A")) {
			n = 7;
			sb.append("<td>"+dto.getDelflag()+"</td>>");
		}
		sb.append("	<td>"+dateFormat(dto.getRegdate())+"</td>                                                                                          ");
		sb.append("	</tr>                                                                                                       ");
		sb.append("                                                                                                            "); 
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
