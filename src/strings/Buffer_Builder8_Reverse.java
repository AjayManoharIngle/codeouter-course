package strings;

public class Buffer_Builder8_Reverse {

	public static void main(String[] args) {
		
		// Reverse -> It is used to reverse the string.
		
		StringBuffer buffer = new StringBuffer("Ajay");
		buffer.reverse();
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Ajay");
		builder.reverse();
		System.out.println(builder);
		
	}
}
