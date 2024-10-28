package example;

import java.util.TreeSet;

import implementation.Board;

public class P06TreeSet {
	public static void main(String[] args) {
		var g1 = new Board();

		// Vytvor mnozinu a pridej
		var set = new TreeSet<Board>();
		set.add(g1);
		
		// Pridej do mnoziny
		var g2 = g1.cloneAndMove(Board.UP);
		g2.move(Board.DOWN); 
		set.add(g2);
		
		set.contains(g2);

		System.out.println("Pocet prvku v mnozine je: "+set.size() + "\n"+ set);
		
	}
}
