package org.zerock.domain;

public class SeattableVO {
	private int tableNum;
	private int tableLoc;
	private int tableColor;
	private int tableCatNum;
	private String tableName;
	
	

	public int getTableNum() {
		return tableNum;
	}



	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}



	public int getTableLoc() {
		return tableLoc;
	}



	public void setTableLoc(int tableLoc) {
		this.tableLoc = tableLoc;
	}



	public int getTableColor() {
		return tableColor;
	}



	public void setTableColor(int tableColor) {
		this.tableColor = tableColor;
	}



	public int getTableCatNum() {
		return tableCatNum;
	}



	public void setTableCatNum(int tableCatNum) {
		this.tableCatNum = tableCatNum;
	}



	public String getTableName() {
		return tableName;
	}



	public void setTableName(String tableName) {
		this.tableName = tableName;
	}



	@Override
	public String toString() {
		return "TableVO [tableNum=" + tableNum + ", tableLoc=" + tableLoc
				+ ", tableColor=" + tableColor + ", tableCatNum=" + tableCatNum
				+ ", tableName=" + tableName + "]";
	}	
}
