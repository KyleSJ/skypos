package org.zerock.domain;

public class GoodsVO {
	private int goodsNum;
	private int goodsCatNum;
	private int goodsColor;
	private String goodsName;
	private int goodsPrice;
	private int goodsSeq;
	private int posNum;
		
	public int getPosNum() {
		return posNum;
	}

	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public int getGoodsCatNum() {
		return goodsCatNum;
	}
	public void setGoodsCatNum(int goodsCatNum) {
		this.goodsCatNum = goodsCatNum;
	}
	public int getGoodsColor() {
		return goodsColor;
	}
	public void setGoodsColor(int goodsColor) {
		this.goodsColor = goodsColor;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsSeq() {
		return goodsSeq;
	}
	public void setGoodsSeq(int goodsSeq) {
		this.goodsSeq = goodsSeq;
	}

	@Override
	public String toString() {
		return "GoodsVO [goodsNum=" + goodsNum + ", goodsCatNum=" + goodsCatNum
				+ ", goodsColor=" + goodsColor + ", goodsName=" + goodsName
				+ ", goodsPrice=" + goodsPrice + ", goodsSeq=" + goodsSeq
				+ ", posNum=" + posNum + "]";
	}
}
