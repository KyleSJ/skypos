package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.CmplxPayVO;
import org.zerock.persistence.CmplxPayDAO;

@Service
public class CmplxPayServiceImpl implements CmplxPayService{
	
	@Inject
	private CmplxPayDAO dao;

	@Override
	public void regist(CmplxPayVO cmplxpay) throws Exception {
		dao.create(cmplxpay);
	}

	@Override
	public CmplxPayVO read(int cmplxPayNum) throws Exception{
		return dao.read(cmplxPayNum);
	}

	@Override
	public void modify(CmplxPayVO cmplxpay) throws Exception {
		dao.update(cmplxpay);
	}

	@Override
	public void remove(int cmplxPayNum) throws Exception {
		dao.delete(cmplxPayNum);
	}

	@Override
	public List<CmplxPayVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
