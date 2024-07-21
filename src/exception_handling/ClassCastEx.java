package exception_handling;

public class ClassCastEx {

	public static void main(String[] args) {
		// Thrown when an attempt is made to cast an object to a subclass of which it is not an instance.
		
		 try {
	            Object obj = new Integer(10);
	            String str = (String) obj; // Attempting to cast Integer to String
	        } catch (ClassCastException e) {
	            System.out.println("ClassCastException: " + e.getMessage());
	        }
	}

}
