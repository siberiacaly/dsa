package example;

import implementation.Board;

public class P04Cloning2 {
	public static void main(String[] args) {
		var g = new Board();
		System.out.println("Original: \n" + g);

		for (int i = 1; i <= 4; i++) {
			var g3 = g.cloneAndMove(i);
            if (g3 == null) {
                continue;
            }
			System.out.println("Kopie s pohybem "+i+ " je: \n"+g3);
		}
	}
}
