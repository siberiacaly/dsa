package cviko2;

import java.util.Vector;

public class game {
	private int[][] gamefield;
	
	game() {
        this.gamefield = new int[3][3];
        gamefield[0][0] = 7;
        gamefield[0][1] = 2;
        gamefield[0][2] = 4;
        gamefield[1][0] = 5;
        gamefield[1][2] = 6;
        gamefield[2][0] = 8;
        gamefield[2][1] = 3;
        gamefield[2][2] = 1;
    }
	
	public void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println(gamefield[i][0] + " " + gamefield[i][1] + " " + gamefield[i][2]);
        }
    }
	
	//udelat jinak
	   private Vector<Integer> findZero() {
	        Vector<Integer> pos = new Vector<>();
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (this.gamefield[i][j] == 0) {
	                    pos.add(i);
	                    pos.add(j);
	                }
	            }
	        }
	        return pos;
	    }
	   
	   
	   
}
