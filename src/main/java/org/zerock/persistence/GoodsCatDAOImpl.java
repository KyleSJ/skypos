package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.GoodsCatVO;

@Repository
public class GoodsCatDAOImpl implements GoodsCatDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.GoodsCatMapper";

	@Override
	public void create(GoodsCatVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public GoodsCatVO read(int goodsCatNum) throws Exception {
		return session.selectOne(namespace+".read",goodsCatNum);
	}

	@Override
	public void update(GoodsCatVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int goodsCatNum) throws Exception {
		session.delete(namespace+".delete",goodsCatNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}
	
}
