package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.CalcuChngNumVO;
import org.zerock.persistence.CalcuChngNumDAO;

@Service
public class CalcuChngNumServiceImpl implements CalcuChngNumService{
	
	@Inject
	private CalcuChngNumDAO dao;

	@Override
	public void regist(CalcuChngNumVO calcuChngNum) throws Exception {
		dao.create(calcuChngNum);
	}

	@Override
	public CalcuChngNumVO read(int calcuChngNum) throws Exception{
		//System.out.println(test.toString());
		return dao.read(calcuChngNum);
	}

	@Override
	public void modify(CalcuChngNumVO calcuChngNum) throws Exception {
		dao.update(calcuChngNum);
	}

	@Override
	public void remove(int calcuChngNum) throws Exception {
		dao.delete(calcuChngNum);
	}

	@Override
	public List<CalcuChngNumVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
