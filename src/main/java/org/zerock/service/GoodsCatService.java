package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.GoodsCatVO;

public interface GoodsCatService {
	public void regist(GoodsCatVO goodscat)throws Exception;
	
	public GoodsCatVO read(int goodsCatNum)throws Exception;
	
	public void modify(GoodsCatVO goodscat)throws Exception;
	
	public void remove(int goodsCatNum)throws Exception;
	
	public List<GoodsCatVO> listAll(int posNum)throws Exception;
	
	public void UpdateInsert(GoodsCatVO goodscat)throws Exception;

	public List<GoodsCatVO> Alldata();

	public List<GoodsCatVO> sendlistAll(int posNum);
}
