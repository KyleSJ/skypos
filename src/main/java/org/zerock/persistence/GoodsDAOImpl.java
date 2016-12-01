package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.GoodsVO;

@Repository
public class GoodsDAOImpl implements GoodsDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.GoodsMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(GoodsVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public GoodsVO read(int goodsNum) throws Exception {
		return session.selectOne(namespace+".read",goodsNum);
	}

	@Override
	public void update(GoodsVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int goodsNum) throws Exception {
		session.delete(namespace+".delete",goodsNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(GoodsVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertGoods",vo);
	}
	
}
