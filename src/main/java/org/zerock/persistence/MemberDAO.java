package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.MemberVO;

public interface MemberDAO {
	public void create(MemberVO vo)throws Exception;
	
	public MemberVO read(int posNum)throws Exception;
	
	public void update(MemberVO vo)throws Exception;
	
	public void delete(int posNum)throws Exception;
	
	public List<MemberVO> listAll()throws Exception;
	
	public void updateORInsert(MemberVO vo)throws Exception;
}
