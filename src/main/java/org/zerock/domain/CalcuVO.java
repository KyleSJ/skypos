package org.zerock.domain;

import java.sql.Date;

public class CalcuVO {
	private Date calcuDay;
	private int calcuChngNum;
	private int printNum;
	private Date openDay;
	public Date getCalcuDay() {
		return calcuDay;
	}
	public void setCalcuDay(Date calcuDay) {
		this.calcuDay = calcuDay;
	}
	public int getCalcuChngNum() {
		return calcuChngNum;
	}
	public void setCalcuChngNum(int calcuChngNum) {
		this.calcuChngNum = calcuChngNum;
	}
	public int getPrintNum() {
		return printNum;
	}
	public void setPrintNum(int printNum) {
		this.printNum = printNum;
	}
	public Date getOpenDay() {
		return openDay;
	}
	public void setOpenDay(Date openDay) {
		this.openDay = openDay;
	}
	@Override
	public String toString() {
		return "CalcuVO [calcuDay=" + calcuDay + ", calcuChngNum="
				+ calcuChngNum + ", printNum=" + printNum + ", openDay="
				+ openDay + "]";
	}
}
