package com.min.mj.model.EstimateBoard;

import java.util.List;
import java.util.Map;

import com.min.mj.dtos.MJ_ESTIMATEBoardDto;

public interface IMj_EstimateBoard_Dao {

//견적서 리스트 전체보기
public List<MJ_ESTIMATEBoardDto> ESTIMATEALL(Map<String, Object > seq);

//견적서 상세보기 
public List<MJ_ESTIMATEBoardDto> ESTIMATEDETAIL(Map<String, Object> seq);

//견적서 삭제하기
public List<MJ_ESTIMATEBoardDto> ESTIMATEDELETE(String seq);


}
