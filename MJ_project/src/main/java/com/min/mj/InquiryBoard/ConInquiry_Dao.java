package com.min.mj.InquiryBoard;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.INQUIRYBoardDto;
@Repository
public class ConInquiry_Dao implements IConInquiry_Dao {
	
	@Autowired
	SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS="com.min.inquiry.";

	   @Override
	   public boolean c_insertBoard(INQUIRYBoardDto dto) {
	      log.info("c_insertBoard 성공");
	      int n = session.update(NS+"c_insertBoard",dto);
	      return (n>0)?true:false;
	   }

	@Override
	public List<INQUIRYBoardDto> C_allSelectBoard() {
		log.info("C_allSelectBoard 성공");
		return session.selectList(NS+"C_allSelectBoard");
	}

	@Override
	public INQUIRYBoardDto C_SelectBoardDetail(String seq) {
		log.info("C_SelectBoardDetail 성공");
		return session.selectOne(NS+"C_SelectBoardDetail",seq);
	}

	@Override
	public List<INQUIRYBoardDto> S_allSelectBoard() {
		log.info("S_allSelectBoard 성공");
		return session.selectList(NS+"S_allSelectBoard");
	}

	@Override
	public INQUIRYBoardDto S_SelectBoardDetail(String seq) {
		log.info("S_SelectBoardDetail 성공");
		return session.selectOne(NS+"S_SelectBoardDetail",seq);
	}

}
