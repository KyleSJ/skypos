package org.zerock.domain;

public class GoodsCatVO {
	private int goodsCatNum;
	private String goodsCatName;
	private int goodsCatLoc;
	public int getGoodsCatNum() {
		return goodsCatNum;
	}
	public void setGoodsCatNum(int goodsCatNum) {
		this.goodsCatNum = goodsCatNum;
	}
	public String getGoodsCatName() {
		return goodsCatName;
	}
	public void setGoodsCatName(String goodsCatName) {
		this.goodsCatName = goodsCatName;
	}
	public int getGoodsCatLoc() {
		return goodsCatLoc;
	}
	public void setGoodsCatLoc(int goodsCatLoc) {
		this.goodsCatLoc = goodsCatLoc;
	}
	@Override
	public String toString() {
		return "GoodsCatVO [goodsCatNum=" + goodsCatNum + ", goodsCatName="
				+ goodsCatName + ", goodsCatLoc=" + goodsCatLoc + "]";
	}
	
}
