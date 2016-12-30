package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.OrderGoodsVO;

public interface OrderGoodsDAO {
	public void create(OrderGoodsVO vo)throws Exception;
	
	public OrderGoodsVO read(int orderGoodsNum)throws Exception;
	
	public void update(OrderGoodsVO vo)throws Exception;
	
	public void delete(int orderGoodsNum)throws Exception;
	
	public List<OrderGoodsVO> listAll()throws Exception;
	
	public void updateORInsert(OrderGoodsVO vo)throws Exception;

	public List<OrderGoodsVO> sendlistAll(int posNum);
}
