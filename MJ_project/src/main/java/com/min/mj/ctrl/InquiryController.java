package com.min.mj.ctrl;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.mj.dtos.INQUIRYBoardDto;
import com.min.mj.model.Inquiry.IMj_Inquiry_Service;



@Controller
public class InquiryController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMj_Inquiry_Service service;
	
	// 임시 문의글 게시판 전체리스트
	@RequestMapping(value="/iBoardList.do",method = RequestMethod.GET)
	public String iBoardList(Model model) {
		
		List<INQUIRYBoardDto> lists=service.Mimsi_All();
		model.addAttribute("lists",lists);
		return "iBoardList";
		

		
	}
		
	
	// 임시 문의글 게시판 상세보기

	@RequestMapping(value="/iBoardListDetail.do",method = RequestMethod.GET)
	public String iBoardListDetail(Model model,String seq) {
		
		INQUIRYBoardDto Dlists = service.Mimsi_Detail(seq);
		
		model.addAttribute("Dlists",Dlists);
		return "iBoardListDetail";
	}
	
	// 소비자문의게시판 글 전체리스트 (소비자)
	@RequestMapping(value="/c_BoardList.do",method = RequestMethod.GET)
	public String C_BoardList(Model model) {
		
		List<INQUIRYBoardDto> lists=service.Mimsi_All();
		model.addAttribute("lists",lists);
		return "BoardList";
	}
	
//	@SuppressWarnings("unchecked")
//	@RequestMapping(value="/iBoardListDetail.do", method=RequestMethod.GET, produces = "application/text; charset=UTF-8;")
//	@ResponseBody
//	public String modifyForm(String seq) {
//		log.info("Welcome iBoardListDetail, {}", seq);
//		JSONObject json = new JSONObject();
//		
//		INQUIRYBoardDto dto = service.Mimsi_Detail(seq);
//		
//		json.put("seq", dto.getSeq());
//		json.put("id", dto.getId());
//		json.put("title", dto.getTitle());
//		json.put("content", dto.getContent());
//		json.put("regdate", dto.getRegdate());
//		
//		log.info("Welcome iBoardListDetail 결과, {}", json.toString());
//		
//		return json.toString();
//		
//	}

	// 소비자문의게시판 글 상세 조회 (소비자)
	
	
	// 소비자문의게시판 글 입력 (소비자)
	
	
	// 소비자문의게시판 글 전체리스트 (업체)
	
	
	// 소비자문의게시판 글 상세 조회 (업체)

	
	
}
