package com.min.mj.ctrl;

import java.security.Principal;
import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.dtos.RowNumDto;
import com.min.mj.model.board.IMj_Board_Service;


@Controller
public class PBoardController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IMj_Board_Service service;
	
	
	// 홍보게시판 전체글 리스트
	@RequestMapping(value="/pBoardList.do", method = RequestMethod.GET)
	public String pBoardList(Model model, HttpSession session ) {
		log.info("Welcome /BoardList.do : \t {}", new Date());
		
		//페이징 처리 DTO
//		RowNumDto rowDto = null;
		//페이징처리된 리스트
		
		// 전체글 조회
		List<MJ_BoardDTO> lists = service.pplSelectBoard();
//		MJ_BoardDTO mDto = (MJ_BoardDTO) session.getAttribute("list");
		
		model.addAttribute("lists", lists);
		return "pBoardList";
	}
	
	//글쓰기
	@RequestMapping(value="/writeForm.do", method = RequestMethod.GET)
	public String writeForm() {
		log.info("Welcome writeForm.do :\t {}", new Date());
		return "pBoardWriteForm";
	}
	
	@RequestMapping(value="/pBoardWrite.do", method = RequestMethod.POST)
	public String pboardWrite(HttpSession session, MJ_BoardDTO dto, Model model, Principal principal) {
		log.info("Welcome boardWrite: \t {}",dto);
		String id = principal.getName();
		dto.setId(id);
		log.info("Welcome boardWrite: \t {}",id,dto);
		boolean isc = service.pplWriteBoard(dto);
		model.addAttribute("mem", isc);
//		boolean isc = service.pplWriteBoard(dto);
		return "pBoardList";
//		return isc?"redirect:/pBoardList.do":"redirect:/logout.do";
	}
	
	@RequestMapping(value="/pModify.do", method = RequestMethod.POST)
	public String ModifypBoard(MJ_BoardDTO dto){
		log.info("Welcome Modify.do : \t{}",dto);
		boolean isc = service.pplModifyBoard(dto);
		return isc?"redirect:/pBoardList.do":":redirect:/pModify.do";
	}
	
	
	public String DelpBoard(String seq) {
		return "";
	}
	
	
	@RequestMapping(value="/pBoardDetail.do", method = RequestMethod.GET)
	public String DetailpBoard(Model model,String seq) {
		log.info("Welcome Detail.do : \t {}", seq);
		MJ_BoardDTO bDto = service.pplgetOnBoard(seq);
		model.addAttribute("bDto", bDto);
		return "pBoardDetail";
	}
	
}
