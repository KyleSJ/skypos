package org.zerock.domain;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class OrderMenuVO {
	private int orderNum;
	private Date openDay;
	private int printNum;
	private int tableNum;
	private Timestamp orderTime;
	private int orderAmnt;
	private String CloneorderTime;
	private int orderComplete;
		
	public int getOrderComplete() {
		return orderComplete;
	}
	public void setOrderComplete(int orderComplete) {
		this.orderComplete = orderComplete;
	}
	public String getCloneorderTime() {
		return CloneorderTime;
	}
	//String -> DateFormat
	public void setCloneorderTime(String cloneorderTime) {
		if(cloneorderTime == null){
			this.orderTime = null;
		}
		else{
		String s= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(Long.parseLong(cloneorderTime));
		this.orderTime = Timestamp.valueOf(s);
		}
	}
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
				+ ", orderTime=" + orderTime + ", orderAmnt=" + orderAmnt
				+ ", CloneorderTime=" + CloneorderTime + ", orderComplete="
				+ orderComplete + "]";
	}	
}
