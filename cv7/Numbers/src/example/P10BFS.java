package example;

import java.util.Random;

import implementation.BFS;
import implementation.Board;

public class P10BFS {
	public static void main(String[] args) {
        Board h = new Board();
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++) {
            int nahodne = rnd.nextInt(4);
            h.move(1 + nahodne);
        }
        BFS bfs = new BFS();
        bfs.printMoves(h);
	}
}
