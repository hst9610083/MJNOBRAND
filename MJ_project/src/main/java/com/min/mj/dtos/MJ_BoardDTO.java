package com.min.mj.dtos;

public class MJ_BoardDTO {

	
	//홍보게시판
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getNicname() {
		return nicname;
	}

	public void setNicname(String nicname) {
		this.nicname = nicname;
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

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMoneypub() {
		return moneypub;
	}

	public void setMoneypub(String moneypub) {
		this.moneypub = moneypub;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getJjim() {
		return jjim;
	}

	public void setJjim(String jjim) {
		this.jjim = jjim;
	}

	public String getDelflag() {
		return delflag;
	}

	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}

	public String getRealfile() {
		return realfile;
	}

	public void setRealfile(String realfile) {
		this.realfile = realfile;
	}

	@Override
	public String toString() {
		return "MJ_BoardDTO [id=" + id + ", seq=" + seq + ", nicname=" + nicname + ", title=" + title + ", content="
				+ content + ", readcount=" + readcount + ", regdate=" + regdate + ", moneypub=" + moneypub + ", imsi="
				+ imsi + ", jjim=" + jjim + ", delflag=" + delflag + ", realfile=" + realfile + "]";
	}
	
	
	
	
	
}
