package org.zerock.domain;

import java.util.ArrayList;

public class EmployeeVO {
	private int posNum;
	private String empId;
	private String empName;
	private String pwd;
	private int retire;
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getRetire() {
		return retire;
	}
	public void setRetire(int retire) {
		this.retire = retire;
	}
	@Override
	public String toString() {
		return "EmployeeVO [posNum=" + posNum + ", empId=" + empId
				+ ", empName=" + empName + ", pwd=" + pwd + ", retire="
				+ retire + "]";
	}		
}
