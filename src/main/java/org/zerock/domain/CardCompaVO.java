package org.zerock.domain;

public class CardCompaVO {
	private int cardCompaNum;
	private String cardCompaName;
	private String cardCompaPhoneNum;
	
	public int getCardCompaNum() {
		return cardCompaNum;
	}
	public void setCardCompaNum(int cardCompaNum) {
		this.cardCompaNum = cardCompaNum;
	}
	public String getCardCompaName() {
		return cardCompaName;
	}
	public void setCardCompaName(String cardCompaName) {
		this.cardCompaName = cardCompaName;
	}
	public String getCardCompaPhoneNum() {
		return cardCompaPhoneNum;
	}
	public void setCardCompaPhoneNum(String cardCompaPhoneNum) {
		this.cardCompaPhoneNum = cardCompaPhoneNum;
	}
	@Override
	public String toString() {
		return "CardCompaVO [cardCompaNum=" + cardCompaNum + ", cardCompaName="
				+ cardCompaName + ", cardCompaPhoneNum=" + cardCompaPhoneNum
				+ "]";
	}
		
}
