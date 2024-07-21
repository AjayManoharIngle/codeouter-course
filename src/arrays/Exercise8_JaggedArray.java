package arrays;

public class Exercise8_JaggedArray {

	public static void main(String[] args) {
		
		// Print :  Transpose of matrix
		// 1
		// 2 3 
		// 3 4
		// 4 5 6
		
		// output :
		//1 2 3 4
		//  3 4 5
		//      6 
		
		int arr[][] = {
				{1},{2,3},{3,4},{4,5,6}
		};
		
		// Find the maximum number of columns in any row
		int maxColumns = 0;
		for (int i = 0; i < arr.length; i++) {
		    maxColumns = Math.max(maxColumns, arr[i].length);
		}
		System.out.println(maxColumns);

		// Transpose the matrix and print it in the desired format
		for (int i = 0; i < maxColumns; i++) {
		    for (int j = 0; j < arr.length; j++) {
		        if (i < arr[j].length) {
		            System.out.print(arr[j][i] + " ");
		        } else {
		            System.out.print("  "); // Print spaces for indentation
		        }
		    }
		    System.out.println(); // Move to the next line
		}
		
		// max = 3
		// 0 < 1, 0 < 2, 0 < 2, 0 < 3
		// 1 < 1 - space
		// 1 < 2, 1<2, 1< 3
		// 2 < 1 - space, 2<2 - space, 2<2- space , 2 < 3 
	}
}
