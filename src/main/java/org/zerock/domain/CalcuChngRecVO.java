package org.zerock.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class CalcuChngRecVO {
	private int calcuChngNum;
	private Date calcuChngDay;
	private Timestamp calcuChngTime;
	private Date bakDay;
	private Timestamp bakTime;
	private int moneySales;
	private int cardSales;
	public int getCalcuChngNum() {
		return calcuChngNum;
	}
	public void setCalcuChngNum(int calcuChngNum) {
		this.calcuChngNum = calcuChngNum;
	}
	public Date getCalcuChngDay() {
		return calcuChngDay;
	}
	public void setCalcuChngDay(Date calcuChngDay) {
		this.calcuChngDay = calcuChngDay;
	}
	public Timestamp getCalcuChngTime() {
		return calcuChngTime;
	}
	public void setCalcuChngTime(Timestamp calcuChngTime) {
		this.calcuChngTime = calcuChngTime;
	}
	public Date getBakDay() {
		return bakDay;
	}
	public void setBakDay(Date bakDay) {
		this.bakDay = bakDay;
	}
	public Timestamp getBakTime() {
		return bakTime;
	}
	public void setBakTime(Timestamp bakTime) {
		this.bakTime = bakTime;
	}
	public int getMoneySales() {
		return moneySales;
	}
	public void setMoneySales(int moneySales) {
		this.moneySales = moneySales;
	}
	public int getCardSales() {
		return cardSales;
	}
	public void setCardSales(int cardSales) {
		this.cardSales = cardSales;
	}
	@Override
	public String toString() {
		return "CalcuChngNumVO [calcuChngNum=" + calcuChngNum
				+ ", calcuChngDay=" + calcuChngDay + ", calcuChngTime="
				+ calcuChngTime + ", bakDay=" + bakDay + ", bakTime=" + bakTime
				+ ", moneySales=" + moneySales + ", cardSales=" + cardSales
				+ "]";
	}
}
