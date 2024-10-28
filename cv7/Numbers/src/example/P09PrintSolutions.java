package example;

import implementation.Board;

public class P09PrintSolutions {
	public static void main(String[] args) {
		var h = new Board();
		System.out.println("" + h + h.isSolution());
		
		System.out.println();
		h = h.cloneAndMove(Board.UP);
		h = h.cloneAndMove(Board.DOWN);
        h = h.cloneAndMove(Board.LEFT);
        h = h.cloneAndMove(Board.RIGHT);
		System.out.println("" + h + h.isSolution());
	}
}
