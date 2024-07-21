package exception_handling;

public class StringIndexOutOfBoundEx {

	public static void main(String[] args) {
		// Thrown by String methods to indicate that an index is either negative or
		// greater than or equal to the size of the string.
		
		 try {
	            String str = "hello";
	            char ch = str.charAt(10); // Accessing index out of bounds
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
	        }
	}

}
