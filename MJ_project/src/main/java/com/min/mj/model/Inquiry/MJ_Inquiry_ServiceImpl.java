package com.min.mj.model.Inquiry;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.INQUIRYBoardDto;

@Service
public class MJ_Inquiry_ServiceImpl implements IMj_Inquiry_Service {

	@Autowired
	private IMj_Inquiry_Dao dao;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	
	@Override
	public List<INQUIRYBoardDto> Mimsi_All() {
		log.info("Mimsi_All 성공");
		return dao.Mimsi_All();
	}

	@Override
	public List<INQUIRYBoardDto> Mimsi_Detail(String seq) {
		log.info("Mimsi_Detail 성공");
		return dao.Mimsi_Detail(seq);
	}

	@Override
	public boolean Mimsi_modify(INQUIRYBoardDto dto) {
		log.info("Mimsi_modify 성공");
		return dao.Mimsi_modify(dto);
	}

	@Override
	public boolean MiImsi_Delete(String seq) {
		log.info("MiImsi_Delete 성공");
		return dao.MiImsi_Delete(seq);
	}

	@Override
	public List<INQUIRYBoardDto> Mstore_All() {
		log.info("Mstore_All 성공");
		return dao.Mstore_All();
	}

	@Override
	public List<INQUIRYBoardDto> Mstore_Detail(String seq) {
		log.info("Mstore_Detail 성공");
		return dao.Mstore_Detail(seq);
	}

	@Override
	public boolean Mstore_modify(INQUIRYBoardDto dto) {
		log.info("Mstore_modify 성공");
		return dao.Mstore_modify(dto);
	}

	@Override
	public boolean Mstore_Delete(String seq) {
		log.info("Mstore_Delete 성공");
		return dao.Mstore_Delete(seq);
	}

}
