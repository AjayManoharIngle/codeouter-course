package strings;

public class StringBufferEqualsHashcodeAndTostring {

	public static void main(String[] args) {
		
		StringBuffer buffer1 = new StringBuffer("Ajay");
		StringBuffer buffer2 = new StringBuffer("Ajay");

		//equals() method is not overridden from the Object class. Therefore, 
		//it inherits the default behavior of performing a reference comparison.
		System.out.println("Equal : " + (buffer1.equals(buffer2)));
		System.out.println("== : " + (buffer1 == buffer2));

		// toString is for converting StringBuffer to String
		System.out.println("Equal : " + (buffer1.toString().equals(buffer2.toString())));

		// Hashcode
		System.out.println("Hashcode : " + (buffer1.hashCode()==buffer2.hashCode()));
	}
}
