package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.VanVO;

public interface VanService{
	public void regist(VanVO van)throws Exception;
	
	public VanVO read(int vanNum)throws Exception;
	
	public void modify(VanVO van)throws Exception;
	
	public void remove(int vanNum)throws Exception;
	
	public List<VanVO> listAll()throws Exception;
	
	public void UpdateInsert(VanVO van)throws Exception;

	public List<VanVO> sendlistAll(int posNum);
}
