package org.zerock.service;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.OpenVO;
import org.zerock.persistence.OpenDAO;

@Service
public class OpenServiceImpl implements OpenService{
	
	@Inject
	private OpenDAO dao;

	@Override
	public void regist(OpenVO open) throws Exception {
		dao.create(open);
	}

	@Override
	public OpenVO read(Date OpenDay) throws Exception{
		//System.out.println(test.toString());
		return dao.read(OpenDay);
	}

	@Override
	public void modify(OpenVO open) throws Exception {
		dao.update(open);
	}

	@Override
	public void remove(Date OpenDay) throws Exception {
		dao.delete(OpenDay);
	}

	@Override
	public List<OpenVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
