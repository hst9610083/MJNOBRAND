package com.min.mj.model.member;

import java.util.List;

import org.springframework.stereotype.Service;

import com.min.mj.dtos.MJ_MemberDTO;

@Service
public class Mj_Member_ServiceImpl implements IMj_Member_Service {

	
	private IMj_Member_Dao dao;
	
	@Override
	public boolean s_register(MJ_MemberDTO dto) {
		
		return dao.s_register(dto);
	}

	@Override
	public boolean c_register(MJ_MemberDTO dto) {
		
		return dao.c_register(dto);
	}

	@Override
	public MJ_MemberDTO userlogin(String id) {
	
		return dao.userlogin(id);
	}

	@Override
	public List<MJ_MemberDTO> s_info() {
		
		return dao.s_info();
	}

	@Override
	public List<MJ_MemberDTO> c_info() {
		return dao.c_info();
	}

	@Override
	public boolean s_getout(String id) {
		return dao.s_getout(id);
	}

	@Override
	public boolean c_getout(String id) {
		return dao.c_getout(id);
	}

}
