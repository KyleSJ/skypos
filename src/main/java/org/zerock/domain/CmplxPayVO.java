package org.zerock.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class CmplxPayVO {
	private int cmplxPayNum;
	private int printNum;
	private int orderNum;
	private Timestamp payTime;
	private Date openDay;
	private int totalPayAmnt;
	public int getCmplxPayNum() {
		return cmplxPayNum;
	}
	public void setCmplxPayNum(int cmplxPayNum) {
		this.cmplxPayNum = cmplxPayNum;
	}
	public int getPrintNum() {
		return printNum;
	}
	public void setPrintNum(int printNum) {
		this.printNum = printNum;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public Timestamp getPayTime() {
		return payTime;
	}
	public void setPayTime(Timestamp payTime) {
		this.payTime = payTime;
	}
	public Date getOpenDay() {
		return openDay;
	}
	public void setOpenDay(Date openDay) {
		this.openDay = openDay;
	}
	public int getTotalPayAmnt() {
		return totalPayAmnt;
	}
	public void setTotalPayAmnt(int totalPayAmnt) {
		this.totalPayAmnt = totalPayAmnt;
	}
	@Override
	public String toString() {
		return "CmplxPayVO [cmplxPayNum=" + cmplxPayNum + ", printNum="
				+ printNum + ", orderNum=" + orderNum + ", payTime=" + payTime
				+ ", openDay=" + openDay + ", totalPayAmnt=" + totalPayAmnt
				+ "]";
	}

}