package org.zerock.service;

import java.util.List;

import org.zerock.domain.EmployeeVO;

public interface EmployeeService {
	public void regist(EmployeeVO employee)throws Exception;
	
	public EmployeeVO read(String empId)throws Exception;
	
	public void modify(EmployeeVO employee)throws Exception;
	
	public void remove(String empId)throws Exception;
	
	public List<EmployeeVO> listAll()throws Exception;
}
