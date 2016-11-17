package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.CalcuChngNumVO;

@Repository
public class CalcuChngNumDAOImpl implements CalcuChngNumDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.CalcuchngnumMapper";

	@Override
	public void create(CalcuChngNumVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public CalcuChngNumVO read(int calcuChngNum) throws Exception {
		return session.selectOne(namespace+".read",calcuChngNum);
	}

	@Override
	public void update(CalcuChngNumVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int calcuChngNum) throws Exception {
		session.delete(namespace+".delete",calcuChngNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}
	
}
