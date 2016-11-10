package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.SeattableVO;
import org.zerock.persistence.seattableDAO;

@Service
public class SeattableServiceImpl implements SeattableService{
	
	@Inject
	private seattableDAO dao;

	@Override
	public void regist(SeattableVO table) throws Exception {
		dao.create(table);
	}

	@Override
	public SeattableVO read(int tableNum) throws Exception{
		//System.out.println(test.toString());
		return dao.read(tableNum);
	}

	@Override
	public void modify(SeattableVO table) throws Exception {
		dao.update(table);
	}

	@Override
	public void remove(int tableNum) throws Exception {
		dao.delete(tableNum);
	}

	@Override
	public List<SeattableVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
