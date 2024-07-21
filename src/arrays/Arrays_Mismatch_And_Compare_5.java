package arrays;

import java.util.Arrays;

public class Arrays_Mismatch_And_Compare_5 {

	public static void main(String[] args) {
		
		// mismatch ->  Finds and returns the index of the first mismatch between two arrays.
		
		int a[] = {1,2,3};
		int b[] = {1,4,5};
		
		int s = Arrays.mismatch(a,b);
		System.out.println("Return index of first mismatch : " + s);
		
		// Compare : 
		
		int s1 = Arrays.compare(a,b);
		System.out.println("if a is less than b lexigraphically :  " + s1);
		
		int c[] = {1,2,1};
		int s2 = Arrays.compare(a,c);
		System.out.println("if a is greater than b lexigraphically : " + s2);
		
	}
}
