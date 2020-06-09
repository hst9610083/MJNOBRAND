package com.min.mj.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.min.mj.model.Inquiry.IMj_Inquiry_Service;

@Controller
public class InquiryController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMj_Inquiry_Service service;
	
	//문의글 게시판 전체리스트
	
	
}
