package recursion;

public class StackOverflowEx {

	public static void main(String[] args) {
		
		printNo(3);
		
		// We haven't written condition to stop recursion so goes till stack limit.
		// No Base condition, Excessive recursion depth, infinite recursion calls
	}
	
	private static void printNo(int n) {
		printNo(n-1);
		System.out.print(n + " ");
	}

}
