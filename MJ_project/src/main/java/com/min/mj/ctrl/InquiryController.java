package com.min.mj.ctrl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.dtos.INQUIRYBoardDto;
import com.min.mj.model.Inquiry.IMj_Inquiry_Service;

@Controller
public class InquiryController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMj_Inquiry_Service service;
	
	//임시 문의글 게시판 전체리스트
	@RequestMapping(value="/iBoardList.do",method = RequestMethod.GET)
	public String iBoardList(Model model) {
		
		List<INQUIRYBoardDto> lists=service.Mimsi_All();
		model.addAttribute("lists",lists);
		return "iBoardList";
		
	};
}
