package com.cis.project1;

public class Board {
	private boolean[][] board;

	public Board() {
		// TODO Auto-generated constructor stub
		this.board = new boolean[10][10];
	}
	
	public Board(boolean[][] board){
		this.board = board;
	}
	
	public void flip(int row, int col){
		board[row][col] = !board[row][col];
	}
	
	public void next(){
        // Generate the next generation from a board
        boolean[][] newBoard = new boolean[10][10];

        // for each row
        for(int i = 0; i < 10; i++){
            // for each entry
            for(int j = 0; j < 10; j++){
                // determine if cell lives or dies
                boolean alive = nextState(i, j);
                // write value to new board
                newBoard[i][j] = alive;
            }
        }
        board = newBoard;
        
    }
	
	
	
	private boolean nextState(int row, int col) {
		// Given a board and a position decide if the
        // cell lives or dies

        int neighbors = 0;
        boolean alive;

        // check cell life
        alive = board[row][col];

        // count all neighbors
        neighbors = countNeighbors(row, col);
        

        // if dead and 3 neighbors
        // spawn a child
        if(!alive) {
            if(neighbors == 3){
                // alive
                return(true);
            } else {
                return(false);
            }
        } else {
            // switch neighbors
            switch (neighbors) {
                case 0:
                case 1:
                    // dead of loneliness
                    return false;
                case 2:
                case 3:
                    // happy and alive
                    return true;
                default:
                    // dead of overcrowding
                    return false;
            }
        }
	}
	
	private int countNeighbors(int row, int col) {
		int neighbors = 0;

        // for each neighbor row
        for (int i = row-1; i <= row+1; i++){
            // for each neighbor col
            for (int j = col-1; j <= col+1; j++){
            	if (i == row && j == col){
            		// skip current cell
            		continue;
            	}
                // if neighbor cell valid
                if(isValid(i, j)){
                    // if neighbor alive
                    if(board[i][j]){
                        // +1 neighbor
                        neighbors += 1;
                    }
                }
            }
        }

 
        return neighbors;
	}
	
	private boolean isValid(int row, int col){
		// assume valid
        boolean valid = true;

        // if row out of bounds
        // board is invalid
        if(row < 0 || row >= board.length){
            valid = false;
        }

        // for each row
        for (int i = 0; i < board.length; i++){
            // if col out of bounds
            // board is invalid
            if(col < 0 || col >= board[i].length){
                valid = false;
            }
        }

        return valid;
	}
	
	public void print(){
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
				if(board[i][j]){
					System.out.print('1');
				} else {
					System.out.print('0');
				}
			}
			System.out.println();
		}
	}

}
