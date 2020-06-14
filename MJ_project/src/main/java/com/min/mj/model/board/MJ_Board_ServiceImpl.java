package com.min.mj.model.board;

import java.util.List;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.RowNumDto;

@Service
public class MJ_Board_ServiceImpl implements IMj_Board_Service {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMj_Board_Dao dao;
	
	@Override
	public List<MJ_BoardDTO> pplSelectBoard() {
		log.info("pplSelectBoard 전체보기");
		return dao.pplSelectBoard();
	}

	@Override
	public MJ_BoardDTO pplgetOnBoard(String seq) {
		log.info("pplgetOnBoard 상세글 보기{}",seq);
		return dao.pplgetOnBoard(seq);
	}

	@Override
	public boolean pplWriteBoard(MJ_BoardDTO dto) {
		log.info("pplWriteBoard 글쓰기{}",dto);
		return dao.pplWriteBoard(dto);
	}

//	//니중에 수정
//	public boolean pplReadcountBoard(String seq) {
//		log.info("pplReadcountBoard 조회수{}",seq);
//		return dao.pplReadcountBoard(seq);
//	}

	@Override
	public boolean pplModifyBoard(MJ_BoardDTO dto) {
		log.info("pplModifyBoard 글수정{}",dto);
		return dao.pplModifyBoard(dto);
	}

	@Override
	public boolean pplDelBoard(String seq) {
		log.info("pplDelBoard 삭제{}",seq);
		return dao.pplDelBoard(seq);
	}

	@Override
	public boolean pplMultiDel(Map<String, String[]> map) {
		log.info("pplMultiDel 다중삭제{}",map);
		return dao.pplMultiDel(map);
	}

	@Override
	public List<MJ_BoardDTO> BoardListRow(RowNumDto dto) {
		log.info("BoardListRow 게시판 페이징 처리 {}",dto);
		return dao.BoardListRow(dto);
	}

	@Override
	public int BoardListTotal() {
		log.info("BoardListTotal 게시판 글 총 갯수{}");
		return dao.BoardListTotal();
	}

}
