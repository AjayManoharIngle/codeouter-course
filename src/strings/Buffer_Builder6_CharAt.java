package strings;

public class Buffer_Builder6_CharAt {

	public static void main(String[] args) {
		
		// CharAt -> It is used to return the character at the specified position.
		
		StringBuffer buffer = new StringBuffer("Ajay");	
		System.out.println("Character at 3rd index : " + buffer.charAt(3));
		
		StringBuilder builder = new StringBuilder("Ajay");	
		System.out.println("Character at 3rd index : " + builder.charAt(3));
	}
}
