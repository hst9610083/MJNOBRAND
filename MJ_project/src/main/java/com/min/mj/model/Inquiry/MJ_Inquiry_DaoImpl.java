package com.min.mj.model.Inquiry;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.INQUIRYBoardDto;

@Repository
public class MJ_Inquiry_DaoImpl implements IMj_Inquiry_Dao{

	@Inject
	private SqlSession sqlSession;
	
	@Autowired
	SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS="com.min.inquiry.";
	

	
	
	@Override
	public List<INQUIRYBoardDto> Mstore_All() {
		log.info("Mstore_All 성공");
		return session.selectList(NS+"Mstore_All");
	}

	@Override
	public INQUIRYBoardDto Mstore_Detail(String seq) {
		log.info("Mstore_Detail 성공");
		return session.selectOne(NS+"Mstore_Detail",seq);
	}



	@Override
	public boolean Mstore_Delete(String seq) {
		log.info("Mstore_Delete 성공");
		int n=session.delete(NS+"Mstore_Delete", seq);
		return (n>0)?true:false;
	}

	
	

}
