package hw4.player;

import hw4.maze.*;

public class Player {
	private int currentRow;
	private int currentCell;
	
	public Player() {
		currentRow = -1;
		currentCell = -1;
	}
	
	public Player(int r, int c) {
		currentRow = r;
		currentCell = c;
	}
	
	public int getCurrentRow() {
		return currentRow;
	}
	
	public void setCurrentRow(int r) {
		this.currentRow = r;
	}
	
	public int getCurrentCell() {
		return currentCell;
	}
	
	public void setCurrentCell(int c) {
		this.currentCell = c;
	}
}
