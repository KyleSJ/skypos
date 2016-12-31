package org.zerock.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@SuppressWarnings("unchecked")
	@Override
	public EmployeeVO read(String empId,int posNum) throws Exception {
		Map<String, String> Stringvalue=new HashMap<String,String>();
		Map<String, Integer>  Intvalue= new HashMap<String, Integer>();
		Stringvalue.put("empId", empId);
		Intvalue.put("posNum", posNum);
		
		Map<Object, Object> merge = new HashMap<Object, Object>();
		merge.putAll(Stringvalue);
		merge.putAll(Intvalue);
		
		return session.selectOne(namespace+".read",merge);
	}

	@Override
	public void update(EmployeeVO vo) throws Exception {
		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(String empId,int posNum) throws Exception {
		Map<String, String> Stringvalue=new HashMap<String,String>();
		Map<String, Integer> Intvalue=new HashMap<String, Integer>();
		Stringvalue.put("empId",  empId);
		Intvalue.put("posNum", posNum);
		
		Map<Object, Object> merge = new HashMap<Object, Object>();
		merge.putAll(Stringvalue);
		merge.putAll(Intvalue);
		
		session.delete(namespace+".delete",merge);
	}

	@Override
	public List listAll(int posNum) throws Exception {
		return session.selectList(namespace+".listAll",posNum);
	}
	
	@Override
	public EmployeeVO verify(EmployeeVO vo) {
		return session.selectOne(namespace+".login",vo);
	}

	@Override
	public void updateORInsert(EmployeeVO vo) throws Exception {
		session.update(namespaceForIU+".updateinsertEmp",vo);
	}

	@Override
	public void restart(EmployeeVO vo) throws Exception {
		session.update(namespace+".restart",vo);
	}

	@Override
	public List<EmployeeVO> sendlistAll(int posNum) {
		return session.selectList(namespace+".sendlistAll",posNum);
	}	
}
