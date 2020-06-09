package com.min.mj.model.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.MJ_MemberDTO;

@Repository
public class Mj_Member_DaoImpl implements IMj_Member_Dao {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS="com.min.login.";
	
	@Autowired
	private SqlSessionTemplate sqlssion;
	
		
	
	
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
