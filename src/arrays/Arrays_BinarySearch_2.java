package arrays;

import java.util.Arrays;

public class Arrays_BinarySearch_2 {

	public static void main(String[] args) {		
		
		int a[] = {2,3,4,5,6};
		// binarySearch() : It returns index of search ele if array is sorted array.
		
		int search = Arrays.binarySearch(a,4);
		System.out.println("Search ele is 4 at index is : " + search);
		
		int b[] = {2,2,3,3};
		int search1 = Arrays.binarySearch(b,3);
		System.out.println("Search ele 3 which is double in array : " + search1);
		
		int c[] = {10,2,11,34,3};
		int search2 = Arrays.binarySearch(c,3);
		System.out.println("Search ele 3 which is unsorted array : " + search2);
		
		int d[] = {2,3,4,5};
		int search3 = Arrays.binarySearch(d, 6);
		System.out.println("Search ele 6 which is not in array : " + search3);
		
	}
}
