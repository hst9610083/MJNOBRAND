package com.min.mj.model.Esti;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.EstiDto;

@Repository
public class MJ_Esti_DaoImpl implements IMj_Esti_Dao {

	@Autowired
	SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS="com.min.Esti.";
	
	@Override
	public List<EstiDto> Cesti_All(String seq) {
		log.info("Cesti_All 성공");
		return session.selectList(NS+"Cesti_All",seq);
	}

	@Override
	public List<EstiDto> Cesti_Detail(String seq) {
		log.info("Cesti_Detail 성공");
		return session.selectList(NS+"Cesti_Detail",seq);
	}

	@Override
	public boolean Cesti_Delete(String seq) {
		log.info("Cesti_Delete 성공");
		int n = session.delete(NS+"Cesti_Delete",seq);
		return (n>0)?true:false;
	}

	@Override
	public List<EstiDto> Sesti_All(String seq) {
		log.info("Sesti_All 성공");
		return session.selectList(NS+"Sesti_All",seq);
	}

	@Override
	public List<EstiDto> Sesti_Detail(String seq) {
		log.info("Sesti_Detail 성공");
		return session.selectList(NS+"Sesti_Detail",seq);
	}

}
