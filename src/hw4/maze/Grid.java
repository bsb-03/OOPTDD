package hw4.maze;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Row> rows;
	
	public Grid() {
		rows = null;
	}
	
	public Grid(ArrayList<Row> r) {
		rows = r;
	}
	
	public ArrayList<Row> getRows() {
		return rows;
	}
	
	public void setRows(ArrayList<Row> r) {
		this.rows = r;
	}
}
