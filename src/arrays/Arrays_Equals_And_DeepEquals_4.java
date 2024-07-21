package arrays;

import java.util.Arrays;

public class Arrays_Equals_And_DeepEquals_4 {

	public static void main(String[] args) {
		
		// equal if they have the same length and contain the same elements in the same order.
		
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		
		boolean s = Arrays.equals(a,b);
		System.out.println("equal a and b : " + s);
		
		int c[] = {1,2,3,4};
		System.out.println("Same content & different length : " + Arrays.equals(a,c));
		
		int d[] = {3,4,5};
		System.out.println("Different content & same length : " + Arrays.equals(a,d));
		
		int a1[][] = {{1,2},{3,4}};
		int b1[][] = {{1,2},{3,4}};
		
		System.out.println("Check 2D array : " + Arrays.deepEquals(a1, b1));
		
		int c1[][] = {{3,2},{2,3}};
		System.out.println("Check 2D : " + Arrays.deepEquals(a1, c1));
		
	}

}
