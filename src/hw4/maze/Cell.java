// https://github.com/bsb-03/OOPTDD/tree/main

package hw4.maze;

public class Cell {
	private CellComponents up, down, left, right;
	
	/**
	 * Default constructor for Cell class.
	 */
	public Cell() {
		up = null;
		down = null;
		left = null;
		right = null;
	}
	
	/**
	 * Parameterized constructor for Cell class.
	 * @param u - CellComponents values for left part of cell.
	 * @param b - CellComponents values for right part of cell.
	 * @param l - CellComponents values for top part of cell.
	 * @param r - CellComponents values for bottom part of cell.
	 */
	public Cell(CellComponents u, CellComponents b, CellComponents l, CellComponents r) {
		left = u;
		right = b;
		up = l;
		down = r;
	}

	/**
	 * toString() method for Cell class.
	 */
	@Override
	public String toString() {
		return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
	}
	
	/**
	 * Getter method for up field
	 * @return
	 */
	public CellComponents getUp() {
		return up;
	}
	
	/**
	 * Setter method for up field
	 * @param up
	 */
	public void setUp(CellComponents up) {
		this.up = up;
	}
	
	/**
	 * Getter method for down field
	 * @return
	 */
	public CellComponents getDown() {
		return down;
	}
	
	/**
	 * Setter method for down field
	 * @param bottom
	 */
	public void setDown(CellComponents bottom) {
		this.down = bottom;
	}
	
	/**
	 * Getter method for left field
	 * @return
	 */
	public CellComponents getLeft() {
		return left;
	}
	
	/**
	 * Setter method for left field
	 * @param left
	 */
	public void setLeft(CellComponents left) {
		this.left = left;
		if(left == null) {
			this.left = null;
		}
	}
	
	/**
	 * Getter method for right field
	 * @return
	 */
	public CellComponents getRight() {
		return right;
	}

	/**
	 * Setter method for right field
	 * @param right
	 */
	public void setRight(CellComponents right) {
		this.right = right;
	}
	
}
