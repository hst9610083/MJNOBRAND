package com.min.mj.dtos;

public class EstiDto {

	
private int seq     ;
private String id      ;
private String regdate ;
private String title   ;
private String content ;
private String imsi    ;
private String realfile;

public EstiDto() {
	// TODO Auto-generated constructor stub
}

public EstiDto(int seq, String id, String regdate, String title, String content, String imsi, String realfile) {
	super();
	this.seq = seq;
	this.id = id;
	this.regdate = regdate;
	this.title = title;
	this.content = content;
	this.imsi = imsi;
	this.realfile = realfile;
}

public int getSeq() {
	return seq;
}

public void setSeq(int seq) {
	this.seq = seq;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getRegdate() {
	return regdate;
}

public void setRegdate(String regdate) {
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

public String getRealfile() {
	return realfile;
}

public void setRealfile(String realfile) {
	this.realfile = realfile;
}

@Override
public String toString() {
	return "EstiDto [seq=" + seq + ", id=" + id + ", regdate=" + regdate + ", title=" + title + ", content=" + content
			+ ", imsi=" + imsi + ", realfile=" + realfile + "]";
}





}
