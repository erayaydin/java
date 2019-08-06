package com.mergenumbers.game;

import java.util.ArrayList;
import java.util.List;

public class MergeNumbers {
	
	/**
	 * Visited Locations
	 * 
	 * Its protect infinite loop for checking neighbours.
	 */
	private static List<List<Integer>> visited = new ArrayList<List<Integer>>();

	/**
	 * The main function of our program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Initialize grid
		int[][] grid = {
			{2, 0, 1, 1, 0, 8},
			{2, 1, 0, 2, 4, 0}, 
			{1, 2, 1, 2, 1, 3}, 
			{2, 3, 2, 0, 1, 0},
			{0, 0, 5, 8, 7, 2},
			{2, 0, 1, 1, 0, 0}
		};
		
		// Show first grid to user.
		System.out.println("--- GRID ---");
		printGrid(grid);
		
		// Put '1' to (3,3) location and merge numbers.
		mergeNumbers(grid, 3, 3, 1);

		// Put '2' to (4,0) location and merge numbers.
		mergeNumbers(grid, 4, 0, 2);
		
		// Put '4' to (0,4) location and merge numbers.
		mergeNumbers(grid, 0, 4, 4);
		
		// Try to put '1' to (0,0) location
		mergeNumbers(grid, 0, 0, 1);
	}
	
	/**
	 * Merge Numbers
	 * 
	 * Putting number to location and checking merge available.
	 * 
	 * @param grid       Grid
	 * @param row        New number's row index
	 * @param column     New number's column index
.	 * @param nextNumber Number's value
	 */
	public static void mergeNumbers(int[][] grid, int row, int column, int nextNumber) {
		
		if(grid[row][column] != 0){ // Check for cell available
			System.out.println("("+row+","+column+") is not empty! Please select another cell.");
			return;
		} else {
			// Add new number to user's selected location.
			grid[row][column] = nextNumber;
		}
		
		// Show the added number grid
		System.out.println(nextNumber+" has been added to ("+row+","+column+") location.");
		System.out.println("--- GRID ---");
		printGrid(grid);
		
		// Start checking grid for merge available
		grid = checkGrid(grid, row, column);
		
		// Show result to user
		System.out.println("Merging has been completed!");
		System.out.println("--- COMPLETED GRID ---");
		printGrid(grid);
	}
	
