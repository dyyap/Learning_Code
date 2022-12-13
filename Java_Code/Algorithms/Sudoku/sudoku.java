package Algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class sudoku {
	
	
	
	public static boolean Gothere(int row, int col, int number, int[][] board) {
		
		//unique Number algorithm
		int checker = (int) Math.sqrt(board.length);
		int ColChecker = col - col % checker;
		int RowChecker = row - row % checker;		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j< col; j++) {
				if(board[i][j] == number) {
					return false; // there is a number there
				}
			}
		}
		
		for(int i = ColChecker; i < ColChecker + checker;  i++) {
			for(int j = RowChecker; j < RowChecker + checker; j++) {
				if(board[i][j] == number) {
					return false; // breaks the rule of Sudoku
				}
			}
		}
		
		return true; // 2 cases are not met and true
		
		
		
		
	}

	public static boolean SolveSudoku(int[][] Board, int number) {
		int col = -1, row = -1;
		boolean flag = true;
		for(int i = 0; i < number; i++) { //iterate through 
			for(int j = 0; j < number;j++) {
				if (Board[i][j] == 0) {// if empty spot
					//need to notify program which spot to fill
					col = i;
					row = j;
					flag = false;
					break;
					
				}
			}
			if(!flag) {
				break;
			}
		}
		if(flag) {
			return true;
		}
		
		for(int i = 1; i <= number; i++) {
			if(Gothere(row, col, i, Board)){
				Board[row][col] = i;
				if(SolveSudoku(Board, number)) {
					return true; // if you can solve it solve it
				}
				else {
					Board[row][col] = 0; // messed up gotta redo
				}
			}
		}
		return false; //couldn't solve redo
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		  Scanner sc = new Scanner(new BufferedReader(new FileReader("C://Users/bwom123/Desktop/test.txt")));
	      int rows = 9;
	      int columns = 9;
	      int [][] myArray = new int[rows][columns];
	      while(sc.hasNextLine()) {
	         for (int i=0; i<myArray.length; i++) {
	            String[] line = sc.nextLine().trim().split(" ");
	            for (int j=0; j<line.length; j++) {
	               myArray[i][j] = Integer.parseInt(line[j]);
	            }
	         }
	      }
	      if (SolveSudoku(myArray, myArray.length)) 
	      { 
	    	  for (int i = 0; i < myArray.length; i++) 
	    	    { 
	    	        for (int j = 0; j < myArray.length; j++) 
	    	        { 
	    	            System.out.print(myArray[i][j]); 
	    	            System.out.print(" "); 
	    	        } 
	    	        System.out.print("\n"); 
	    	          
	    	        if ((i + 1)%9 == 0)  
	    	        { 
	    	            System.out.print(""); 
	    	        } 
	    	    } 
	      }  
	      else
	      { 
	          System.out.println("No solution"); 
	      } 
	}
	
}
