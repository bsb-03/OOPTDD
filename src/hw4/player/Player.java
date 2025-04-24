// https://github.com/bsb-03/OOPTDD/tree/main

package hw4.player;

import hw4.maze.*;

public class Player {
	
	private Row currentRow;
	private Cell currentCell;

	private int currentRowInt;
	private int currentCellInt;
	
	/**
	 * Default constructor for Player class
	 */
	public Player() {
		currentRow = null;
		currentCell = null;
		
		currentRowInt = -1;
		currentCellInt = -1;
	}
	
	/**
	 * Parameterized constructor for Player class. Takes a row and cell object
	 * as parameters, which represent the position of the player object which is the
	 * agent within the game.
	 * 
	 * @param r - Row object to populate row field
	 * @param c - Cell object to populate cell field
	 */
	public Player(Row r, Cell c) {
		currentRow = r;
		currentCell = c;
		
		currentRowInt = 0;
		currentCellInt = 0;
	}
	
	/**
	 * Getter method for currentRowInt field
	 * @return
	 */
	public int getCurrentRowInt() {
		return currentRowInt;
	}
	
	/**
	 * Setter method for currentRowInt field
	 * @param r
	 */
	public void setCurrentRowInt(int r) {
		this.currentRowInt = r;
	}
	
	/**
	 * Getter method for currentCellInt field
	 * @return
	 */
	public int getCurrentCellInt() {
		return currentCellInt;
	}
	
	/**
	 * Setter method for currentCellInt field
	 * @param c
	 */
	public void setCurrentCellInt(int c) {
		this.currentCellInt = c;
	}
	
	/**
	 * Getter method for currentRow field
	 * @return
	 */
	public Row getCurrentRow() {
		return currentRow;
	}
	
	/**
	 * Setter method for currentRow field
	 * @param currentRow
	 */
	public void setCurrentRow(Row currentRow) {
		this.currentRow = currentRow;
	}
	
	/**
	 * Getter method for currentCell field
	 * @return
	 */
	public Cell getCurrentCell() {
		return currentCell;
	}
	
	/**
	 * Setter method for currentCell field
	 * @param currentCell
	 */
	public void setCurrentCell(Cell currentCell) {
		this.currentCell = currentCell;
	}
	
	/**
	 * toString() method for Player class
	 */
	@Override
	public String toString() {
		return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
	}
}
