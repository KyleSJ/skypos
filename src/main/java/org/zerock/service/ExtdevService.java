package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.ExtdevVO;

public interface ExtdevService {
	public void regist(ExtdevVO extdev)throws Exception;
	
	public ExtdevVO read(String devName)throws Exception;
	
	public void modify(ExtdevVO extdev)throws Exception;
	
	public void remove(String devName)throws Exception;
	
	public List<ExtdevVO> listAll()throws Exception;
	
	public void UpdateInsert(ExtdevVO extdev)throws Exception;

	public List<ExtdevVO> sendlistAll(int posNum);
}
