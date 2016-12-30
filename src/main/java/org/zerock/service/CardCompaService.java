package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.zerock.domain.CalcuChngRecVO;
import org.zerock.domain.CardCompaVO;

public interface CardCompaService {
	public void regist(CardCompaVO cardcompa)throws Exception;
	
	public CardCompaVO read(int cardCompaNum)throws Exception;
	
	public void modify(CardCompaVO cardcompa)throws Exception;
	
	public void remove(int cardCompaNum)throws Exception;
	
	public List<CardCompaVO> listAll()throws Exception;
	
	public void UpdateInsert(CardCompaVO cardcompa)throws Exception;

	public List<CardCompaVO> sendlistAll(int posNum);
}
