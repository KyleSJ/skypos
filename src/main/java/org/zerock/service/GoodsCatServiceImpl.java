package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.GoodsCatVO;
import org.zerock.persistence.GoodsCatDAO;

@Service
public class GoodsCatServiceImpl implements GoodsCatService{
	
	@Inject
	private GoodsCatDAO dao;

	@Override
	public void regist(GoodsCatVO goodscat) throws Exception {
		dao.create(goodscat);
	}

	@Override
	public GoodsCatVO read(int goodsCatNum) throws Exception{
		return dao.read(goodsCatNum);
	}

	@Override
	public void modify(GoodsCatVO goodscat) throws Exception {
		dao.update(goodscat);
	}

	@Override
	public void remove(int goodsCatNum) throws Exception {
		dao.delete(goodsCatNum);
	}

	@Override
	public List<GoodsCatVO> listAll(int posNum) throws Exception {
		return dao.listAll(posNum);
	}

	@Override
	public void UpdateInsert(GoodsCatVO goodscat) throws Exception {
		dao.updateORInsert(goodscat);
	}

	@Override
	public List<GoodsCatVO> sendlistAll(int posNum) {
		return dao.sendlistAll(posNum);
	}
	
}
