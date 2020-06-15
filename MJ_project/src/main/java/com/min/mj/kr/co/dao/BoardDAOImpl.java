package com.min.mj.kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.min.mj.kr.co.vo.BoardVO;
import com.min.mj.kr.co.vo.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper2.insert", boardVO);
		
	}

	@Override
	public List<BoardVO> list(Criteria cri) throws Exception {
		
		return sqlSession.selectList("boardMapper2.listPage",cri);
	}
	
	@Override
	public int listCount() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardMapper2.listCount");
	}
	
	// 게시물 조회
	@Override
	public BoardVO read(int bno) throws Exception {
			
		return sqlSession.selectOne("boardMapper2.read", bno);
	}
	
	
	// 게시물 수정
		@Override
		public void update(BoardVO boardVO) throws Exception {
			
			sqlSession.update("boardMapper2.update", boardVO);
		}

		// 게시물 삭제
		@Override
		public void delete(int bno) throws Exception {
			
			sqlSession.delete("boardMapper2.delete", bno);
		}

	

}