package hw4.player;

import hw4.maze.*;

public class Player {
	
	private Row currentRow;
	private Cell currentCell;

	private int currentRowInt;
	private int currentCellInt;
	
	public Player() {
		currentRow = null;
		currentCell = null;
		
		currentRowInt = -1;
		currentCellInt = -1;
	}
	
	public Player(Row r, Cell c) {
		currentRow = r;
		currentCell = c;
		
		currentRowInt = -1;
		currentCellInt = -1;
	}
	
	public int getCurrentRowInt() {
		return currentRowInt;
	}
	
	public void setCurrentRowInt(int r) {
		this.currentRowInt = r;
	}
	
	public int getCurrentCellInt() {
		return currentCellInt;
	}
	
	public void setCurrentCellInt(int c) {
		this.currentCellInt = c;
	}

	public Row getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(Row currentRow) {
		this.currentRow = currentRow;
	}

	public Cell getCurrentCell() {
		return currentCell;
	}

	public void setCurrentCell(Cell currentCell) {
		this.currentCell = currentCell;
	}
}
