package arrays;

import java.util.Arrays;

public class Arrays_toString_And_deepToString_1 {

	public static void main(String[] args) {
		
		// It use static method for calculation and manipulation of array of data.
		
		int a[] = {2,3,4,5,6};
		// toString -> Print array element as string
		
		System.out.println(Arrays.toString(a));
		
		int b[][]= {{1,2},{3,4}};
		System.out.println(Arrays.toString(b)); // print references 
		
		System.out.println(Arrays.deepToString(b));
		
		int c[][][] = {{{1,2},{2,3}}, {{3,4},{4,5}}};
		System.out.println(Arrays.toString(c)); // print references 
		
		System.out.println(Arrays.deepToString(c));
	}
}
