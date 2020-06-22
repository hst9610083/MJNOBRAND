package com.min.mj.dtos;

import java.util.Date;

public class INQUIRYBoardDto {

   //문의 게시판
private int seq      ;
private String id       ;
private String nicname  ;
private Date regdate  ;
private String title    ;
private String content  ;
private String auth     ;
private String realfile ;
private String imsi     ;

   
public INQUIRYBoardDto() {
   // TODO Auto-generated constructor stub
}


public INQUIRYBoardDto(int seq, String id, String nicname, Date regdate, String title, String content, String auth,
      String realfile, String imsi) {
   this.seq = seq;
   this.id = id;
   this.nicname = nicname;
   this.regdate = regdate;
   this.title = title;
   this.content = content;
   this.auth = auth;
   this.realfile = realfile;
   this.imsi = imsi;
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


public String getNicname() {
   return nicname;
}


public void setNicname(String nicname) {
   this.nicname = nicname;
}


public Date getRegdate() {
   return regdate;
}


public void setRegdate(Date regdate) {
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


public String getAuth() {
   return auth;
}


public void setAuth(String auth) {
   this.auth = auth;
}


public String getRealfile() {
   return realfile;
}


public void setRealfile(String realfile) {
   this.realfile = realfile;
}


public String getImsi() {
   return imsi;
}


public void setImsi(String imsi) {
   this.imsi = imsi;
}


@Override
public String toString() {
   return "MJ_INQUIRYBoardDto [seq=" + seq + ", id=" + id + ", nicname=" + nicname + ", regdate=" + regdate
         + ", title=" + title + ", content=" + content + ", auth=" + auth + ", realfile=" + realfile + ", imsi="
         + imsi + "]";
}




   

   
   
   
}