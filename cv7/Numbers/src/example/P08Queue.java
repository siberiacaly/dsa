package example;

import java.util.LinkedList;

import implementation.Board;

public class P08Queue {

	public static void main(String[] args) {
		var h1 = new Board();
		var h2 = new Board();

		var fronta = new LinkedList<Board>();
		fronta.addLast(h1);
		fronta.addLast(h2);

	    while (!fronta.isEmpty()) {
            System.out.println(fronta.getFirst());
            fronta.removeFirst();
        }		
	    
	    // for (Board board : fronta) {
		//	System.out.println(board);
		//    fronta.removeFirst();
	    //  }
	}
}