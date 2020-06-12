package com.min.mj.dtos;

public class fileDto {

	private int f_seq;
	private int seq;
	private String id;
	private String realfile;
	private String userfile;
	private String fileurl;
	
	public fileDto() {
		
	}

	public fileDto(int f_seq, int seq, String id, String realfile, String userfile, String fileurl) {
		super();
		this.f_seq = f_seq;
		this.seq = seq;
		this.id = id;
		this.realfile = realfile;
		this.userfile = userfile;
		this.fileurl = fileurl;
	}
	

	public fileDto(int f_seq, String id, String realfile, String userfile, String fileurl) {
		super();
		this.f_seq = f_seq;
		this.id = id;
		this.realfile = realfile;
		this.userfile = userfile;
		this.fileurl = fileurl;
	}
	

	public fileDto(String realfile, String userfile, String fileurl) {
		super();
		this.realfile = realfile;
		this.userfile = userfile;
		this.fileurl = fileurl;
	}

	public int getF_seq() {
		return f_seq;
	}

	public void setF_seq(int f_seq) {
		this.f_seq = f_seq;
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

	public String getRealfile() {
		return realfile;
	}

	public void setRealfile(String realfile) {
		this.realfile = realfile;
	}

	public String getUserfile() {
		return userfile;
	}

	public void setUserfile(String userfile) {
		this.userfile = userfile;
	}

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}
	
	
}
