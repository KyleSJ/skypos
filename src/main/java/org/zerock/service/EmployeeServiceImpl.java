package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.EmployeeVO;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Inject
	private EmployeeDAO dao;

	@Override
	public void regist(EmployeeVO employee) throws Exception {
		dao.create(employee);
	}

	@Override
	public EmployeeVO read(String empId, int posNum) throws Exception{
		return dao.read(empId,posNum);
	}

	@Override
	public void modify(EmployeeVO employee) throws Exception {
		dao.update(employee);
	}

	@Override
	public void remove(String empId,int posNum) throws Exception {
		dao.delete(empId,posNum);
	}

	@Override
	public List<EmployeeVO> listAll(int posNum) throws Exception {
		return dao.listAll(posNum);
	}
	
	/*@Override
	public List<EmployeeVO> Alldata(EmployeeVO employee)throws Exception{
		return dao.Alldata(employee);
	}*/

	@Override
	public EmployeeVO login(EmployeeVO employee)throws Exception {
		return dao.verify(employee);
	}

	@Override
	public ArrayList<EmployeeVO> Alldata() throws Exception {
		return dao.Alldata();
	}

	@Override
	public void UpdateInsert(EmployeeVO employee) throws Exception {
		dao.updateORInsert(employee);		
	}

	@Override
	public void restart(EmployeeVO employee) throws Exception {
		dao.restart(employee);
	}

}
