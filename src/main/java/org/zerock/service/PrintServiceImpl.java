package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.PrintVO;
import org.zerock.persistence.PrintDAO;

@Service
public class PrintServiceImpl implements PrintService{
	
	@Inject
	private PrintDAO dao;

	@Override
	public void regist(PrintVO print) throws Exception {
		dao.create(print);
	}

	@Override
	public PrintVO read(int printNum) throws Exception{
		return dao.read(printNum);
	}

	@Override
	public void modify(PrintVO print) throws Exception {
		dao.update(print);
	}

	@Override
	public void remove(int printNum) throws Exception {
		dao.delete(printNum);
	}

	@Override
	public List<PrintVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public void UpdateInsert(PrintVO print) throws Exception {
		dao.updateORInsert(print);
	}
	
}
