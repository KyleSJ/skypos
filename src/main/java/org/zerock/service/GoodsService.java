package org.zerock.service;

import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.GoodsVO;

public interface GoodsService {
	public void regist(GoodsVO goods)throws Exception;
	
	public GoodsVO read(int goodsNum)throws Exception;
	
	public void modify(GoodsVO goods)throws Exception;
	
	public void remove(int goodsNum)throws Exception;
	
	public List<GoodsVO> listAll()throws Exception;
	
	public void UpdateInsert(GoodsVO goods)throws Exception;
}
