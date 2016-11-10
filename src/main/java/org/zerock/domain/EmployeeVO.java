package org.zerock.domain;

public class EmployeeVO {
	private int posNum;
	private String empId;
	private int empName;
	private String pwd;
	
	
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

	public int getEmpName() {
		return empName;
	}
	public void setEmpName(int empName) {
		this.empName = empName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO [posNum=" + posNum + ", empId=" + empId
				+ ", empName=" + empName + ", pwd=" + pwd + "]";
	}
}
