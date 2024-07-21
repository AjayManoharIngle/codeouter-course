package recursion;

public class Exercise2_Recursion2 {

	public static void main(String[] args) {
		
		// To find fibonacci series
		// 0 1 1 2 3 5 8 13...
		// 1 2 3 4 5 6 7 8
		
		int n = 5;
		int fibo = fibo(n-1);
		System.out.println("Fibonacci : " + fibo);
	}

	private static int fibo(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	
	// fibo(4) = fibo(3)+fibo(2) = 2+1 = 3
	// fibo(3) = fibo(2)+fibo(1) = 1+1 = 2
	// fibo(2) = fibo(1)+fibo(0) = 1
	// fibo(1) = fibo(0) = 1
}
