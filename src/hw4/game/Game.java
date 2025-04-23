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
	
	public Grid getGrid() {
		return grid;
	}
	
	public void setGrid(Grid g) {
		this.grid = g;
	}
}
