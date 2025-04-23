package hw4.player;

import hw4.maze.*;

public class Player {
	private Row currentRow;
	private Cell currentCell;
	
	public Player() {
		currentRow = null;
		currentCell = null;
	}
	
	public Player(Row r, Cell c) {
		currentRow = r;
		currentCell = c;
	}
	
	public Row getCurrentRow() {
		return currentRow;
	}
	
	public void setCurrentRow(Row r) {
		this.currentRow = r;
	}
	
	public Cell getCurrentCell() {
		return currentCell;
	}
	
	public void setCurrentCell(Cell c) {
		this.currentCell = c;
	}
}
