package com.min.mj.ctrl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.dtos.EstiDto;
import com.min.mj.dtos.INQUIRYBoardDto;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.model.Esti.IMj_Esti_Service;


@Controller
public class EstiController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMj_Esti_Service service;
	
	//견적서 게시판 전체 리스트(소비자)
	@RequestMapping(value="/c_EstiList.do",method = RequestMethod.GET)
	public String c_EstiList(Model model,EstiDto dto) {
		
		List<EstiDto> lists=service.Cesti_All();
		model.addAttribute("lists",lists);
		return "c_EstiList";
	};
	
	//견적서 게시판 전체 리스트(업체)
	@RequestMapping(value="/s_EstiList.do",method = RequestMethod.GET)
	public String s_EstiList(Model model) {
		List<EstiDto> lists=service.Sesti_All();
		model.addAttribute("lists",lists);
		return "s_EstiList";
	};
	
	// 견적서 쓰기
		@RequestMapping(value="/s_EstiInputm.do",method = RequestMethod.GET)
		public String s_EstiInputm(String id) {
			System.out.println("㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾mm");
			System.out.println("id는     :    "+id);
			return "s_EstiInput";
	}
		@RequestMapping(value="/s_EstiInput.do", method = RequestMethod.GET)
		public String s_EstiInput(HttpSession session, EstiDto dto, Model model) {
			log.info("Welcome s_EstiInput: \t {}",dto);
			MJ_MemberDTO mDto =  (MJ_MemberDTO) session.getAttribute("mem");
			System.out.println("㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾㉾");
//			dto.setId(mDto.getId());
			String id = dto.getId();
			System.out.println(id+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
			String title = dto.getTitle();
			String content = dto.getContent();
			String realfile = "파일입니다.";

			System.out.println(id+" : "+title+" : "+content);
			
			EstiDto estiDto = new EstiDto(id, title, content, realfile);
			
			model.addAttribute("mDto", mDto);
			boolean isc = service.EstiInput(estiDto);
			System.out.println("fdasdfsdagsafasgabd");
			return isc?"redirect:/s_EstiList.do":"redirect:/logout.do";
		}
		
	
	
	
	
	
	
	
	
}
