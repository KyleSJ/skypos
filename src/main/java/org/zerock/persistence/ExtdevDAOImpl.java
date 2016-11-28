package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.ExtdevVO;

@Repository
public class ExtdevDAOImpl implements ExtdevDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.ExtdevMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(ExtdevVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public ExtdevVO read(String devName) throws Exception {
		return session.selectOne(namespace+".read",devName);
	}

	@Override
	public void update(ExtdevVO vo) throws Exception {
		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(String devName) throws Exception {
		session.delete(namespace+".delete",devName);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(ExtdevVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsert",vo);
	}
	
}
