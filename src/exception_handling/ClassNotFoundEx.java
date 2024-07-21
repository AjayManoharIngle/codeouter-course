package exception_handling;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		
		 try {
			// Trying to load a class that doesn't exist
	        // Class.forName("exception_handling.Case1_Finally");   
			 Class.forName("non exisiting class");   
	     } catch (ClassNotFoundException e) {
	        System.out.println("Class not found: " + e.getMessage());
	     }
	}

}
