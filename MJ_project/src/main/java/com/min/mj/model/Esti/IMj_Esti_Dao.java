package com.min.mj.model.Esti;

import java.util.List;

import com.min.mj.dtos.EstiDto;

public interface IMj_Esti_Dao {


	//견적서 리스트 전체보기(소비자) 
	public List<EstiDto> Cesti_All(String seq);
	
	//견적서 상세보기(소비자)
	public List<EstiDto> Cesti_Detail(String seq);
	
	//견적서 삭제하기(소비자)
	public boolean Cesti_Delete(String seq);
	
	//견적서 리스트 전체보기(업체)
	public List<EstiDto> Sesti_All(String seq);
	
	//견적서 리스트 상세보기(업체)
	public List<EstiDto> Sesti_Detail(String seq);
}
