package org.zerock.domain;

public class ExtdevVO {
	private String devName;
	private String devType;
	private String prtcl;
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevType() {
		return devType;
	}
	public void setDevType(String devType) {
		this.devType = devType;
	}
	public String getPrtcl() {
		return prtcl;
	}
	public void setPrtcl(String prtcl) {
		this.prtcl = prtcl;
	}
	@Override
	public String toString() {
		return "ExtdevVO [devName=" + devName + ", devType=" + devType
				+ ", prtcl=" + prtcl + "]";
	}
}
