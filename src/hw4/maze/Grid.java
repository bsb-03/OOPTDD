// https://github.com/bsb-03/OOPTDD/tree/main

package hw4.maze;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Row> rows;
	
	/**
	 * toString() method for Grid class
	 */
	@Override
	public String toString() {
		return "Grid [rows=" + rows + "]";
	}
	
	/**
	 * Default constructor for Grid class
	 */
	public Grid() {
		rows = null;
	}
	
	/**
	 * Parameterized constructor for Grid class. Takes an ArrayList of rows
	 * as a parameter to assign to rows field
	 * @param r - ArrayList of rows
	 */
	public Grid(ArrayList<Row> r) {
		rows = r;
	}
	
	/**
	 * Getter method for rows field
	 * @return
	 */
	public ArrayList<Row> getRows() {
		return rows;
	}
	
	/**
	 * Setter method for rows field
	 * @param r
	 */
	public void setRows(ArrayList<Row> r) {
		this.rows = r;
	}

}
