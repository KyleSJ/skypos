package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.GoodsCatVO;

public interface GoodsCatDAO {
	public void create(GoodsCatVO vo)throws Exception;
	
	public GoodsCatVO read(int goodsCatNum)throws Exception;
	
	public void update(GoodsCatVO vo)throws Exception;
	
	public void delete(int goodsCatNum)throws Exception;
	
	public List<GoodsCatVO> listAll(int posNum)throws Exception;
	
	public void updateORInsert(GoodsCatVO vo)throws Exception;

	public List<GoodsCatVO> Alldata();
}