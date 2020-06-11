package com.min.mj.model.Inquiry;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.INQUIRYBoardDto;

@Repository
public class MJ_Inquiry_DaoImpl implements IMj_Inquiry_Dao{

	@Autowired
	SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS="com.min.inquiry.";
	
	@Override
	public List<INQUIRYBoardDto> Mimsi_All() {
		log.info("Mimsi_All 성공");
		return session.selectList(NS+"Mimsi_All");
	}

	@Override
	public INQUIRYBoardDto Mimsi_Detail(String seq) {
		log.info("Mimsi_Detail 성공");
		return session.selectOne(NS+"Mimsi_Detail",seq);
	}

	@Override
	public boolean Mimsi_modify(String seq) {
		log.info("Mimsi_modify 성공");
		int n=session.update(NS+"Mimsi_modify",seq);
		return (n>0)?true:false;
	}

	@Override
	public boolean MiImsi_Delete(String seq) {
		log.info("MiImsi_Delete 성공");
		int n = session.delete(NS+"MiImsi_Delete", seq);
		return (n>0)?true:false;
	}

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
	public boolean Mstore_modify(String seq) {
		log.info("Mstore_modify 성공");
		int n =session.update(NS+"Mstore_modify", seq);
		return (n>0)?true:false;
	}

	@Override
	public boolean Mstore_Delete(String seq) {
		log.info("Mstore_Delete 성공");
		int n=session.delete(NS+"Mstore_Delete", seq);
		return (n>0)?true:false;
	}

}
