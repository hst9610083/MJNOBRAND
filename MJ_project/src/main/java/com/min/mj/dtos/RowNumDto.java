package com.min.mj.dtos;

public class RowNumDto {

	private int pageList; // 출력할 페이지번호 갯수
	private int index; // 출력할 페이지 번호
	private int pageNum; // 출력할 페이지 시작번호
	private int listNum; // 출력할 리스트 갯수
	private int total; // 글 토탈 갯 수

	{
		pageList = 5;
		index = 0;
		pageNum = 1;
		listNum = 5;
	}

	public RowNumDto() {
		// TODO Auto-generated constructor stub
	}

	public RowNumDto(String index, String pageNum, String listNum) {
		if(index!=null) {
			this.index = Integer.parseInt(index);
		}
		if(pageNum!=null) {
			this.pageNum = Integer.parseInt(pageNum);
		}
		if(listNum!=null) {
			this.listNum = Integer.parseInt(listNum);
		}
	}

	@Override
	public String toString() {
		return "RowNumDto [출력할 페이지 번호 갯수=" + pageList + ", 출력할 페이지 번호=" + index + ", 출력할 페이지 시작 번호=" + pageNum + ", 출력할 리스트 갯수=" + listNum
				+ ", 리스트의 총 갯수=" + total + "]";
	}
	
	//글 리스트 중 시작 번호
	public int getStart() {
		return index*listNum+1;
	}
	
	
	
	//글 리스트 중 끝 번호
	public int getlast() {
		return (index*listNum)+listNum;
	}
	
	
	//카운트
	public int getCount() {
		//전체 갯수 - 출력 갯수*(시작번호): 91-5(0)
		int temp = total - listNum*(pageNum-1);
		// 전체갯수/출력갯수   전체페이지의 최소갯수
		int min = temp/listNum;
		
		if(temp%listNum !=0) {
			min++;
		}
		
		int count = 0;
		
		if(temp <= listNum) {
			count = pageNum;
		}else if(min <= pageList) {
			count = min + pageNum-1;
		}else {
			count = pageList+pageNum-1;
		}
		return count;
	}

	public int getPageList() {
		return pageList;
	}

	public void setPageList(int pageList) {
		this.pageList = pageList;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getListNum() {
		return listNum;
	}

	public void setListNum(int listNum) {
		this.listNum = listNum;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
}
