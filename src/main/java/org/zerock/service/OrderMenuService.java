package org.zerock.service;

import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.OrderMenuVO;

public interface OrderMenuService {
	public void regist(OrderMenuVO ordermenu)throws Exception;
	
	public OrderMenuVO read(int orderNum)throws Exception;
	
	public void modify(OrderMenuVO ordermenu)throws Exception;
	
	public void remove(int orderNum)throws Exception;
	
	public List<OrderMenuVO> listAll()throws Exception;
	
	public void UpdateInsert(OrderMenuVO ordermenu)throws Exception;
}
