package com.min.mj.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.min.mj.model.Esti.IMj_Esti_Service;

@Controller
public class EstiController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMj_Esti_Service service;
	
	//견적서 게시판 전체 리스트(업체)
	
	
}
