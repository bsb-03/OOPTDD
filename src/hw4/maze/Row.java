// https://github.com/bsb-03/OOPTDD/tree/main

package hw4.maze;

import java.util.ArrayList;

public class Row {
	private ArrayList<Cell> cells;
	
	/**
	 * toString() method for Row class
	 */
	@Override
	public String toString() {
		return "Row [cells=" + cells + "]";
	}
	
	/**
	 * Default constructor for Row class
	 */
	public Row() {
		cells = null;
	}
	
	/**
	 * Parameterized constructor for Row class. Takes
	 * an ArrayList of cells and assigns it to cells field
	 * @param c - ArrayList of cells
	 */
	public Row(ArrayList<Cell> c) {
		cells = c;
	}
	
	/**
	 * Getter method for Cells class
	 * @return
	 */
	public ArrayList<Cell> getCells() {
		return cells;
	}
	
	/**
	 * Setter method for Cells class
	 * @param c
	 */
	public void setCells(ArrayList<Cell> c) {
		this.cells = c;
	}
}
