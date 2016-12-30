package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.PayVO;

public interface PayDAO {
	public void create(PayVO vo)throws Exception;
	
	public PayVO read(int payNum)throws Exception;
	
	public void update(PayVO vo)throws Exception;
	
	public void delete(int payNum)throws Exception;
	
	public List<PayVO> listAll()throws Exception;
	
	public void updateORInsert(PayVO vo)throws Exception;

	public List<PayVO> sendlistAll(int posNum);
}
