package hw4.maze;

import java.util.ArrayList;

public class Row {
	private ArrayList<Cell> cells;
	
	@Override
	public String toString() {
		return "Row [cells=" + cells + "]";
	}

	public Row() {
		cells = null;
	}
	
	public Row(ArrayList<Cell> c) {
		cells = c;
	}
	
	public ArrayList<Cell> getCells() {
		return cells;
	}
	
	public void setCells(ArrayList<Cell> c) {
		this.cells = c;
	}
}
