package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.VanVO;

@Repository
public class VanDAOImpl implements VanDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.VanMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(VanVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public VanVO read(int vanNum) throws Exception {
		return session.selectOne(namespace+".read",vanNum);
	}

	@Override
	public void update(VanVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int vanNum) throws Exception {
		session.delete(namespace+".delete",vanNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(VanVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertVan",vo);
	}

	@Override
	public List<VanVO> sendlistAll(int posNum) {
		return session.selectList(namespace+".sendlistAll",posNum);
	}
	
}
