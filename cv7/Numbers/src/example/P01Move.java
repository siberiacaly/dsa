package example;

import implementation.Board;

public class P01Move {
	public static void main(String[] args) {
		var p = new Board();
		System.out.println(p);
		
		p.move(Board.UP);
		System.out.println(p);
	}
}
