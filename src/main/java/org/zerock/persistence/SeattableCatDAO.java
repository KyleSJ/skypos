package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.SeattableCatVO;

public interface SeattableCatDAO {
	public void create(SeattableCatVO vo)throws Exception;
	
	public SeattableCatVO read(int tableCatNum)throws Exception;
	
	public void update(SeattableCatVO vo)throws Exception;
	
	public void delete(int tableCatNum)throws Exception;
	
	public List<SeattableCatVO> listAll()throws Exception;
}