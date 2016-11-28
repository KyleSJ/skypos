package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.VanVO;

public interface VanDAO {
	public void create(VanVO vo)throws Exception;
	
	public VanVO read(int vanNum)throws Exception;
	
	public void update(VanVO vo)throws Exception;
	
	public void delete(int vanNum)throws Exception;
	
	public List<VanVO> listAll()throws Exception;
	
	public void updateORInsert(VanVO vo)throws Exception;
}