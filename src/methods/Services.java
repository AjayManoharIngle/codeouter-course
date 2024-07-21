package methods;

public class Services {
	
	// We provide services to number for increment and decrement
	
	static void increment(int n) {
		System.out.println("Plus  : " + (++n));
	}
	
	static void decrement(int n) {
		System.out.println("Minus  : " + (--n));
	}
	
	void increment1(int n) {
		System.out.println("Plus  : " + (++n));
	}
	
	void decrement1(int n) {
		System.out.println("Minus  : " + (--n));
	}
	
	// Access method which is public and private
	private static void display(int n) {
		System.out.println("Your Number : "  +n);
	}
	
	public static void display1(int n) {
		System.out.println("Your Number : "  +n);
	}
}
