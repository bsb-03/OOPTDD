package hw4.game;

import hw4.maze.*;

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
	}
}
