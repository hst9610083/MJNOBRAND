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
   private IMj_Member_Service service;
   
   @Autowired
   private IMj_Inquiry_Service service3;
   
   @Autowired
   private IConInquiry_Service service2;
   
   // 소비자 로그인후 문의글 게시판 전체리스트
   @RequestMapping(value="/iBoardList.do",method = RequestMethod.GET)
   public String iBoardList(Model model, Authentication user, Principal principal,HttpSession session) {
      
	   String id = principal.getName();
	      MJ_MemberDTO mDto = service.userlogin(id);
	      System.out.println();
	      mDto.getAuth();
	      log.info("getAuth 으아아아이ㅏ어ㅣ아ㅓㅇ");
	      mDto.getId();
	      model.addAttribute("mDto",mDto);
	      log.info("getId 으아아아이ㅏ어ㅣ아ㅓㅇ");
	      session.setAttribute("mem", mDto);
	      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
	    	  mDto.getAuth();
	    	  System.out.println(mDto.getAuth()+"C");
	      }
	      
	   
      List<INQUIRYBoardDto> lists=service3.Mstore_All();
      model.addAttribute("lists",lists);
      return "iBoardList";
   }
   
      // 소비자 마이페이지에 문의글 리스트 상세보기
      @RequestMapping(value="/iBoardListDetail.do",method = RequestMethod.GET)
      public String iBoardListDetail(Model model, String seq, Authentication user, Principal principal,HttpSession session) {
    	  
    	  String id = principal.getName();
	      MJ_MemberDTO mDto = service.userlogin(id);
	      System.out.println();
	      mDto.getAuth();
	      log.info("getAuth");
	      mDto.getId();
	      log.info("getId");
	      model.addAttribute("mDto",mDto);
	      session.setAttribute("mem", mDto);
	      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
	    	  mDto.getAuth();
	    	  System.out.println(mDto.getAuth()+"C");
	    	  
	      }
    	  
         log.info("게시판 상세보기,\t {}", seq);
         INQUIRYBoardDto lists = service3.Mstore_Detail(seq);
         System.out.println("___________________________________"+lists.toString());
         model.addAttribute("lists",lists);
         return "iBoardListDetail";
      }
      

      // 소비자문의게시판 (글 쓰기 템플릿)(소비자)///////////////////////////////////

   	@RequestMapping(value="/Contemplatem.do", method = RequestMethod.GET)
   	public String Contemplatem() {
   		System.out.println("dsfsafsadfsadf");
   		return "Contemplate";
   	}
     	
   	@RequestMapping(value="/Contemplate.do", method = RequestMethod.POST)
   	public String conTemplInput(HttpSession session, INQUIRYBoardDto dto, Model model) {
   		log.info("Welcome conTemplInput: \t {}",dto);
   		MJ_MemberDTO mDto =  (MJ_MemberDTO) session.getAttribute("mem");
   		System.out.println("㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾");
   		dto.setId(mDto.getId());
   		boolean isc = service2.c_insertBoard(dto);
   		return isc?"redirect:/iBoardList.do":"redirect:/logout.do";
   	}
   	
   	
      // 소비자문의 게시판 (글 전체 조회)(업체)
       @RequestMapping(value="/ConInquiryBoard.do",method = {RequestMethod.GET,RequestMethod.POST})
       public String SellInquiryBoard(Model model, Authentication user, Principal principal,HttpSession session) {
          log.info("SellInquiryBoard ");
    	   	  String id = principal.getName();
    	      MJ_MemberDTO mDto = service.userlogin(id);
    	      System.out.println();
    	      mDto.getAuth();
    	      System.out.println("mdto fdsafa : "+mDto.getAuth());
    	      mDto.getId();
    	      model.addAttribute("mDto",mDto);
    	      session.setAttribute("mem", mDto);
    	      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_S")) {
    	    	  mDto.getAuth();
    	    	  System.out.println(mDto.getAuth()+"S");

    	      }
    	   
          List<INQUIRYBoardDto> lists=service2.S_allSelectBoard();
          model.addAttribute("lists",lists);
          return "ConInquiryBoard";
       }
       
       @RequestMapping(value="/CBoard2.do",method = RequestMethod.GET)
       public String SellInquiryBoard2(Model model) {
       	 log.info("SellInquiryBoard ");
       	 List<INQUIRYBoardDto> lists=service2.S_allSelectBoard();
       	 System.out.println(lists);
       	 model.addAttribute("lists",lists);
       	return "ConInquiryBoard";
       }
      
      
      // 소비자 문의 게시판 (글 상세 조회)(업체)
       @RequestMapping(value="/SellInquiryBoardDetail.do",method = RequestMethod.POST)
       public String SellInquiryBoardDetail(Model model,String seq,Principal principal,HttpSession session) {	  
     	  String id = principal.getName();
   	      MJ_MemberDTO mDto = service.userlogin(id);
   	      System.out.println();
   	      mDto.getAuth();
   	      System.out.println(mDto.getAuth());
   	      mDto.getId();
   	      model.addAttribute("mDto",mDto);
   	      session.setAttribute("mem", mDto);
   	      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_S")) {
   	    	  mDto.getAuth();
   	    	  System.out.println(mDto.getAuth()+"S");
   	      }
     	  
          log.info("게시판 상세보기,\t {}", seq);
          INQUIRYBoardDto lists=service2.S_SelectBoardDetail(seq);
          System.out.println("___________________________________"+lists.toString());
          model.addAttribute("lists",lists);
          return "SellInquiryBoardDetail";
       }
      
  
   
}

