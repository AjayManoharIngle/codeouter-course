package exception_handling;

public class ArrayIndexOutOfBoundEx {

	public static void main(String[] args) {
		// Thrown when an attempt is made to access an array element at an index that is outside the bounds of the array.
		
		try {
            int[] arr = new int[5];
            int value = arr[10]; // Accessing index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
	}

}
