package cviko2;

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
	
	public int[] lookZero() {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (this.gamefield[i][j] == 0) {
	                return new int[]{i, j};
	            }
	        }
	    }
	    return null;
	}
	
	public void move(int course) {
		int[] zero_pos = this.lookZero();
		int old_num;
		if (course == 1) { //nahoru
            if (zero_pos[0] == 0) {
                System.out.println("Zero is already at the top");
                return;
            }
            old_num = this.gamefield[zero_pos[0] - 1][zero_pos[1]];
            this.gamefield[zero_pos[0]][zero_pos[1]] = old_num;
            this.gamefield[zero_pos[0] - 1][zero_pos[1]] = 0;
		}
		else if (course == 2) { //dolu
            if (zero_pos[0] == 2) {
                System.out.println("Zero is already at the bottom");
                return;
            }
            old_num = this.gamefield[zero_pos[0] + 1][zero_pos[1]];
            this.gamefield[zero_pos[0]][zero_pos[1]] = old_num;
            this.gamefield[zero_pos[0] +1][zero_pos[1]] = 0;
		
		}

		else if (course == 3) { //doleva
            if (zero_pos[1] == 0) {
                System.out.println("Zero is already at the far left");
                return;
            }
            old_num = this.gamefield[zero_pos[0]][zero_pos[1] - 1];
            this.gamefield[zero_pos[0]][zero_pos[1]] = old_num;
            this.gamefield[zero_pos[0]][zero_pos[1] - 1] = 0;
		
		}
		
		else if (course == 4) { //doprava
            if (zero_pos[1] == 2) {
                System.out.println("Zero is already at the far right");
                return;
            }
            old_num = this.gamefield[zero_pos[0]][zero_pos[1] + 1];
            this.gamefield[zero_pos[0]][zero_pos[1]] = old_num;
            this.gamefield[zero_pos[0]][zero_pos[1] + 1] = 0;
		
		}
		
		else {
            System.out.println("Unknown direction:" + course);
		}
	   
	   
	}
}