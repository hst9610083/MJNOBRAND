package com.min.mj.model.Board;

import java.util.List;
import java.util.Map;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.RowNumDto;

public class MJ_Board_ServiceImpl implements IMj_Board_Service {

	@Override
	public List<MJ_BoardDTO> pplSelectBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MJ_BoardDTO pplgetOnBoard(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pplWriteBoard(MJ_BoardDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pplReadcountBoard(String seq) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pplModifyBoard(MJ_BoardDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pplDelBoard(String seq) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pplMultiDel(Map<String, String[]> map) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MJ_BoardDTO> BoardListRow(RowNumDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int BoardListTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
