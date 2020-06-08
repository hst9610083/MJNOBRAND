package com.min.mj.model.EstimateBoard;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.MJ_ESTIMATEBoardDto;

@Service
public class Mj_EstimateBoard_ServiceImpl implements IMj_EstimateBoard_Service {
	
	@Autowired
	private IMj_EstimateBoard_Service dao;
	
	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public List<MJ_ESTIMATEBoardDto> ESTIMATEALL(Map<String, Object> seq) {
		log.info("ESTIMATEALL 입니다");
		return dao.ESTIMATEALL(seq);
	}

	@Override
	public List<MJ_ESTIMATEBoardDto> ESTIMATEDETAIL(Map<String, Object> seq) {
		log.info("ESTIMATEDETAIL 입니다");
		return dao.ESTIMATEDETAIL(seq);
	}

	@Override
	public List<MJ_ESTIMATEBoardDto> ESTIMATEDELETE(String seq) {
		log.info("ESTIMATEDELETE 입니다");
		return dao.ESTIMATEDELETE(seq);
	}

}
