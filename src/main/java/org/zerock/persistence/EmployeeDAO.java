package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.EmployeeVO;

public interface EmployeeDAO {
	public void create(EmployeeVO vo)throws Exception;
	
	public EmployeeVO read(String empId)throws Exception;
	
	public void update(EmployeeVO vo)throws Exception;
	
	public void delete(String empId)throws Exception;
	
	public List<EmployeeVO> listAll()throws Exception;
}