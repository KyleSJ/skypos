package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.PrintVO;

public interface PrintService {
	public void regist(PrintVO print)throws Exception;
	
	public PrintVO read(int printNum)throws Exception;
	
	public void modify(PrintVO print)throws Exception;
	
	public void remove(int printNum)throws Exception;
	
	public List<PrintVO> listAll()throws Exception;
	
	public void UpdateInsert(PrintVO print)throws Exception;

	public List<PrintVO> sendlistAll(int posNum);
}
