package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.CalcuChngNumVO;

public interface CalcuChngNumDAO {
	public void create(CalcuChngNumVO vo)throws Exception;
	
	public CalcuChngNumVO read(int calcuChngNum)throws Exception;
	
	public void update(CalcuChngNumVO vo)throws Exception;
	
	public void delete(int calcuChngNum)throws Exception;
	
	public List<CalcuChngNumVO> listAll()throws Exception;
}