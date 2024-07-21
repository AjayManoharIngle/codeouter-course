package arrays;

public class ReturningArrayToMethod {

	public static void main(String[] args) {
		
		int arr[]={3,2,4,5};
		
		// Returning Array from the Method
		int[] res1 = doubleArray(arr);
		for(int i : res1) {
			System.out.print(i + " ");
		}
		System.out.println(" ");		
	}
	
	private static int[] doubleArray(int[] arr) {
		int b[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			b[i] = arr[i]*2;
		}
		return b;
	}
}
