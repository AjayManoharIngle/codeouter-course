package oops.polymorphism;

public class OverloadMainMethod {

	public static void main(String[] args) {
		
		// can we overload main method - Yes
		
		int res = main(0,2,3);
		System.out.println("Sum of three ele : " + res);
		
		main("Ajay");
	}

	private static void main(String name) {
		System.out.println("Print name : " + name );
	}

	private static int main(int i, int j, int k) {
		return i+j+k;
	}
}
