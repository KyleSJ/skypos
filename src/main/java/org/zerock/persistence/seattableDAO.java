package org.zerock.persistence;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.SeattableVO;

public interface seattableDAO {
	public void create(SeattableVO vo)throws Exception;
	
	public SeattableVO read(int tableNum)throws Exception;
	
	public void update(SeattableVO vo)throws Exception;
	
	public void delete(int tableNum)throws Exception;
	
	public List<SeattableVO> listAll(int posNum)throws Exception;
	
	public ArrayList<SeattableVO> Alldata() throws Exception;
	
	public void updateORInsert(SeattableVO vo)throws Exception;

	public List<SeattableVO> sendlistAll(int posNum);
}