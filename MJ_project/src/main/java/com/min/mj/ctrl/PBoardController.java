package com.min.mj.ctrl;


import java.security.Principal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		RowNumDto rowDto = null;
		//페이징처리된 리스트

		
		model.addAttribute("row", rowDto);


		List<MJ_BoardDTO> lists = service.pplSelectBoard();
		MJ_MemberDTO mDto = (MJ_MemberDTO) session.getAttribute("mem");
//		if(session.getAttribute("row")==null) {
//			rowDto = new RowNumDto();
//		}else {
//			rowDto = (RowNumDto) session.getAttribute("row");
//		}
//		
//		if(mDto.getAuth().trim().equalsIgnoreCase("ROLE_S")) {
//			rowDto.setTotal(service.BoardListTotal());
//			lists = service.BoardListRow(rowDto);
//		}else {
//			rowDto.setTotal(service.BoardListTotal());
//			lists = service.BoardListRow(rowDto);
//		}
//		model.addAttribute("row", rowDto);

		
		// 전체글 조회
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
	public String pboardWrite(HttpSession session, MJ_BoardDTO dto, Model model) {
		log.info("Welcome boardWrite: \t {}",dto);
		MJ_MemberDTO mDto =  (MJ_MemberDTO) session.getAttribute("mem");
		dto.setId(mDto.getId());
		boolean isc = service.pplWriteBoard(dto);
		return isc?"redirect:/pBoardList.do":"redirect:/logout.do";
	}
	
	@RequestMapping(value="/pModify.do", method = RequestMethod.POST)
	public String ModifypBoard(MJ_BoardDTO dto){
		log.info("Welcome Modify.do : \t{}",dto);
		boolean isc = service.pplModifyBoard(dto);
		return "redirect:/pBoardList.do";
	}
	
	

	@RequestMapping(value = "pMultiDel.do", method = RequestMethod.GET)
	public String DelpBoard(HttpSession session,String[] seq) {
		log.info("Welcome MultiDelete.do : \t{}",Arrays.toString(seq));
		MJ_BoardDTO dto = service.pplgetOnBoard(seq[0]);
		MJ_MemberDTO mDto = (MJ_MemberDTO) session.getAttribute("mem");
		boolean isc = false;
		if(mDto.getAuth().equalsIgnoreCase("ROLE_S") || dto.getId().equalsIgnoreCase(mDto.getId())) {
			Map<String, String[]> map = new HashMap<String, String[]>();
			map.put("seq_", seq);
			isc = service.pplMultiDel(map);
		}
		return isc?"redirect:/pBoardList.do":"redirect:/logout.do";
	}
	
	
	@RequestMapping(value = "/pdel.do", method = RequestMethod.GET)
	public String del(String seq) {
		log.info("Welcome pdel.do : \t {}",seq);
		boolean isc = service.pplDelBoard(seq);

	

		return "pBoardList";

	}
	
	@RequestMapping(value="/pBoardDetail.do", method = RequestMethod.GET)
	public String DetailpBoard(Model model,String seq) {
		log.info("Welcome Detail.do : \t {}", seq);
		MJ_BoardDTO bDto = service.pplgetOnBoard(seq);
		model.addAttribute("bDto", bDto);
		return "pBoardDetail";

	}

	public String Del(String seq) {
		return "";

	}
	
}
