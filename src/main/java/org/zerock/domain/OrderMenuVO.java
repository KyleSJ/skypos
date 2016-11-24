package org.zerock.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderMenuVO {
	private int orderNum;
	private Date openDay;
	private int printNum;
	private int tableNum;
	private Timestamp orderTime;
	private int orderAmnt;
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public Date getOpenDay() {
		return openDay;
	}
	public void setOpenDay(Date openDay) {
		this.openDay = openDay;
	}
	public int getPrintNum() {
		return printNum;
	}
	public void setPrintNum(int printNum) {
		this.printNum = printNum;
	}
	public int getTableNum() {
		return tableNum;
	}
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public int getOrderAmnt() {
		return orderAmnt;
	}
	public void setOrderAmnt(int orderAmnt) {
		this.orderAmnt = orderAmnt;
	}
	@Override
	public String toString() {
		return "OrderMenuVO [orderNum=" + orderNum + ", openDay=" + openDay
				+ ", printNum=" + printNum + ", tableNum=" + tableNum
				+ ", orderTime=" + orderTime + ", orderAmnt=" + orderAmnt + "]";
	}
}
