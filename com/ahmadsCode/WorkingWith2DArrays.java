package com.ahmadsCode;

import java.util.Arrays;

public class WorkingWith2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [][] board = new char[3][3];
		for ( int i = 0; i < 3; i++ ) {
			for ( int j = 0; j < 3; j++ ) {
				board[i][j] = '-';
			}
		}
		
		// Second method of creating 2d array and instanitiating them
		int[][] boardTwo = new int[][] {
			new int[] { 1, 1, 1 },
			new int[] { 1, 1, 1 },
			new int[] { 1, 1, 1 }
		};
		
		board[0][0] = '0';
		board[1][0] = '0';
		board[2][0] = '0';
		System.out.println(Arrays.deepToString(board));
		System.out.println(Arrays.deepToString(boardTwo));
		
		// personal assignment- implement tick tac toe using java
	}

}
