
package com.min.mj.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.activation.CommandMap;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.min.mj.InquiryBoard.IConInquiry_Service;
import com.min.mj.dtos.INQUIRYBoardDto;
import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.model.Inquiry.IMj_Inquiry_Service;
import com.min.mj.model.member.IMj_Member_Service;




@Controller
public class InquiryController {
   private Logger log = LoggerFactory.getLogger(this.getClass());
   
    
   @Autowired
   IMj_Member_Service service;
   
   @Autowired
   private IMj_Inquiry_Service service3;
   
   @Autowired
   private IConInquiry_Service service2;
   
   
   // 소비자 로그인후  임시 문의글 게시판 전체리스트
   @RequestMapping(value="/iBoardList.do",method = RequestMethod.GET)
   public String iBoardList(Model model, Authentication user, Principal principal,HttpSession session) {
      
	   String id = principal.getName();
	      MJ_MemberDTO mDto = service.userlogin(id);
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
	   
      List<INQUIRYBoardDto> lists=service3.Mimsi_All();
      model.addAttribute("lists",lists);
      return "iBoardList";
   }
   
      // 임시 문의글 게시판 상세보기
      @RequestMapping(value="/iBoardListDetail.do",method = RequestMethod.GET)
      public String iBoardListDetail(Model model, String seq) {
         log.info("게시판 상세보기,\t {}", seq);
         INQUIRYBoardDto lists = service3.Mimsi_Detail(seq);
         System.out.println("___________________________________"+lists.toString());
         model.addAttribute("lists",lists);
         return "iBoardListDetail";
      }
      
      //임시 문의글 게시판 수정하기

  	@RequestMapping(value = "/iBoardListModify.do", method = RequestMethod.GET)
  	public String iBoardListModify(INQUIRYBoardDto dto) {
  		log.info("Welcome modify.do:\t {}", dto);
  		boolean isc = service3.Mimsi_modify(dto);
  		return "redirect:/iBoardList.do";
  	}
      
  	
  	//임시문의글 작성하기
  	
  	 
  	@RequestMapping(value="/iBoardListWrite.do")
  	public String iboardWrite(INQUIRYBoardDto map) {
  		log.info("Welcome modify.do:\t {}", map);
  		boolean isc = service3.Mimsi_modify(map);
  		return "redirect:/iBoardList.do";
  	}
  	



  
   // 소비자문의게시판 (글 전체 조회)(소비자)
   @RequestMapping(value="/ConInquiryBoard.do",method = RequestMethod.GET)
   public String ConInquiryBoard(Model model) {
      
      List<INQUIRYBoardDto> lists=service2.C_allSelectBoard();
      model.addAttribute("lists",lists);
      return "ConInquiryBoard";
   }
   
   // 소비자문의게시판 글 상세 조회 (소비자)
   @RequestMapping(value="/ConInquiryBoardDetail.do",method = RequestMethod.GET)
   public String ConInquiryBoardDetail(Model model,String seq) {
      
      INQUIRYBoardDto lists=service2.C_SelectBoardDetail(seq);
      model.addAttribute("lists",lists);
      return "ConInquiryBoardDetail";
   }
   
   // 소비자문의게시판 글 입력 (소비자)
   
   
   // 소비자문의 게시판 (글 전체 조회)(업체)
   @RequestMapping(value="/SellInquiryBoard.do",method = RequestMethod.GET)
   public String SellInquiryBoard(Model model) {
      
      List<INQUIRYBoardDto> lists=service2.S_allSelectBoard();
      model.addAttribute("lists",lists);
      return "SellInquiryBoard";
   }
   
   // 소비자 문의 게시판 (글 상세 조회)(업체)
   @RequestMapping(value="/SellInquiryBoardDetail.do",method = RequestMethod.GET)
   public String SellInquiryBoardDetail(Model model,String seq) {
      
      INQUIRYBoardDto lists=service2.S_SelectBoardDetail(seq);
      model.addAttribute("lists",lists);
      return "SellInquiryBoardDetail";
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

   
}

