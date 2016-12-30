package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.PayVO;
import org.zerock.persistence.PayDAO;

@Service
public class PayServiceImpl implements PayService{
	
	@Inject
	private PayDAO dao;

	@Override
	public void regist(PayVO pay) throws Exception {
		dao.create(pay);
	}

	@Override
	public PayVO read(int payNum) throws Exception{
		return dao.read(payNum);
	}

	@Override
	public void modify(PayVO pay) throws Exception {
		dao.update(pay);
	}

	@Override
	public void remove(int payNum) throws Exception {
		dao.delete(payNum);
	}

	@Override
	public List<PayVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(PayVO pay) throws Exception {
		dao.updateORInsert(pay);
	}

	@Override
	public List<PayVO> sendlistAll(int posNum) {
		return dao.sendlistAll(posNum);
	}
	
}
