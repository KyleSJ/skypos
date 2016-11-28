package org.zerock.service;

import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.OrderGoodsVO;

public interface OrderGoodsService {
	public void regist(OrderGoodsVO orderGoods)throws Exception;
	
	public OrderGoodsVO read(int orderGoodsNum)throws Exception;
	
	public void modify(OrderGoodsVO orderGoods)throws Exception;
	
	public void remove(int orderGoodsNum)throws Exception;
	
	public List<OrderGoodsVO> listAll()throws Exception;
	
	public void UpdateInsert(OrderGoodsVO orderGoods)throws Exception;
}
