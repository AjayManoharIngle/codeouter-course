package arrays;

public class AnonymousArrayToMethod {

	public static void main(String[] args) {
		
		// Anonymous Array in Java -> you don't need to declare the array while passing an array to the method.
		int res2 = max(new int[] {10,34,33,45,0});
		System.out.println("Max : " + res2);
	}
	
	private static int max(int[] arr) {
		int max=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(max<arr[i]) 
		   max=arr[i];  
		return max;
	}
	// max = 10 , 10<34
	// max = 34, 34 > 33
	// max = 34, 34 < 45
	// max = 45, 45 > 0
}
