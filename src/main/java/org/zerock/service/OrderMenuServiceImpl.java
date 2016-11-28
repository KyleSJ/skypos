package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.OrderMenuVO;
import org.zerock.persistence.OrderMenuDAO;

@Service
public class OrderMenuServiceImpl implements OrderMenuService{
	
	@Inject
	private OrderMenuDAO dao;

	@Override
	public void regist(OrderMenuVO ordermenu) throws Exception {
		dao.create(ordermenu);
	}

	@Override
	public OrderMenuVO read(int orderNum) throws Exception{
		return dao.read(orderNum);
	}

	@Override
	public void modify(OrderMenuVO ordermenu) throws Exception {
		dao.update(ordermenu);
	}

	@Override
	public void remove(int orderNum) throws Exception {
		dao.delete(orderNum);
	}

	@Override
	public List<OrderMenuVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(OrderMenuVO ordermenu) throws Exception {
		dao.updateORInsert(ordermenu);		
	}
	
}
