package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.PayVO;

public interface PayService {
	public void regist(PayVO pay)throws Exception;
	
	public PayVO read(int payNum)throws Exception;
	
	public void modify(PayVO pay)throws Exception;
	
	public void remove(int payNum)throws Exception;
	
	public List<PayVO> listAll()throws Exception;
	
	public void UpdateInsert(PayVO pay)throws Exception;

	public List<PayVO> sendlistAll(int posNum);
}
