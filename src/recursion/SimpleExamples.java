package recursion;

public class SimpleExamples {

	public static void main(String[] args) {
		
		// Example1 : To print 1 to n number. => 1 2 3 4 5
		printNo(5);
		System.out.println(" ");
				
		// Example2 : To print 1 to n number in reverse => 5 4 3 2 1
		printNoInRev(5);
		System.out.println(" ");
		
		// Example3 : To print even n numbers => 2 4 6 8 10
		printEvenNo(20);
		System.out.println(" ");
		
		// Example4 : To print odd n numbers => 1 3 5 7 9 11
		printOddNo(20);
		System.out.println(" ");
		
		// Example5 : Sum of first N numbers => 1+2+3+4+5 = 15
		int sum = sumOfFirstNo(5);
		System.out.println("Sum : " + sum);
	}

	private static int sumOfFirstNo(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return n + sumOfFirstNo(n-1);
		}
	}
	// n = 5
	//s(5) = 5 + s(4) = 5+10 = 15
	//s(4) = 4 + s(3) = 4+6 = 10
	//s(3) = 3 + s(2) = 3+3 = 6
	//s(2) = 2 + s(1) = 2+1 = 3
	//s(1) = 1 + s(0) = 1+0 = 1
	//s(0) = 0

	private static void printOddNo(int n) {
		if(n>0) {
			printOddNo(n-1);
			if(n%2!=0) {
				System.out.print(n + " ");
			}
		}
	}

	private static void printEvenNo(int n) {
		if(n>0) {
			printEvenNo(n-1);
			if(n%2==0) {
				System.out.print(n + " ");
			}
		}
	}
	
	private static void printNoInRev(int n) {
		if(n > 0){
			System.out.print(n + " ");
			printNoInRev(n-1);
		}
	}
	// p(5) = print 5 = p(4)
	// p(4) = print 4 = p(3) 
	// p(3) = print 3 = p(2) 
	// p(2) = print 2 = p(1) 
	// p(1) = print 1 = p(0)
	// p(0) = false - not executed	
	
	private static void printNo(int n) {
		if(n > 0){
			printNo(n-1);
			System.out.print(n + " ");
		}
	}
	// p(5) = p(4) = print 5
	// p(4) = p(3) = print 4
	// p(3) = p(2) = print 3
	// p(2) = p(1) = print 2
	// p(1) = p(0) = print 1
	// p(0) = false - not executed
}
