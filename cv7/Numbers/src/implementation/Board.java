package implementation;

import java.util.ArrayList;

public class Board implements Comparable<Board> {
	private int[][] data = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, -1 } };
	private int x = 2;
	private int y = 2;
	private ArrayList<Integer> moves = new ArrayList<Integer>();

	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;

	public Board cloneAndMove(int smer) {
		var newBoard = new Board();
		newBoard.x = this.x;
		newBoard.y = this.y;
		newBoard.moves.addAll(this.moves);
		newBoard.moves.add(smer);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				newBoard.data[x][y] = this.data[x][y];
			}
		}

		boolean canBeMoved = newBoard.move(smer);
		if (canBeMoved) {
			return newBoard;
		} else {
			return null;
		}
	}

	public boolean move(int direction) {
		switch (direction) {
		case UP:
			if (y < 1) {
				return false;
			}
			data[x][y] = data[x][y - 1];
			data[x][y - 1] = -1;
			y = y - 1; // y--;
			return true;
		case DOWN:
			if (y > 1) {
				return false;
			}
			data[x][y] = data[x][y + 1];
			data[x][y + 1] = -1;
			y++; // y = y + 1;
			return true;
		case LEFT:
			if (x < 1) {
				return false;
			}
			data[x][y] = data[x - 1][y];
			data[x - 1][y] = -1;
			x = x - 1; // x--;
			return true;
		case RIGHT:
			if (x > 1) {
				return false;
			}
			data[x][y] = data[x + 1][y];
			data[x + 1][y] = -1;
			x++; // x = x + 1;
			return true;
		}
		return false;
	}
	
	public boolean isSolution() {
		int[][] groundTruth = {{1,4,7},{2,5,8},{3,6,-1}};
		for (int iy = 0; iy < 3; iy++) {
			for	(int ix = 0; ix < 3; ix++) {
				if (data[ix][iy] != groundTruth[ix][iy]) {
					return false;
				}
			}
		}
		return true; 
	}

	@Override
	public String toString() {
		String res = "moves:" + moves + "\n";
		for (int iy = 0; iy < 3; iy++) {
			for (int ix = 0; ix < 3; ix++) {
				res += data[ix][iy] + ",";
			}
			res += "\n";
		}
		return res;
	}


	@Override
	public int compareTo(Board other) {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (this.data[i][j] != other.data[i][j]) {
	                return Integer.compare(this.data[i][j], other.data[i][j]);
	            }
	        }
	    }
	    return 0; // All elements are equal
	}

	@Override
	public int hashCode() {
	    int hash = 7;
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            hash = 31 * hash + this.data[i][j];
	        }
	    }
	    return hash;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (!(obj instanceof Board)) return false;
	    Board other = (Board) obj;
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (this.data[i][j] != other.data[i][j]) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

}
	
