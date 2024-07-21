package exception_handling;

public class DefaultException {

	public static void main(String[] args) {
		
		// Default exception is when no method is handling exception and JVM print it's default exception.
		
		m1();
	}

	private static void m1() {
		m2();
	}
	
	private static void m2() {
		m3();
	}
	
	private static void m3() {
		System.out.println(1/0);
	}
}
