package com.min.mj.kr.co.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.kr.co.service.BoardService;
import com.min.mj.kr.co.vo.BoardVO;
import com.min.mj.kr.co.vo.Criteria;
import com.min.mj.kr.co.vo.PageMaker;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	// 게시판 글 작성 화면
	@RequestMapping(value = "/board/writeView.do", method = RequestMethod.GET)
	public void writeView() throws Exception{
		logger.info("writeView");
		
	}
	
	// 게시판 글 작성
	@RequestMapping(value = "/board/write.do", method = RequestMethod.POST)
	public String write(BoardVO boardVO) throws Exception{
		logger.info("write");
		
		service.write(boardVO);
		
		return "/board/list";
	}
	
	// 게시판 목록 조회
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Model model, Criteria cri) throws Exception{
		logger.info("list");
		
		model.addAttribute("list.do", service.list(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCount());
		
		model.addAttribute("pageMaker", pageMaker);
		
		return "board/list";
		
	}
		
		
	
		
		// 게시판 조회
		@RequestMapping(value = "/board/readView.do", method = RequestMethod.GET)
		public String read(BoardVO boardVO, Model model) throws Exception{
			logger.info("read");
			
			model.addAttribute("read", service.read(boardVO.getBno()));
			
			return "board/readView";
		}	
		
		
		// 게시판 수정뷰
		@RequestMapping(value = "/board/updateView.do", method = RequestMethod.GET)
		public String updateView(BoardVO boardVO, Model model) throws Exception{
			logger.info("updateView");
			
			model.addAttribute("update", service.read(boardVO.getBno()));
			
			return "board/updateView";
		}
		
		// 게시판 수정
		@RequestMapping(value = "/board/update.do", method = RequestMethod.POST)
		public String update(BoardVO boardVO) throws Exception{
			logger.info("update");
			
			service.update(boardVO);
			
			return "redirect:/board/list.do";
		}

		// 게시판 삭제
		@RequestMapping(value = "/delete", method = RequestMethod.POST)
		public String delete(BoardVO boardVO) throws Exception{
			logger.info("delete");
			
			service.delete(boardVO.getBno());
			
			return "redirect:/board/list";
		}
}
///

//sdfsdfsdfsdfds