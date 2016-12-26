package org.zerock.persistence;

import java.sql.Date;
import java.util.List;

import org.zerock.domain.OpenVO;

public interface OpenDAO {
	public void create(OpenVO vo)throws Exception;
	
	public OpenVO read(Date openDay)throws Exception;
	
	public void update(OpenVO vo)throws Exception;
	
	public void delete(Date openDay)throws Exception;
	
	public List<OpenVO> listAll()throws Exception;
	
	public void updateORInsert(OpenVO vo)throws Exception;

	public List<OpenVO> selectlistAll(String posnum, String empid, String pwd);


}
