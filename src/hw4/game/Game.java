package hw4.game;

import java.util.ArrayList;
import java.util.Random;

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
	
	public Grid createRandomGrid(int size) {
		Random random = new Random();
		
		Grid grid = newGrid(size);
		
		int rIndex = 0;
		int cIndex = 0;
		for (Row r : grid.getRows()) {
			for(Cell c : r.getCells()) {
				boolean hasAperture = false;
				if(rIndex == 0) {
					c.setUp(CellComponents.WALL);
				}
				else {
					if(hasAperture) {
						CellComponents randomComponent = CellComponents.randomComponent();
						c.setUp(randomComponent);
					}
					else { c.setUp(CellComponents.APERTURE); hasAperture = true;}
				}
				
				if(cIndex == 0) {
					c.setLeft(CellComponents.WALL);
				}
				else {
					if(hasAperture) {
						CellComponents randomComponent = CellComponents.randomComponent();
						c.setLeft(randomComponent);
					}
					else { c.setLeft(CellComponents.APERTURE); hasAperture = true;}
				}
				
				if(cIndex == size) {
					c.setRight(CellComponents.WALL);
				}
				else {
					if(hasAperture) {
						CellComponents randomComponent = CellComponents.randomComponent();
						c.setRight(randomComponent);
					}
					else { c.setRight(CellComponents.APERTURE); hasAperture = true;}
				}
				
				if(rIndex == size) {
					c.setDown(CellComponents.WALL);
				}
				else {
					if(hasAperture) {
						CellComponents randomComponent = CellComponents.randomComponent();
						c.setDown(randomComponent);
					}
					else { c.setDown(CellComponents.APERTURE); hasAperture = true;}
				}
				
				cIndex++;
			}
			rIndex++;
		}
		
		//set a random leftmost cell to be the exit
		int exitCellIndex = random.nextInt(size);
		grid.getRows().get(exitCellIndex).getCells().get(0).setLeft(CellComponents.EXIT);
		
		return grid;
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

		Row currentRow = this.grid.getRows().get(player.getCurrentRow());
		Cell currentCell = currentRow.getCells().get(player.getCurrentCell());
		
		int currentRowInt = player.getCurrentRow();
		int currentCellInt = player.getCurrentCell();
		
		if(movement == Movement.UP && currentCell.getUp() != CellComponents.WALL) {
			player.setCurrentRow(currentRowInt-1);
		}
		if(movement == Movement.DOWN && currentCell.getDown() != CellComponents.WALL) {
			player.setCurrentRow(currentRowInt+1);
		}
		if(movement == Movement.LEFT && currentCell.getLeft() != CellComponents.WALL) {
			player.setCurrentCell(currentCellInt-1);
		}
		if(movement == Movement.RIGHT && currentCell.getRight() != CellComponents.WALL) {
			player.setCurrentCell(currentCellInt-1);
		}
		return null;
	}
}
