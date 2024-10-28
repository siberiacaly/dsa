package example;

import implementation.Board;

public class P05IsSolution {
	public static void main(String[] args) {
		var h = new Board();
		System.out.println("" + h + h.isSolution());
		
		System.out.println(); // odradkuj
		h.move(Board.LEFT);
		System.out.println("" + h + h.isSolution());
	}
}
