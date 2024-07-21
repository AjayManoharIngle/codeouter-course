package arrays;

public class ArrayDeclareAndIntialize {

	public static void main(String[] args) {
	
		// What is Array : 
		// -> an array is a collection of similar type of elements which has contiguous memory location.
		
		// Declare  array
		
		int num[];
		
		// intialize array
		num = new int[5];
		
		// Declare and initialize array
		//int num[] = new int[5];
		
		// Assign value to array 
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		
		// Default value : 
		System.out.println("Default value : " + num[4]);
		
		// Print length of array
		System.out.println("Length of array : " + num.length);
		
		// Can array contains chracter as Size = Yes
		int[] b = new int['a']; // AScii character
		System.out.println("length of array : " + b.length);
		
		// Can array has zero size => yes
		int[] c = new int[0];
		System.out.println("Array contain zero size : " + c.length);
		
		// Can Array has Negative size => No = gives exception
		int[] a = new int[-1];
		System.out.println(a);
		
	}
}
