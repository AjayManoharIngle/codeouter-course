package arrays;

public class ReturningAnonymousArrayToMethod {

	public static void main(String[] args) {
		
		int a[] = {1,1,3,1}; // return status of even element present 
		int b[] = {4,5,6,7}; // return status of odd element present 
		
		boolean c[] = statusOfArray(a,b);
		System.out.println("Even : " + c[0] + " Odd : " + c[1]);
	}

	private static boolean[] statusOfArray(int[] a, int[] b) {
		boolean aStatus = false;
		boolean bStatus = false;
		
		for(int i : a) {
			if(i%2 == 0) {
				aStatus = true;
				break;
			}
		}
		for(int j : b) {
			if(j%2 == 0) {
				bStatus = true;
				break;
			}
		}
		return new boolean[] {aStatus,bStatus};
	}

}
