package hw4.maze;

public class Cell {
	private CellComponents up, down, left, right;
	public Cell() {
		up = null;
		down = null;
		left = null;
		right = null;
	}
	
	public Cell(CellComponents u, CellComponents b, CellComponents l, CellComponents r) {
		up = u;
		down = b;
		left = l;
		right = r;
	}

	public CellComponents getUp() {
		return up;
	}

	public void setUp(CellComponents up) {
		this.up = up;
	}

	public CellComponents getDown() {
		return down;
	}

	public void setDown(CellComponents bottom) {
		this.down = bottom;
	}

	public CellComponents getLeft() {
		return left;
	}

	public void setLeft(CellComponents left) {
		this.left = left;
	}

	public CellComponents getRight() {
		return right;
	}

	public void setRight(CellComponents right) {
		this.right = right;
	}
	
}
