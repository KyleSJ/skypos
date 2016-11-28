package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.GoodsVO;
import org.zerock.persistence.GoodsDAO;

@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Inject
	private GoodsDAO dao;

	@Override
	public void regist(GoodsVO goods) throws Exception {
		dao.create(goods);
	}

	@Override
	public GoodsVO read(int goodsNum) throws Exception{
		return dao.read(goodsNum);
	}

	@Override
	public void modify(GoodsVO goods) throws Exception {
		dao.update(goods);
	}

	@Override
	public void remove(int goodsNum) throws Exception {
		dao.delete(goodsNum);
	}

	@Override
	public List<GoodsVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(GoodsVO goods) throws Exception {
		dao.updateORInsert(goods);
	}
	
}
