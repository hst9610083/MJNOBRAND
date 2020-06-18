package com.min.mj.ctrl;

import java.security.Principal;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.dtos.BoardVO;
import com.min.mj.dtos.Criteria;
import com.min.mj.dtos.INQUIRYBoardDto;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.dtos.PageMaker;
import com.min.mj.model.ex.BoardService;
import com.min.mj.model.member.IMj_Member_Service;



@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	 @Autowired
	 IMj_Member_Service service2;
	
	// 게시판 글 작성 화면
	@RequestMapping(value = "/board/writeView.do", method = RequestMethod.GET)
	public void writeView(Model model, Criteria cri, Authentication user, Principal principal,HttpSession session) throws Exception{
		logger.info("writeView");
		
		 String id = principal.getName();
	      MJ_MemberDTO mDto = service2.userlogin(id);
	      System.out.println();
	      mDto.getAuth();
	      System.out.println(mDto.getAuth());
	      mDto.getId();
	      model.addAttribute("mDto",mDto);
	      session.setAttribute("mem", mDto);
	      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
	    	  mDto.getAuth();
	    	  System.out.println(mDto.getAuth()+"C");
	    	  
	      }
		
	}
	
	// 게시판 글 작성
	@RequestMapping(value = "/board/write.do", method = RequestMethod.POST)
	public String write(INQUIRYBoardDto boardVO,Model model, Authentication user, Principal principal,HttpSession session) throws Exception{
		logger.info("write");
		
		  String id = principal.getName();
	      MJ_MemberDTO mDto = service2.userlogin(id);
	      System.out.println();
	      mDto.getAuth();
	      System.out.println(mDto.getAuth());
	      mDto.getId();
	      model.addAttribute("mDto",mDto);
	      session.setAttribute("mem", mDto);
	      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
	    	  mDto.getAuth();
	    	  System.out.println(mDto.getAuth()+"C");
	    	  
	      }
		
		service.write(boardVO);
		
		return "redirect:/board/list.do";
	}
	
	// 게시판 목록 조회
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Model model, Criteria cri, Authentication user, Principal principal,HttpSession session) throws Exception{
		logger.info("list");
		
		  String id = principal.getName();
	      MJ_MemberDTO mDto = service2.userlogin(id);
	      System.out.println();
	      mDto.getAuth();
	      System.out.println(mDto.getAuth());
	      mDto.getId();
	      model.addAttribute("mDto",mDto);
	      session.setAttribute("mem", mDto);
	      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
	    	  mDto.getAuth();
	    	  System.out.println(mDto.getAuth()+"C");
	    	  
	      }
		model.addAttribute("list", service.list(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCount());
		
		model.addAttribute("pageMaker", pageMaker);
		
		return "board/list";
		
	}
		
		
	
		
		// 게시판 조회
		@RequestMapping(value = "/board/readView.do", method = RequestMethod.GET)
		public String read(INQUIRYBoardDto boardVO,Model model, Authentication user, Principal principal,HttpSession session) throws Exception{
			logger.info("read");
			
			  String id = principal.getName();
		      MJ_MemberDTO mDto = service2.userlogin(id);
		      System.out.println();
		      mDto.getAuth();
		      System.out.println(mDto.getAuth());
		      mDto.getId();
		      model.addAttribute("mDto",mDto);
		      session.setAttribute("mem", mDto);
		      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
		    	  mDto.getAuth();
		    	  System.out.println(mDto.getAuth()+"C");
		      }
			model.addAttribute("read", service.read(boardVO.getSeq()));
			return "board/readView";
		}	
		
		
		// 게시판 수정뷰
		@RequestMapping(value = "/board/updateView.do", method = RequestMethod.GET)
		public String updateView(INQUIRYBoardDto boardVO, Model model, Authentication user, Principal principal,HttpSession session) throws Exception{
			logger.info("updateView");
			
			  String id = principal.getName();
		      MJ_MemberDTO mDto = service2.userlogin(id);
		      System.out.println();
		      mDto.getAuth();
		      System.out.println(mDto.getAuth());
		      mDto.getId();
		      model.addAttribute("mDto",mDto);
		      session.setAttribute("mem", mDto);
		      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
		    	  mDto.getAuth();
		    	  System.out.println(mDto.getAuth()+"C");
		    	  
		      }
			
			model.addAttribute("update", service.read(boardVO.getSeq()));
			
			return "board/updateView";
		}
		
		// 게시판 수정
		@RequestMapping(value = "/board/update.do", method = RequestMethod.POST)
		public String update(INQUIRYBoardDto boardVO,Model model, Authentication user, Principal principal,HttpSession session) throws Exception{
			logger.info("update");
			
			  String id = principal.getName();
		      MJ_MemberDTO mDto = service2.userlogin(id);
		      System.out.println();
		      mDto.getAuth();
		      System.out.println(mDto.getAuth());
		      mDto.getId();
		      model.addAttribute("mDto",mDto);
		      session.setAttribute("mem", mDto);
		      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
		    	  mDto.getAuth();
		    	  System.out.println(mDto.getAuth()+"C");
		    	  
		      }
			
			service.update(boardVO);
			
			return "redirect:/board/list.do";
		}

		// 게시판 삭제
		@RequestMapping(value = "/delete.do", method = RequestMethod.POST)
		public String delete(INQUIRYBoardDto boardVO) throws Exception{
			logger.info("delete");
			
			service.delete(boardVO.getSeq());
			
			return "redirect:/board/list.do";
		}
		
		//임시변환
		@RequestMapping(value="/conversion.do", method=RequestMethod.GET)
		public String conversion(INQUIRYBoardDto boardVO,Model model, Authentication user, Principal principal,HttpSession session) throws Exception{
			logger.info("conversion 성공");
			
			
			String id = principal.getName();
		      MJ_MemberDTO mDto = service2.userlogin(id);
		      System.out.println();
		      mDto.getAuth();
		      System.out.println(mDto.getAuth());
		      mDto.getId();
		      model.addAttribute("mDto",mDto);
		      session.setAttribute("mem", mDto);
		      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
		    	  mDto.getAuth();
		    	  System.out.println(mDto.getAuth()+"C");
		    	  
		      }
			
			service.conversion(boardVO);
			return "redirect:/iBoardList.do";
		}
}