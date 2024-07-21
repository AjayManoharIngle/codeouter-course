package arrays;

public class OneDimesionalArray {

	public static void main(String[] args) {
		
		// One Dim array : same data type of element is access using single index. 
		
		// Method 1 : 
		// int marks[ ] = { 90, 97, 95, 99, 100 }; // declare marks[ ] and initialize with five values.

		// Method 2 : 
		int marks[ ]; // declare marks arrays.
		marks = new int[5]; // allocating memory for storing 5 integer elements into an array
		
		//int marks[ ] = new int[5];
		
		// Add manually
		marks[0] = 90;
		marks[1] = 97;
		marks[2] = 95;
		marks[3] = 99;
		marks[4] = 100;
		
		// To print element of array
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println("+++++++++++++++++++++++++");
		
		// Using for loop
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("++++++++++++++++++++++++++++");
		
		// using for each
		for(int i : marks) {
			System.out.println(i);
		}
	}
}
