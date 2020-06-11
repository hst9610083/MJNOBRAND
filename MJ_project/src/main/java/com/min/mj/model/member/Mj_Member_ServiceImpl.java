package com.min.mj.model.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.MJ_MemberDTO;

@Service
public class Mj_Member_ServiceImpl implements IMj_Member_Service {

	@Autowired
	private IMj_Member_Dao dao;
	
	@Override
	public boolean s_register(MJ_MemberDTO dto) {
		System.out.println("ServiceImpl>>"+dto+"s_register");
		return dao.s_register(dto);
	}

	@Override
	public boolean c_register(MJ_MemberDTO dto) {
		System.out.println("ServiceImpl>>"+dto+">>c_register");
		return dao.c_register(dto);
	}

	@Override
	public MJ_MemberDTO userlogin(String id) {
		System.out.println("ServiceImpl>>"+id+">>userlogin");
		return dao.userlogin(id);
	}

	@Override
	public List<MJ_MemberDTO> s_info() {
		System.out.println("ServiceImpl>>"+">>s_info");
		return dao.s_info();
	}

	@Override
	public List<MJ_MemberDTO> c_info() {
		System.out.println("ServiceImpl>>"+">>c_info");
		return dao.c_info();
	}

	@Override
	public boolean s_getout(String id) {
		System.out.println("ServiceImpl>>"+id+">>s_getout");
		return dao.s_getout(id);
	}


	@Override
	public boolean s_modify(String id) {
		System.out.println("ServiceImpl"+id+">>s_modify");
		return dao.s_modify(id);
	}

}
