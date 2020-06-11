package com.min.mj.model.member;

import java.util.List;

import com.min.mj.dtos.MJ_MemberDTO;

public interface IMj_Member_Service {

	/**
	 * 업체 회원가입(s_register)
	 * @param 회원가입 정보
	 * @return 회원 등록 성공 여부(true 성공)
	 */
	public boolean s_register(MJ_MemberDTO dto);
	
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


}

