package org.zerock.persistence;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.OpenVO;

@Repository
public class OpenDAOImpl implements OpenDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.OpenMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(OpenVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public OpenVO read(Date OpenDay) throws Exception {
		return session.selectOne(namespace+".read",OpenDay);
	}

	@Override
	public void update(OpenVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(Date OpenDay) throws Exception {
		session.delete(namespace+".delete",OpenDay);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(OpenVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertOpen",vo);
	}

	@Override
	public List<OpenVO> selectlistAll(String posnum, String empid, String pwd) {
		
		return session.selectList(namespace+".selectlistAll");
	}
	
}
