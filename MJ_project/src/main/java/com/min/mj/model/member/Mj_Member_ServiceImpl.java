package com.min.mj.model.member;

import java.util.List;

import org.springframework.stereotype.Service;

import com.min.mj.dtos.MJ_MemberDTO;

@Service
public class Mj_Member_ServiceImpl implements IMj_Member_Service {

	
	private IMj_Member_Dao dao;
	
	@Override
	public boolean s_register(MJ_MemberDTO dto) {
		System.out.println(dto+"1");
		return dao.s_register(dto);
	}

	@Override
	public boolean c_register(MJ_MemberDTO dto) {
		System.out.println(dto+"2");
		return dao.c_register(dto);
	}

	@Override
	public MJ_MemberDTO userlogin(String id) {
		System.out.println(id+"3");
		return dao.userlogin(id);
	}

	@Override
	public List<MJ_MemberDTO> s_info() {
		System.out.println("4");
		return dao.s_info();
	}

	@Override
	public List<MJ_MemberDTO> c_info() {
		System.out.println("5");
		return dao.c_info();
	}

	@Override
	public boolean s_getout(String id) {
		System.out.println(id+"6");
		return dao.s_getout(id);
	}

	@Override
	public boolean c_getout(String id) {
		System.out.println(id+"7");
		return dao.c_getout(id);
	}

	@Override
	public boolean C_modify(String id) {
		System.out.println(id+"8");
		return dao.C_modify(id);
	}

	@Override
	public boolean S_modify(String id) {
		System.out.println(id+"9");
		return dao.S_modify(id);
	}

}
