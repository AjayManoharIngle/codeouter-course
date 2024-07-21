package methods;

public class Exercise1_MethodEx1 {

	public static void main(String[] args) {
		
		// To find maximum number from two number 
		int a = 80;
		int b = 100;
		int max = max(a,b);
		System.out.println("Max no : " + max);
		
		// To find number is even or odd
		int n = 12;
		boolean status = checkNoEvenOrOdd(n);
		System.out.println("Status of number : " + (status ? "even" : "odd"));
	}

	private static boolean checkNoEvenOrOdd(int n) {
		if(n%2==0)
			return true;
		else 
			return false;
	}

	public static int max(int a, int b) {
		if(a > b)
			return a;
		else
			return b;
	}
}
