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
	private String birth;
	private int phonnum;
	private String auth;




	public MJ_MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}


	public MJ_MemberDTO(int seq, String id, String pw, String name, String address, String nicname, String birth,
			int phonnum, String auth) {
		super();
		this.seq = seq;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.nicname = nicname;
		this.birth = birth;
		this.phonnum = phonnum;
		this.auth = auth;
	}


	public MJ_MemberDTO(int seq, String selpick, String id, String pw, String name, String address, String nicname,
			String sellernum, String email, String auth) {
		super();
		this.seq = seq;
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


	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getSelpick() {
		return selpick;
	}


	public void setSelpick(String selpick) {
		this.selpick = selpick;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNicname() {
		return nicname;
	}


	public void setNicname(String nicname) {
		this.nicname = nicname;
	}


	public String getSellernum() {
		return sellernum;
	}


	public void setSellernum(String sellernum) {
		this.sellernum = sellernum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhonnum() {
		return phonnum;
	}


	public void setPhonnum(int phonnum) {
		this.phonnum = phonnum;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getAuth() {
		return auth;
	}


	public void setAuth(String auth) {
		this.auth = auth;
	}


	public MJ_MemberDTO() {
	}
	

	@Override
	public String toString() {
		return "MJ_MemberDTO [seq=" + seq + ", selpick=" + selpick + ", id=" + id + ", pw=" + pw + ", name=" + name
				+ ", address=" + address + ", nicname=" + nicname + ", sellernum=" + sellernum + ", email=" + email
				+ ", phonnum=" + phonnum + ", birth=" + birth + ", auth=" + auth + "]";
	}


	
	
}
