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

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhonnum() {
		return phonnum;
	}

	public void setPhonnum(String phonnum) {
		this.phonnum = phonnum;
	}

	public String getRealfile() {
		return realfile;
	}

	public void setRealfile(String realfile) {
		this.realfile = realfile;
	}

	public int getRegdate() {
		return regdate;
	}

	public void setRegdate(int regdate) {
		this.regdate = regdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	@Override
	public String toString() {
		return "MJ_MemberDTO [seq=" + seq + ", selpick=" + selpick + ", id=" + id + ", pw=" + pw + ", name=" + name
				+ ", address=" + address + ", nicname=" + nicname + ", sellernum=" + sellernum + ", email=" + email
				+ ", auth=" + auth + ", birth=" + birth + ", phonnum=" + phonnum + ", realfile=" + realfile
				+ ", regdate=" + regdate + ", title=" + title + ", content=" + content + ", imsi=" + imsi + "]";
	}
	
	



	
	
	
	
	
	

}
