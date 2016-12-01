package org.zerock.persistence;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.CalcuVO;

@Repository
public class CalcuDAOImpl implements CalcuDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.CalcuMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(CalcuVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public CalcuVO read(Date calcuDay) throws Exception {
		return session.selectOne(namespace+".read",calcuDay);
	}

	@Override
	public void update(CalcuVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(Date calcuDay) throws Exception {
		session.delete(namespace+".delete",calcuDay);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(CalcuVO vo) throws Exception {	
		session.update(namespaceForIU+".updateinsertCalcu",vo);
	}
	
}
