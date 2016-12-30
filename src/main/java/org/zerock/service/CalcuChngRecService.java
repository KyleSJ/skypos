package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CalendarVO;

public interface CalcuChngRecService {
	public void regist(CalcuChngRecVO calcuChngRec)throws Exception;
	
	public CalcuChngRecVO read(int calcuChngNum)throws Exception;
	
	public void modify(CalcuChngRecVO calcuChngRec)throws Exception;
	
	public void remove(int calcuChngNum)throws Exception;
	
	public List<CalcuChngRecVO> listAll()throws Exception;
	
	public void UpdateInsert(CalcuChngRecVO calcuChngRec)throws Exception;
	
	public List<CalendarVO> CalendarlistAll(int posNum)throws Exception;

	public List<CalcuChngRecVO> sendlistAll(int posNum);
}
