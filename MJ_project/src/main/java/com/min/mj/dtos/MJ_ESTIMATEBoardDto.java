package com.min.mj.dtos;

public class MJ_ESTIMATEBoardDto {
	
//견적서 게시판
	
	private int SEQ    	   ;
	private String ID      ;
	private String REGDATE ;
	private String TITLE   ;
	private String CONTENT ;
	private String IMSI    ;
	private String REALFILE;
	
	public MJ_ESTIMATEBoardDto() {
		// TODO Auto-generated constructor stub
	}

	public MJ_ESTIMATEBoardDto(int sEQ, String iD, String rEGDATE, String tITLE, String cONTENT, String iMSI,
			String rEALFILE) {
		super();
		SEQ = sEQ;
		ID = iD;
		REGDATE = rEGDATE;
		TITLE = tITLE;
		CONTENT = cONTENT;
		IMSI = iMSI;
		REALFILE = rEALFILE;
	}

	public int getSEQ() {
		return SEQ;
	}

	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getREGDATE() {
		return REGDATE;
	}

	public void setREGDATE(String rEGDATE) {
		REGDATE = rEGDATE;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

	public String getIMSI() {
		return IMSI;
	}

	public void setIMSI(String iMSI) {
		IMSI = iMSI;
	}

	public String getREALFILE() {
		return REALFILE;
	}

	public void setREALFILE(String rEALFILE) {
		REALFILE = rEALFILE;
	}

	@Override
	public String toString() {
		return "MJ_ESTIMATEBoardDto [SEQ=" + SEQ + ", ID=" + ID + ", REGDATE=" + REGDATE + ", TITLE=" + TITLE
				+ ", CONTENT=" + CONTENT + ", IMSI=" + IMSI + ", REALFILE=" + REALFILE + "]";
	}
	
	

}
