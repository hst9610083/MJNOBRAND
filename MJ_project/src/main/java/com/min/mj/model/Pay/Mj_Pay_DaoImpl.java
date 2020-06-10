package com.min.mj.model.Pay;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.PayListDto;
@Repository
public class Mj_Pay_DaoImpl implements IMj_Pay_Dao {

	@Autowired
	SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS="com.min.pay.";
	
	@Override
	public List<PayListDto> PayList() {
		log.info("PayList 성공");
		return session.selectList(NS+"PayList");
	}

}
//