package com.min.mj.model.pay;

import java.util.List;

import com.min.mj.dtos.PayListDto;

public interface IMj_Pay_Service {

	//결제내역보기
	public List<PayListDto> PayList();
	
	
}
