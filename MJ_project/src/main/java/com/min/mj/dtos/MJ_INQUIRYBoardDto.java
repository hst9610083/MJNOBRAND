package com.min.mj.dtos;

public class MJ_INQUIRYBoardDto {

	//문의 게시판
private int SEQ		;
private String ID       ;
private String NICNAME  ;
private String REGDATE  ;
private String TITLE    ;
private String CONTENT  ;
private String AUTH     ;
private String REALFILE ;
private String IMSI     ;
	
public MJ_INQUIRYBoardDto() {
	// TODO Auto-generated constructor stub
}

public MJ_INQUIRYBoardDto(int sEQ, String iD, String nICNAME, String rEGDATE, String tITLE, String cONTENT, String aUTH,
		String rEALFILE, String iMSI) {
	super();
	SEQ = sEQ;
	ID = iD;
	NICNAME = nICNAME;
	REGDATE = rEGDATE;
	TITLE = tITLE;
	CONTENT = cONTENT;
	AUTH = aUTH;
	REALFILE = rEALFILE;
	IMSI = iMSI;
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

public String getNICNAME() {
	return NICNAME;
}

public void setNICNAME(String nICNAME) {
	NICNAME = nICNAME;
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

public String getAUTH() {
	return AUTH;
}

public void setAUTH(String aUTH) {
	AUTH = aUTH;
}

public String getREALFILE() {
	return REALFILE;
}

public void setREALFILE(String rEALFILE) {
	REALFILE = rEALFILE;
}

public String getIMSI() {
	return IMSI;
}

public void setIMSI(String iMSI) {
	IMSI = iMSI;
}

@Override
public String toString() {
	return "MJ_INQUIRYBoardDto [SEQ=" + SEQ + ", ID=" + ID + ", NICNAME=" + NICNAME + ", REGDATE=" + REGDATE
			+ ", TITLE=" + TITLE + ", CONTENT=" + CONTENT + ", AUTH=" + AUTH + ", REALFILE=" + REALFILE + ", IMSI="
			+ IMSI + "]";
}


	

	
	
	
}
