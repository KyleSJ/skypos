package org.zerock.domain;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CalcuChngRecVO {
	private int calcuChngNum;
	private Date calcuChngDay;
	private Timestamp calcuChngTime;
	private Date bakDay;
	private Timestamp bakTime;
	private int moneySales;
	private int cardSales;
	private String ClonecalcuChngTime;
	private String ClonebakTime;
	private int posNum;	
	
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public String getClonecalcuChngTime() {
		return ClonecalcuChngTime;
	}
	//String -> DateFormat
	public void setClonecalcuChngTime(String clonecalcuChngTime) {
		if(clonecalcuChngTime== null || clonecalcuChngTime=="null"){
			this.calcuChngTime = null;
		}else{
		String s= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(Long.parseLong(clonecalcuChngTime));
		this.calcuChngTime = Timestamp.valueOf(s);
		}
	}
	
	public String getClonebakTime() {
		return ClonebakTime;
	}
	//String -> DateFormat
	public void setClonebakTime(String clonebakTime) {
		if(clonebakTime== null || clonebakTime=="null"){
			this.bakTime = null;
		}else{
		String s= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").format(Long.parseLong(clonebakTime));
		this.bakTime=Timestamp.valueOf(s);
		}
	}
	
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
		if(calcuChngDay == null){
		this.calcuChngDay=null;	
		}else{
		this.calcuChngDay = calcuChngDay;
		}
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
	if(calcuChngDay == null){
		this.calcuChngDay=null;	
		}else{
		this.bakDay = bakDay;
		}
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
		return "CalcuChngRecVO [calcuChngNum=" + calcuChngNum
				+ ", calcuChngDay=" + calcuChngDay + ", calcuChngTime="
				+ calcuChngTime + ", bakDay=" + bakDay + ", bakTime=" + bakTime
				+ ", moneySales=" + moneySales + ", cardSales=" + cardSales
				+ ", ClonecalcuChngTime=" + ClonecalcuChngTime
				+ ", ClonebakTime=" + ClonebakTime + ", posNum=" + posNum + "]";
	}	
}
