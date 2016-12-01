package org.zerock.persistence;

import java.util.ArrayList;
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
	private static String namespaceForIU="org.zerock.mapper.AndroidToServerMapper";
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
	
	/*@Override
	public List Alldata(EmployeeVO vo)throws Exception{
		return session.selectList(namespace+".Alldata",vo);
	}*/
	
	@Override
	public EmployeeVO verify(EmployeeVO vo) {
		return session.selectOne(namespace+".login",vo);
	}

	@Override
	public ArrayList Alldata()throws Exception{
		return (ArrayList) session.selectList(namespace+".Alldata");
	}

	@Override
	public void updateORInsert(EmployeeVO vo) throws Exception {
		session.update(namespaceForIU+".updateinsertEmp",vo);
	}

	
}
