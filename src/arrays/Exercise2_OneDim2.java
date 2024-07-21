package arrays;

public class Exercise2_OneDim2 {

	public static void main(String[] args) {
		
		// Sum of all numbers in array with size 5
		// Input : [10,20,30,40,50]
		
		int a[] = {10,20,30,40,50};
		int len = a.length;
		
		int sum =0;
		for(int i=0;i<len;i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of all no : " + sum);
		
		sum = 0;
		for(int i : a) {
			sum += i;
		}
		System.out.println("Sum of all no : " + sum);		
	}
}
