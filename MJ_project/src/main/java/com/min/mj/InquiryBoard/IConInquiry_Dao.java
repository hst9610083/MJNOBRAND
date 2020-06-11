package com.min.mj.InquiryBoard;

import java.util.List;

import com.min.mj.dtos.INQUIRYBoardDto;

public interface IConInquiry_Dao {
	
	// 소비자문의게시판 (글 입력)(소비자)
	public List<INQUIRYBoardDto> InquiryInput(INQUIRYBoardDto dto);
	
	// 소비자문의게시판 (글 전체 조회)(소비자)
	public List<INQUIRYBoardDto> CInquiryAll();
	
	// 소비자문의게시판 (글 상세 조회)(소비자)
	public INQUIRYBoardDto SInquiryDetail(String seq);
	
	// 소비자문의 게시판 (글 전체 조회)(업체)
	public List<INQUIRYBoardDto> SInquiryAll();
	
	// 소비자 문의 게시판 (글 상세 조회)(업체)
	public INQUIRYBoardDto CInquiryDetail(String seq);

}
