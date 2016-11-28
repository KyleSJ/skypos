package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.OrderMenuVO;

@Repository
public class OrderMenuDAOImpl implements OrderMenuDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.OrderMenuMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(OrderMenuVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public OrderMenuVO read(int orderNum) throws Exception {
		return session.selectOne(namespace+".read",orderNum);
	}

	@Override
	public void update(OrderMenuVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int orderNum) throws Exception {
		session.delete(namespace+".delete",orderNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(OrderMenuVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsert",vo);
	}
	
}
