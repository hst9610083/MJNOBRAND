package com.min.mj.dtos;

import java.io.Serializable;

//회원가입
public class MJ_MemberDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4513687978424253222L;
	
	private int seq;
	private String selpick;
	private String id;
	private String pw;
	private String name;
	private String address;
	private String nicname;
	private String sellernum;
	private String email;
	private String auth;
	private String birth;
	private String phonnum;
	private String realfile;
	private int regdate;
	private String title;
	private String content;
	private String imsi;
	
	public MJ_MemberDTO() {
	}
	
	// 로그인
	public MJ_MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// 업체 회원가입
	public MJ_MemberDTO(String selpick, String id, String pw, String name, String address, String nicname,
			String sellernum, String email, String auth) {
		this.selpick = selpick;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.nicname = nicname;
		this.sellernum = sellernum;
		this.email = email;
		this.auth = auth;
	}



	// 소비자 회원가입
	public MJ_MemberDTO(String id, String pw, String name, String address, String nicname, String auth, String birth,
			String phonnum) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.nicname = nicname;
		this.auth = auth;
		this.birth = birth;
		this.phonnum = phonnum;
	}



	
	
	
	
	
	

}
