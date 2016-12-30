package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.EmployeeVO;
import org.zerock.domain.MemberVO;

public interface EmployeeService {
	public void regist(EmployeeVO employee)throws Exception;
	
	public EmployeeVO read(String empId,int posNum)throws Exception;
	
	public void modify(EmployeeVO employee)throws Exception;
	
	public void remove(String empId,int posNum)throws Exception;
	
	public List<EmployeeVO> listAll(int posNum)throws Exception;

	public EmployeeVO login(EmployeeVO employee) throws Exception;

	public void UpdateInsert(EmployeeVO employee)throws Exception;	

	public void restart(EmployeeVO employee)throws Exception;

	public List<EmployeeVO> sendlistAll(int posNum);
}
