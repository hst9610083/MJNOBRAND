package com.min.mj.model.Esti;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.EstiDto;

@Service
public class MJ_Esti_ServiceImpl implements IMj_Esti_Service {

	
	@Autowired
	private IMj_Esti_Dao dao;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public List<EstiDto> Cesti_All() {
		log.info("Cesti_All 성공");
		return dao.Cesti_All();
	}

	@Override
	public EstiDto Cesti_Detail(String seq) {
		log.info("Cesti_Detail 성공");
		return dao.Cesti_Detail(seq);
	}
	

	@Override
	public boolean Cesti_Delete(String seq) {
		log.info("Cesti_Delete 성공");
		return dao.Cesti_Delete(seq);
	}

	@Override
	public List<EstiDto> Sesti_All() {
		log.info("Sesti_All 성공");
		return dao.Sesti_All();
	}

	@Override
	public EstiDto Sesti_Detail(String seq) {
		log.info("Sesti_Detail 성공");
		return dao.Sesti_Detail(seq);
	}

	@Override
	public boolean EstiInput(EstiDto dto) {
		log.info("EstiInput 글쓰기",dto);
		return dao.EstiInput(dto);
	}

}
