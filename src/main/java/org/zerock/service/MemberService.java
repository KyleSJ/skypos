package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.MemberVO;

public interface MemberService {
	public void regist(MemberVO member)throws Exception;
	
	public MemberVO read(int posNum)throws Exception;
	
	public void modify(MemberVO member)throws Exception;
	
	public void remove(int posNum)throws Exception;
	
	public List<MemberVO> listAll()throws Exception;
	
	public void UpdateInsert(MemberVO member)throws Exception;

	public void restart(MemberVO member)throws Exception;

	public List<MemberVO> sendlistAll(int posNum);
}
