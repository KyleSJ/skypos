package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.OrderMenuVO;

public interface OrderMenuDAO {
	public void create(OrderMenuVO vo)throws Exception;
	
	public OrderMenuVO read(int orderNum)throws Exception;
	
	public void update(OrderMenuVO vo)throws Exception;
	
	public void delete(int orderNum)throws Exception;
	
	public List<OrderMenuVO> listAll()throws Exception;
}
