package org.zerock.domain;

public class VanVO {
	private int vanNum;
	private int vanIP;
	private String vanName;
	
	public int getVanNum() {
		return vanNum;
	}
	public void setVanNum(int vanNum) {
		this.vanNum = vanNum;
	}
	public int getVanIP() {
		return vanIP;
	}
	public void setVanIP(int vanIP) {
		this.vanIP = vanIP;
	}
	public String getVanName() {
		return vanName;
	}
	public void setVanName(String vanName) {
		this.vanName = vanName;
	}
	@Override
	public String toString() {
		return "VanVO [vanNum=" + vanNum + ", vanIP=" + vanIP + ", vanName="
				+ vanName + "]";
	}
}
