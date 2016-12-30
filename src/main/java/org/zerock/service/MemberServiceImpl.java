package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO dao;

	@Override
	public void regist(MemberVO member) throws Exception {
		dao.create(member);
	}

	@Override
	public MemberVO read(int posNum) throws Exception{		
		return dao.read(posNum);
	}

	@Override
	public void modify(MemberVO member) throws Exception {
		dao.update(member);
	}

	@Override
	public void remove(int posNum) throws Exception {
		dao.delete(posNum);
	}

	@Override
	public List<MemberVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(MemberVO member) throws Exception {
		dao.updateORInsert(member);
	}

	@Override
	public void restart(MemberVO member) throws Exception {
		dao.restart(member);
	}

	@Override
	public List<MemberVO> sendlistAll(int posNum) {
		return dao.sendlistAll(posNum);
	}
	
}
