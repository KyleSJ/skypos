package org.zerock.domain;

public class PrintVO {
	private int printNum;
	private String devName;
	private String printName;
	private String printCntt;
	private int posNum;
	
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public int getPrintNum() {
		return printNum;
	}
	public void setPrintNum(int printNum) {
		this.printNum = printNum;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getPrintName() {
		return printName;
	}
	public void setPrintName(String printName) {
		this.printName = printName;
	}
	public String getPrintCntt() {
		return printCntt;
	}
	public void setPrintCntt(String printCntt) {
		this.printCntt = printCntt;
	}
	@Override
	public String toString() {
		return "PrintVO [printNum=" + printNum + ", devName=" + devName
				+ ", printName=" + printName + ", printCntt=" + printCntt
				+ ", posNum=" + posNum + "]";
	}
}
