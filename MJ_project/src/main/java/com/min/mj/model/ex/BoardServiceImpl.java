package com.min.mj.model.ex;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;


import com.min.mj.dtos.Criteria;
import com.min.mj.dtos.INQUIRYBoardDto;



@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	
	// 게시글 작성
	@Override
	public void write(INQUIRYBoardDto boardVO) throws Exception {
		dao.write(boardVO);
	}

	//게시글 목록 조회
	@Override
	public List<INQUIRYBoardDto> list(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(cri);
	}
	//게시물 총 갯수
	@Override
	public int listCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.listCount();
	}
	
	// 게시물  조회
	@Override
	public INQUIRYBoardDto read(int seq) throws Exception {

		return dao.read(seq);
	}
	
	@Override
	public void update(INQUIRYBoardDto boardVO) throws Exception {

		dao.update(boardVO);
	}

	@Override
	public void delete(int seq) throws Exception {
		
		dao.delete(seq);
	}

	@Override
	public void conversion(INQUIRYBoardDto boardVO) throws Exception {
		
	dao.conversion(boardVO);
		
	}

	

}