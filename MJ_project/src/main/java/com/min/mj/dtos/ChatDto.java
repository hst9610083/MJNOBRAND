package com.min.mj.dtos;

import java.io.Serializable;

public class ChatDto implements Serializable{
	
	
	private static final long serialVersionUID = 352616505012997585L;
	
	
	private String chatseq;
	private String userid;
	private String touserid;
	private String chatcontent;
	private String chattime; // 소캣정보
	
	public ChatDto() {
	}

	public ChatDto(String userid) {
		super();
		this.userid = userid;
	}
	
	
	
	public ChatDto(String userid, String touserid, String chatcontent) {
		super();
		this.userid = userid;
		this.touserid = touserid;
		this.chatcontent = chatcontent;
	}




	public ChatDto(String chatseq, String userid, String touserid, String chatcontent, String chattime) {
		super();
		this.chatseq = chatseq;
		this.userid = userid;
		this.touserid = touserid;
		this.chatcontent = chatcontent;
		this.chattime = chattime;
	}
	

	public String getChatseq() {
		return chatseq;
	}

	public void setChatseq(String chatseq) {
		this.chatseq = chatseq;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTouserid() {
		return touserid;
	}

	public void setTouserid(String touserid) {
		this.touserid = touserid;
	}

	public String getChatcontent() {
		return chatcontent;
	}

	public void setChatcontent(String chatcontent) {
		this.chatcontent = chatcontent;
	}

	public String getChattime() {
		return chattime;
	}

	public void setChattime(String chattime) {
		this.chattime = chattime;
	}

	@Override
	public String toString() {
		return "ChatDto [chatseq=" + chatseq + ", userid=" + userid + ", touserid=" + touserid + ", chatcontent="
				+ chatcontent + ", chattime=" + chattime + "]";
	}
	
	
	
	
}