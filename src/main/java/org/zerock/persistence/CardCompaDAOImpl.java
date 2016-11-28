package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.CardCompaVO;

@Repository
public class CardCompaDAOImpl implements CardCompaDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.CardcompaMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(CardCompaVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public CardCompaVO read(int cardCompaNum) throws Exception {
		return session.selectOne(namespace+".read",cardCompaNum);
	}

	@Override
	public void update(CardCompaVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int cardCompaNum) throws Exception {
		session.delete(namespace+".delete",cardCompaNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(CardCompaVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsert",vo);
	}
	
}
