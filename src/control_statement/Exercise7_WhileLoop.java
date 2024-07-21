package control_statement;

public class Exercise7_WhileLoop {

	public static void main(String[] args) {
		
		// Find Sum of Digit from number
		
		int n = 12345;
		
		int t = n;
		int sum = 0;
		while(n != 0) {
			int rem = n % 10; // 5
			sum = sum + rem; // 5
			n = n/10; // 1234
			
		}
		
		System.out.println("Sum of number : " + t + " is " + sum);
		
		// n=12345, sum=0
		// n=1234, sum=5
		// n=123, sum=9
		// n=12, sum=12
		// n=1, sum=14
		// n=0, sum =15
		
	}
}
