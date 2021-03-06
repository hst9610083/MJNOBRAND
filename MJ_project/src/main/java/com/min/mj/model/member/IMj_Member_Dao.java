package com.min.mj.model.member;

import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.dtos.RowNumDto;

import java.util.List;
public interface IMj_Member_Dao {
	/**
	 * 업체 회원가입(s_register)
	 * @param 회원가입 정보
	 * @return 회원 등록 성공 여부(true 성공)
	 */
	public boolean s_register(MJ_MemberDTO dto);
	/**
	 * 아이디 중복 검사(idDuplicateCheck)
	 * @param 중복확인값
	 * @return 사용가능 여부(true 사용가능)
	 */
	public boolean idDuplicateCheck(String id);
	
	/**
	 * 소비자 회원가입(c_register)
	 * @param 회원가입 정보
	 * @return 회원 등록 성공 여부(true 성공)
	 */
	public boolean c_register(MJ_MemberDTO dto);
	
	/**
	 * 로그인(userlogin)
	 * @param 로그인 정보 값
	 * @return 로그인 한 회원의 정보 값
	 */
	public MJ_MemberDTO userlogin(String id);
	
	
	public List<MJ_MemberDTO> info();
	
	/**
	 * 업체 정보(s_info)
	 * @return 업체 정보 리스트 
	 */
	public List<MJ_MemberDTO> s_info();
	
	
	/**
	 * 소비자 정보(c_info)
	 * @return 소비자 정보 리스트 
	 */
	public List<MJ_MemberDTO> c_info();
	
	/**
	 * 회원 탈퇴
	 * @param id
	 * @return 업체 탈퇴 (관리자 모드)
	 */
	public boolean s_getout(String id);


	//회원 정보 수정
	public boolean s_modify(String id);

//	public List<MJ_MemberDTO> infoListRow(RowNumDto dto);
//	
//	public int infoListTotal();
	

//	아이디 찾기
	public  MJ_MemberDTO findid(MJ_MemberDTO dto);
	
//	소비자 아이디 찾기
	public  MJ_MemberDTO findid_C(MJ_MemberDTO dto);


	
}
