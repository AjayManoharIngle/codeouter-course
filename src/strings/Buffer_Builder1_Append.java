package strings;

public class Buffer_Builder1_Append {

	public static void main(String[] args) {
		
		// Append -> append the specified string with this string.
		
		StringBuffer buffer = new StringBuffer("Ajay");
		buffer.append("Ingle");
		System.out.println("String Buffer : "  +buffer);
		
		buffer.append("Manohar",2,5);
		System.out.println("String buffer append Start & End : " + buffer);
		
		StringBuilder builder = new StringBuilder("Ajay");
		builder.append("Ingle");
		System.out.println("String Buffer : "  +builder);
		
		builder.append("Manohar",2,5);
		System.out.println("String builder append Start & End : " + builder);
	}
}
