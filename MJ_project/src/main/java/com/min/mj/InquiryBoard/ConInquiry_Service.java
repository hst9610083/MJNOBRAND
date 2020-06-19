package com.min.mj.InquiryBoard;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.INQUIRYBoardDto;

@Service
public class ConInquiry_Service implements IConInquiry_Service {
	
	@Autowired
	private IConInquiry_Dao dao;
	
	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public boolean c_insertBoard(INQUIRYBoardDto dto) {
		log.info("c_insertBoard 성공");
		return dao.c_insertBoard(dto);
	}

	@Override
	public List<INQUIRYBoardDto> C_allSelectBoard() {
		log.info("C_allSelectBoard 성공");
		return dao.C_allSelectBoard();
	}

	@Override
	public INQUIRYBoardDto C_SelectBoardDetail(String seq) {
		log.info("C_SelectBoardDetail 성공");
		return dao.C_SelectBoardDetail(seq);
	}
	
	@Override
	public INQUIRYBoardDto S_SelectBoardDetail(String seq) {
		log.info("S_SelectBoardDetail 성공");
		return dao.S_SelectBoardDetail(seq);
	}

	@Override
	public List<INQUIRYBoardDto> S_allSelectBoard() {
		log.info("S_allSelectBoard 성공");
		return dao.S_allSelectBoard();
	}


}
