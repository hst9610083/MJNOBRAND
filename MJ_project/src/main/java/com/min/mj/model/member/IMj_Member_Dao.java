package com.min.mj.model.member;

import com.min.mj.dtos.MJ_MemberDTO;

public interface IMj_Member_Dao {

	// 로그인
	public MJ_MemberDTO userlogin();
	
	// 업체 회원가입
	public boolean s_register();
	
	// 소비자 회원가입
	public boolean c_register();
	
	// 업체 정보 조회
	public MJ_MemberDTO s_info();
	
	// 업체 탈퇴
	public boolean s_getout();
	
	// 소비자 정보 조회
	public MJ_MemberDTO c_info();
	
	// 소비자 회원 탈퇴
	public boolean c_getout();
	
	
	
	
}
