package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.CmplxPayVO;

@Repository
public class CmplxPayDAOImpl implements CmplxPayDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.CmplxPayMapper";
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
	@Override
	public void create(CmplxPayVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public CmplxPayVO read(int cmplxPayNum) throws Exception {
		return session.selectOne(namespace+".read",cmplxPayNum);
	}

	@Override
	public void update(CmplxPayVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int cmplxPayNum) throws Exception {
		session.delete(namespace+".delete",cmplxPayNum);
	}

	@Override
	public List listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public void updateORInsert(CmplxPayVO vo) throws Exception {		
		session.update(namespaceForIU+".updateinsertCmplxPay",vo);
	}

	@Override
	public List<CmplxPayVO> sendlistAll(int posNum) {
		return session.selectList(namespace+".sendlistAll",posNum);
	}
	
}
