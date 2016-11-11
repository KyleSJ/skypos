package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.zerock.mapper.EmployeeMapper";

	@Override
	public void create(EmployeeVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public EmployeeVO read(String empId) throws Exception {
		return session.selectOne(namespace+".read",empId);
	}

	@Override
	public void update(EmployeeVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(String empId) throws Exception {
		session.delete(namespace+".delete",empId);
	}

	@Override
	public List listAll(int posNum) throws Exception {
		return session.selectList(namespace+".listAll",posNum);
	}
	
}
