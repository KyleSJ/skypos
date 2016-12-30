package org.zerock.persistence;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.EmployeeVO;
import org.zerock.domain.GoodsVO;

public interface GoodsDAO {
	public void create(GoodsVO vo)throws Exception;
	
	public GoodsVO read(int goodsNum)throws Exception;
	
	public void update(GoodsVO vo)throws Exception;
	
	public void delete(int goodsNum)throws Exception;
	
	public List<GoodsVO> listAll(int posNum)throws Exception;
	
	public ArrayList<GoodsVO> Alldata()throws Exception;

	public void updateORInsert(GoodsVO vo)throws Exception;

	public List<GoodsVO> sendlistAll(int posNum);
}