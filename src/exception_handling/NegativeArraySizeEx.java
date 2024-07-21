package exception_handling;

public class NegativeArraySizeEx {

	public static void main(String[] args) {
		// Thrown when an array is created with a negative size.
		
		try {
            int[] arr = new int[-5]; // Creating array with negative size
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: " + e.getMessage());
        }
	}

}
