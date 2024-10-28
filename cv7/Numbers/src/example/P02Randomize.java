package example;

import java.util.Random;

import implementation.Board;

public class P02Randomize {

	public static void main(String[] args) {
		var g = new Board();
		var rnd = new Random();
		for (int i = 0; i < 100000; i++) {
			int nahodne = rnd.nextInt(4);
			g.move(1 + nahodne);
		}
		System.out.println(g);
	}

}
