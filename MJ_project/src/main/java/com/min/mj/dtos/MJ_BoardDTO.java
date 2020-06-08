package com.min.mj.dtos;

public class MJ_BoardDTO {

	
	//게시판
	private String id           ;
	private int seq             ;
	private String nicname      ;
	private String title        ;
	private String content      ;
	private int readcount       ;
	private String regdate      ;
	private String moneypub     ;
	private String imsi         ;
	private String jjim         ;
	private String delflag      ;
	private String realfile     ;
	
	public MJ_BoardDTO() {
		// TODO Auto-generated constructor stub
	}

	public MJ_BoardDTO(String id, int seq, String nicname, String title, String content, int readcount, String regdate,
			String moneypub, String imsi, String jjim, String delflag, String realfile) {
		super();
		this.id = id;
		this.seq = seq;
		this.nicname = nicname;
		this.title = title;
		this.content = content;
		this.readcount = readcount;
		this.regdate = regdate;
		this.moneypub = moneypub;
		this.imsi = imsi;
		this.jjim = jjim;
		this.delflag = delflag;
		this.realfile = realfile;
	}

	public MJ_BoardDTO(int seq, String nicname, String title, String content, int readcount, String regdate,
			String moneypub, String realfile) {
		super();
		this.seq = seq;
		this.nicname = nicname;
		this.title = title;
		this.content = content;
		this.readcount = readcount;
		this.regdate = regdate;
		this.moneypub = moneypub;
		this.realfile = realfile;
	}
	
	
}
