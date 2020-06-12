
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
	
	
	//첫번째 오류 수정사항
	@Autowired
	private SqlSessionTemplate session;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
		
	
	
	@Override
	public boolean s_register(MJ_MemberDTO dto) {
		System.out.println("DaoImpl>>"+dto+">>s_register");
		String enPw = passwordEncoder.encode(dto.getPw());
		dto.setPw(enPw);
		int n= session.insert(NS+"s_register", dto);
		return  (n > 0)? true : false;
	}
	@Override
	public boolean c_register(MJ_MemberDTO dto) {
		System.out.println("DaoImpl>>"+dto+">>c_register");
		String enPw = passwordEncoder.encode(dto.getPw());
		dto.setPw(enPw);
		int n= session.insert(NS+"c_register", dto);
		return  (n > 0)? true : false;
	}
	@Override
	public MJ_MemberDTO userlogin(String id) {
		System.out.println("DaoImpl>>"+id+">>userlogin");
		return session.selectOne(NS+"userlogin", id);
	}
	@Override
	public List<MJ_MemberDTO> s_info() {
		System.out.println("DaoImpl>>"+">>s_info");
		return session.selectList(NS+"s_info");
	}
	@Override
	public List<MJ_MemberDTO> c_info() {
		System.out.println("DaoImpl>>"+">>c_info");
		return session.selectList(NS+"c_info");
	}
	@Override
	public boolean s_getout(String id) {
		System.out.println("DaoImpl>>"+id+">>s_getout");
		int n = session.update(NS+"s_getout",id);
		return (n>0)?true:false;
	}
	@Override
	public boolean s_modify(String id) {
		System.out.println("DaoImpl>>"+id+">>s_modify");
		int n =session.update(NS+"s_modify", id);
		return (n>0)?true:false;
	}
	@Override
	public List<MJ_MemberDTO> info(MJ_MemberDTO dto) {
		// TODO Auto-generated method stub
		return session.selectList(NS+"info",dto);
	}
}

