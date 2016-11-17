package org.zerock.domain;

public class CardCompaVO {
	private int cardCompaNum;
	private String compaName;
	private String phoneNum;
	public int getCardCompaNum() {
		return cardCompaNum;
	}
	public void setCardCompaNum(int cardCompaNum) {
		this.cardCompaNum = cardCompaNum;
	}
	public String getCompaName() {
		return compaName;
	}
	public void setCompaName(String compaName) {
		this.compaName = compaName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "CardCompaVO [cardCompaNum=" + cardCompaNum + ", compaName="
				+ compaName + ", phoneNum=" + phoneNum + "]";
	}
		
}
