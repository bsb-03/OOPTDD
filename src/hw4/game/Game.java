package hw4.game;

import java.util.ArrayList;
import java.util.Random;

import hw4.maze.*;
import hw4.player.Movement;
import hw4.player.Player;

public class Game {
	private Grid grid;
	
	/**
	 * Default constructor for game class.
	 */
	public Game() {
		grid = null;
	}
	
	/**
	 * Parameterized constructor for game class.
	 * @param g - Contains an ArrayList of rows.
	 */
	public Game(Grid g) {
		grid = g;
	}
	
	/**
	 * public Game(int size) - Checks that the size of
	 * the grid is within bounds.
	 * @param size - Size of the grid
	 */
	public Game(int size) {
		if(size >= 3 && size <= 7) {
			this.createRandomGrid(size);
		}
	}
	
	/**
	 * Getter method for grid
	 * @return
	 */
	public Grid getGrid() {
		return grid;
	}
	
	/**
	 * Setter method for grid
	 * @param g
	 */
	public void setGrid(Grid g) {
		this.grid = g;
	}
	
	/**
	 * public Grid createRandomGrid(int size) - This method takes an integer as a parameter
	 * which is used to determine the dimensions of a randomly generated grid. Uses a helper function to generate an
	 * empty grid with these dimensions. This method then generates cells and populates the empty grid. Contains logic to ensure
	 * that the position of the exit will be properly placed on the leftmost part of a cell on the leftmost 
	 * part of the grid. Contains logic to ensure that the bounds of the grid will contain walls. Contains logic
	 * to ensure that walls/apertures are otherwise randomly assigned if the cells are not constrained.
	 * 
	 * @param size - Size integer used to determine the dimensions of the random grid
	 * @return
	 */
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
	
	/**
	 * private Grid newGrid(int size) - Helper method for createRandomGrid(int size) method,
	 * this method generates an empty grid with the size parameter used to determine the dimensions
	 * of the grid. Returns the empty grid.
	 * 
	 * @param size - Integer size used to determine the dimensions of the grid.
	 * @return
	 */
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
	
	/**
	 * public Object play(Movement movement, Player player) - Method updates the position of the 
	 * agent space depending on the input passed through the movement parameter. Contains logic to ensure
	 * that the agent cannot move into cells that are blocked by walls. Updates the current row position and index.
	 * 
	 * @param movement - Parameter movement determines the direction in which the agent will move.
	 * @param player - Parameter player is the player object represented as the agent on the board.
	 * @return
	 */
	public Object play(Movement movement, Player player) {

		Row currentRow = this.grid.getRows().get(player.getCurrentRowInt());
		Cell currentCell = currentRow.getCells().get(player.getCurrentCellInt());
		
		int currentRowInt = player.getCurrentRowInt();
		int currentCellInt = player.getCurrentCellInt();
		
		if(movement == Movement.UP && currentCell.getUp() != CellComponents.WALL) {
			player.setCurrentRowInt(currentRowInt-1);
			player.setCurrentRow(this.grid.getRows().get(currentRowInt - 1));
		}
		if(movement == Movement.DOWN && currentCell.getDown() != CellComponents.WALL) {
			player.setCurrentRowInt(currentRowInt+1);
			player.setCurrentRow(this.grid.getRows().get(currentRowInt + 1));
		}
		if(movement == Movement.LEFT && currentCell.getLeft() != CellComponents.WALL) {
			player.setCurrentCellInt(currentCellInt-1);
			player.setCurrentCell(currentRow.getCells().get(currentCellInt - 1));
		}
		if(movement == Movement.RIGHT && currentCell.getRight() != CellComponents.WALL) {
			player.setCurrentCellInt(currentCellInt+1);
			player.setCurrentCell(currentRow.getCells().get(currentCellInt + 1));
		}
		return null;
	}

	@Override
	public String toString() {
		return "Game [grid=" + grid + "]";
	}
	
	
}
