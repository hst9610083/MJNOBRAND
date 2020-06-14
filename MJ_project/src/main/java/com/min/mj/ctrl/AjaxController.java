package com.min.mj.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.dtos.RowNumDto;
import com.min.mj.model.board.IMj_Board_Service;
@Controller
public class AjaxController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMj_Board_Service service;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/modifyForm.do", method= RequestMethod.POST, produces = "application/text; charset=UTF-8;")
	@ResponseBody
	public String modifyForm(String seq) {
		log.info("Welcome modifyForm,{}",seq);
		JSONObject json = new JSONObject();
		
		MJ_BoardDTO dto = service.pplgetOnBoard(seq);
		
		
		json.put("seq", dto.getSeq());
		json.put("id", dto.getId());
		json.put("title", dto.getTitle());
		json.put("content", dto.getContent());
		json.put("regdate", dto.getRegdate());
		
		log.info("Welcome modifyForm 결과,{}",json.toString());
		
		return json.toString();
	}
	
	@RequestMapping(value="/page.do", method= RequestMethod.POST, produces="application/text; charset=UTF-8;")
	@ResponseBody
	public String page(HttpSession session, RowNumDto rDto) {
		MJ_MemberDTO mdto = (MJ_MemberDTO) session.getAttribute("mem");
		
		JSONObject json = null;
		
		if(mdto.getAuth().equalsIgnoreCase("ROLE_S")) {
			rDto.setTotal(service.BoardListTotal());
			json = makeJson(service.BoardListRow(rDto), rDto, mdto);
		}else {
			rDto.setTotal(service.BoardListTotal());
			json = makeJson(service.BoardListRow(rDto), rDto, mdto);
		}
		session.removeAttribute("row");
		session.setAttribute("row", rDto);
		
		return json.toString();
	}
	
	//JSON객체로 만들어주는 메소드 JSONObject {} JSONArray [{},{}]->{'키':[{키2}:{값2},{키3:값3}]}
	@SuppressWarnings("unchecked")
	private JSONObject makeJson(List<MJ_BoardDTO>lists, RowNumDto row, MJ_MemberDTO mem) {
		JSONArray jList = new JSONArray(); //{"":""}
		JSONObject json = new JSONObject(); //[{"":""},{"":""},{"":""}...]
		JSONObject jdto = new JSONObject();//[{"":[{"":""},{"":""},{"":""}...]]
		for(MJ_BoardDTO dto: lists) {
			jdto = new JSONObject();
			jdto.put("seq", dto.getSeq());
			jdto.put("id", dto.getId());
			jdto.put("title", dto.getTitle());
			jdto.put("content", dto.getContent());
			jdto.put("readcount", dto.getReadcount());
			jdto.put("delflag", dto.getDelflag());
			jdto.put("regdate", dto.getRegdate());
			jdto.put("meid", dto.getId());
			jList.add(jdto);
		}
		//페이지 관련
		jdto = new JSONObject();
		jdto.put("pageList", row.getPageList());
		jdto.put("index", row.getIndex());
		jdto.put("pageNum", row.getPageNum());
		jdto.put("listNum", row.getListNum());
		jdto.put("total", row.getTotal());
		jdto.put("count", row.getCount());
		
		json.put("lists", jList);
		json.put("row", jdto);
		
		System.out.println(json.toString());
		
		return json;
	}
}
