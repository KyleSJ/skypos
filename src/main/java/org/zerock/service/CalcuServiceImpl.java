package org.zerock.service;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.CalcuVO;
import org.zerock.persistence.CalcuDAO;

@Service
public class CalcuServiceImpl implements CalcuService{
	
	@Inject
	private CalcuDAO dao;

	@Override
	public void regist(CalcuVO calcu) throws Exception {
		dao.create(calcu);
	}

	@Override
	public CalcuVO read(Date calcuDay) throws Exception{
		//System.out.println(test.toString());
		return dao.read(calcuDay);
	}

	@Override
	public void modify(CalcuVO calcu) throws Exception {
		dao.update(calcu);
	}

	@Override
	public void remove(Date calcuDay) throws Exception {
		dao.delete(calcuDay);
	}

	@Override
	public List<CalcuVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(CalcuVO calcu) throws Exception {
		dao.updateORInsert(calcu);
	}
	
}
