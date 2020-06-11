package com.min.mj.InquiryBoard;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.min.mj.dtos.INQUIRYBoardDto;

public class ConInquiry_Dao implements IConInquiry_Dao {
	
	@Autowired
	SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS="com.min.ConInquiry.";

	@Override
	public List<INQUIRYBoardDto> InquiryInput(INQUIRYBoardDto dto) {
		log.info("InquiryInput 성공");
		return session.selectList(NS+"InquiryInput",dto);
	}

	@Override
	public List<INQUIRYBoardDto> CInquiryAll() {
		log.info("CInquiryAll 성공");
		return session.selectList(NS+"CInquiryAll");
	}

	@Override
	public INQUIRYBoardDto SInquiryDetail(String seq) {
		log.info("SInquiryDetail 성공");
		return session.selectOne(NS+"SInquiryDetail",seq);
	}

	@Override
	public List<INQUIRYBoardDto> SInquiryAll() {
		log.info("SInquiryAll 성공");
		return session.selectList(NS+"SInquiryAll");
	}

	@Override
	public INQUIRYBoardDto CInquiryDetail(String seq) {
		log.info("CInquiryDetail 성공");
		return session.selectOne(NS+"CInquiryDetail",seq);
	}

}
