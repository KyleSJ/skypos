package org.zerock.domain;

public class MemberVO {
	private int posNum;
	private int regNum;
	private int vanNum;
	private String repreName;
	private String compaName;
	private String phoneNum;
	private String addr;
	private String IP;
	private int shutdown;
	
	
	public int getShutdown() {
		return shutdown;
	}
	public void setShutdown(int shutdown) {
		this.shutdown = shutdown;
	}
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
	public String getRepreName() {
		return repreName;
	}
	public void setRepreName(String repreName) {
		this.repreName = repreName;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	@Override
	public String toString() {
		return "MemberVO [posNum=" + posNum + ", regNum=" + regNum
				+ ", vanNum=" + vanNum + ", repreName=" + repreName
				+ ", compaName=" + compaName + ", phoneNum=" + phoneNum
				+ ", addr=" + addr + ", IP=" + IP + ", shutdown=" + shutdown
				+ "]";
	}
}
