package com.min.mj.dtos;

public class MJ_CSAPAYBoardDto {

	//결제게시판
	private String ID               ;
	private int SEQ              ;
	private String NICKNAME         ;
	private String AUTH             ;
	private String REGDATE          ;
	private String PAYLIST          ;
	private int AMOUNT           ;
	private String PRODUCT          ;
	private int APIKEY           ;
	private String RETURL           ;
	private String NOTRETURL        ;
	private String RETAPPSCHEME     ;
	private String AUTOEXECUTE      ;
	private String PAYTIME			;
	
	public MJ_CSAPAYBoardDto() {
		// TODO Auto-generated constructor stub
	}

	public MJ_CSAPAYBoardDto(String iD, int sEQ, String nICKNAME, String aUTH, String rEGDATE, String pAYLIST,
			int aMOUNT, String pRODUCT, int aPIKEY, String rETURL, String nOTRETURL, String rETAPPSCHEME,
			String aUTOEXECUTE, String pAYTIME) {
		super();
		ID = iD;
		SEQ = sEQ;
		NICKNAME = nICKNAME;
		AUTH = aUTH;
		REGDATE = rEGDATE;
		PAYLIST = pAYLIST;
		AMOUNT = aMOUNT;
		PRODUCT = pRODUCT;
		APIKEY = aPIKEY;
		RETURL = rETURL;
		NOTRETURL = nOTRETURL;
		RETAPPSCHEME = rETAPPSCHEME;
		AUTOEXECUTE = aUTOEXECUTE;
		PAYTIME = pAYTIME;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getSEQ() {
		return SEQ;
	}

	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}

	public String getNICKNAME() {
		return NICKNAME;
	}

	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}

	public String getAUTH() {
		return AUTH;
	}

	public void setAUTH(String aUTH) {
		AUTH = aUTH;
	}

	public String getREGDATE() {
		return REGDATE;
	}

	public void setREGDATE(String rEGDATE) {
		REGDATE = rEGDATE;
	}

	public String getPAYLIST() {
		return PAYLIST;
	}

	public void setPAYLIST(String pAYLIST) {
		PAYLIST = pAYLIST;
	}

	public int getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getPRODUCT() {
		return PRODUCT;
	}

	public void setPRODUCT(String pRODUCT) {
		PRODUCT = pRODUCT;
	}

	public int getAPIKEY() {
		return APIKEY;
	}

	public void setAPIKEY(int aPIKEY) {
		APIKEY = aPIKEY;
	}

	public String getRETURL() {
		return RETURL;
	}

	public void setRETURL(String rETURL) {
		RETURL = rETURL;
	}

	public String getNOTRETURL() {
		return NOTRETURL;
	}

	public void setNOTRETURL(String nOTRETURL) {
		NOTRETURL = nOTRETURL;
	}

	public String getRETAPPSCHEME() {
		return RETAPPSCHEME;
	}

	public void setRETAPPSCHEME(String rETAPPSCHEME) {
		RETAPPSCHEME = rETAPPSCHEME;
	}

	public String getAUTOEXECUTE() {
		return AUTOEXECUTE;
	}

	public void setAUTOEXECUTE(String aUTOEXECUTE) {
		AUTOEXECUTE = aUTOEXECUTE;
	}

	public String getPAYTIME() {
		return PAYTIME;
	}

	public void setPAYTIME(String pAYTIME) {
		PAYTIME = pAYTIME;
	}

	@Override
	public String toString() {
		return "MJ_CSAPAYBoardDto [ID=" + ID + ", SEQ=" + SEQ + ", NICKNAME=" + NICKNAME + ", AUTH=" + AUTH
				+ ", REGDATE=" + REGDATE + ", PAYLIST=" + PAYLIST + ", AMOUNT=" + AMOUNT + ", PRODUCT=" + PRODUCT
				+ ", APIKEY=" + APIKEY + ", RETURL=" + RETURL + ", NOTRETURL=" + NOTRETURL + ", RETAPPSCHEME="
				+ RETAPPSCHEME + ", AUTOEXECUTE=" + AUTOEXECUTE + ", PAYTIME=" + PAYTIME + "]";
	}
	
	
}
