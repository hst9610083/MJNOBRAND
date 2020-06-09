package com.min.mj.model.member;

import java.util.List;

import org.springframework.stereotype.Service;

import com.min.mj.dtos.MJ_MemberDTO;

@Service
public class Mj_Member_ServiceImpl implements IMj_Member_Service {

	@Override
	public boolean s_register(MJ_MemberDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean c_register(MJ_MemberDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MJ_MemberDTO userlogin(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MJ_MemberDTO> s_info() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MJ_MemberDTO> c_info() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean s_getout(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean c_getout(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
