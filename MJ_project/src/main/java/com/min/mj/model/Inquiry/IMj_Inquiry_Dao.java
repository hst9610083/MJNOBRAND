package com.min.mj.model.Inquiry;

import java.util.List;
import java.util.Map;

import com.min.mj.dtos.INQUIRYBoardDto;

public interface IMj_Inquiry_Dao {

	//문의글 임시보관함 리스트 전체보기
	public List<INQUIRYBoardDto> Mimsi_All();
	
	//문의글 임시보관함 상세보기
	public  INQUIRYBoardDto Mimsi_Detail(String seq);
	

	
	//문의글 임시 보관함 수정하기
	public boolean Mimsi_modify(INQUIRYBoardDto dto);
	
	//문의글 임시 보관함 삭제하기
	public boolean MiImsi_Delete(String seq);
	
	//보관함 리스트 전체보기
	public List<INQUIRYBoardDto> Mstore_All();
	
	//보관함 상세보기
	public INQUIRYBoardDto Mstore_Detail(String seq);
	
	//보관함 수정하기
	public boolean Mstore_modify(INQUIRYBoardDto dto);
	
	//보관함 삭제하기
	public boolean Mstore_Delete(String seq);
	
}
