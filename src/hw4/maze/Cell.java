package hw4.maze;

public class Cell {
	CellComponents up, bottom, left, right;
	public Cell() {
		up = null;
		bottom = null;
		left = null;
		right = null;
	}
	
	public Cell(CellComponents u, CellComponents b, CellComponents l, CellComponents r) {
		up = u;
		bottom = b;
		left = l;
		right = r;
	}
}
