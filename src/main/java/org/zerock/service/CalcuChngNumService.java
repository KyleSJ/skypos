package org.zerock.service;

import java.util.List;

import org.zerock.domain.CalcuChngNumVO;

public interface CalcuChngNumService {
	public void regist(CalcuChngNumVO calcuChngNum)throws Exception;
	
	public CalcuChngNumVO read(int calcuChngNum)throws Exception;
	
	public void modify(CalcuChngNumVO calcuChngNum)throws Exception;
	
	public void remove(int calcuChngNum)throws Exception;
	
	public List<CalcuChngNumVO> listAll()throws Exception;
}
