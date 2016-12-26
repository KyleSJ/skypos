package org.zerock.domain;

import java.sql.Date;

public class CalcuVO {
	private Date calcuDay;
	private int calcuChngNum;
	private int printNum;
	private int posNum;
	private Date openDay;
		
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
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
				+ calcuChngNum + ", printNum=" + printNum + ", posNum="
				+ posNum + ", openDay=" + openDay + "]";
	}	
}
