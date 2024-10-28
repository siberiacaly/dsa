package implementation;

import java.util.Random;

public class Executable {

	public static void main(String[] args) {
		var h = new Board();
		for (int i = 0; i < 10000; i++) {
			h.move(new Random().nextInt(4)+ 1);
		}
		System.out.println(h);
		BFS bfs = new BFS();
		bfs.printMoves(h);
		
	}

}
