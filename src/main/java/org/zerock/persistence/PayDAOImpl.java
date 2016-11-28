package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.PayVO;

@Repository
public class PayDAOImpl implements PayDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.PayMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(PayVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public PayVO read(int payNum) throws Exception {
		return session.selectOne(namespace+".read",payNum);
	}

	@Override
	public void update(PayVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int payNum) throws Exception {
		session.delete(namespace+".delete",payNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(PayVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsert",vo);
	}
	
}
