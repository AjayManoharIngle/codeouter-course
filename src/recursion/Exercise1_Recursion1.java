package recursion;

public class Exercise1_Recursion1 {

	public static void main(String[] args) {
		
		// To find factorial number 
		// 5! = 5*4*3*2*1 = 120
		
		int n = 5;
		int factorial = factorial(n);
		System.out.println("Fact of " + n + " is " + factorial );
	}

	private static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	// fact(5) = 5 * fact(4) = 24*5 = 120
	// fact(4) = 4 * fact(3) = 4*6 = 24
	// fact(3) = 3 * fact(2) = 3*2 = 6
	// fact(2) = 2 * fact(1) = 2*1 = 2
	// fact(1) = 1
}
