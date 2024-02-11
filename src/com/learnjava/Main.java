package com.learnjava;

public class Main {
	public static void main(String[] args) {
		int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		System.out.println(grid.length);
		for (int i = 0; i < grid.length; i++) {
		   for (int j = 0; j < grid[i].length; j++) {
		     if (i == j)
		       System.out.print(grid[i][j] + " ");
		     System.out.println("inside loop");
		   }
	}
}
}
