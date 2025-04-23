package hw4.maze;

import java.util.Random;

public enum CellComponents {
	WALL,
	APERTURE,
	EXIT;
	
	public static CellComponents randomComponent() {
		Random random = new Random();
		
		int randInt = random.nextInt(2);
		
		switch(randInt) {
			case 0:
				return WALL;
			case 1:
				return APERTURE;
		}
		
		return null;
	}
}
