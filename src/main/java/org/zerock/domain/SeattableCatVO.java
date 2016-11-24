package org.zerock.domain;

public class SeattableCatVO {
	private int tableCatNum;
	private String tableCatName;
	private int tableCatLoc;
	public int getTableCatNum() {
		return tableCatNum;
	}
	public void setTableCatNum(int tableCatNum) {
		this.tableCatNum = tableCatNum;
	}
	public String getTableCatName() {
		return tableCatName;
	}
	public void setTableCatName(String tableCatName) {
		this.tableCatName = tableCatName;
	}
	public int getTableCatLoc() {
		return tableCatLoc;
	}
	public void setTableCatLoc(int tableCatLoc) {
		this.tableCatLoc = tableCatLoc;
	}
	@Override
	public String toString() {
		return "SeattableCatVO [tableCatNum=" + tableCatNum + ", tableCatName="
				+ tableCatName + ", tableCatLoc=" + tableCatLoc + "]";
	}
	
}
