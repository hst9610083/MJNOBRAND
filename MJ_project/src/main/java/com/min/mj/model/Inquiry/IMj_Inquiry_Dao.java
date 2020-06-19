package com.min.mj.model.Inquiry;

import java.util.List;
import java.util.Map;

import com.min.mj.dtos.INQUIRYBoardDto;

public interface IMj_Inquiry_Dao {

	
	

	
	//보관함 리스트 전체보기
	public List<INQUIRYBoardDto> Mstore_All();
	
	//보관함 상세보기
	public INQUIRYBoardDto Mstore_Detail(String seq);
	
	
	
	//보관함 삭제하기
	public boolean Mstore_Delete(String seq);
	
	
	
}
