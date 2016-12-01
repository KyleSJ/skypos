package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.SeattableVO;

@Repository
public class seattableDAOImpl implements seattableDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.SeattableMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(SeattableVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public SeattableVO read(int tableNum) throws Exception {
		return session.selectOne(namespace+".read",tableNum);
	}

	@Override
	public void update(SeattableVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int tableNum) throws Exception {
		session.delete(namespace+".delete",tableNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(SeattableVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertSeattable",vo);
	}
	
}
