package com.min.mj.ctrl;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.dtos.EstiDto;
import com.min.mj.dtos.INQUIRYBoardDto;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.model.Esti.IMj_Esti_Service;
import com.min.mj.model.member.IMj_Member_Service;


@Controller
public class EstiController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	   IMj_Member_Service service;
	@Autowired
	private IMj_Esti_Service service2;
	
	//견적서 게시판 전체 리스트(소비자)
	@RequestMapping(value="/c_EstiList.do",method = RequestMethod.GET)
	public String c_EstiList(Model model,EstiDto dto) {
		
		List<EstiDto> lists=service2.Cesti_All();
		model.addAttribute("lists",lists);
		return "c_EstiList";
	};
	
	//견적서 게시판 상세보기(소비자)
	
	
	
	//견적서 게시판 전체 리스트(업체)
	@RequestMapping(value="/s_EstiList.do",method = RequestMethod.GET)
	public String s_EstiList(Model model,EstiDto dto, Authentication user, Principal principal,HttpSession session) {
		
		
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
		
		List<EstiDto> lists=service2.Sesti_All();
		model.addAttribute("lists",lists);
		return "s_EstiList";
		
	};
	
	//견적서  게시판 상세보기(업체)
	@RequestMapping(value="/s_EstiListDetail.do",method = RequestMethod.GET)
	public String s_EstiListDetail(Model model,String seq, Authentication user, Principal principal,HttpSession session) {
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
	      EstiDto lists=service2.Sesti_Detail(seq);
	      model.addAttribute("lists",lists);
	      return "s_EstiListDetail";
	}
	
	// 견적서 쓰기
	@RequestMapping(value="/s_EstiInput.do",method = RequestMethod.GET)
	public String s_EstiInput(Model model,EstiDto dto) {
		
		boolean lists=service2.EstiInput(dto);
		model.addAttribute("lists",lists);
		return "s_EstiInput";

};
}
