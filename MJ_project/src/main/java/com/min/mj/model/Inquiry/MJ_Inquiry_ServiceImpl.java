package com.min.mj.model.Inquiry;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.INQUIRYBoardDto;

@Service
public class MJ_Inquiry_ServiceImpl implements IMj_Inquiry_Service {

	@Inject
	private IMj_Inquiry_Dao dao2;
	
	
	@Autowired
	private IMj_Inquiry_Dao dao;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	
	
	

	@Override
	public List<INQUIRYBoardDto> Mstore_All() {
		log.info("Mstore_All 성공");
		return dao.Mstore_All();
	}

	@Override
	public INQUIRYBoardDto Mstore_Detail(String seq) {
		log.info("Mstore_Detail 성공");
		return dao.Mstore_Detail(seq);
	}


	@Override
	public boolean Mstore_Delete(String seq) {
		log.info("Mstore_Delete 성공");
		return dao.Mstore_Delete(seq);
	}



	

}
