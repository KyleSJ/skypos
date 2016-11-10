package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.MemberMapper";

	@Override
	public void create(MemberVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public MemberVO read(int posNum) throws Exception {
		return session.selectOne(namespace+".read",posNum);
	}

	@Override
	public void update(MemberVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int posNum) throws Exception {
		session.delete(namespace+".delete",posNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}
	
}
