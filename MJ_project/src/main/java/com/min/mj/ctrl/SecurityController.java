package com.min.mj.ctrl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.model.member.IMj_Member_Service;

public class SecurityController {

	@Autowired
	private IMj_Member_Service service;
	
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
			
			MJ_MemberDTO dto = service.userlogin(username);
			
			Collection<SimpleGrantedAuthority> roles= new ArrayList<SimpleGrantedAuthority>();
			roles.add(new SimpleGrantedAuthority(dto.getAuth()));
			
			UserDetails user = new User(username, dto.getPw(), roles);
			return user;
			
		}
}
