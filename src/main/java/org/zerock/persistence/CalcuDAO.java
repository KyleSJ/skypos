package org.zerock.persistence;

import java.sql.Date;
import java.util.List;

import org.zerock.domain.CalcuVO;

public interface CalcuDAO {
	public void create(CalcuVO vo)throws Exception;
	
	public CalcuVO read(Date calcuDay)throws Exception;
	
	public void update(CalcuVO vo)throws Exception;
	
	public void delete(Date calcuDay)throws Exception;
	
	public List<CalcuVO> listAll()throws Exception;
	
	public void updateORInsert(CalcuVO vo)throws Exception;
}