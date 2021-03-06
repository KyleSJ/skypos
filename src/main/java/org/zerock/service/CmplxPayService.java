package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CmplxPayVO;

public interface CmplxPayService {
	public void regist(CmplxPayVO cmplxpay)throws Exception;
	
	public CmplxPayVO read(int cmplxPayNum)throws Exception;
	
	public void modify(CmplxPayVO cmplxpay)throws Exception;
	
	public void remove(int cmplxPayNum)throws Exception;
	
	public List<CmplxPayVO> listAll()throws Exception;
	
	public void UpdateInsert(CmplxPayVO cmplxpay)throws Exception;

	public List<CmplxPayVO> sendlistAll(int posNum);
}
