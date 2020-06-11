package com.min.mj.InquiryBoard;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.min.mj.dtos.INQUIRYBoardDto;

public class ConInquiry_Service implements IConInquiry_Service {
	
	@Autowired
	private IConInquiry_Dao dao;
	
	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public List<INQUIRYBoardDto> InquiryInput(INQUIRYBoardDto dto) {
		log.info("InquiryInput 성공");
		return dao.InquiryInput(dto);
	}

	@Override
	public List<INQUIRYBoardDto> CInquiryAll() {
		log.info("CInquiryAll 성공");
		return dao.CInquiryAll();
	}

	@Override
	public INQUIRYBoardDto SInquiryDetail(String seq) {
		log.info("SInquiryDetail 성공");
		return dao.SInquiryDetail(seq);
	}

	@Override
	public List<INQUIRYBoardDto> SInquiryAll() {
		log.info("SInquiryAll 성공");
		return dao.SInquiryAll();
	}

	@Override
	public INQUIRYBoardDto CInquiryDetail(String seq) {
		log.info("CInquiryDetail 성공");
		return dao.CInquiryDetail(seq);
	}

}
