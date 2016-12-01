package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.PrintVO;

@Repository
public class PrintDAOImpl implements PrintDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.PrintMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(PrintVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public PrintVO read(int printNum) throws Exception {
		return session.selectOne(namespace+".read",printNum);
	}

	@Override
	public void update(PrintVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int printNum) throws Exception {
		session.delete(namespace+".delete",printNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(PrintVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertPrint",vo);
	}
	
}
