package org.zerock.domain;

import java.sql.Date;
//Fullcalender 형식 맞추기
public class CalendarVO {
	private String title;
	private Date start;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	@Override
	public String toString() {
		return "CalendarVO [title=" + title + ", start=" + start + "]";
	}
	
	
}
