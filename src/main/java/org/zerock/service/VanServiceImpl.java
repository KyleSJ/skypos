package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.VanVO;
import org.zerock.persistence.VanDAO;

@Service
public class VanServiceImpl implements VanService{
	
	@Inject
	private VanDAO dao;

	@Override
	public void regist(VanVO van) throws Exception {
		dao.create(van);
	}

	@Override
	public VanVO read(int vanNum) throws Exception{
		//System.out.println(test.toString());
		return dao.read(vanNum);
	}

	@Override
	public void modify(VanVO van) throws Exception {
		dao.update(van);
	}

	@Override
	public void remove(int vanNum) throws Exception {
		dao.delete(vanNum);
	}

	@Override
	public List<VanVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(VanVO van) throws Exception {
		dao.updateORInsert(van);
	}
	
}
