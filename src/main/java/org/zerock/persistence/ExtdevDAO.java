package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.ExtdevVO;

public interface ExtdevDAO {
	public void create(ExtdevVO vo)throws Exception;
	
	public ExtdevVO read(String devName)throws Exception;
	
	public void update(ExtdevVO vo)throws Exception;
	
	public void delete(String devName)throws Exception;
	
	public List<ExtdevVO> listAll()throws Exception;
	
	public void updateORInsert(ExtdevVO vo)throws Exception;
}