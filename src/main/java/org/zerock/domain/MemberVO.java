package org.zerock.domain;

public class MemberVO {
	private int posNum;
	private int regNum;
	private int vanNum;
	private String repreName;
	private String compaName;
	private int phoneNum;
	private String addr;
		
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public int getRegNum() {
		return regNum;
	}
	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}
	public int getVanNum() {
		return vanNum;
	}
	public void setVanNum(int vanNum) {
		this.vanNum = vanNum;
	}
	public String getrepreName() {
		return repreName;
	}
	public void setrepreName(String repreName) {
		this.repreName = repreName;
	}
	public String getCompaName() {
		return compaName;
	}
	public void setCompaName(String compaName) {
		this.compaName = compaName;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "MemberVO [posNum=" + posNum + ", regNum=" + regNum
				+ ", vanNum=" + vanNum + ", repreName=" + repreName
				+ ", compaName=" + compaName + ", phoneNum=" + phoneNum
				+ ", addr=" + addr + "]";
	}
}
