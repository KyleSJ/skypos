package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.PrintVO;

public interface PrintDAO {
	public void create(PrintVO vo)throws Exception;
	
	public PrintVO read(int printNum)throws Exception;
	
	public void update(PrintVO vo)throws Exception;
	
	public void delete(int printNum)throws Exception;
	
	public List<PrintVO> listAll()throws Exception;
}
