package com.min.mj.ctrl;

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
import com.min.mj.dtos.RowNumDto;
import com.min.mj.model.Board.IMj_Board_Service;

@Controller
public class P_BoardController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IMj_Board_Service service;
	
	
	
	// 홍보게시판 전체글 리스트
	@RequestMapping(value="pBoardList.do", method = RequestMethod.GET)
	public String pBoardList(Model model) {
		log.info("Welcome /BoardList.do : \t {}", new Date());
		
		//페이징 처리 DTO
//		RowNumDto rowDto = null;
		//페이징처리된 리스트
		List<MJ_BoardDTO> lists = service.pplSelectBoard();
//		MJ_BoardDTO mDto = (MJ_BoardDTO) session.getAttribute("mem");
		
		model.addAttribute("lists", lists);
		return "pBoardList";
	}
}
