package org.zerock.domain;

import java.sql.Date;

public class OpenVO {
	private Date openDay;
	private String empId;
	private int posNum;
	private int cashAmnt;
	public Date getOpenDay() {
		return openDay;
	}
	public void setOpenDay(Date openDay) {
		this.openDay = openDay;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public int getCashAmnt() {
		return cashAmnt;
	}
	public void setCashAmnt(int cashAmnt) {
		this.cashAmnt = cashAmnt;
	}
	@Override
	public String toString() {
		return "OpenVO [openDay=" + openDay + ", empId=" + empId + ", posNum="
				+ posNum + ", cashAmnt=" + cashAmnt + "]";
	}
	
	
}
