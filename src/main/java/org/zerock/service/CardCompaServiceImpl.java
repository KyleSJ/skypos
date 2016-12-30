package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.CardCompaVO;
import org.zerock.persistence.CardCompaDAO;

@Service
public class CardCompaServiceImpl implements CardCompaService{
	
	@Inject
	private CardCompaDAO dao;

	@Override
	public void regist(CardCompaVO cardcompa) throws Exception {
		dao.create(cardcompa);
	}

	@Override
	public CardCompaVO read(int cardCompaNum) throws Exception{
		return dao.read(cardCompaNum);
	}

	@Override
	public void modify(CardCompaVO cardcompa) throws Exception {
		dao.update(cardcompa);
	}

	@Override
	public void remove(int cardCompaNum) throws Exception {
		dao.delete(cardCompaNum);
	}

	@Override
	public List<CardCompaVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(CardCompaVO cardcompa) throws Exception {
		dao.updateORInsert(cardcompa);		
	}

	@Override
	public List<CardCompaVO> sendlistAll(int posNum) {
		return dao.sendlistAll(posNum);
	}
	
}
