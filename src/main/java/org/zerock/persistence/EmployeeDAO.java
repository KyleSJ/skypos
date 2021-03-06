package org.zerock.persistence;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.EmployeeVO;

public interface EmployeeDAO {
	public void create(EmployeeVO vo)throws Exception;
	
	public EmployeeVO read(String empId, int posNum)throws Exception;
	
	public void update(EmployeeVO vo)throws Exception;
	
	public void delete(String empId,int posNum)throws Exception;
	
	public List<EmployeeVO> listAll(int posNum)throws Exception;

	public EmployeeVO verify(EmployeeVO vo);
	
	public void updateORInsert(EmployeeVO vo)throws Exception;

	public void restart(EmployeeVO employee)throws Exception;

	public List<EmployeeVO> sendlistAll(int posNum);
	
	//public List<EmployeeVO> Alldata(EmployeeVO vo)throws Exception;
}