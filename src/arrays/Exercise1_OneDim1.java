package arrays;

public class Exercise1_OneDim1 {

	public static void main(String[] args) {
		
		int a[] = {10,23,22,34,55};
		int len = a.length;
		
		// Task 1 : To print even numbers from array
		for(int i=0;i<len;i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i] + " is even no.");
			}
			else {
				System.out.println(a[i] + " is odd no.");
			}
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		// Task 2 : Square of every element of array.
		int b[] = new int[len];
		for(int i=0;i<len;i++) {
			b[i] = a[i]*a[i];
		}
		for(int i : b) {
			System.out.print(i + " ");
		}
	}
}
