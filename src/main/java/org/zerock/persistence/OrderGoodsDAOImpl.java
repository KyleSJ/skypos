package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.OrderGoodsVO;

@Repository
public class OrderGoodsDAOImpl implements OrderGoodsDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.OrderGoodsMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(OrderGoodsVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public OrderGoodsVO read(int orderGoodsNum) throws Exception {
		return session.selectOne(namespace+".read",orderGoodsNum);
	}

	@Override
	public void update(OrderGoodsVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int orderGoodsNum) throws Exception {
		session.delete(namespace+".delete",orderGoodsNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(OrderGoodsVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertOrderGoods",vo);
	}

	@Override
	public List<OrderGoodsVO> sendlistAll(int posNum) {
		return session.selectList(namespace+".sendlistAll",posNum);
	}
	
}
