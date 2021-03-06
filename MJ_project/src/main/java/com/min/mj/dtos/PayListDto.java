package com.min.mj.dtos;

public class PayListDto {

private String id               ;
private int    seq              ;
private String nicname         ;
private String auth             ;
private String regdate          ;
private String paylist          ;
private int amount           ;
private String product          ;
private int apikey           ;
private String returl           ;
private String notreturl        ;
private String retappscheme     ;
private String autoexecute      ;
private String paytime			;

public PayListDto(String id, int seq, String nicname, String auth, String regdate, String paylist, int amount,
		String product, int apikey, String returl, String notreturl, String retappscheme, String autoexecute,
		String paytime) {
	super();
	this.id = id;
	this.seq = seq;
	this.nicname = nicname;
	this.auth = auth;
	this.regdate = regdate;
	this.paylist = paylist;
	this.amount = amount;
	this.product = product;
	this.apikey = apikey;
	this.returl = returl;
	this.notreturl = notreturl;
	this.retappscheme = retappscheme;
	this.autoexecute = autoexecute;
	this.paytime = paytime;
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

public String getAuth() {
	return auth;
}

public void setAuth(String auth) {
	this.auth = auth;
}

public String getRegdate() {
	return regdate;
}

public void setRegdate(String regdate) {
	this.regdate = regdate;
}

public String getPaylist() {
	return paylist;
}

public void setPaylist(String paylist) {
	this.paylist = paylist;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public String getProduct() {
	return product;
}

public void setProduct(String product) {
	this.product = product;
}

public int getApikey() {
	return apikey;
}

public void setApikey(int apikey) {
	this.apikey = apikey;
}

public String getReturl() {
	return returl;
}

public void setReturl(String returl) {
	this.returl = returl;
}

public String getNotreturl() {
	return notreturl;
}

public void setNotreturl(String notreturl) {
	this.notreturl = notreturl;
}

public String getRetappscheme() {
	return retappscheme;
}

public void setRetappscheme(String retappscheme) {
	this.retappscheme = retappscheme;
}

public String getAutoexecute() {
	return autoexecute;
}

public void setAutoexecute(String autoexecute) {
	this.autoexecute = autoexecute;
}

public String getPaytime() {
	return paytime;
}

public void setPaytime(String paytime) {
	this.paytime = paytime;
}

@Override
public String toString() {
	return "PayListDto [id=" + id + ", seq=" + seq + ", nicname=" + nicname + ", auth=" + auth + ", regdate=" + regdate
			+ ", paylist=" + paylist + ", amount=" + amount + ", product=" + product + ", apikey=" + apikey
			+ ", returl=" + returl + ", notreturl=" + notreturl + ", retappscheme=" + retappscheme + ", autoexecute="
			+ autoexecute + ", paytime=" + paytime + "]";
}



}
