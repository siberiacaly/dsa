package example;

import implementation.Board;

public class P03Cloning {
	public static void main(String[] args) {
		var g = new Board();
		System.out.println("Original: \n" + g);
		
		var g1 = g.cloneAndMove(Board.RIGHT);
		var g2 = g.cloneAndMove(Board.LEFT);
		var g3 = g.cloneAndMove(Board.UP);
		var g4 = g.cloneAndMove(Board.DOWN);


		// Vyzkousejte nahradit timto kodem predchozi radek a pozorujte efekt
		// Board g1 = g;
		// g1.move(Board.RIGHT);
		 
		// Board g4 = g;
		// g4.move(Board.DOWN);
		
		// Board g2 = g;
		// g2.move(Board.LEFT);
		 
		
		// Board g3 = g;
		// g3.move(Board.UP);
		 
		// KOMENTÁŘ: Pokud to uděláme tímto způsobem, g3 nebude kopie, ale odkaz na původní g,
		// takže g a g3 budou ve výsledku totožné.
		
		System.out.println("Kopie s pohybem " + Board.UP + " je: \n" + g3);
	}
}
