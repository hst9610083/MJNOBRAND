package com.min.mj.InquiryBoard;

import java.util.List;

import com.min.mj.dtos.INQUIRYBoardDto;

public interface IConInquiry_Service {
	
	// 소비자문의게시판 (글 입력)(소비자)
	public boolean c_insertBoard(INQUIRYBoardDto dto);
	
	// 소비자문의게시판 (글 전체 조회)(소비자)
	public List<INQUIRYBoardDto> C_allSelectBoard();
	
	// 소비자문의게시판 (글 상세 조회)(소비자)
	public INQUIRYBoardDto C_SelectBoardDetail(String seq);
	
	// 소비자문의 게시판 (글 전체 조회)(업체)
	public List<INQUIRYBoardDto> S_allSelectBoard();
	
	// 소비자 문의 게시판 (글 상세 조회)(업체)
	public INQUIRYBoardDto S_SelectBoardDetail(String seq);
	
}

// 1