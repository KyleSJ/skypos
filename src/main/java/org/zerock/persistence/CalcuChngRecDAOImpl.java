package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CalendarVO;

@Repository
public class CalcuChngRecDAOImpl implements CalcuChngRecDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.CalcuChngRecMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";

	@Override
	public void create(CalcuChngRecVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public CalcuChngRecVO read(int calcuChngNum) throws Exception {
		return session.selectOne(namespace+".read",calcuChngNum);
	}

	@Override
	public void update(CalcuChngRecVO vo) throws Exception {
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

	@Override
	public void updateORInsert(CalcuChngRecVO vo) throws Exception {
		session.update(namespaceForIU+".updateinsertCalcuChngRec",vo);
	}

	@Override
	public List CalendarlistAll(int posNum) throws Exception {
		return session.selectList(namespace+".calendarvalue",posNum);
	}

	@Override
	public List<CalcuChngRecVO> sendlistAll(int posNum) {
		return session.selectList(namespace+".sendlistAll",posNum);
	}
	
}
