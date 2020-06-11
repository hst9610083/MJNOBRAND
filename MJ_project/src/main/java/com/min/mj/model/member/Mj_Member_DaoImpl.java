package com.min.mj.model.member;


import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.MJ_MemberDTO;


@Repository

public class Mj_Member_DaoImpl implements IMj_Member_Dao {
	


	private Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NS="com.min.login.";
	
	
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

		
	
	
	@Override
	public boolean s_register(MJ_MemberDTO dto) {
		String enPw = passwordEncoder.encode(dto.getPw());
		dto.setPw(enPw);

		return session.insert(NS+"signUp", dto) > 0 ? true : false;
	}

	@Override
	public boolean c_register(MJ_MemberDTO dto) {
		String enPw = passwordEncoder.encode(dto.getPw());
		dto.setPw(enPw);
		return session.insert(NS+"signUp", dto) > 0 ? true : false;
	}

	@Override
	public MJ_MemberDTO userlogin(String id) {
		return session.selectOne(NS+"userlogin", id);
	}

	@Override
	public List<MJ_MemberDTO> s_info() {
		return session.selectList(NS+"s_info");
	}

	@Override
	public List<MJ_MemberDTO> c_info() {
		return session.selectList(NS+"c_info");
	}

	@Override
	public boolean s_getout(String id) {
		int n = session.update(NS+"s_getout",id);
		return (n>0)?true:false;
	}

	@Override
	public boolean c_getout(String id) {
		int n = session.update(NS+"c_getout",id);
		return (n>0)?true:false;
	}

	@Override
	public boolean C_modify(String id) {
		int n = session.update(NS+"C_modify", id);
		return (n>0)?true:false;
	}

	@Override
	public boolean S_modify(String id) {
		int n =session.update(NS+"S_modify", id);
		return (n>0)?true:false;
	}

}
