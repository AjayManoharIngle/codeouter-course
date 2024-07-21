package arrays;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		
		int arr[]={3,2,4,5}; 
		
		// Passing array to method : 
		// Task - find min number from array
		int res = min(arr);
		System.out.println("Min : " + res);		

	}
	
	private static int min(int[] arr) {
		int min=arr[0];  
		for(int i=1;i<arr.length;i++) { 
		 if(min>arr[i]) 
		   min=arr[i];  
		}
		return min;
	}
	// min = 3, 3>2 
	// min = 2, 2<4
	// min = 2, 2<5

}
