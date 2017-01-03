package org.zerock.domain;

public class PayVO {
	private int payNum;
	private int cmplxPayNum;
	private int cardCompaNum;
	private String payWay;
	private int cardNum;
	private int payAmnt;
	private int posNum;
	
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public int getPayNum() {
		return payNum;
	}
	public void setPayNum(int payNum) {
		this.payNum = payNum;
	}
	public int getCmplxPayNum() {
		return cmplxPayNum;
	}
	public void setCmplxPayNum(int cmplxPayNum) {
		this.cmplxPayNum = cmplxPayNum;
	}
	public int getCardCompaNum() {
		return cardCompaNum;
	}
	public void setCardCompaNum(int cardCompaNum) {
		this.cardCompaNum = cardCompaNum;
	}
	
	public String getPayWay() {
		return payWay;
	}
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public int getPayAmnt() {
		return payAmnt;
	}
	public void setPayAmnt(int payAmnt) {
		this.payAmnt = payAmnt;
	}
	@Override
	public String toString() {
		return "PayVO [payNum=" + payNum + ", cmplxPayNum=" + cmplxPayNum
				+ ", cardCompaNum=" + cardCompaNum + ", payWay=" + payWay
				+ ", cardNum=" + cardNum + ", payAmnt=" + payAmnt + ", posNum="
				+ posNum + "]";
	}
}
