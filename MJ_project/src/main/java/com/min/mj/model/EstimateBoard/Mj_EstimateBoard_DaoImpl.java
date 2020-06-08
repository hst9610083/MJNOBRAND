package com.min.mj.model.EstimateBoard;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.MJ_ESTIMATEBoardDto;

@Repository
public class Mj_EstimateBoard_DaoImpl implements IMj_EstimateBoard_Dao{
	
	@Autowired
	SqlSession session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS = "com.min.mj.list.";

	
	
	@Override
	public List<MJ_ESTIMATEBoardDto> ESTIMATEALL(Map<String, Object> seq) {
		log.info("ESTIMATEALL 성공");
		return session.selectList(NS+"ESTIMATEALL");
	}

	@Override
	public List<MJ_ESTIMATEBoardDto> ESTIMATEDETAIL(Map<String, Object> seq) {
		log.info("ESTIMATEDETAIL 성공");
		return null;
	}

	@Override
	public List<MJ_ESTIMATEBoardDto> ESTIMATEDELETE(String seq) {
		log.info("ESTIMATEDELETE 성공");
		return null;
	}

}
