package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.SeattableCatVO;
import org.zerock.persistence.SeattableCatDAO;

@Service
public class SeattableCatServiceImpl implements SeattableCatService{
	
	@Inject
	private SeattableCatDAO dao;

	@Override
	public void regist(SeattableCatVO tablecat) throws Exception {
		dao.create(tablecat);
	}

	@Override
	public SeattableCatVO read(int tableCatNum) throws Exception{		
		return dao.read(tableCatNum);
	}

	@Override
	public void modify(SeattableCatVO tablecat) throws Exception {
		dao.update(tablecat);
	}

	@Override
	public void remove(int tableCatNum) throws Exception {
		dao.delete(tableCatNum);
	}

	@Override
	public List<SeattableCatVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(SeattableCatVO tablecat) throws Exception {
		dao.updateORInsert(tablecat);
	}
	
}
