package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.CardCompaVO;

public interface CardCompaDAO {
	public void create(CardCompaVO vo)throws Exception;
	
	public CardCompaVO read(int cardCompaNum)throws Exception;
	
	public void update(CardCompaVO vo)throws Exception;
	
	public void delete(int cardCompaNum)throws Exception;
	
	public List<CardCompaVO> listAll()throws Exception;
	
	public void updateORInsert(CardCompaVO vo)throws Exception;

	public List<CardCompaVO> sendlistAll();
}