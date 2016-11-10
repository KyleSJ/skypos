package org.zerock.service;

import java.sql.Date;
import java.util.List;

import org.zerock.domain.OpenVO;

public interface OpenService {
	public void regist(OpenVO open)throws Exception;
	
	public OpenVO read(Date OpenDay)throws Exception;
	
	public void modify(OpenVO open)throws Exception;
	
	public void remove(Date OpenDay)throws Exception;
	
	public List<OpenVO> listAll()throws Exception;
}
