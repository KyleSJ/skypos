package org.zerock.service;

import java.util.List;

import org.zerock.domain.GoodsCatVO;

public interface GoodsCatService {
	public void regist(GoodsCatVO goodscat)throws Exception;
	
	public GoodsCatVO read(int goodsCatNum)throws Exception;
	
	public void modify(GoodsCatVO goodscat)throws Exception;
	
	public void remove(int goodsCatNum)throws Exception;
	
	public List<GoodsCatVO> listAll()throws Exception;
}
