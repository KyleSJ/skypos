package org.zerock.service;

import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.SeattableVO;

public interface SeattableService{
	public void regist(SeattableVO table)throws Exception;
	
	public SeattableVO read(int tableNum)throws Exception;
	
	public void modify(SeattableVO table)throws Exception;
	
	public void remove(int tableNum)throws Exception;
	
	public List<SeattableVO> listAll()throws Exception;
	
	public void UpdateInsert(SeattableVO table)throws Exception;
}
