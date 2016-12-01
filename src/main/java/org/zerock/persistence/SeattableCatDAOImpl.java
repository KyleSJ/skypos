package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.SeattableCatVO;

@Repository
public class SeattableCatDAOImpl implements SeattableCatDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.SeattableCatMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(SeattableCatVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public SeattableCatVO read(int tableCatNum) throws Exception {
		return session.selectOne(namespace+".read",tableCatNum);
	}

	@Override
	public void update(SeattableCatVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int tableCatNum) throws Exception {
		session.delete(namespace+".delete",tableCatNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(SeattableCatVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertTableCat",vo);
	}
	
}
