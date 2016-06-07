package source;

import java.util.Arrays;

public class ArraysInJava {

	public static void main(String[] args) {
		/* Create a integer array of size 5 and assign values to it */
		
		//create a constant field called MAX that stores the size of the array
		final int MAX = 5;
		//MAX = 500; //values of constant field cannot be modified
		int[] grades = new int[MAX]; //create the array
		grades[0] = 10;
		grades[1] = 45;
		grades[2] = 26;
		grades[3] = 4;
		grades[4] = 90;
	//	grades[5] = 67; //Index is out of bounds
		
		//display values stored in array
		for(int count=0; count<MAX; count++){
			System.out.println(grades[count]);
		}
		
		for(int count=0; count<grades.length; count++){
			System.out.print(grades[count] + " ");
		}
		System.out.println();
		
		/* Create array using initializer list */
		String[] daysofTheWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		System.out.println("DaysOfTheWeek" + Arrays.toString(daysofTheWeek)); //displays the data without a need of for loop.
		System.out.println("Grades: " + Arrays.toString(grades));
		
		Arrays.sort(grades);
		System.out.println("Sorted Grades Array: " + Arrays.toString(grades));
		
		Arrays.sort(daysofTheWeek);
		System.out.println("Sorted daysOftheweek: " + Arrays.toString(daysofTheWeek));
		
		double[][] grid = new double[3][3];
		grid[0][0] = 1.5;
		grid[0][1] = 5.1;
		grid[0][2] = 6.78;
		
		//System.out.println("Grid: " + Arrays.toString(grid));
		for(int row=0; row<grid.length; row++){
			for(int col=0; col<3; col++){
				System.out.print(grid[row][col] + " ");
			}
			System.out.println();
		}
	
		for(int row=0; row<grid.length; row++){
			System.out.println(Arrays.toString(grid[row]));
		}
	}

}
