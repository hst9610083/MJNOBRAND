package com.min.mj.model.ex;

import java.util.List;

import com.min.mj.dtos.BoardVO;
import com.min.mj.dtos.Criteria;
import com.min.mj.dtos.INQUIRYBoardDto;


public interface BoardService {

	// 게시글 작성
	public void write(INQUIRYBoardDto boardVO) throws Exception;
	
	// 게시물 목록 조회
	public List<INQUIRYBoardDto> list(Criteria cri) throws Exception;
	
	//게시물 총 갯수
	public int listCount() throws Exception;
	
	
	// 게시물  조회
	public INQUIRYBoardDto read(int seq) throws Exception;
	
	// 게시물 수정
		public void update(INQUIRYBoardDto boardVO) throws Exception;
		
		// 게시물 삭제
		public void delete(int seq) throws Exception;
		
		//권한 변환
		public void conversion(INQUIRYBoardDto boardVO) throws Exception;
}