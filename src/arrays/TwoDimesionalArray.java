package arrays;

public class TwoDimesionalArray {

	public static void main(String[] args) {
		
		// Multi Dim Array :  arrays which is a combination of several types of arrays. 
		
		// 2D Array : a two-dimensional array is a combination of two or more one dimensional array. 
		
		// Three - rows and five columns
		int marks[][];
		marks = new int[3][5];
		
		// write in single line
		//int marks[][] = new int[3][3];
		
		// Assigned values in 2D
		int markss[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		// Normally Assigned value 
		marks[0][0] = 1;
		marks[0][1] = 2;
		marks[0][2] = 3;
		marks[1][0] = 4;
		marks[1][1] = 5;
		marks[1][2] = 6;
		marks[2][0] = 7;
		marks[2][1] = 8;
		marks[2][2] = 9;
		
		// How to get length of 2d array
		int markssArray = markss.length;
		System.out.println("2D Array length : " + markssArray);
		int markssSubArray = markss[markss.length-1].length; // markss[2].length => {1,2,3} => 3 ele
		System.out.println("2D Array length : " + markssSubArray);
		
		int marksArray = marks.length;
		System.out.println("2D Array length : " + marksArray);
		int marksSubArray = marks[marks.length-1].length; // marks[2].length => {1,2,3,4,5} => 5 ele
		System.out.println("2D Array length : " + marksSubArray);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");

		
		// using for loop - print
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int row = 3;
		int col = 3;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		// using for each
		
		for(int[] i : arr) { // i : {1,2,3}
			for(int j : i) { // j : 1
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}
