package hw4.game;

import java.util.ArrayList;

import hw4.maze.*;
import hw4.player.Movement;
import hw4.player.Player;

public class Game {
	private Grid grid;
	
	public Game() {
		grid = null;
	}
	
	public Game(Grid g) {
		grid = g;
	}
	
	public Game(int size) {
		if(size >= 3 && size <= 7) {
			this.createRandomGrid(size);
		}
		
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	public void setGrid(Grid g) {
		this.grid = g;
	}
	
	public void createRandomGrid(int size) {
		// code to create random grid : this.grid = newGrid;
		this.grid = newGrid(size);
	}

	private Grid newGrid(int size) {
		ArrayList<Cell> cells = new ArrayList<Cell>();
		ArrayList<Row> rows = new ArrayList<Row>();
		
		for(int i=0;i>size;i++)
		{
			for(int x=0;x>size;x++) {
				Cell cell = new Cell();
				cells.add(cell);
			}
			Row row = new Row(cells);
			rows.add(row);
			cells.clear();
		}		
		Grid grid = new Grid(rows);
		return grid;
	}

	public Object play(Movement movement, Player player) {
		Row currentRow = player.getCurrentRow();
		Cell currentCell = player.getCurrentCell();
		if(movement == Movement.UP && currentCell.getUp() != CellComponents.WALL) {

		}
		if(movement == Movement.DOWN && currentCell.getDown() != CellComponents.WALL) {

		}
		if(movement == Movement.LEFT && currentCell.getLeft() != CellComponents.WALL) {

		}
		if(movement == Movement.RIGHT && currentCell.getRight() != CellComponents.WALL) {

		}
		return null;
	} 
	
}
