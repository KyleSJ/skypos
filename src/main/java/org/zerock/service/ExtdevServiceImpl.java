package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.ExtdevVO;
import org.zerock.persistence.ExtdevDAO;

@Service
public class ExtdevServiceImpl implements ExtdevService{
	
	@Inject
	private ExtdevDAO dao;

	@Override
	public void regist(ExtdevVO extdev) throws Exception {
		dao.create(extdev);
	}

	@Override
	public ExtdevVO read(String devName) throws Exception{
		return dao.read(devName);
	}

	@Override
	public void modify(ExtdevVO extdev) throws Exception {
		dao.update(extdev);
	}

	@Override
	public void remove(String devName) throws Exception {
		dao.delete(devName);
	}

	@Override
	public List<ExtdevVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(ExtdevVO extdev) throws Exception {		
		dao.updateORInsert(extdev);
	}
	
}
