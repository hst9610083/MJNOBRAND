package com.min.model.pay;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.PayListDto;

@Service
public class Mj_Pay_ServiceImpl implements IMj_Pay_Service {

	@Autowired
	private IMj_Pay_Service dao;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public List<PayListDto> PayList() {
		log.info("PayList 성공");
		return dao.PayList();
	}

}
