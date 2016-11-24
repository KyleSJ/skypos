package org.zerock.domain;

import java.sql.Date;

public class OrderGoodsVO {
	private int orderGoodsNum;
	private int goodsNum;
	private int orderNum;
	private int goodsQntt;
	private Date openDay;
	public int getOrderGoodsNum() {
		return orderGoodsNum;
	}
	public void setOrderGoodsNum(int orderGoodsNum) {
		this.orderGoodsNum = orderGoodsNum;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public int getGoodsQntt() {
		return goodsQntt;
	}
	public void setGoodsQntt(int goodsQntt) {
		this.goodsQntt = goodsQntt;
	}
	public Date getOpenDay() {
		return openDay;
	}
	public void setOpenDay(Date openDay) {
		this.openDay = openDay;
	}
	@Override
	public String toString() {
		return "OrderGoodsVO [orderGoodsNum=" + orderGoodsNum + ", goodsNum="
				+ goodsNum + ", orderNum=" + orderNum + ", goodsQntt="
				+ goodsQntt + ", openDay=" + openDay + "]";
	}
	
}
