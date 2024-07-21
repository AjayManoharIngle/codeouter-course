package strings;

public class StringBuilderEqualsHashcodeAndTostring {

	public static void main(String[] args) {
		
		StringBuilder buffer1 = new StringBuilder("Ajay");
		StringBuilder buffer2 = new StringBuilder("Ajay");

		//equals() method is not overridden from the Object class. Therefore, 
		//it inherits the default behavior of performing a reference comparison.
		System.out.println("Equal : " + (buffer1.equals(buffer2)));
		System.out.println("== : " + (buffer1 == buffer2));

		// toString is for converting StringBuilder to String
		System.out.println("Equal : " + (buffer1.toString().equals(buffer2.toString())));

		// Hashcode
		System.out.println("Hashcode : " + (buffer1.hashCode()==buffer2.hashCode()));
	}
}
