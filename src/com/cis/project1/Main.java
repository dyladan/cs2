package com.cis.project1;

import java.util.List;
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = readFile("input.txt");

		for(int i = 0; i < 10; i++){
			System.out.print("---Board ");
			System.out.println(i + 1 + "---");
			board.print();
			board.next();
		}


	}
	
	private static Board readFile(String fileName){
		// Read a board from a file
        String line;
        // open file
        Path filePath = Paths.get(fileName);

        // read file to memory
        List<String> linesFromFile = null;
		try {
			linesFromFile = Files.readAllLines(filePath, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Could not open file");
			e.printStackTrace();
		}


        boolean[][] board = new boolean[10][10];

        for (int lineNum = 0; lineNum < 10; lineNum++){
            line = linesFromFile.get(lineNum);
            for (int pos = 0; pos < 10; pos++) {
                if(line.charAt(pos) == '0') {
                    board[lineNum][pos] = true;
                } else if(line.charAt(pos) == '1'){
                    board[lineNum][pos] = false;
                }
            }
        }

        return new Board(board);
	}

}
