package arrays;

import java.util.Arrays;

public class Arrays_Fill_And_Copy_6 {

	public static void main(String[] args) {
		
		// Fill : fill all value with specified ele
		
		int a[] = {1,2,3};
		Arrays.fill(a, 2);
		System.out.println(Arrays.toString(a));
		
		int b[] = {1,2,3,4,5,6};
		Arrays.fill(b,2,4,11); // [start,end-1]
		System.out.println(Arrays.toString(b));
		
		// CopyOf : copy the content of old array with additionl padding with 0 if needed.
		// CopyOfRange : This method creates a new array that is a copy of the specified range of the specified array.
		
		int c[] = {1,2,3,4,5};
		int d[] = Arrays.copyOf(c,8); // 5 is new length of array
		
		System.out.println(Arrays.toString(d));
		
		int e[] = Arrays.copyOfRange(a, 1, 3); // [start,end-1]
		System.out.println(Arrays.toString(e));
	}
}