	/**
	 * Checking grid for available merge.
	 * 
	 * @param grid   Grid
	 * @param row    Origin cell's row index
	 * @param column Origin cell's column index
	 * @return Completed grid
	 */
	private static int[][] checkGrid(int[][] grid, int row, int column) {
		// Clear visited locations, because its new merging job.
		visited.clear();
		
		// Add first (row,column) to visited locations. Its protect infinite loop for neighbours.
		List<Integer> addFirst = new ArrayList<Integer>();
		addFirst.add(row);
		addFirst.add(column);
		visited.add(addFirst);
		
		// Get number of origin location. We will check equal with this number.
		int number = grid[row][column];
		// Count merge number quantity
		int total = 1;
		
		// Add first (row,column) to merge indexes array. We will empty this cells.
		List<List<Integer>> indexes = new ArrayList<List<Integer>>();
		indexes.add(addFirst);
		
		// Initialize top, right, bottom, left with 0 value
		int top = 0, right = 0, bottom = 0, left = 0;
		
		if(row-1 >= 0){ // If there is exist a top cell...
			top = grid[row-1][column]; // Assign top cell's value
		}
		
		if(row+1 < grid.length){ // If there is exists a bottom cell...
			bottom = grid[row+1][column]; // Assign bottom cell's value
		}

		if(column+1 < grid[row].length){ // If there is a right cell...
			right = grid[row][column+1]; // Assign right cell's value
		}

		if(column-1 >= 0){ // If there is a left cell...
			left = grid[row][column-1]; // Assign left cell's value
		}
		
		/*
		 * Visiting neighbours...
		 */
		if(top == number) { // If top cell's value equals to our origin number
			total += 1; // We found a merge cell. Lets add this number.
			
			// Add this cell to our merge indexes and visited locations.
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row-1);
			temp.add(column);
			indexes.add(temp);
			visited.add(temp);
			
			// Check neighbours of origin's top cell
			List<List<Integer>> neighbours = checkNeighbours(grid, row-1, column, number);
			
			if(neighbours.size() > 0) { // If there is a merge index at origin's top cell...
				
				// Add them all to our merge index
				for (List<Integer> toAdd : neighbours){
					total += 1;
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		
		if(bottom == number) {
			total += 1;
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row+1);
			temp.add(column);
			indexes.add(temp);
			visited.add(temp);
			
			List<List<Integer>> neighbours = checkNeighbours(grid, row+1, column, number);
			if(neighbours.size() > 0) {
				for (List<Integer> toAdd : neighbours){
					total += 1;
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		
		if(left == number) {
			total += 1;
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row);
			temp.add(column-1);
			indexes.add(temp);
			visited.add(temp);
			
			List<List<Integer>> neighbours = checkNeighbours(grid, row, column-1, number);
			if(neighbours.size() > 0) {
				for (List<Integer> toAdd : neighbours){
					total += 1;
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		
		if(right == number) {
			total += 1;
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row);
			temp.add(column+1);
			indexes.add(temp);
			visited.add(temp);
			
			List<List<Integer>> neighbours = checkNeighbours(grid, row, column+1, number);
			if(neighbours.size() > 0) {
				for (List<Integer> toAdd : neighbours){
					total += 1;
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		

		if(indexes.size() >= 3) { // If there is 3 or more merge index...
			
			// Clear all merge index cell's (Set 0)
			for (List<Integer> index: indexes) {
				int[] cell = new int[2];
				int no = 0;
				for(Integer indexValue: index) {
					cell[no] = indexValue;
					no++;
				}
				grid = removeCell(grid, cell[0], cell[1]);
			}
			// Put new value to our origin
			grid[row][column] = number+1;
		}
		
		if(total < 3 || grid[row][column] == number) // If above checking grid failed...
			return grid; // Return completed grid
		else // If above checking grid success...
			return checkGrid(grid, row, column); // Test for another merge
	}
	
	/**
	 * Checking neighbours and return available merge indexes... Its used on origin's top,right,bottom and left
	 * cells.
	 * 
	 * @param grid   Grid
	 * @param row    Checking cell's row
	 * @param column Checking cell's column
	 * @param number Our origin number (mergeNumber's function parameter)
	 * @return available merge indexes
	 */
	private static List<List<Integer>> checkNeighbours(int[][] grid, int row, int column, int number) {
		// We created empty list for checking cell's available merge indexes
		List<List<Integer>> indexes = new ArrayList<List<Integer>>();
		
		// Check neighbour's neighbours and assign values.
		int top = 0, right = 0, bottom = 0, left = 0;
		if(row-1 >= 0 && !isVisited(row-1, column)){
			top = grid[row-1][column];
		}
		if(row+1 < grid.length && !isVisited(row+1, column)){
			bottom = grid[row+1][column];
		}
		if(column+1 < grid[row].length && !isVisited(row, column+1)){
			right = grid[row][column+1];
		}
		if(column-1 >= 0 && !isVisited(row-1, column-1)){
			left = grid[row][column-1];
		}
		
		/*
		 * If its fit, add to neighbour's indexes.
		 */
		
		if(top == number) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row-1);
			temp.add(column);
			indexes.add(temp);
			
			List<List<Integer>> neighbours = checkNeighbours(grid, row-1, column, number);
			if(neighbours.size() > 0) {
				for (List<Integer> toAdd : neighbours){
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		
		if(bottom == number) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row+1);
			temp.add(column);
			indexes.add(temp);
			
			List<List<Integer>> neighbours = checkNeighbours(grid, row+1, column, number);
			if(neighbours.size() > 0) {
				for (List<Integer> toAdd : neighbours){
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		
		if(left == number) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row);
			temp.add(column-1);
			indexes.add(temp);
			
			List<List<Integer>> neighbours = checkNeighbours(grid, row, column-1, number);
			if(neighbours.size() > 0) {
				for (List<Integer> toAdd : neighbours){
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		
		if(right == number) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(row);
			temp.add(column+1);
			indexes.add(temp);
			
			List<List<Integer>> neighbours = checkNeighbours(grid, row, column+1, number);
			if(neighbours.size() > 0) {
				for (List<Integer> toAdd : neighbours){
					List<Integer> tempp = new ArrayList<Integer>();
					for(Integer cell : toAdd) {
						tempp.add(cell);
					}
					indexes.add(tempp);
				}
			}
		}
		
		// Return available indexes, checkGrid will add this indexes of its.
		return indexes;
	}
	
	/**
	 * Check cell for is visited. Its used on checkNeighbours function.
	 * Because we don't want infinite loop.
	 * 
	 * @param row    Cell's row
	 * @param column Cell's column
	 * @return is visited or not
	 */
	private static Boolean isVisited(int row, int column) {
		// Cell isn't visited yet.
		Boolean isVisit = false;
		
		for (List<Integer> visit: visited) { // Check all visited locations
			int[] cell = new int[2];
			int no=0;
			for(Integer indexValue: visit) {
				cell[no] = indexValue;
				no++;
			}
			
			if(cell[0] == row && cell[1] == column) { // If (row,column) exists in visited locations...
				isVisit = true; // Yes its visited
			}
		}
		return isVisit; // Return result
	}
	
	/**
	 * Print the grid
	 * 
	 * @param grid Which grid will be printed.
	 */
	private static void printGrid(int[][] grid) {
		for (int[] row  : grid) {
			int columnIndex = 0;
			for(int column : row) {
				System.out.print(column);
				if(columnIndex != row.length-1)
					System.out.print(" ");
				columnIndex++;
			}
			System.out.print("\n");
	    }
	}
	
	/**
	 * Set cell's value to 0
	 * 
	 * @param grid   Grid
	 * @param row    Cell's row
	 * @param column Cell's column
	 * @return cleared grid
	 */
	private static int[][] removeCell(int[][] grid, int row, int column) {
		grid[row][column] = 0;
		return grid;
	}

}
