package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CalendarVO;

public interface CalcuChngRecDAO {
	public void create(CalcuChngRecVO vo)throws Exception;
	
	public CalcuChngRecVO read(int calcuChngNum)throws Exception;
	
	public void update(CalcuChngRecVO vo)throws Exception;
	
	public void delete(int calcuChngNum)throws Exception;
	
	public List<CalcuChngRecVO> listAll()throws Exception;
	
	public void updateORInsert(CalcuChngRecVO vo)throws Exception;

	public List<CalendarVO> CalendarlistAll(int posNum)throws Exception;
}