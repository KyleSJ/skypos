package org.zerock.service;

import java.util.ArrayList;
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
	public List<SeattableVO> listAll(int posNum) throws Exception {
		return dao.listAll(posNum);
	}
	
	@Override
	public void UpdateInsert(SeattableVO table) throws Exception {
		dao.updateORInsert(table);
	}

	@Override
	public List<SeattableVO> sendlistAll(int posNum) {
		return dao.sendlistAll(posNum);
	}
}
