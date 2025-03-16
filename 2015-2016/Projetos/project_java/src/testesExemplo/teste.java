package testesExemplo;

import java.util.Arrays;

public class teste {
	
	public static void main(String[] args) {
		int [][] puzzle = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println(Arrays.deepToString(puzzle));
		
		
		puzzle[0][0] = 10;
		
		puzzle[1][2] = 20;
		
		System.out.println(Arrays.deepToString(puzzle));
	}

}
