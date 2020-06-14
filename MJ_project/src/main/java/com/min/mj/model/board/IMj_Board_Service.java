package com.min.mj.model.board;

import java.util.List;
import java.util.Map;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.RowNumDto;

public interface IMj_Board_Service {

	//홍보게시판 리스트 전체보기
	public List<MJ_BoardDTO> pplSelectBoard();
	
	//홍보게시판 상세보기
	public MJ_BoardDTO pplgetOnBoard(String seq);
	
	//홍보게시판 글등록
	public boolean pplWriteBoard(MJ_BoardDTO dto);
	
	//홍보게시판 조회수
//	public boolean pplReadcountBoard(String seq);
	
//	홍보게시판 수정
	public boolean pplModifyBoard(MJ_BoardDTO dto);
	
	//홍보게시판 삭제
	public boolean pplDelBoard(String seq);
	
	//홍보게시판 다중삭제
	public boolean pplMultiDel(Map<String, String[]> map);
	
	//페이징 조회
	public List<MJ_BoardDTO> BoardListRow(RowNumDto dto);
	
	//리스트 토탈 갯수
	public int BoardListTotal();
}
