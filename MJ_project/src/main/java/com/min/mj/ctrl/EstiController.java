package com.min.mj.ctrl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.dtos.EstiDto;
import com.min.mj.dtos.INQUIRYBoardDto;
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
	public String s_EstiList(Model model,EstiDto dto) {
		
		List<EstiDto> lists=service.Sesti_All();
		model.addAttribute("lists",lists);
		return "s_EstiList";
		
	};
	
	
	
}
