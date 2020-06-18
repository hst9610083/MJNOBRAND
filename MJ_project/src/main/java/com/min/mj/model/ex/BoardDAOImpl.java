package com.min.mj.model.ex;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.BoardVO;
import com.min.mj.dtos.Criteria;
import com.min.mj.dtos.INQUIRYBoardDto;



@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	
	// 게시글 작성
	@Override
	public void write(INQUIRYBoardDto boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
		
	}

	@Override
	public List<INQUIRYBoardDto> list(Criteria cri) throws Exception {
		
		return sqlSession.selectList("boardMapper.listPage",cri);
	}
	
	@Override
	public int listCount() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper.listCount");
	}
	
	// 게시물 조회
	@Override
	public INQUIRYBoardDto read(int seq) throws Exception {
			
		return sqlSession.selectOne("boardMapper.read", seq);
	}
	
	
	// 게시물 수정
		@Override
		public void update(INQUIRYBoardDto boardVO) throws Exception {
			
			sqlSession.update("boardMapper.update", boardVO);
		}

		// 게시물 삭제
		@Override
		public void delete(int seq) throws Exception {
			
			sqlSession.delete("boardMapper.delete", seq);
		}

		
		//권한 변환
		@Override
		public void conversion(INQUIRYBoardDto boardVO) throws Exception {
			
			sqlSession.update("boardMapper.conversion", boardVO);
		}

	

}