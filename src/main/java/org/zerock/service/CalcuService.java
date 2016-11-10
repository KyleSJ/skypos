package org.zerock.service;

import java.sql.Date;
import java.util.List;

import org.zerock.domain.CalcuVO;

public interface CalcuService {
	public void regist(CalcuVO calcu)throws Exception;
	
	public CalcuVO read(Date calcuDay)throws Exception;
	
	public void modify(CalcuVO calcu)throws Exception;
	
	public void remove(Date calcuDay)throws Exception;
	
	public List<CalcuVO> listAll()throws Exception;
}
