package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.OrderGoodsVO;
import org.zerock.persistence.OrderGoodsDAO;

@Service
public class OrderGoodsServiceImpl implements OrderGoodsService{
	
	@Inject
	private OrderGoodsDAO dao;

	@Override
	public void regist(OrderGoodsVO orderGoods) throws Exception {
		dao.create(orderGoods);
	}

	@Override
	public OrderGoodsVO read(int orderGoodsNum) throws Exception{
		return dao.read(orderGoodsNum);
	}

	@Override
	public void modify(OrderGoodsVO orderGoods) throws Exception {
		dao.update(orderGoods);
	}

	@Override
	public void remove(int orderGoodsNum) throws Exception {
		dao.delete(orderGoodsNum);
	}

	@Override
	public List<OrderGoodsVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
