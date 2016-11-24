package org.zerock.service;

import java.util.List;

import org.zerock.domain.CalcuChngRecVO;

public interface CalcuChngRecService {
	public void regist(CalcuChngRecVO calcuChngRec)throws Exception;
	
	public CalcuChngRecVO read(int calcuChngNum)throws Exception;
	
	public void modify(CalcuChngRecVO calcuChngRec)throws Exception;
	
	public void remove(int calcuChngNum)throws Exception;
	
	public List<CalcuChngRecVO> listAll()throws Exception;
}
