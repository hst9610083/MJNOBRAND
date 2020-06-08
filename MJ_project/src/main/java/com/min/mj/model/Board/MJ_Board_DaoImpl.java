package com.min.mj.model.Board;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.RowNumDto;

@Repository
public class MJ_Board_DaoImpl implements IMj_Board_Dao {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS = "com.min.pplboard.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<MJ_BoardDTO> pplSelectBoard() {
		log.info("홍보게시판 전체 리스트 : pplSelectBoard");
		return sqlSession.selectList(NS+ "pplSelectBoard");
	}

	@Override
	public MJ_BoardDTO pplgetOnBoard(String seq) {
		log.info("홍보게시판 상세보기 : pplgetOnBoard");
		return sqlSession.selectOne(NS+"pplgetOnBoard",seq);
	}

	@Override
	public boolean pplWriteBoard(MJ_BoardDTO dto) {
		log.info("홍보게시판 글쓰기 : pplWriteBoard");
		int n = sqlSession.insert(NS+"pplWriteBoard", dto);
		return (n>0)?true:false;
	}

	//나중에 수정
	@Override
	public boolean pplReadcountBoard(String seq) {
		log.info("홍보게시판 조회수 : pplReadcountBoard");
		int n = sqlSession.update(NS+"");
		return false;
	}

	@Override
	public boolean pplModifyBoard(MJ_BoardDTO dto) {
		log.info("홍보게시판 수정 : pplModifyBoard");
		int n = sqlSession.update(NS+"pplModifyBoard",dto);
		return (n>0)?true:false;
	}

	@Override
	public boolean pplDelBoard(String seq) {
		log.info("홍보게시판 삭제 : pplDelBoard ");
		int n = sqlSession.update(NS+"pplDelBoard",seq);
		return (n>0)?true:false;
	}

	@Override
	public boolean pplMultiDel(Map<String, String[]> map) {
		log.info("홍보게시판 다중삭제 : pplMultiDel");
		int n = sqlSession.update(NS+"pplMultiDel", map);
		return (n>0)?true:false;
	}

	@Override
	public List<MJ_BoardDTO> BoardListRow(RowNumDto dto) {
		log.info("홍보게시팡 페이징처리 : pplPaging");
		return sqlSession.selectList(NS+"pplPaging",dto);
	}

	@Override
	public int BoardListTotal() {
		log.info("홍보게시판 전체글 갯수 : BoardListTotal");
		return sqlSession.selectOne(NS+"BoardListTotal");
	}

}
