package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.CmplxPayVO;

public interface CmplxPayDAO {
	public void create(CmplxPayVO vo)throws Exception;
	
	public CmplxPayVO read(int cmplxPayNum)throws Exception;
	
	public void update(CmplxPayVO vo)throws Exception;
	
	public void delete(int cmplxPayNum)throws Exception;
	
	public List<CmplxPayVO> listAll()throws Exception;
	
	public void updateORInsert(CmplxPayVO vo)throws Exception;

	public List<CmplxPayVO> sendlistAll(int posNum);
}
