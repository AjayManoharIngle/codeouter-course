package exception_handling;

public class ArrayStoreEx {

	public static void main(String[] args) {
		// Thrown when an attempt is made to store an object of an incompatible type in an array.
		
		try {
            Object[] objArr = new String[5];
            objArr[0] = new Integer(10); // Storing Integer object in String array
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException: " + e.getMessage());
        }
	}
}
