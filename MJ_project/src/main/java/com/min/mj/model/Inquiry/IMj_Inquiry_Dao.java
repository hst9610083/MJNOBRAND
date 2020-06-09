package com.min.mj.model.Inquiry;

import java.util.List;

import com.min.mj.dtos.INQUIRYBoardDto;

public interface IMj_Inquiry_Dao {

	//문의글 임시보관함 리스트 전체보기
	public List<INQUIRYBoardDto> Mimsi_All();
	
	//문의글 임시보관함 상세보기
	public List<INQUIRYBoardDto> Mimsi_Detail(String seq);
	
	//문의글 임시 보관함 수정하기
	public boolean Mimsi_modify(String seq);
	
	//문의글 임시 보관함 삭제하기
	public boolean MiImsi_Delete(String seq);
	
	//보관함 리스트 전체보기
	public List<INQUIRYBoardDto> Mstore_All();
	
	//보관함 상세보기
	public List<INQUIRYBoardDto> Mstore_Detail(String seq);
	
	//보관함 수정하기
	public boolean Mstore_modify(String seq);
	
	//보관함 삭제하기
	public boolean Mstore_Delete(String seq);
	
}