package exception_handling;

public class ArithmaticEx {

	public static void main(String[] args) {
		
		// Thrown when an arithmetic operation fails, such as division by zero.
		
		try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
	}
}
