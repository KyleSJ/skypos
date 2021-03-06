package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.SeattableCatVO;

public interface SeattableCatService{
	public void regist(SeattableCatVO tablecat)throws Exception;
	
	public SeattableCatVO read(int tableCatNum)throws Exception;
	
	public void modify(SeattableCatVO tablecat)throws Exception;
	
	public void remove(int tableCatNum)throws Exception;
	
	public List<SeattableCatVO> listAll()throws Exception;
	
	public void UpdateInsert(SeattableCatVO tablecat)throws Exception;

	public List<SeattableCatVO> sendlistAll(int posNum);
}
