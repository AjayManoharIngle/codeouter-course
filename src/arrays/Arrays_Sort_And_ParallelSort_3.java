package arrays;

import java.util.Arrays;

public class Arrays_Sort_And_ParallelSort_3 {

	public static void main(String[] args) {
		
		// sort() : Sorts the specified array of objects into ascending order.

		int a[]  = {2,1,9,3,4};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int b[][] = {{1,2},{10,8}};
		
		for(int[] i : b) {
			Arrays.sort(i);
		}
		System.out.println(Arrays.deepToString(b));
		
		int c[] = {2,1,3,33,-1};
		
		Arrays.parallelSort(c, 0, 3);
		System.out.println(Arrays.toString(c));
	}

}
