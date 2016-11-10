package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.EmployeeVO;
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
	public EmployeeVO read(String empId) throws Exception{
		return dao.read(empId);
	}

	@Override
	public void modify(EmployeeVO employee) throws Exception {
		dao.update(employee);
	}

	@Override
	public void remove(String empId) throws Exception {
		dao.delete(empId);
	}

	@Override
	public List<EmployeeVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
