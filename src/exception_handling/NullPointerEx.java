package exception_handling;

public class NullPointerEx {

	public static void main(String[] args) {
		
		// Thrown when a null object is referenced and an instance method is invoked, or a field is accessed.
		
		 try {
	            String str = null;
	            int length = str.length(); // Attempting to access length of null string
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException: " + e.getMessage());
	        }
	}

}
