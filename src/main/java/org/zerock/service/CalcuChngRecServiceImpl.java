package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CalendarVO;
import org.zerock.persistence.CalcuChngRecDAO;

@Service
public class CalcuChngRecServiceImpl implements CalcuChngRecService{
	
	@Inject
	private CalcuChngRecDAO dao;

	@Override
	public void regist(CalcuChngRecVO calcuChngRec) throws Exception {
		dao.create(calcuChngRec);
	}

	@Override
	public CalcuChngRecVO read(int calcuChngNum) throws Exception{
		return dao.read(calcuChngNum);
	}

	@Override
	public void modify(CalcuChngRecVO calcuChngRec) throws Exception {
		dao.update(calcuChngRec);
	}

	@Override
	public void remove(int calcuChngNum) throws Exception {
		dao.delete(calcuChngNum);
	}

	@Override
	public List<CalcuChngRecVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(CalcuChngRecVO calcuChngRec) throws Exception {
		dao.updateORInsert(calcuChngRec);
	}

	@Override
	public List<CalendarVO> CalendarlistAll(int posNum) throws Exception {
		return dao.CalendarlistAll(posNum);
	}

	@Override
	public List<CalcuChngRecVO> sendlistAll(int posNum) {
		return dao.sendlistAll(posNum);
	}
}
